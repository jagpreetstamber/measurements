package com.bootcamp.length;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class LengthTest {

  @Test
  public void testEqualityCmAndMeter() {
    Length cm = new Centimeter(300);
    Length m = new Meter(3);

    Assert.assertEquals(m, cm);
  }

  @Test
  public void testInequalityCmAndMeter() {
    Length cm = new Centimeter(30);
    Length m = new Meter(3);

    Assert.assertFalse(m.equals(cm));
  }

  @Test
  public void testConversionCmToMeter()
          throws InstantiationException, IllegalAccessException,
          NoSuchMethodException, InvocationTargetException {

    Centimeter centimeter = new Centimeter(300);
    Meter expected = new Meter(3);

    Meter actual = centimeter.convertTo(Meter.class);

    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testConversionMeterToCm()
          throws InstantiationException, IllegalAccessException,
          NoSuchMethodException, InvocationTargetException {

    Length meter = new Meter(3);
    Centimeter expected = new Centimeter(300);

    Centimeter actual = meter.convertTo(Centimeter.class);

    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testAdditionOfCentimeterToMeter()
          throws InstantiationException, IllegalAccessException,
          NoSuchMethodException, InvocationTargetException {

    Centimeter expected = new Centimeter(600);
    Length meter = new Meter(3);
    Centimeter centimeter = new Centimeter(300);

    Centimeter actual = meter.add(centimeter);

    Assert.assertEquals(actual, expected);
  }

}