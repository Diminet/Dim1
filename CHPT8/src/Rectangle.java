public class Rectangle{
    private double length;
    private double width;

    public Rectangle(){
        setLength(1.0f);
        setWidth(1.0f);
    }
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
   public void setLength(double length){
        if(length >= 0.0f && length <=20.0f)
            this.length = length;
          }
    public void setWidth(double width){
        if(width >= 0.0f && width <= 20.0f)
            this.width = width;
         }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }
    public double getArea(){
        return length * width;
    }

}