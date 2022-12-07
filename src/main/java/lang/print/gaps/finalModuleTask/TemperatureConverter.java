package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        
        int temperatureFahrenheit = 1;
        temperatureCelsius = ((temperatureFahrenheit * 9 / 5) + 32);

        BigDecimal x = new BigDecimal(temperatureCelsius);
        x = BigDecimal.valueOf((((double)temperatureFahrenheit * 9 / 5) + 32));

        System.out.printf("%.1f %n", x);
    }
}
