package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;

    }

    public static int rubleToDollar(int value) {
        int rsl = value/60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static int euroToRuble(int value){
        return value*70;
    }

    public static int dollarToRuble(int value){
        return value*60;
    }



    public static void main(String[] args) {
        int inEuro =140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;

        int euro = Converter.rubleToEuro(140);

        int inDollar = 590;
        int expectedDollar = 9;
        int outDollar = rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;

        int rubleToDollar = 10;
        int expectedRubleDollar = 600;
        int outRubleDollar = dollarToRuble(rubleToDollar);
        boolean passedRubleDollar = expectedRubleDollar==outRubleDollar;

        int rubleToEuro =7;
        int expectedRubleEuro = 490;
        int outRubleEuro = euroToRuble(rubleToEuro);
        boolean passedRubleEuro = expectedRubleEuro ==outRubleEuro;

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("590 rubles are "+Converter.rubleToDollar(590)+" dollar.");
        System.out.println("140 rubles are 2. Test result : "+ passedEuro);
        System.out.println("590 rubles are 9. Test result : "+ passedDollar);
        System.out.println("10 dollars are "+Converter.dollarToRuble(10)+" rubles.");
        System.out.println("7 euro are "+Converter.euroToRuble(7)+" rubles.");
        System.out.println("10 dollars are 600. Test result : "+passedRubleDollar);
        System.out.println("7 euro are 490. Test result : "+passedRubleEuro);
    }
}
