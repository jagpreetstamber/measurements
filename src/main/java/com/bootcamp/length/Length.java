package com.bootcamp.length;

import com.bootcamp.Unit;

public abstract class Length implements Unit<Length> {

  protected double value;

  public Length(double value) {
    this.value = value;
  }

  public abstract double getFactor();

  public double baseValue() {
    return value * getFactor();
  }

  public void applyConversionFactor() {
    value = value / getFactor();
  }

  @Override
  public boolean equals(Object obj) {
    boolean areEqual = false;

    if (obj instanceof Length) {
      areEqual = baseValue() == ((Length) obj).baseValue();
    }

    return areEqual;
  }

  @Override
  public String toString() {
    return value + " ";
  }
}
