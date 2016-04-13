package com.bootcamp.length;

/**
 * Created by Jagpreet on 11/04/16.
 */
public class Meter extends Length<Meter> {

  public Meter(double value) {
    super(value);
  }

  public double getFactor() {
    return 100;
  }
}
