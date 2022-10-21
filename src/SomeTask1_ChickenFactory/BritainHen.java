package SomeTask1_ChickenFactory;

public class BritainHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDescription())
                .append(". My country - Britain. I give ")
                .append(getCountOfEggsPerMonth())
                .append(" eggs per month.");

        return sb.toString();
    }
}
