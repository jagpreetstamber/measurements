package com.bootcamp;

/**
 * Created by Jagpreet on 11/04/16.
 */
public class Centimeter extends Measurement {

  public Centimeter() {

  }

  public Centimeter(double value) {
    super(value);
  }

  public double centimeterValue() {
    return value;
  }

  protected <T extends Measurement> T fromCentimeter(double centimeterValue) {
    return (T) new Centimeter(centimeterValue);
  }
}
