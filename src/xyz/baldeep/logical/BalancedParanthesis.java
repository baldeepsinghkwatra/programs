/**
 * ****************************************************************************
 *
 * Copyright (c) 2019, BSK Technologies and/or its affiliates. All rights
 * reserved.
 * ___________________________________________________________________________________
 *
 *
 * NOTICE: All information contained herein is, and remains the property of
 * BSK and its suppliers,if any. The intellectual and technical concepts
 * contained herein are proprietary to BSK Technologies. and its suppliers and
 * may be covered by us and Foreign Patents, patents in process, and are
 * protected by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from BSK Technologies
 */
package xyz.baldeep.logical;

/**
 *
 * @author baldeepsinghkwatra
 */
public class BalancedParanthesis {

    static class Stack {

        int top = -1;
        char items[] = new char[100];

        void push(char x) {
            if (top == 99) {
                System.out.println("Stack full");
            } else {
                items[++top] = x;
            }
        }

        char pop() {
            if (top == -1) {
                System.out.println("Underflow error");
                return '\0';
            } else {
                char element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty() {
            return (top == -1);
        }
    }

    /* Returns true if character1 and character2
	are matching left and right Parenthesis */
    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')') {
            return true;
        } else if (character1 == '{' && character2 == '}') {
            return true;
        } else if (character1 == '[' && character2 == ']') {
            return true;
        }
        return false;
    }

    /* Return true if expression has balanced 
	Parenthesis */
    static boolean areParenthesisBalanced(char exp[]) {
        /* Declare an empty character stack */
        Stack st = new Stack();

        /* Traverse the given expression to 
		check matching parenthesis */
        for (int i = 0; i < exp.length; i++) {

            /*If the exp[i] is a starting 
			parenthesis then push it*/
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
                st.push(exp[i]);
            }

            /* If exp[i] is an ending parenthesis 
			then pop from stack and check if the 
			popped parenthesis is a matching pair*/
            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

                /* If we see an ending parenthesis without 
				a pair then return false*/
                if (st.isEmpty()) {
                    return false;
                } /* Pop the top element from stack, if 
                    it is not a pair parenthesis of character 
                    then there is a mismatch. This happens for 
                    expressions like {(}) */ else if (!isMatchingPair(st.pop(), exp[i])) {
                    return false;
                }
            }

        }

        /* If there is something left in expression
        then there is a starting parenthesis without
        a closing parenthesis */
        return st.isEmpty();//if empty then its balanced
    }

    public static void main(String[] args) {
        char exp[] = {'{', '(', ')', '}', '[', ']'};
        System.out.println("Is Balanced: " + areParenthesisBalanced(exp));
    }

}
