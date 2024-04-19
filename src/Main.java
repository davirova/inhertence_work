public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.getdoc();
        System.out.println("Doctor superclassdan inhertence olgan sub class 'Xirurg'.");
        Xirurg xg = new Xirurg();
        xg.getxirurg();
        System.out.println("Doctor superclassdan inhertence olgan sub class 'Lor'.");
        Lor lor = new Lor();
        lor.getlor();

        //  B masala buyicha umumiy kurinish
        System.out.println("\nSuper class: Electronica");
        B_electronics belc = new B_electronics("Electornic");
        belc.getelect();
        System.out.println("\nSub class and super class: Compyuter  ");
        B_compyuter bcom = new B_compyuter();
        bcom.cout();
        System.out.println("\nSub class and super class: Sound  ");
        B_sounds bc=new B_sounds();
        bc.sound();
        System.out.println("\nSub class: pc  super class compyuter ");
        B_pc pc = new B_pc( "izmu",2.5f, "izmu");
        pc.getpc();
        System.out.println("\nSub class: loptop  super class compyuter ");
        B_laptop bl= new B_laptop(13f,220);
        bl.getloptop();
        System.out.println("\nSub class: subwoofer  super class sound ");
        B_subwoofer bs = new B_subwoofer(12,"Msound");
        bs.bsub();
        System.out.println("\nSub class: loudspeaker  super class sound ");
        B_loudspeaker blm = new B_loudspeaker("Fxemin ",64,"accer");
        blm.bl();
    }
}