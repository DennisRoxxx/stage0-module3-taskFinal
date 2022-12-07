package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        number = 337;
        int reversedNumber = 0;
        if (number > 99) {
            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }
            System.out.println(reversedNumber);
        }
   }
}
