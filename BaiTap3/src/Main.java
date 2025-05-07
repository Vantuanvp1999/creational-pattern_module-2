//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
       Shape a1 = shapeFactory.getShape("Square");
       a1.draw();
       Shape a2 =shapeFactory.getShape("Circle");
       a2.draw();
       Shape a3 = shapeFactory.getShape("Rectangle");
       a3.draw();
    }
}