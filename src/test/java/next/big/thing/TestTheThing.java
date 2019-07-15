package next.big.thing;

import org.junit.Assert;
import org.junit.Test;

public class TestTheThing {

  @Test
  public void testItGuessesTheNextNumberGivenAsingleDigitNumber(){

    // given a number is a single digit number
    // when I compute the next big then
    // then I should be given -1

    int aSingleDigitNumber = 1;
    NextBigThingCalculator nextBigThingCalculator = new NextBigThingCalculator();

    int actual = nextBigThingCalculator.next(aSingleDigitNumber);

    Assert.assertEquals("the next big thing is not as expected", -1, actual);

  }

}
