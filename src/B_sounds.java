public class B_sounds extends B_electronics{
    public static String sound = "32 Grs";
    public static int msoun ;
public static String loud_name ;
public static int loud_size;
  public void sound(){
      System.out.println(electronic + " sound "+ sound);
      this.getelect();
  }

    public static void main(String[] args) {
      B_electronics elec = new B_electronics("electronic");
      B_sounds soun = new B_sounds();
      soun.sound();
    }
}
