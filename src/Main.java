import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello welcome to Elias's currency converter!");
        System.out.println("What would you like to do today?");
        System.out.print("1. convert currency \n2. quit\n> ");
        int input = scan.nextInt();
        String inputString = Integer.toString(input);
        while (inputString == "") {
            System.out.print("> ");
            input = scan.nextInt();
            inputString = Integer.toString(input);
        }
        if (input == 2) {
            System.out.println("Thank you for using Elias's currency converter!\nGoodbye!");
            System.exit(0);
        }
        while (input != 2) {
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
            int currency = scan.nextInt();
            System.out.print("Type how much you want to convert: ");
            int money = scan.nextInt();
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
                    11. Canadian Dollar\n>""");
            int newCurrency = scan.nextInt();
            CurrencyConverter converter = new CurrencyConverter(currency, money, newCurrency);
            CurrencyConverter converter1 = new CurrencyConverter(currency, newCurrency);
            System.out.print(money + " " + converter.getCurrency2() + " is " + converter.getNewAmount() + " in " + converter.getCurrency3());
            System.out.println("\nWhat else would you like to do today?");
            System.out.print("1. convert currency \n2. quit\n> ");
            input = scan.nextInt();
            while (inputString == "") {
                System.out.print("> ");
                input = scan.nextInt();
            }
            if (input == 2) {
                System.out.println("Thank you for using Elias's currency converter!\nGoodbye!");
                System.exit(0);
            }
        }
    }
}