package SomeTask1_ChickenFactory;

public class USAHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDescription())
                .append(". My country - USA. I give ")
                .append(getCountOfEggsPerMonth())
                .append(" eggs per month.");

        return sb.toString();
    }
}
