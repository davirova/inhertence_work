public class B_compyuter extends B_electronics {
    public static String f_name ;
    public static float protsesor ;
    public static float size ;

public void cout()
{
    System.out.println("Compyuter nomli class ishlayapti: " + electronic );
}
    public static void main(String[] args) {
        B_compyuter bm = new B_compyuter();
        B_electronics be = new B_electronics("Electronic super class. ");
        bm.cout();

    }

}
