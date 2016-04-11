package com.bootcamp;

import org.junit.Assert;
import org.junit.Test;

import java.util.UnknownFormatConversionException;

public class MeasurementTest {

  @Test
  public void testEqualityCmAndMeter() {
    Measurement cm = new Measurement(300, Measurement.Unit.CM);
    Measurement m = new Measurement(3, Measurement.Unit.M);

    Assert.assertEquals(m, cm);
  }

  @Test
  public void testInequalityCmAndMeter() {
    Measurement cm = new Measurement(30, Measurement.Unit.CM);
    Measurement m = new Measurement(3, Measurement.Unit.M);

    Assert.assertFalse(m.equals(cm));
  }

  @Test
  public void testConversionCmToMeter() {

    Measurement measurement = new Measurement(300, Measurement.Unit.CM);
    String expected = "3.0 M";

    String actual = measurement.convertToMeter().toString();

    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testConversionMeterToCm() {

    Measurement measurement = new Measurement(3, Measurement.Unit.M);
    String expected = "300.0 CM";

    String actual = measurement.convertToCentimeter().toString();

    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testCentimeterValueGivesCorrectValue() {

    double expected = 300;
    Measurement measurement = new Measurement(3, Measurement.Unit.M);

    double actual = measurement.centimeterValue();

    Assert.assertEquals(actual, expected, 0.0);
  }

  @Test(expected = UnknownFormatConversionException.class)
  public void testCentimeterValueWithIncorrectMeasurement() {

    new Measurement(3, null);
  }

}