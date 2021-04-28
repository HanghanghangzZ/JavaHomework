package com.hang.Homework.Chapter12;

public class Homework12_1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }
        try {
            allIsNum(args[0]);
            allIsNum(args[2]);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        int result = 0;

        int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[2]);
        switch (args[1].charAt(0)) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }

    public static boolean allIsNum(String str) throws Exception {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                throw new Exception("Wrong Input: " + str);
            }
        }
        return true;
    }

}