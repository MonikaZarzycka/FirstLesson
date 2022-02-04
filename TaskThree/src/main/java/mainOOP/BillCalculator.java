package mainOOP;

class BillCalculator {

        public double calculate(double orderValue, float serviceValue) {
        return orderValue + Double.valueOf(serviceValue);
        }

        public double calculate(double orderValue, float serviceValue, double discount) {
        return (orderValue - discount) + Double.valueOf(serviceValue);
        }

        public double calculate(double orderValue, float serviceValue, short takeOutFee) {
            return orderValue + Double.valueOf(serviceValue) + Double.valueOf(takeOutFee);

        }
}

class BillMain{
    public static void main(String[] args) {
        BillCalculator billCalculator= new BillCalculator();
        System.out.println(billCalculator.calculate(4.324,5));
        System.out.println(billCalculator.calculate(32.245,19,1));
        System.out.println(billCalculator.calculate(4.12124, 1, 1.124));
    }
}