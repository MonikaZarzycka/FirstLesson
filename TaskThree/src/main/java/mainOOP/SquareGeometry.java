package mainOOP;

public class SquareGeometry implements Geometry{

    private double a;

    public void setA(double a){
        this.a=a;
    }

    public double getA(){
        return a;
    }

        @Override
        public double figureArea () {
            if(a>0) {
            return a * a;
            }
            else return 0;
        }

        @Override
        public double figurePerimeter () {
            if (a > 0){
                return 4 * a;
            }
            else return 0;
        }
    }


