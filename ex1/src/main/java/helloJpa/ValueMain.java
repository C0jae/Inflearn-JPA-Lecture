package helloJpa;

public class ValueMain {
    public static void main(String[] args) {
        String a = "A";
        String b = a;

        Integer c = new Integer(10);
        Integer d = c;

        a = "AA";
        c = 30;

        System.out.println("c : " + c);
        System.out.println("d : " + d);
    }
}
