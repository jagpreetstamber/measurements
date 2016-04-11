package com.bootcamp;

import java.util.UnknownFormatConversionException;

public class Measurement {

  private double value;
  private Unit unit;

  public enum Unit {CM, M}

  Measurement(double value, Unit unit) {
    this.value = value;
    this.unit = unit;

    if (unit == null) {
      throw new UnknownFormatConversionException("Unknown Measurement");
    }
  }

  public Measurement convertToMeter() {
    if (unit.equals(Unit.CM)) {
      value = value / 100;
      unit = Unit.M;
    }
    return this;
  }

  public Measurement convertToCentimeter() {
    if (unit.equals(Unit.M)) {
      value = value * 100;
      unit = Unit.CM;
    }
    return this;
  }

  public double centimeterValue() {
    double cmValue;
    switch (unit) {
      case M:
        cmValue = value * 100;
        break;
      case CM:
        cmValue = value;
        break;
      default:
        throw new UnknownFormatConversionException("Unknown Measurement");
    }

    return cmValue;
  }

  @Override
  public boolean equals(Object obj) {
    boolean areEqual = false;

    if (obj instanceof Measurement) {
      areEqual = centimeterValue() == ((Measurement) obj).centimeterValue();
    }

    return areEqual;
  }

  @Override
  public String toString() {
    return value + " " + unit;
  }
}
