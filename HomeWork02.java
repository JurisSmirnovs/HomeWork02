/**
*Java Basic. HomeWork#2
*
*@Autor Juris
*@version 18.09.2022
*
*/
class HomeWork02 {
    public static void main(String[] args) {

        System.out.println("------------------------Task01----------------------------------");
            printcheckWeather();
        System.out.println("------------------------Task02----------------------------------");
            printcanWalk();
        System.out.println("------------------------Task03----------------------------------");
            int x = 8, y = 2;
            int s = sum(x, y);
            int d = dif(x, y);
            int m = mult(x, y);
            int di = div(x, y);
            System.out.println(s);
            System.out.println(d);
            System.out.println(m);
            System.out.println(di);
        System.out.println("------------------------Task04----------------------------------");
        printdayOfWeek(); 
    }
        //Task01
    static void printcheckWeather() {
        int t = 30;
        if (t < 0) {
            System.out.println("It's frosty");
        } else if (t >= 0 && t <= 18) { 
            System.out.println("It's cold");
        } else if (t >= 19 && t <= 28) { 
            System.out.println("It's warm");
        } else if (t >= 29) { 
            System.out.println("It's hot");
        }
        //Task02:
    }
    static void printcanWalk() {
        boolean isWeekend = false;
        boolean isRain = false;
        if (isWeekend) 
            if (isRain) {
                System.out.println("I cannot walk");
            } else { 
                System.out.println("I can walk");
        } else {
            System.out.println("I cannot walk");
        }
        //Task03
    }
    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }
    static int dif(int a, int b) {
        int d = a - b;
        return d;
    }
    static int mult(int a, int b) {
        int m = a * b;
        return m;
    }
    static int div(int a, int b) {
        int di = a / b;
        return di;
    }
        //Task04
    static void printdayOfWeek() {
        int d = 1;
        switch (d) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Whednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break; 
            } 
    }
}
