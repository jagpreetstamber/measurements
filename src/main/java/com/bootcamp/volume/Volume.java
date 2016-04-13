package com.bootcamp.volume;

import com.bootcamp.Unit;

public abstract class Volume implements Unit<Volume> {

  private double value;

  public Volume(double value) {
    this.value = value;
  }

  public abstract double getConversionFactor();

  @Override
  public double baseValue() {
    return value * getConversionFactor();
  }

  public void applyConversionFactor() {
    value = value / getConversionFactor();
  }

  @Override
  public boolean equals(Object obj) {
    boolean areEqual = false;

    if (obj instanceof Volume) {
      areEqual = baseValue() == ((Volume) obj).baseValue();
    }

    return areEqual;
  }

  @Override
  public String toString() {
    return value + " ";
  }
}
