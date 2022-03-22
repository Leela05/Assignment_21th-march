package com.Harman;

public class RBI {
    float getInterestRate() {
        return 7;
    }
}
class AXIS extends RBI{
    @Override
    float getInterestRate() {
        return 8;
    }
}
class SBI extends RBI{
    @Override
    float getInterestRate() {
        return 8.5F;
    }
}
class ICICI extends RBI{
    @Override
    float getInterestRate() {
        return 8.5F;
    }
}
class Main extends RBI{
    public static void main(String[] args) {
        RBI obj = new RBI();
        System.out.print("Interest rate of RBI: ");
        System.out.println(obj.getInterestRate());
        SBI obj2 = new SBI();
        System.out.print("Interest rate of SBI: ");
        System.out.println(obj2.getInterestRate());
        AXIS obj3 = new AXIS();
        System.out.print("Interest rate of Axis: ");
        System.out.println(obj3.getInterestRate());
        ICICI obj4 = new ICICI();
        System.out.print("Interest rate of ICICI: ");
        System.out.println(obj4.getInterestRate());
    }
}
