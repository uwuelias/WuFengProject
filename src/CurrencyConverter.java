import java.util.Objects;

public class CurrencyConverter {
    String origCurrency;
    int origAmount;
    String convertedCurrency;
    public CurrencyConverter(String currency, int amount, String newCurrency) {
        if (currency.equals("1")) {
            this.origCurrency = "euro";
        } else if (currency.equals("2")) {
            this.origCurrency = "usd";
        } else if (currency.equals("3")) {
            this.origCurrency = "china yuan";
        } else if (currency.equals("4")) {
            this.origCurrency = "turkish lira";
        } else if (currency.equals("5")) {
            this.origCurrency = "mexican peso";
        } else if (currency.equals("6")) {
            this.origCurrency = "thai baht";
        } else if (currency.equals("7")) {
            this.origCurrency = "pound sterling";
        } else if (currency.equals("8")) {
            this.origCurrency = "japanese yen";
        } else if (currency.equals("9")) {
            this.origCurrency = "vietnamese dong";
        } else if (currency.equals("10")) {
            this.origCurrency = "south korean won";
        } else {
            this.origCurrency = "canadian dollar";
        }
        this.origAmount = amount;
        if (Objects.equals(newCurrency, "1")) {
            this.convertedCurrency = "euro";
        } else if (Objects.equals(newCurrency, "2")) {
            this.convertedCurrency = "usd";
        } else if (Objects.equals(newCurrency, "3")) {
            this.convertedCurrency = "china yuan";
        } else if (Objects.equals(newCurrency, "4")) {
            this.convertedCurrency = "turkish lira";
        } else if (Objects.equals(newCurrency, "5")) {
            this.convertedCurrency = "mexican peso";
        } else if (Objects.equals(newCurrency, "6")) {
            this.convertedCurrency = "thai baht";
        } else if (Objects.equals(newCurrency, "7")) {
            this.convertedCurrency = "pound sterling";
        } else if (Objects.equals(newCurrency, "8")) {
            this.convertedCurrency = "japanese yen";
        } else if (Objects.equals(newCurrency, "9")) {
            this.convertedCurrency = "vietnamese dong";
        } else if (Objects.equals(newCurrency, "10")) {
            this.convertedCurrency = "south korean won";
        } else {
            this.convertedCurrency = "canadian dollar";
        }
    }
    public double convertingRate() { //find how much each currency is worth in another country
        if ()
    }
    public double getNewAmount() { //return new amount
    }
}
