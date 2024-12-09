public class Array1D {
    int [] numbers = new int[10];

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Array1D a1d = new Array1D();
    }

    public Array1D(){
        numbers[0] = 54;
        for(int i = 0; i < numbers.length; i++){
            int tim = (int)(Math.random()*101);
            numbers[i] = tim;
        }
        printArray();
        System.out.println(sumArray());
    }

    public void printArray(){
       for(int x = 0; x < numbers.length; x++){
           System.out.println(numbers[x]);
       }
    }

    public int sumArray(){
        int sum = 0;

        for(int j = 0; j < numbers.length; j++){
            sum = sum + numbers[j];
        }

        return sum;
    }
    public double aveArray(){
        double average = 0;


        return average;
    }
}
