package com.bootcamp.length;

import java.lang.reflect.InvocationTargetException;

public abstract class Length {

  protected double value;

  public Length(double value) {
    this.value = value;
  }

  public <T extends Length> T convertTo(Class<T> unit)
          throws IllegalAccessException, InstantiationException,
          NoSuchMethodException, InvocationTargetException {
    Length length = unit.getConstructor(double.class).newInstance(centimeterValue());
    length.applyConversionFactor();
    return (T) length;
  }

  public <T extends Length> T add(T measurement)
          throws IllegalAccessException, InstantiationException,
          NoSuchMethodException, InvocationTargetException {

    Length length = measurement.getClass().getConstructor(double.class)
            .newInstance(centimeterValue() + ((Length) measurement).centimeterValue());
    length.applyConversionFactor();
    return (T) length;
  }

  public abstract double getFactor();

  private double centimeterValue() {
    return value * getFactor();
  }

  private void applyConversionFactor() {
    value = value / getFactor();
  }

  @Override
  public boolean equals(Object obj) {
    boolean areEqual = false;

    if (obj instanceof Length) {
      areEqual = centimeterValue() == ((Length) obj).centimeterValue();
    }

    return areEqual;
  }

  @Override
  public String toString() {
    return value + " ";
  }
}
