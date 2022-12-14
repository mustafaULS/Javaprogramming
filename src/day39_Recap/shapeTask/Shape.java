package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("name can NOT be null");
            System.exit(1);// something went wrong
        }

        this.name = name;
    }


    // dont make it private method . other class cant use or overriding
    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }


    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }




}
