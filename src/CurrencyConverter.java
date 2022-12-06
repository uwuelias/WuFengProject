

public class CurrencyConverter {
     int origAmount;
     int currency2;
     int currency3;
    private double conversionRate;
    public CurrencyConverter(int currency1, int currency2) {
        this.currency2 = currency1;
        this.currency3 = currency2;
    }
    /*public CurrencyConverter(int currency, int amount, int newCurrency) {
        if (currency == 1) {
            this.origCurrency = "euro";
        } else if (currency == 2) {
            this.origCurrency = "usd";
        } else if (currency == 3) {
            this.origCurrency = "china yuan";
        } else if (currency == 4) {
            this.origCurrency = "turkish lira";
        } else if (currency == 5) {
            this.origCurrency = "mexican peso";
        } else if (currency == 6) {
            this.origCurrency = "thai baht";
        } else if (currency == 7) {
            this.origCurrency = "pound sterling";
        } else if (currency == 8) {
            this.origCurrency = "japanese yen";
        } else if (currency == 9) {
            this.origCurrency = "vietnamese dong";
        } else if (currency == 10) {
            this.origCurrency = "south korean won";
        } else {
            this.origCurrency = "canadian dollar";
        }
        this.origAmount = amount;
        if (newCurrency == 1) {
            this.convertedCurrency = "euro";
        } else if (newCurrency == 2) {
            this.convertedCurrency = "usd";
        } else if (newCurrency == 3) {
            this.convertedCurrency = "china yuan";
        } else if (newCurrency == 4) {
            this.convertedCurrency = "turkish lira";
        } else if (newCurrency == 5) {
            this.convertedCurrency = "mexican peso";
        } else if (newCurrency == 6) {
            this.convertedCurrency = "thai baht";
        } else if (newCurrency == 7) {
            this.convertedCurrency = "pound sterling";
        } else if (newCurrency == 8) {
            this.convertedCurrency = "japanese yen";
        } else if (newCurrency == 9) {
            this.convertedCurrency = "vietnamese dong";
        } else if (newCurrency == 10) {
            this.convertedCurrency = "south korean won";
        } else {
            this.convertedCurrency = "canadian dollar";
        }
    }
    */
    public void convertingRate() { //find how much each currency is worth in another country
        if (currency2 == 1) {
            if (currency3 == 1) {
                this.conversionRate = 1.00;
            } else if (currency3 == 2) {
                this.conversionRate = 1.03;
            } else if (currency3 == 3) {
                this.conversionRate = 7.41;
            } else if (currency3 == 4) {
                this.conversionRate = 19.29;
            } else if (currency3 == 5) {
                this.conversionRate = 19.93;
            } else if (currency3 == 6) {
                this.conversionRate = 36.67;
            } else if (currency3 == 7) {
                this.conversionRate = 0.86;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 143.24;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 25611.74;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 1371.76;
            } else {
                this.conversionRate = 1.41;
            }
        } else if (currency2.equals("usd")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.97;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 1.00;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 7.16;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 18.64;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 19.27;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 35.45;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.84;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 138.48;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 24760.00;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 1326.41;
            } else {
                this.conversionRate = 1.36;
            }
        }
        else if (currency2.equals("china yuan")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.14;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 0.14;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 1.00;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 2.60;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 2.69;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 4.95;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.12;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 19.34;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 3457.71;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 185.24;
            } else {
                this.conversionRate = 0.19;
            }
        }
        else if (currency2.equals("turkish lira")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.052;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 0.054;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 0.38;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 1.00;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 1.03;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 1.90;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.045;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 7.43;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 1328.46;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 71.17;
            } else {
                this.conversionRate = 0.073;
            }
        }
        else if (currency2.equals("mexican peso")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.05;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 0.052;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 0.37;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 0.97;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 1.00;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 1.84;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.043;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 7.19;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 1284.96;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 68.84;
            } else {
                this.conversionRate = 0.071;
            }
        }
        else if (currency2.equals("thai baht")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.027;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 0.028;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 0.20;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 0.53;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 0.54;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 1.00;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.024;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 3.91;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 698.45;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 37.42;
            } else {
                this.conversionRate = 0.038;
            }
        }
        else if (currency2.equals("pound sterling")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 1.16;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 1.20;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 8.57;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 22.32;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 23.06;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 42.45;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 1.00;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 165.76;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 29642.55;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 1588.07;
            } else {
                this.conversionRate = 1.63;
            }
        }
        else if (currency2.equals("japanese yen")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.0070;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 0.0072;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 0.052;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 0.13;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 0.14;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 0.26;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.0060;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 1.00;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 178.87;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 9.58;
            } else {
                this.conversionRate = 0.0098;
            }
        }
        else if (currency2.equals("vietnamese dong")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.000039;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 0.000040;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 0.00029;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 0.00075;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 0.00078;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 0.0014;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.000034;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 0.0056;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 1.00;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 0.054;
            } else {
                this.conversionRate = 0.000055;
            }
        }
        else if (currency2.equals("south korean won")) {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.00073;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 0.00075;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 0.0054;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 0.014;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 0.015;
            } else if (currency3 == ("thai baht")) {
                this.conversionRate = 0.027;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.00063;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 0.10;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 18.67;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 1.00;
            } else {
                this.conversionRate = 0.0010;
            }
        }
        else {
            if (currency3.equals(("euro"))) {
                this.conversionRate = 0.71;
            } else if (currency3.equals("usd")) {
                this.conversionRate = 0.74;
            } else if (currency3.equals("china yuan")) {
                this.conversionRate = 5.27;
            } else if (currency3.equals("turkish lira")) {
                this.conversionRate = 13.72;
            } else if (currency3.equals("mexican peso")) {
                this.conversionRate = 14.17;
            } else if (currency3.equals("thai baht")) {
                this.conversionRate = 26.10;
            } else if (currency3.equals("pound sterling")) {
                this.conversionRate = 0.61;
            } else if (currency3.equals("japanese yen")) {
                this.conversionRate = 101.86;
            } else if (currency3.equals("vietnamese dong")) {
                this.conversionRate = 18223.73;
            } else if (currency3.equals("south korean won")) {
                this.conversionRate = 976.46;
            } else {
                this.conversionRate = 1.00;
            }
        }
    }
    public String getCurrency2() {
        return currency2;
    }
    public String getCurrency3() {
        return currency3;
    }
    public double getNewAmount() {
        return origAmount * conversionRate;
    }
}
