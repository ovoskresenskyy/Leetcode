package SomeTask1_ChickenFactory;

public class PolandHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDescription())
                .append(". My country - Poland. I give ")
                .append(getCountOfEggsPerMonth())
                .append(" eggs per month.");

        return sb.toString();
    }
}
