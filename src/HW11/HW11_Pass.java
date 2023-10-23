/*
 * TITLE: Homework Set 11 - Pass
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Give the user an equation and output whether they got it right.
 */

import java.util.Scanner;

class HW11_Pass {
    public static void main(String[] args) {
        Symbol head = buildEquation(5); // Generate equation with 5 terms

        System.out.println(outputEquation(head));
        // Evaluate equation and round to nearest integer
        long answer = Math.round(eval(head));

        // Prompt user for answer
        System.out.print("What is the answer (rounded to the nearest integer)? ");
        Scanner sc = new Scanner(System.in);
        long guess = sc.nextLong();

        // Output whether the user got it right or wrong
        if (guess == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The answer is " + answer + ".");
        }
    }

    public static Operator locate(Symbol head) {
        // Initialize all variables to run through linked list
        Symbol last = head;
        Operator max = (Operator) head.next;
        int maxPrecedence = -1;

        // Find operator with the highest precedence
        while (last.next != null) {
            if (last instanceof Operator op) {
                if (op.precedence > maxPrecedence) {
                    max = op;
                    maxPrecedence = op.precedence;
                }
            }
            last = last.next;
        }
        return max;
    }

    public static double eval(Symbol head) {
        // Clear brackets
        for (Symbol symbol = head; symbol != null; symbol = symbol.next) {
            if (symbol instanceof Operator op) {
                if (op.prev instanceof Operator) {
                    op.remove();
                } else if (op.operator == ")") {
                    op.remove();
                } else {
                    if (op.operator.equals("(")) {
                        op.replace(new Operator(op.prev, " * ", (op.precedence - 1) * 3 + 1));
                    }
                }
            }
        }

        System.out.println(outputEquation(head));

        // Solve equation
        while (locate(head) != null) {
            Operator op = locate(head);
            Symbol res = op.operate();
            if (head.next == null) {
                System.out.println("prob finished?");
                System.out.println(head);
                return ((Number) head).value;
            } else if (res.prev.prev == null) {
                System.out.println("broken part");
                head = res.prev;
            }

            System.out.println(outputEquation(head));
        }

        return ((Number) head).value;
    }

    public static String outputEquation(Symbol head) {
        StringBuilder equation = new StringBuilder();
        for (Symbol symbol = head; symbol != null; symbol = symbol.next) {
            if (symbol instanceof Number num) {
                if (num.value < 0) {
                    equation.append("(").append(num).append(")");
                } else {
                    equation.append(num);
                }
            } else {
                equation.append(symbol);
            }
        }
        return equation.toString();
    }

    public static Number buildEquation(int terms) {
        // Random first number
        Number head = new Number(null, (int) (Math.random() * 500) - 250);

        Symbol last = head;
        int level = 0;
        for (int i = 0; i < terms; i++) {
            // Random operator
            int op = (int) (Math.random() * 6);
            switch (op) {
                case 0 -> last = last.append(new Operator(last, " + ", level*3));
                case 1 -> last = last.append(new Operator(last, " - ", level*3));
                case 2 -> last = last.append(new Operator(last, " * ", level*3+1));
                case 3 -> last = last.append(new Operator(last, " / ", level*3+1));
                case 4 -> last = last.append(new Operator(last, "^", level*3+2));
                case 5 -> { level++; last = last.append(new Operator(last, "(", level)); }
            }

            // Produce number
            if (op != 4) {
                last = last.append(new Number(last, (int) (Math.random() * 500) - 250));
            } else {
                last = last.append(new Number(last, (int) (Math.random() * 3) + 2));
            }

            // Possibly close bracket
            if (Math.random() < 0.2 && level > 0) {
                last = last.append(new Operator(last, ")", level));
                level--;
            }
        }

        while (level > 0) {
            last = last.append(new Operator(last, ")", level*3+3));
            level--;
        }

        return head;
    }
}

class Symbol {
    Symbol prev;
    Symbol next;

    public Symbol(Symbol prev) {
        this.prev = prev;
    }

    public Symbol append(Symbol next) {
        this.next = next;
        next.prev = this;

        return next;
    }

    public Symbol prepend(Symbol prev) {
        this.prev = prev;
        prev.next = this;

        return prev;
    }

    public Symbol remove() {
        // Close list
        if (this.next != null) this.next.prev = this.prev;
        if (this.prev != null) this.prev.next = this.next;

        this.prev = null;
        this.next = null;

        return this;
    }

    public Symbol replace(Symbol replacement) {
        if (prev != null) {
            prev.next = replacement;
        }
        replacement.prev = prev;
        replacement.next = this.next;
        if (next != null) {
            next.prev = replacement;
        }

        return replacement;
    }

    public int length() {
        int length = 0;
        for (Symbol symbol = this; symbol != null; symbol = symbol.next) {
            length++;
        }
        return length;
    }
}

class Number extends Symbol {
    double value;

    public Number(Symbol prev, double value) {
        super(prev);
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == (int) value) {
            return Integer.toString((int) value);
        } else {
            return Double.toString(value);
        }
    }
}

class Operator extends Symbol {
    String operator;
    int precedence;

    public Operator(Symbol prev, String operator, int precedence) {
        super(prev);
        this.operator = operator;
        this.precedence = precedence;
    }

    @Override
    public String toString() {
        return operator;
    }

    public Symbol operate() {
        double res;
        double a, b;

        System.out.print(prev);
        System.out.print(this);
        System.out.println(next);
        a = ((Number) prev.remove()).value;
        b = ((Number) next.remove()).value;

        res = switch (operator) {
            case " + " -> a + b;
            case " - " -> a - b;
            case " * " -> a * b;
            case " / " -> a / b;
            case "^" -> Math.pow(a, b);
            default -> 0;
        };

        return this.replace(new Number(null, res));
    }
}