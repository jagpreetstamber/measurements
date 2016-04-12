package com.bootcamp.volume;

/**
 * Created by Jagpreet on 12/04/16.
 */
public class MiliLiter extends Volume {

  public MiliLiter(double value) {
    super(value);
  }

  public double getConversionFactor() {
    return 1;
  }
}
