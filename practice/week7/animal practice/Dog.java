public class Dog extends Animal {
    private String color;

    public Dog(String color, String family, String species, String name) {
        super(family, species, name);
        this.color = color;
    }

    public void bark() {
        System.out.println("""

                    BRaaaaaaaaaaaaaaaaaaAAAAAhTTAAAAAAAAAAAaaaaaaaahTAAtaaataaaaaaaaah!!

                """);
    }
}
