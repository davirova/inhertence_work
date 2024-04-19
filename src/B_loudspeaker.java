public class B_loudspeaker extends B_sounds{
    B_loudspeaker(){}
    B_loudspeaker(String loud_name, int loud_size, String name){
        this.loud_name = loud_name;
        this.loud_size = loud_size;
        this.name = name;
    }
    public void bl(){
        System.out.println("Loudspeaker name:  " +loud_name);
        System.out.println("Loudspeaker size:  " +loud_size);
        System.out.println("Sound name:  " +name);
    }
    public static void main(String[] args) {
            B_loudspeaker bl = new B_loudspeaker(" Flexly ",13, "HP");
            bl.bl();
    }
}
