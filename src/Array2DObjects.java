public class Array2DObjects {
    Country [][] countries = new Country[4][5];

    public static void main(String[] args) {
        Array2DObjects a2d0 = new Array2DObjects();
    }

    public Array2DObjects(){
        for(int r = 0; r < countries.length; r++){
            for(int c = 0; c < countries[r].length; c++){
                countries[r][c] = new Country();
                countries[r][c].setPopulation((int)(Math.random()*1001));
            }
        }
        printArray();
        System.out.println(addPops());
        System.out.println(avePop());
    }

    public void printArray(){
        for(int r = 0; r < countries.length; r++){
            for(int c = 0; c < countries.length; c++) {
                System.out.print(countries[r][c].getPopulation() + " ");
            }
            System.out.println();
        }
    }

    public int addPops(){
        int sum = 0;

        for(int r = 0; r < countries.length; r++) {
            for (int c = 0; c < countries.length; c++) {
                sum = sum + countries[r][c].getPopulation();
            }
        }
        return sum;
    }

    public double avePop(){
        double average = 0;
        double sum = 0;

        for(int r = 0; r < countries.length; r++) {
            for (int c = 0; c < countries.length; c++) {
                sum = sum + countries[r][c].getPopulation();
                average = sum / countries.length;
            }
        }
        return average;
    }
}
