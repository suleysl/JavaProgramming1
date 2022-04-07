package day07_Operators;

public class unaryOperators {
    public static void main(String[] args) {


        int num1 = 25;
        int num2= -25;

        System.out.println( num1 < 0 );
        System.out.println(num2 < 0 );

        System.out.println("_____________________________________");

     int a = 5;
     ++a; // pre increment : increase the value by one immediately

        System.out.println(a);

        --a; // pre decrement: decreases thr value by 1 right away
        System.out.println(a);

        System.out.println("________________________________________");

        int b = 100;
        System.out.println(++b);

        int c = 100;
        System.out.println(c++); // post increment: first passes the current value then increases the value by 1
        System.out.println(c);

        System.out.println("__________________________________________");

        int x = 200;
        System.out.println(--x); // pre decrement: decreases by 1 right away

        int y = 200;
        System.out.println( y--);// post decrement passes the current value then decrease in the next step
        System.out.println(y);//199

        System.out.println("___________________________________________");

        int z = 45;
        System.out.println(++z); // increase the value by 1 (1 step)
        System.out.println(z++); //46, z =47
        System.out.println(z);//47

        int q = 30;

        System.out.println(--q); //29 q=29
        System.out.println(q--); // 29,
        System.out.println(q); // q=28






    }
}
