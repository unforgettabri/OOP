public class Animal {
    private String family;
    private String species;
    private String name;

    // constructor
    public Animal(String family, String species, String name) {
        this.family = family;
        this.species = species;
        this.name = name;
    }

    // setters
    public void setFamily(String family) {
        this.family = family;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters
    public String getFamily() {
        return family;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

}
