import java.util.Objects;

public class CurrencyConverter {
    String origCurrency;
    int origAmount;
    String convertedCurrency;
    double conversionRate;
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
    public void convertingRate() { //find how much each currency is worth in another country
        if (origCurrency.equals("euro")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 1.03;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 7.41;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 19.29;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 19.93;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 36.67;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.86;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 143.24;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 25611.74;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 1371.76;
            } else {
                conversionRate = 1.41;
            }
        } else if (origCurrency.equals("usd")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.97;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 7.16;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 18.64;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 19.27;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 35.45;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.84;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 138.48;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 24760.00;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 1326.41;
            } else {
                conversionRate = 1.36;
            }
        }
        else if (origCurrency.equals("china yuan")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.14;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 0.14;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 2.60;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 2.69;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 4.95;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.12;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 19.34;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 3457.71;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 185.24;
            } else {
                conversionRate = 0.19;
            }
        }
        else if (origCurrency.equals("turkish lira")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.052;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 0.054;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 0.38;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 1.03;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 1.90;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.045;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 7.43;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 1328.46;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 71.17;
            } else {
                conversionRate = 0.073;
            }
        }
        else if (origCurrency.equals("mexican peso")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.05;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 0.052;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 0.37;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 0.97;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 1.84;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.043;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 7.19;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 1284.96;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 68.84;
            } else {
                conversionRate = 0.071;
            }
        }
        else if (origCurrency.equals("thai baht")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.027;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 0.028;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 0.20;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 0.53;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 0.54;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.024;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 3.91;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 698.45;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 37.42;
            } else {
                conversionRate = 0.038;
            }
        }
        else if (origCurrency.equals("pound sterling")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 1.16;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 1.20;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 8.57;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 22.32;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 23.06;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 42.45;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 165.76;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 29642.55;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 1588.07;
            } else {
                conversionRate = 1.63;
            }
        }
        else if (origCurrency.equals("japanese yen")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.0070;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 0.0072;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 0.052;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 0.13;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 0.14;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 0.26;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.0060;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 178.87;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 9.58;
            } else {
                conversionRate = 0.0098;
            }
        }
        else if (origCurrency.equals("vietnamese dong")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.000039;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 0.000040;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 0.00029;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 0.00075;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 0.00078;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 0.0014;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.000034;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 0.0056;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 1.00;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 0.054;
            } else {
                conversionRate = 0.000055;
            }
        }
        else if (origCurrency.equals("south korean won")) {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.00073;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 0.00075;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 0.0054;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 0.014;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 0.015;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 0.027;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.00063;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 0.10;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 18.67;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 1.00;
            } else {
                conversionRate = 0.0010;
            }
        }
        else {
            if (convertedCurrency.equals(("euro"))) {
                conversionRate = 0.71;
            } else if (convertedCurrency.equals("usd")) {
                conversionRate = 0.74;
            } else if (convertedCurrency.equals("china yuan")) {
                conversionRate = 5.27;
            } else if (convertedCurrency.equals("turkish lira")) {
                conversionRate = 13.72;
            } else if (convertedCurrency.equals("mexican peso")) {
                conversionRate = 14.17;
            } else if (convertedCurrency.equals("thai baht")) {
                conversionRate = 26.10;
            } else if (convertedCurrency.equals("pound sterling")) {
                conversionRate = 0.61;
            } else if (convertedCurrency.equals("japanese yen")) {
                conversionRate = 101.86;
            } else if (convertedCurrency.equals("vietnamese dong")) {
                conversionRate = 18223.73;
            } else if (convertedCurrency.equals("south korean won")) {
                conversionRate = 976.46;
            } else {
                conversionRate = 1.00;
            }
        }
    }
    public double getNewAmount() {
        return Math.round(origAmount * conversionRate * 100.0) / 100.0;
    }
}
