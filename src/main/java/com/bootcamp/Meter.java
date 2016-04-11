package com.bootcamp;

/**
 * Created by Jagpreet on 11/04/16.
 */
public class Meter extends Measurement {

  public Meter() {

  }

  public Meter(double value) {
    super(value);
  }

  public double centimeterValue() {
    return value * 100;
  }

  protected <T extends Measurement> T fromCentimeter(double centimeterValue) {
    return (T) new Meter(centimeterValue / 100);
  }
}
