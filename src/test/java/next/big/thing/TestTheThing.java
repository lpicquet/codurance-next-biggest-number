package next.big.thing;

import org.junit.Assert;
import org.junit.Test;

public class TestTheThing {

  NextBigThingCalculator nextBigThingCalculator = new NextBigThingCalculator();

  @Test
  public void testItGuessesTheNextNumberGivenAsingleDigitNumber(){




    assertNextBigThing(1, -1);

  }

  @Test
  public void testItGuessesTheNextNumberGivenATwoDigitNumberLower(){
    assertNextBigThing(10, -1);

  }

  @Test
  public void testATwoDigitNumberWithIdenticalDigits(){
    assertNextBigThing(11, -1);
  }

  @Test
  public void testATwoDigitNumberLower(){
    assertNextBigThing(12, 21);
  }

  private void assertNextBigThing(int aNumber, int expected) {
    int actual = nextBigThingCalculator.next(aNumber);


    // given a number is a single digit number
    // when I compute the next big then
    // then I should be given -1

    Assert.assertEquals("the next big thing is not as expected", expected, actual);
  }


}
