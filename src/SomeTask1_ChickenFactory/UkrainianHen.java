package SomeTask1_ChickenFactory;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDescription())
                .append(". My country - Ukraine. I give ")
                .append(getCountOfEggsPerMonth())
                .append(" eggs per month.");

        return sb.toString();
    }
}
