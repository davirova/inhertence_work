public class B_subwoofer extends B_sounds{
    B_subwoofer(){}
    B_subwoofer(int msoun,String name){
        this.msoun = msoun;
        this.name = name;
    }
public void bsub(){
    System.out.println("M_sound: "+ msoun);
    System.out.println("M_name: "+ name);

}
    public static void main(String[] args) {
        B_subwoofer bsub = new B_subwoofer(16,"MMusount");
        bsub.bsub();
    }
}
