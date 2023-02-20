import java.util.Arrays;

public class Flat implements Utilitiesable {
    private String family;
    private Person[] person;
    private int energy;
    private double watter;
    private int garbage;
    private int flat;

    public Flat(String family,Person[] person, int energy, double watter, int garbage, int flat) {
        this.family = family;
        this.person = person;
        this.energy = energy;
        this.watter = watter;
        this.garbage = garbage;
        this.flat = flat;
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

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
    @Override
    public void expedinture() {
        System.out.println("Expense for one year ");
        System.out.println(energy+watter*3+garbage*3+flat+" coм");

    }

    @Override
    public String toString() {
        return "Flat " +
                "family " + family +" " +
                "person " + Arrays.toString(person) +"\n"+
                "energy " + energy +" сом\n"+
                "watter " + watter +" сом\n"+
                "garbage " + garbage +" сом\n"+
                "flat " + flat +" сом" ;
    }
}
