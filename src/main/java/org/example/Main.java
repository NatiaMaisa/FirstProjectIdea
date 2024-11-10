package org.example;

public class Main {
    public static void main(String[] args) {

       // 8 პრიმიტიული მონაცემთა ტიპი ჯავაში

        byte customerAge = 35; //stores whole numbers -128 to 127
        short salary = 3000; //stores whole numbers -32,768 to 32,767
        int carPrice = 100000; // stores whole numbers -2,147,483,648 to 2,147,483,647
        long housePrice = 1000000; // stores whole numbers -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float milkPrice = 5.9875f;
        double butterPrice = 25.5555555f;
        boolean a = true;
        char symbol = 'A';
        System.out.println(salary);



    // არითმეტიკული ოპერატორები

        int x = 5;
        int y = 3;
        int z = x + y;
        int w = x - y;
        int q = x * y;
       double e = (double) x / y; // დაგვჭირდა cast ანუ მნიშვნელობის შეცვლა, რადგან
        // int მთელი რიცხვია გვიბრუნებს მთელ რიცხვს და ვკარგავთ წილადებს,
        // double შემთხვევაში წილადებსაც დაგვიბრუნებს
        int r = x % y;
        double t = (double) x % y;

        System.out.println(z);
        System.out.println(w);
        System.out.println(q);
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);

        //ინკრემენტი
        System.out.println(x++); // დაბეჭდავს ისევ 7, რადგან კოდი წაიკითხავს x
        // და გაზრდას ვერ მოახერხებს რადგან ჩვენ ვთხოვთ კოდს რომ დაბეჭდოს მაშინვე დაბეჭდავს 7-ს
        System.out.println(x); // აქ კი უკვე დაბეჭდავს 8-ს,
        // რადგან წინა ინკრემენტს გაითვალისწინებს და
        // ხელახლა დაბეჭდვის დროს გაზრდის მნიშვნელობას
        System.out.println(++x); // აქ უკვე დაიბეჭდება პირდაპირ 8,
        // რადგან ჩვენ ჯერ ვზრდით ინკრემენტით და მერე მიადგება x-ს

        //დეკრემენტი
        System.out.println(--x); // დაბეჭდავს 6-ს, ჯერ შეამცირებს დეკრემენტით
        // და მერე დაგვიწერს შემცირებუ მნიშვნელობას



        //მინიჭების ოპერატორები

      // int y = 5; // = ანუ მინიჭება
       // y = y + 5;
       // y += 5;  იგივე რაც y + 5
        int u = 10;
        //u = u - 3;
        u -= 3; // იგივე რაც u - 3
       // u *= 3;
        // u /= 3;
       // u %= 3;


        // შედარების ოპერატორები

       int i = 7;
       int o = 5;
       boolean p = i > o;
       boolean s = i >= o;
       boolean f = i == o;
       boolean g = i != o;
       boolean k = i < o;
       boolean j = i <= o;


        System.out.println(p);
        System.out.println(s);
        System.out.println(f);
        System.out.println(g);
        System.out.println(j);









    }


}