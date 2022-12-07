package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        
        number = 4567;
        int sum = 0;
        while(number != 0){

            sum += (number % 10);
            number/=10;
        }
        System.out.println(sum);
    }
}
