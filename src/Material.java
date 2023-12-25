import java.time.LocalDate;
import java.util.Objects;


public abstract class Material implements Discount{
    private String id;
    private String name;
    LocalDate manufacturing;
    private double cost;
    public Material(){
    }

    public Material(String id) {
        this.id = id;
    }

    public Material(String id, String name, LocalDate manufacturing, double cost) {
        this.id = id;
        this.name = name;
        this.manufacturing = manufacturing;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(LocalDate manufacturing) {
        this.manufacturing = manufacturing;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getAmount(){
        return 0;
    };

    public LocalDate getExpiryDate(){
        return LocalDate.now();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost);
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturing=" + manufacturing +
                ", cost=" + cost +
                '}';
    }

    @Override
    public abstract double getReallyMoney(double discount);

}
