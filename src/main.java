import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Вы голодны? (да/нет): ");
        boolean isHungry = scanner.nextLine().equalsIgnoreCase("да");


        System.out.print("Выберите категорию (завтрак/обед/ужин): ");
        String mealType = scanner.nextLine().toLowerCase();

        String dish;
        String drink;

        switch (mealType) {
            case "завтрак":
                dish = isHungry ? "омлет с тостами" : "йогурт с фруктами";
                drink = "кофе";
                break;
            case "обед":
                dish = isHungry ? "стейк с картофелем" : "салат с курицей";
                drink = "сок";
                break;
            case "ужин":
                dish = isHungry ? "паста с соусом" : "суп-пюре";
                drink = "сок";
                break;
            default:
                dish = "недоступно";
                drink = "";
                break;
        }
        System.out.println("Рекомендуемое блюдо: " + dish);
        System.out.println("Напиток: " + drink);
    }
}