public class Country {
    //continent, population, gdp, name

    private String continent;
    private int population;
    private double gdp;
    private String name;

    public Country(){
        continent = "Australia";
        population = 5;
        gdp = 28.3;
        name = "Japan";
    }

    public void printInfo(){
        System.out.println(continent);
        System.out.println(population);
        System.out.println(gdp);
        System.out.println(name);
    }

    public int getPopulation(){
        return population;
    }

    public void setPopulation(int population1){
        population = population1;
    }
}
