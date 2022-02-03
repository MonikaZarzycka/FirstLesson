package mainOOP;

    class Triangle extends Shape{

        private int a;
        private int b;
        private int c;
        private int h;

        public Triangle(int a, int b, int c, int h) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.h = h;
        }

        @Override
        public double getArea() {
            return (float) a/2*h;
        }

        @Override
        public double getPerimeter() {
            return a+b+c;
        }
    }
