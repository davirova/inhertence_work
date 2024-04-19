public class B_pc extends B_compyuter{

    B_pc(){}
    B_pc(String name, float protsesor ,String f_name)
    {
        this.name = name;
        this.protsesor = protsesor;
        this.f_name = f_name;
    }
    public void getpc(){
        System.out.println("Name : " + name);
        System.out.println("Protsesor : "+ protsesor);
        System.out.println("Firma nomi : "+ f_name);
    }

    public static void main(String[] args) {
        B_pc bp= new B_pc("Macos",2.5f, "Apple" );
        bp.getpc();
    }

}
