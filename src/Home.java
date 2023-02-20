import java.util.Arrays;

public class   Home implements Utilitiesable {
    private String family;
    private Person[] person;
    private int energy;
    private double watter;
    private int garbage;

    public Home( String family, Person[] person, int energy, double watter, int garbage) {
        this.family = family;
        this.person = person;
        this.energy = energy;
        this.watter = watter;
        this.garbage = garbage;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public double getWatter() {
        return watter;
    }

    public void setWatter(double watter) {
        this.watter = watter;
    }

    public int getGarbage() {
        return garbage;
    }

    public void setGarbage(int garbage) {
        this.garbage = garbage;
    }
    @Override
    public void expedinture() {
        System.out.println("Expense for one year ");
        System.out.println(energy+watter*5+garbage*5+" coм" );

    }

    @Override
    public String toString() {
        return "Home " +
                "family " + family + " " +
                "person " + Arrays.toString(person) +"\n"+
                "energy " + energy +" сом\n"+
                "watter " + watter +" сом\n"+
                "garbage " + garbage +" сом";
    }
}
