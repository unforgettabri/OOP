public class Cat extends Animal {
    private String color;

    public Cat(String color, String family, String species, String name) {
        super(family, species, name);
        this.color = color;
    }

    public void meow() {
        System.out.println("""

                raoaaAAAAwrk!!!

                            """);
    }
}
