package Format;

import Interface.Calculate;

public class Rectangle implements Calculate {
    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    private double w;
    private double l;
    public Rectangle(){
        this.w = 0;
        this.l = 0;
    }
    public Rectangle(double w, double l){
        this.w = w;
        this.l = l;
    }

    @Override
    public double Width() {
        return 0;
    }

    @Override
    public double Length() {
        return 0;
    }

    @Override
    public double Area() {
        return this.w * this.l;
    }

    @Override
    public double Perimeter() {
        return 2 * (this.w + this.l);
    }

    @Override
    public double Diagonal() {
        return Math.sqrt(Math.pow(this.w, 2)+Math.pow(this.l, 2));
    }

    @Override
    public double Volume() {
        return 0;
    }
}
