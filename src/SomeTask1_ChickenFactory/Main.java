package SomeTask1_ChickenFactory;

public class Main {
    public static void main(String[] args) {

        HenFactory hf = new HenFactory();
        System.out.println(hf.getHen(Country.UKRAINE).getDescription());
        System.out.println(hf.getHen(Country.USA).getDescription());
        System.out.println(hf.getHen(Country.BRITAIN).getDescription());
        System.out.println(hf.getHen(Country.POLAND).getDescription());

    }
}
