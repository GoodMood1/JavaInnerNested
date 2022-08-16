package pack;

import second.Num;

public class MainNum {

    public static void main(String[] args) {
        //3
        Integer a = 2, b = 3;
        Integer i = Num.sum(a, b);
        Float f = Num.div(10f, 3f);
        Num<Double> n1 = new Num<>(12d);
        Num<Double> n2 = new Num<>(2d);
        double d = n1.multiVal(n2);

        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
    }
}
