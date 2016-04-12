package com.bootcamp.volume;

/**
 * Created by Jagpreet on 12/04/16.
 */
public class Liter extends Volume {

  public Liter(double value) {
    super(value);
  }

  public double getConversionFactor() {
    return 1000;
  }
}
