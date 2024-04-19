public class B_laptop extends B_compyuter{
    B_laptop(){}
    B_laptop(float size,int wolt){
        this.size = size;
        this.wolt = wolt;
    }
    public void getloptop(){
        System.out.println("Size:  "+ size);
        System.out.println("Wolt : "+wolt);
    }

    public static void main(String[] args) {
        B_laptop bl = new B_laptop(25f, 220);
        bl.getloptop();
    }

}
