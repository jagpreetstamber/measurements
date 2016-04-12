package com.bootcamp.volume;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jagpreet on 12/04/16.
 */
public class VolumeTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testIfMiliLiterAndLiterAreEqual() throws Exception {

    Volume miliLiter = new MiliLiter(1000);
    Volume liter = new Liter(1);

    assertEquals(liter, miliLiter);
  }

  @Test
  public void testLiterToMiliLiterConversion() throws Exception {
    Liter liter = new Liter(1);
    MiliLiter expected = new MiliLiter(1000);

    MiliLiter actual = liter.convertTo(MiliLiter.class);

    assertEquals(expected, actual);

  }
}