public class testball {
    public static void main(String[] args) {
        ball b = new ball();
        System.out.println(b);
        b.setXY(2.6, 4.9);
        System.out.println(b);
        b.move(12, -4);
        System.out.println(b);
    }
}
