public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("Задава №2");
        for (int q = 10; q >= 0; q--){
            System.out.println(q);
        }
        System.out.println("Задава №3");
        for (int g = 0; g <= 17; g = g + 2){
            System.out.println(g);
        }
        System.out.println("Задава №4");
        for (int w = 10; w >= -10; w --){
            System.out.println(w);
        }
        System.out.println("Задава №5");
        for (int e = 1904; e <= 2096; e = e + 4){
            System.out.println("Год является високосным " +e);
        }
        System.out.println("Задава №6");
        for (int r = 7; r <= 98; r = r + 7){
            System.out.println(r);
        }
        System.out.println("Задава №7");
        for (int t = 1 ; t <=512 ; t = t * 2){
            System.out.println(t);
        }
        System.out.println("Задава №8");
        int savings = 29_000;
        int total = 0;
        for (int y = 1 ; y <= 12 ; y++ ){
            total = total + savings;
            System.out.println("За " + y + " Месяц итого " +total);
        }
        System.out.println("Задава №9");
        int income = 29_000;
        int totali = 0;
        for (int u = 1 ; u <= 12 ; u++ ){
            totali = totali + totali/100;
            totali = totali + income;
            System.out.println("За " + u + " Месяц сумма накоплений равна " +totali+ " рублей");
        }
        System.out.println("Задава №10");
        int number = 0;
        for (int p = 1 ; p <= 10 ; p ++){
            number = p * 2;
            System.out.println("2 * " +p+ " = " + number);
        }

    }
}