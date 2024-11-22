import static java.lang.System.*;
import java.util.Scanner;
public class TemperatureAdapter {
    public static void main(String[] args){

        Scanner sc_N = new Scanner(in);
        out.println("Адаптер температуры");
        out.print("Введите количество дней: ");
        int N = sc_N.nextInt();

        Temperature temp = new Temperature(0,15,0);
/*
        while(N>=1){
            out.print("День: ");
            temp.setDay();
            out.print("Цельсия: ");
            temp.setCelsius();
            out.print("Фаренгейт: ");
            temp.setFahrenheit();
            temp.displayTemperature();
            out.println(" ");
            N--;
        }

*/
        while (N>=1) {
            temp.getDay(1);
            temp.getCelsius(1);
            temp.getFahrenheit();
            N--;
        }
        temp.setDay(1);
        temp.setCelsius(1);
        temp.setFahrenheit(1);
        out.println(" ");
        //temp.displayTemperature();

    }
    }
class Temperature{

    Scanner sc = new Scanner(in);
    int Day;
    double Celsius;
    double Fahrenheit;

    public Temperature(int Day, double Celsius, double Fahrenheit)
    {
        this.Day = Day;
        this.Celsius = Celsius;
        this.Fahrenheit = Fahrenheit;
    }

    public void setDay(/**/int Day/**/){      // при использование Геттера раскоментить
        //this.Day = sc.nextInt();            // при использование Геттера закоментить
        this.Day = Day;
    }
    public int getDay(int plusDay) {
        if(Day==Day) {
            plusDay = ++Day;
            out.printf("Day: %s \t", plusDay);
            return plusDay;
        }
        return plusDay;
    }


    public double setCelsius(/**/double Celsius/**/){   // при использование Геттера раскоментить
        //this.Celsius = sc.nextDouble();     // при использование Геттера закоментить
        if (Celsius == 0)
        {
            this.Celsius = ((Fahrenheit-32)*5/9);
            return this.Celsius;
        }
        return this.Celsius;
    }
    public double getCelsius(double Celsium) {
        if (Celsius == Celsium) {
            Celsium = ++Celsius;
            out.printf("Celsium: %s \t", Celsium);
            return Celsium;
        }
        Celsium = ++Celsius;
        out.printf("Celsium: %s \t", Celsium);
        return Celsium;
    }

    public double setFahrenheit(/**/double Fahrenheit/**/) {    // при использование Геттера раскоментить
        //this.Fahrenheit = sc.nextDouble();  // при использование Геттера закоментить
        if (Fahrenheit == 0)
        {
            Fahrenheit = ((Celsius*9/5)+32);
            return this.Fahrenheit;
        }
        return this.Fahrenheit;
    }
    public double getFahrenheit(){
        if (Fahrenheit == 0) {
            Fahrenheit = ((Celsius*9/5)+32);
            out.printf("Fahrenheit: %s \t \n",Fahrenheit);
            return this.Fahrenheit;
        }
        else{
            Fahrenheit = ((Celsius*9/5)+32);;
            out.printf("Fahrenheit: %s \t \n",Fahrenheit);
            return this.Fahrenheit;
        }
    }

    void displayTemperature(){
        out.printf("День: %s \t Цельсия: %s \t Фаренгейта: %s \n",Day, Celsius, Fahrenheit);
    }
}