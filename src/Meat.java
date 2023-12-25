import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturing, double cost, double weight) {
        super(id, name, manufacturing, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.weight * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturing().plusDays(7);
    }

    @Override
    public double getReallyMoney(double discount) {
        return super.getCost() * discount / 100;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", cost=" + getCost() +
                ", manufacturing=" + manufacturing +
                " ,weight=" + weight +
                '}';
    }
}
