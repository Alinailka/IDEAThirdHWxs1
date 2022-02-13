public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(78910);
        System.out.println("Начислено бонусных миль: " + miles);
    }
}