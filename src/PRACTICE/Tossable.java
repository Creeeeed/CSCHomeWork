package PRACTICE;

import java.sql.SQLOutput;

public interface Tossable {
    public void toss();

}
abstract class Ball{
    private String brandname;


    Ball(String brandname) {
        this.brandname = brandname;
    }

    public String getBrandname(){
        return brandname;
    }
    public abstract void bounce();

}
class Football extends Ball{

    Football(String brandname) {
        super(brandname);
    }

    @Override
    public void bounce() {
        System.out.println(" Boucing ball");
    }
}
class Main{
    public static void main(String[] args) {
        Football henry = new Football()
    }
}

