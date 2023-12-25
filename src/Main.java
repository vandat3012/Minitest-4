import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Material material1 = new CrispyFlour("1", "a", LocalDate.now(), 100000, 100);
        Material material2 = new CrispyFlour("2", "b", LocalDate.now(), 110000, 100);
        Material material3 = new CrispyFlour("3", "c", LocalDate.now(), 120000, 100);
        Material material4 = new CrispyFlour("4", "d", LocalDate.now(), 130000, 100);
        Material material5 = new CrispyFlour("5", "e", LocalDate.now(), 140000, 100);
        Material material6 = new Meat("6", "meat1", LocalDate.now(), 200000, 50);
        Material material7 = new Meat("7", "meat1", LocalDate.now(), 200000, 50);
        Material material8 = new Meat("8", "meat1", LocalDate.now(), 200000, 50);
        Material material9 = new Meat("9", "meat1", LocalDate.now(), 200000, 50);
        Material material10 = new Meat("10", "meat1", LocalDate.now(), 200000, 50);

        ManageMaterial listMaterial = new ManageMaterial();
        listMaterial.addMaterial(material1);
        listMaterial.addMaterial(material2);
        listMaterial.addMaterial(material3);
        listMaterial.addMaterial(material4);
        listMaterial.addMaterial(material5);
        listMaterial.addMaterial(material6);
        listMaterial.addMaterial(material7);
        listMaterial.addMaterial(material8);
        listMaterial.addMaterial(material9);
        listMaterial.addMaterial(material10);
        int choice = -1;
        do {
            System.out.println("MENU");
            System.out.println("0. Exit");
            System.out.println("1. Thêm Bột ");
            System.out.println("2. Thêm Thịt ");
            System.out.println("3. Xóa vật liệu ");
            System.out.println("4. Tính tổng tiền vật liệu ");
            System.out.println("5. Sắp xếp vật liệu theo giá ");
            System.out.println("6 Tính nếu thịt còn 5 ngày hết hạn thì giảm 30%, còn lại thì giảm 10% ");
            System.out.println("7 Tính nếu bột còn 2 tháng hết hạn thì giảm 40%, bột còn 4 tháng hết hạn thì giảm 20%, còn lại thì giảm 5% ");
            System.out.println("8 Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay ");
            System.out.println("9 Kiểm tra số lượng nguyên liệu trong kho ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lựa chọn của bạn là ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("id ");
                    String id = scanner1.nextLine();
                    System.out.println("name ");
                    String name = scanner1.nextLine();
                    System.out.println("localDate ");
                    LocalDate.now();
                    System.out.println("cost ");
                    double cost = scanner1.nextDouble();
                    System.out.println("quality ");
                    int quantity = scanner1.nextInt();
                    Material crispyFlour = new CrispyFlour(id, name, LocalDate.now(), cost, quantity);
                    listMaterial.addMaterial(crispyFlour);
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("id ");
                    String id1 = scanner2.nextLine();
                    System.out.println("name ");
                    String name1 = scanner2.nextLine();
                    System.out.println("localDate ");
                    LocalDate.now();
                    System.out.println("cost ");
                    double cost1 = scanner2.nextDouble();
                    System.out.println("weight ");
                    double weight = scanner2.nextDouble();
                    Material meat = new Meat(id1, name1, LocalDate.now(), cost1, weight);
                    listMaterial.addMaterial(meat);
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Chọn id vật liệu mà bạn muốn xóa ");
                    String ids = scanner3.nextLine();
                    listMaterial.removeMaterial(ids);
                    break;
                case 4:
                    System.out.println("Tổng số tiền là  " + listMaterial.getTotalMoney());
                    break;
                case 5:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Số ngày còn lại ");
                    int days = scanner4.nextInt();
                    System.out.println("Muốn giảm bao nhiêu % ");
                    double discount = scanner4.nextDouble();
                    System.out.println("Tổng số tiền thịt là " + listMaterial.getMoneyMeat(days, discount));
                    break;

                case 6:
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Số ngày còn lại ");
                    int months = scanner5.nextInt();
                    System.out.println("Muốn giảm bao nhiêu % ");
                    double discount1 = scanner5.nextDouble();
                    System.out.println("Tổng số tiền thịt là " + listMaterial.getMoneyCrispyFlour(months, discount1));
                    break;
                case 7:
                case 9:
                    listMaterial.printMaterial();
                    break;
                default:
            }
        } while (choice != 0);

    }
}