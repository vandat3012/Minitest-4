import java.time.LocalDate;

public class CrispyFlour extends Material {
    public int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id) {
        super(id);
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturing, double cost, int quantity) {
        super(id, name, manufacturing, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturing().plusMonths(12);
    }

    @Override
    public double getReallyMoney(double discount) {
        return super.getCost() * discount /100;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", manufacturing=" + manufacturing +
                " ,weight=" + quantity +
                '}';
    }
}
