package SomeTask1_ChickenFactory;

public class HenFactory {

    public Hen getHen(Country country){
        return switch (country) {
            case USA -> new USAHen();
            case BRITAIN -> new BritainHen();
            case POLAND -> new PolandHen();
            default -> new UkrainianHen();
        };
    }
}
