import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello welcome to Elias's currency converter!");
        System.out.println("What would you like to do today?");
        System.out.print("1. convert currency \n2. quit\n> ");
        String input = scan.nextLine();
        while (input == "") {
            System.out.print("> ");
            input = scan.nextLine();
        }
        if (input == "2") {
            System.out.println("Thank you for using Elias's currency converter!\nGoodbye!");
            System.exit(0);
        }
        while (input != "2") {
            System.out.print("What currency would you like to convert?\n");
            System.out.print("""
                    1. Euro
                    2. USD
                    3. China Yuan
                    4. Turkish Lira
                    5. Mexican Peso
                    6. Thai Baht
                    7. Pound Sterling
                    8. Japanese Yen
                    9. Vietnamese dong
                    10. South Korean Won
                    11. Canadian Dollar""");
            System.out.print("\n> ");
            String currency = scan.nextLine();
            while (!(currency.contains("1") || currency.contains("2") || currency.contains("3") || currency.contains("4") || currency.contains("5") || currency.contains("6") || currency.contains("7") || currency.contains("8") || currency.contains("9") || currency.contains("10") || currency.contains("11"))) {
                System.out.print("Please answer correctly.\n> ");
            }
            System.out.print("Type how much you want to convert: ");
            int money = scan.nextInt(); //if statement to make sure user input a valid answer
            System.out.print("What currency would you like to convert it to?\n");
            System.out.print("""
                    1. Euro
                    2. USD
                    3. China Yuan
                    4. Turkish Lira
                    5. Mexican Peso
                    6. Thai Baht
                    7. Pound Sterling
                    8. Japanese Yen
                    9. Vietnamese dong
                    10. South Korean Won
                    11. Canadian Dollar""");
            String newCurrency = scan.nextLine();
            while (!(newCurrency.contains("1") || newCurrency.contains("2") || newCurrency.contains("3") || newCurrency.contains("4") || newCurrency.contains("5") || newCurrency.contains("6") || newCurrency.contains("7") || newCurrency.contains("8") || newCurrency.contains("9") || newCurrency.contains("10") || newCurrency.contains("11"))) {
                System.out.print("Please answer correctly.\n> ");
            }
            CurrencyConverter converter = new CurrencyConverter(currency, money, newCurrency);

        }
    }
}