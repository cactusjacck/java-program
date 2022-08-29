public class Calculon {
    public static float add(float a , float b) {
        return a + b;        
    }
    public static float sub(float a , float b) {
        return a - b;        
    }
    public static float mult(float a , float b) {
        return a * b;        
    }
    public static float div(float a , float b) {
        return a / b;        
    }

    public static float raise(float base, int exponent) {    
        float result = 1.0f;

        while(exponent > 0){
            result = result * base;
            exponent -= 1;
        }

        return result;
    }
    
    public static void main(String[] args) {
        // System.out.println(add(2, 3));
        // System.out.println(sub(2, 3));
        // System.out.println(mult(2, 3));
        // System.out.println(div(2, 3));

        System.out.println(raise(2.0f, 4)); 
    }
}