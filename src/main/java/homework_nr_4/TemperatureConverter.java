package homework_nr_4;
public class TemperatureConverter {

    public void toFahrenheit(double celsius){

        double fahrenheit=(celsius*9/5)+32;
        System.out.println(fahrenheit);

    }

    public void toCelsius(double fahrenheit){

        double celsius = (fahrenheit-32)*5/9;
        System.out.println(celsius);

    }

    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.toCelsius(50);
        temperatureConverter.toFahrenheit(26);

    }
}
