package Format;

import Interface.Calculate;
import Interface.Math;

public class Square implements Calculate {
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    private double size;
    public Square(){
        super();
    }
    public Square(double size){
        this.size = size;
    }
    @Override
    public double Width() {
        return this.size;
    }

    @Override
    public double Length() {
        return this.size;
    }

    @Override
    public double Area() {
        return this.size*this.size;
    }

    @Override
    public double Perimeter() {
        return 4*this.size;
    }

    @Override
    public double Diagonal() {
        return java.lang.Math.sqrt(2*this.size);
    }

    @Override
    public double Volume() {
        return 0;
    }
}
