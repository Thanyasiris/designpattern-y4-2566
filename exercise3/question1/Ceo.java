public class Ceo implements ICeo {

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void addBonus() {
        System.out.println("Adding bonus at the end of the year...");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Making decisions...");
    }

    @Override
    public void addStocks() {
        System.out.println("Gettings shares of the company as bonus...");
    }
}
