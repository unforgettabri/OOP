public class Main{
    public static void main (String[] args){
        
        Hair hair1 = new Hair();
        hair1.length = "short";
        hair1.color = "brown";
        hair1.type = "straight";

        Hair hair2 = new Hair();
        hair2.length = "long";
        hair2.color = "black";
        hair2.type = "curly";

        hair1.printDetails();
        hair2.printDetails();
    }
}