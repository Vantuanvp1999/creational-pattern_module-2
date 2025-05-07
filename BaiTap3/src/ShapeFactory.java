public class ShapeFactory {
    public Shape getShape(String shape){
        if("Rectangle".equals(shape)){
            return new Rectangle();
        }else if ("Square".equals(shape)){
            return new Square();
        }else{
            return new Circle();
        }
    }
}
