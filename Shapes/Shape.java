abstract class Shape{
    private String name;
    private String color;
    
    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public double CalculateArea();
    public double CalculatePerimeter();
    public void display();
}