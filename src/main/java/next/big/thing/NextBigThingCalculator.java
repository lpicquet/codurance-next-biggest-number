package next.big.thing;

public class NextBigThingCalculator {
  public int next(int aNumber) {
    String[] digits = String.valueOf(aNumber).split("");

    if (digits.length == 1){
      return -1;
    }

    int firstDigit = Integer.valueOf(digits[0]);
    // remove the first digit from the list of digit
    findHighestNumber(digits);
    findTheLowestNumber(digits);
    int nextDigit = findNextBigestDigit(digits, firstDigit);


  }

  private int findNextBigestDigit(String[] digits, int firstDigit) {
    Integer nextBiggestDigit = null;

    for (int i = 0; i < digits.length; i++) {
      int aDigit = Integer.valueOf(digits[i]);
      if (nextBiggestDigit == null || aDigit < nextBiggestDigit || aDigit > firstDigit) {
          nextBiggestDigit = aDigit;
        }
    }
    return 0;
  }
}
