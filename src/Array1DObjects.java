public class Array1DObjects {

    Country [] countries = new Country[10];
    public static void main(String[] args) {
        Array1DObjects odj = new Array1DObjects();
    }
    public Array1DObjects(){
        Country us = new Country();
        us.printInfo();

        for (double i = 0; i < countries.length; i++){
            countries[(int)i] = new Country();
            countries[(int)i].setPopulation((int)(Math.random()*1001));

        }
        printArray();
        System.out.println(addPops());
    }

    public void printArray(){
        for(int x = 0; x < countries.length; x++){
            System.out.println(countries[x].getPopulation());
        }
    }

    public int addPops(){
        int sum = 0;

        for(int j = 0; j < countries.length; j++){
            sum = sum + countries[j].getPopulation();
        }

        return sum;
    }
}
