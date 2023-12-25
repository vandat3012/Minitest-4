import java.util.ArrayList;


public class ManageMaterial {
    private ArrayList<Material> list;

    public ManageMaterial() {
        this.list = new ArrayList<Material>();
    }

    public ManageMaterial(ArrayList<Material> list) {
        this.list = list;
    }

    public void addMaterial(Material materials){
        this.list.add(materials);
    }

    public void removeMaterial(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                this.list.remove(list.get(i));
                break;
            }
        }
        System.out.println("Đã xóa vật liệu có id = " + id );
    }

    public void printMaterial() {
        for (Material materials : list) {
            System.out.println(materials);
        }
    }
    public double getTotalMoney() {
        double total = 0;
        for (Material materials : list) {
            total += materials.getAmount();
        }
        return total;
    }


    public double getMoneyMeat (int days, double discount) {
        double total = 0;
        for (Material materials : list) {
            if (materials.getExpiryDate().equals(days)|| materials instanceof Meat) {
                total += materials.getReallyMoney(discount);
            }
        }
        return total;
    }

    public double getMoneyCrispyFlour (int months,double discount) {
        double total = 0;
        for (Material materials : list) {
            if (materials.getExpiryDate().equals(months) || materials instanceof CrispyFlour) {
                total += materials.getReallyMoney(discount);
            }
        }
        return total;
    }

}
