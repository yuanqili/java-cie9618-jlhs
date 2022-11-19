public class DataTypes {
    public static void main(String[] args) {

        // declaration and assignment
        // declaration: 告诉计算机，变量的类型和名字
        // assignment: 给变量赋值（初始值）
        // <type> <name> = <initial value>;

        // primitive data types in java
        //         signed integer: short (16-bit), int (32-bit), long (64-bit)
        // floating point numbers: float (32-bit), double (64-bit)
        //              character: char (8-bit ascii)
        //                boolean: boolean (true, false)

        short a = 20;
        double b = 3.14;
        char ch = ' ';
        boolean flag = true;
        String message = "Hello, world 🌎 ☀️ 今天天气很好";

        int value1 = 10;
        int value2 = 20;
        int sum = value1 % value2;  // valued expression

        value1 = value1 + 1;
        value1 += 1;                // syntax sugar
        value1++;                   // increment

        value1 = value1 - 1;
        value1 -= 1;
        value1--;                   // decrement

        value1 = value1 * 18;
        value1 *= 18;

        value2 *= 7;

        System.out.println(value1);
        System.out.println(value2);

        // 整数 / 整数 = 整数

        int quotient = value1 / value2;
        int remainder = value1 % value2;
        System.out.println(quotient);
        System.out.println(remainder);

        boolean proof = quotient * value2 + remainder == value1;
        System.out.println(proof);

        // 整数 / 小数 = 小数
        // 小数 / 整数 = 小数

        int value3 = 87;
        double value4 = 3.14;               // implicit type casting 隐式类型转换
        double result34 = value3 / value4;  // int / double  =>  double / double
        double result43 = (float) (value4 / (double) value3);  // double / int  =>  double / double

        System.out.println(result34);
        System.out.println(result43);

        // >
        // <
        // >=
        // <=
        // ==   =
        // !=   <>

        String firstName = "Donald";
        String lastName = "Trump";
        int age = 76;
        double asset = 21.23;

        System.out.println("I'm " + firstName + " " + lastName + " (" + age + "). I have " + asset + " billion dollars!");

        // format print
        // %s: string placeholder
        // %d: integer placeholder
        // %f: floating point number placeholder
        // %.2f: floating point number with 2 decimal places
        System.out.printf("I'm %s %s (%d). I have %.2f billion dollars!", firstName, lastName, age, asset);

    }
}
