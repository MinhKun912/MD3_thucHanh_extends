public class Main {
    public static void main(String[] args) {
Shape shape=new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);
        //kiểm thử Class Circle
        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5,"blue", false);
        System.out.println(circle);


            //Kiểm thử RECTANGLE
            System.out.println("---------RECTANGLE----------");
            Rectangle rectangle = new Rectangle();
            System.out.println(rectangle);
            rectangle = new Rectangle(2.3, 5.8);
            System.out.println(rectangle);
            rectangle = new Rectangle(2.5, 3.8,"orange", true);
            System.out.println(rectangle);
    }
}