import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your data here");
        String number = sc.nextLine();
        String operation ="";
        String output ="";
        int length =number.length();
        switch (length) {
            case 1, 2 -> throw new RuntimeException("It's not a math operation!");
            default -> {
            }
        }
        String[] numbers = number.split(" ");
        String str = numbers[0];
        String str1 = numbers[2];
        boolean b = (str.equals("1")) || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") ||
                str.equals("9") || str.equals("10");
        if  (numbers.length > 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("The format of maths operation isn't according to the task!");
            }

        } else if (b && (str1.equals("I") || str1.equals("II") || str1.equals("III") || str1.equals("IV") || str1.equals("V") || str1.equals("VI") ||
                str1.equals("VII") || str1.equals("VIII") || str1.equals("IX") || str1.equals("X")) || (str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") ||
                str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") ||
                str1.equals("9") || str1.equals("10")) && (str.equals("I") || str.equals("II") || str.equals("III") || str.equals("IV") || str.equals("V") || str.equals("VI") ||
                str.equals("VII") || str.equals("VIII") || str.equals("IX") || str.equals("X"))) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Different number systems are used together");
            }

        } else if (b) {
            int x = Integer.parseInt(str);
            int y = Integer.parseInt(str1);
            int res=0;
            if (x > 0 && x < 11 && y > 0 && y < 11 && number.indexOf('+') > 0) {
                operation ="+";
                res = Calc(x,y,operation);
                output = String.valueOf(res);
                System.out.println(res);
            } else if (x > 0 && y > 0 && x < 11 && y < 11 && number.indexOf('-') > 0) {
                //               System.out.println(c = x - y);
                operation ="-";
                res = Calc(x,y,operation);
                output = String.valueOf(res);
                System.out.println(res);

            } else if (x > 0 && y > 0 && x < 11 && y < 11 && number.indexOf('*') > 0) {
//                System.out.println(c = x * y);
                operation ="*";
                res = Calc(x,y,operation);
                output = String.valueOf(res);
                System.out.println(res);
            } else if (x > 0 && y > 0 && x < 11 && y < 11 && number.indexOf('/') > 0) {
//                System.out.println(c = x / y);
                operation ="/";
                res = Calc(x,y,operation);
                output = String.valueOf(res);
                System.out.println(res);

            } else
                throw new RuntimeException("The format of math operation doesn't accord to the task!");

        } else {
            String m = numbers[0];
            String n = numbers[2];
            int x = 0;
            int y = 0;
            int res=0;
            switch (m) {
                case "I":
                    x = I;
                    break;
                case "II":
                    x = II;
                    break;
                case "III":
                    x = III;
                    break;
                case "IV":
                    x = IV;
                    break;
                case "V":
                    x = V;
                    break;
                case "VI":
                    x = VI;
                    break;
                case "VII":
                    x = VII;
                    break;
                case "VIII":
                    x = VIII;
                    break;
                case "IX":
                    x = IX;
                    break;
                case "X":
                    x = X;
                    break;
                default:
                    try {
                        throw new IOException();
                    } catch (IOException em) {
                        System.out.println("The format of maths operation doesn't accord to the task");
                    }
                    break;
            }

            switch (n) {
                case "I":
                    y = I;
                    break;
                case "II":
                    y = II;
                    break;
                case "III":
                    y = III;
                    break;
                case "IV":
                    y = IV;
                    break;
                case "V":
                    y = V;
                    break;
                case "VI":
                    y = VI;
                    break;
                case "VII":
                    y = VII;
                    break;
                case "VIII":
                    y = VIII;
                    break;
                case "IX":
                    y = IX;
                    break;
                case "X":
                    y = X;
                    break;
                default:
                    try {
                        throw new IOException();
                    } catch (IOException ed) {
                        System.out.println("The format of maths operation is wrong");
                    }
                    break;
            }

            if (number.indexOf('-') > 0 && x < y) {
                try {
                    throw new IOException();
                } catch (IOException ex) {
                    System.out.println("Roman numbers can't be negative");
                }
            }else if (number.indexOf('/') > 0 && x<y) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("There is no null in roman");
                }
            } else if (number.indexOf('+') > 0) {
                operation ="+";
                res = Calc(x,y,operation);
                output = String.valueOf(res);
                String result=integerToRoman(res);
                System.out.println(result);
            } else if ( number.indexOf('-') > 0) {
                operation ="-";
                res = Calc(x,y,operation);
                output = String.valueOf(res);
                String result=integerToRoman(res);
                System.out.println(result);
            } else if ( number.indexOf('*') > 0) {
                operation ="*";
                res = Calc(x,y,operation);
                output = String.valueOf(res);
                String result=integerToRoman(res);
                System.out.println(result);
            } else if (number.indexOf('/') > 0) {
                operation ="/";
                res = Calc(x,y,operation);
                output = String.valueOf(res);
                String result=integerToRoman(res);
                System.out.println(result);
            } else if (number.indexOf('/') == 0 && number.indexOf('*') == 0 && number.indexOf('+') == 0 && number.indexOf('/') == 0) {
                try {
                    throw new IOException();
                } catch (IOException ex) {
                    System.out.println("It's not  maths operation");
                }
            }
        }
    }

    private static final int I = 1;
    private static final int II = 2;
    private static final int III = 3;
    private static final int IV = 4;
    private static final int V = 5;
    private static final int VI = 6;
    private static final int VII = 7;
    private static final int VIII = 8;
    private static final int IX = 9;
    private static final int X = 10;





    private static final String[] numerals = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] values = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};

    private static String integerToRoman(int e) {
        StringBuilder numeral = new StringBuilder();
        int i = 0;
        while (e > 0) {
            if (e - values[i] >= 0) {
                numeral.append(numerals[i]);
                e -= values[i];
            } else {
                i++;
            }
        }
        return numeral.toString();
    }


    public static int Calc(int x, int y, String operation) {
        int res = 0;
        try {
            switch (operation) {
                case "-" -> res = x - y;
                case "+" -> res = x + y;
                case "*" -> res = x * y;
                case "/" -> res = x / y;
            }

        }catch (ArithmeticException e){
            System.out.println("throws Exception: деление на ноль");
        }

        return (res);
    }

}