public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static void greet(){
        System.out.println("HELLO,WORLD");
        return;
    }
    public static String greet(String name){
        System.out.println("Hello "+name);
        return name;
    }


    public static void main(String[] args) {

        greet();
        greet("Alice");


    }
}