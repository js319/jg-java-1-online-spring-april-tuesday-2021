package students.dmitrijs_matrenicevs.leson_2.level_1.task_1;

class Task1 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter any 2 numbers: ");

        //sum
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("sum = " + sum);

        //minus
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int minus = c - d;
        System.out.println("sum = " + minus);

        //multiply
        int e = scanner.nextInt();
        int r = scanner.nextInt();

        int multiply = e * r;
        System.out.println("sum = " + multiply);

        //share
        int y = scanner.nextInt();
        int i = scanner.nextInt();

        int share = y / i;
        System.out.println("sum = " + share);
    }
}
