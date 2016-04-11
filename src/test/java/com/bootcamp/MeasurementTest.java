package com.bootcamp;

import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {

  @Test
  public void testEqualityCmAndMeter() {
    Measurement cm = new Centimeter(300);
    Measurement m = new Meter(3);

    Assert.assertEquals(m, cm);
  }

  @Test
  public void testInequalityCmAndMeter() {
    Measurement cm = new Centimeter(30);
    Measurement m = new Meter(3);

    Assert.assertFalse(m.equals(cm));
  }

  @Test
  public void testConversionCmToMeter()
          throws InstantiationException, IllegalAccessException {

    Centimeter centimeter = new Centimeter(300);
    Meter expected = new Meter(3);

    Meter actual = centimeter.convertTo(Meter.class);

    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testConversionMeterToCm()
          throws InstantiationException, IllegalAccessException {

    Measurement meter = new Meter(3);
    Centimeter expected = new Centimeter(300);

    Centimeter actual = meter.convertTo(Centimeter.class);

    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testCentimeterValueGivesCorrectValue() {

    double expected = 300;
    Measurement measurement = new Meter(3);

    double actual = measurement.centimeterValue();

    Assert.assertEquals(actual, expected, 0.0);
  }

  @Test
  public void testAdditionOfCentimeterToMeter()
          throws InstantiationException, IllegalAccessException {

    Centimeter expected = new Centimeter(600);
    Measurement meter = new Meter(3);
    Centimeter centimeter = new Centimeter(300);

    Centimeter actual = meter.add(centimeter);

    Assert.assertEquals(actual, expected);
  }

}