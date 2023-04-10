public class Main {
    public static void main(String[] args) {
        
        Ksatria ksatria = new Ksatria("Joko", 5000000);
        System.out.println(ksatria.toString());
        
        Pedagang pedagang = new Pedagang("Budi", 10000000);
        System.out.println(pedagang.toString());
        
        Petani petani = new Petani("Siti", 2000000);
        System.out.println(petani.toString()); 
        
        PandaiBesi pandaiBesi = new PandaiBesi("Agus", 3000000);
        System.out.println(pandaiBesi.toString()); 
    }
}
