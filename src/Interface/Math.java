package Interface;

public interface Math {
    public static double PI(){
        return 3.14159;
    }
    public static double Pow(double x, int a){
        double sum = 1;
        if (a == 0){
            return  1;
        }
        else if (a > 0){
            for (int i = 0; i < a; i++){
                sum *= x;
            }
        }
        return sum;
    }

    static double sqrt(double v) {
        return 0;
    }
}
