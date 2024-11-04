package main;

public class Example8 {
    public static void main(String[] args) {
        var i=10;
        while(i<20){
            i=i+1;
            if(i%2==0) {
                continue;
            }
            System.out.println(i);

        }

    }
}
