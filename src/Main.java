public class Main {
    public static void main(String[] args) {
        Zeitschrift z1 =new Zeitschrift("Sibiu100");
        Zeitschrift z2 =new Zeitschrift("efainlaCluj");

        Abonnent a1=new Abonnent("Vik",z1,1000);
        Abonnent a2=new Abonnent("Radu",z2,6);

        z1.addAbonnent(a1);
        z2.addAbonnent(a2);

        z1.setPreis(7);
        z2.setPreis(8);

        System.out.println(a1.getGeldsumme());
        System.out.println(a2.getGeldsumme());

        System.out.println(z1.getListe());
        System.out.println(z2.getListe());


    }
}