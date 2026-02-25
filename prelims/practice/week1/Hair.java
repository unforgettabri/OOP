public class Hair{
    String length;
    String color;
    String type;

    void printDetails(){
        System.out.printf("""
        %s %s %s hair
        """, length, color, type );
    }
}