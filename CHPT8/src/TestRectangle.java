public class TestRectangle {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(5.0f, 8.0f);
        Rectangle rect2 = new Rectangle(8.0f, 3.0f);
        System.out.println("The data are entered from 0 to 20 ");
        System.out.println("rect1 ");
        System.out.printf("Perm: %s \n", rect1.getPerimeter());
        System.out.printf("Aria: %s \n", rect1.getArea());
        System.out.println("rect2 ");
        System.out.printf("Perm: %s\n", rect2.getPerimeter());
        System.out.printf("Aria: %s\n", rect2.getArea());

    }
}
