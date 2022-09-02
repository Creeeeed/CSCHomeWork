package Week3;

public interface Polygon {

    // interface sometimes have final, constants
    public static int SIZE = 5;
    public static int LENGTH = 4;
    public static int WIDTH = 8;

    //methods 'contracts'
    public void getName();
    public void getNumberofSides();
    public void getArea();
    public void getPerimeter();

}

class Rectangle implements Polygon{
     @Override
    public void getName(){
         System.out.println("");
     }

    @Override
    public void getNumberofSides() {

    }

    @Override
    public void getArea() {

    }

    @Override
    public void getPerimeter() {

    }
}


class Square implements Polygon{
    @Override
    public void getName(){
        System.out.println("This is a square");
    }

    @Override
    public void getNumberofSides() {
        System.out.println(" It has" 4 "sides");


    }

    @Override
    public void getArea() {
        System.out.println("Area of the square is" LENGTH*LENGTH)

    }

    @Override
    public void getPerimeter() {
        System.out.print( )

    }
}