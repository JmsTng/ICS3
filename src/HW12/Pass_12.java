/*
 * TITLE: Homework Set 12 - Pass
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Give the user an equation and output whether they got it right.
 */

package HW12;

import java.util.Scanner;

class Pass {
    public static void main(String[] args) {
        // Generate equation with 5 terms and output to user
        Symbol head = buildEquation(5);
        System.out.println(outputEquation(head) + " = ?");

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
                if (op.precedence > maxPrecedence) { // Usage of > instead of >= means that the first operator found will be used (left to right reading)
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
                if (op.operator.equals(")")) {
                    op.remove();
                }
                if (op.prev instanceof Operator || op.next instanceof Operator) {
                    op.remove();
                } else if (op.operator.equals(")")) {
                    op.remove();
                } else if (op.operator.equals("(")) {
                    op.replace(new Operator(op.prev, " * ", (op.precedence - 1) * 3 + 1));
                }
            }
        }

        // Solve equation
        while (locate(head) != null) { // While there are still operators in the equation
            // Find the operator with the highest precedence and operate on the numbers around it
            Operator op = locate(head);
            Symbol res = op.operate();

            // If the calculation involves the head of the linked list, set the head to the result
            if (res.prev == null && res.next == null) {
                head = res;
            }
        }

        return ((Number) head).value;
    }

    public static String outputEquation(Symbol head) {
        // Initialize empty string using StringBuilder
        StringBuilder equation = new StringBuilder();

        // Loop through linked list and append each symbol to the string
        for (Symbol symbol = head; symbol != null; symbol = symbol.next) {
            if (symbol instanceof Number num) {
                if (num.value < 0) { // If the number is negative, put brackets around it
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

        // Loop variables
        Symbol last = head;
        int level = 0;

        // Loop through terms
        for (int i = 0; i < terms; i++) {
            // Create a random operator and append it to the end of the list
            int op = (int) (Math.random() * 6);
            switch (op) { // Currently equal weighting for all operators
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

            // Possibly close bracket (don't close brackets right after opening)
            if (Math.random() < 0.2 && level > 0) {
                last = last.append(new Operator(last, ")", level));
                level--;
            }
        }

        // If there are still open brackets, close them until there are no more
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

    public Symbol(Symbol prev) { // Define constructor method
        this.prev = prev;
    }

    public Symbol append(Symbol next) { // Add a symbol after this one
        this.next = next;
        next.prev = this;

        return next;
    }

    public Symbol prepend(Symbol prev) { // Add a symbol before this one
        // ** Safety Method; Not Used ** //
        this.prev = prev;
        prev.next = this;

        return prev;
    }

    public Symbol remove() {
        // Close list (set the pointers of the previous and next symbols to each other)
        if (this.next != null) this.next.prev = this.prev;
        if (this.prev != null) this.prev.next = this.next;

        // Remove pointers from this symbol
        this.prev = null;
        this.next = null;

        return this;
    }

    public Symbol replace(Symbol replacement) { // Replace this position in the list with a different symbol (operator or number)
        if (prev != null) { // If there is a previous symbol, point it to the replacement
            prev.next = replacement;
        }

        // Point the replacement to the previous and next symbols (can be null)
        replacement.prev = prev;
        replacement.next = this.next;

        if (next != null) { // If there is a next symbol, point it to the replacement
            next.prev = replacement;
        }

        return replacement;
    }
}

class Number extends Symbol {
    double value;

    public Number(Symbol prev, double value) { // Define constructor method
        super(prev);
        this.value = value;
    }

    @Override
    public String toString() { // Define toString behaviour
        if (value == (int) value) { // If value is an integer, return as an integer (no decimal place)
            return Integer.toString((int) value);
        } else { // Otherwise, return as a double (with decimal place)
            return Double.toString(value);
        }
    }
}

class Operator extends Symbol {
    String operator;
    int precedence;

    public Operator(Symbol prev, String operator, int precedence) { // Define constructor method
        super(prev);
        this.operator = operator;
        this.precedence = precedence;
    }

    @Override
    public String toString() { // Define toString behaviour
        return operator;
    }

    public Symbol operate() { // Method for operating on two numbers
        double res;
        double a, b;

        // Get previous and next numbers, and remove from list
        a = ((Number) prev.remove()).value;
        b = ((Number) next.remove()).value;

        // Calculate result
        res = switch (operator) {
            case " + " -> a + b;
            case " - " -> a - b;
            case " * " -> a * b;
            case " / " -> a / b;
            case "^" -> Math.pow(a, b);
            default -> 0;
        };

        // Return resulting number symbol
        return this.replace(
                new Number(null, res)
        );
    }
}