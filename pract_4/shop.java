package pract_4;

import java.util.Scanner;

class Shop{


    public void view(int z){
        switch (z){
           // case 1->;
        }
    }
}

enum allShop{
    generators,
    tools,
    snack;

}
enum generators{


    belarus(35000),
    russian(45000),


    private double cost;

    computers(double cost){
        this.cost=cost;
    }
}
enum tools{
    flashlight(15000),
    showel(20000),
    wrench(40000);

    private double cost;

    phones(double cost){
        this.cost=cost;
    }
}
enum snack{
    chips(32000),
    fish(20000),
    ipad(35000);

    private double cost;

    tablets(double cost){
        this.cost=cost;
    }

}

public class shop {

    public static boolean auth(int password, int enterPassword){
        boolean enter = false;
            if(enterPassword==password){
                enter = true;
            } else {
                System.out.println("Неверный пароль. Введите пароль ещё раз");
            }
        return enter;
    }

    public static void mai(String[] args){
        Scanner in = new Scanner(System.in);
        int password=1234;
        boolean enter = false;

        System.out.println("Добро пожаловать в интернет магазин, введите пароль");
        while (enter==false){
            int enterPassword = in.nextInt();
            auth(password,enterPassword);
        }
    }
}
