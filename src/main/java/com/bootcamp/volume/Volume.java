package com.bootcamp.volume;

import java.lang.reflect.InvocationTargetException;

public abstract class Volume {

  private double value;

  public Volume(double value) {
    this.value = value;
  }

  public abstract double getConversionFactor();

  public <T extends Volume> T convertTo(Class<T> unit)
          throws ClassNotFoundException, NoSuchMethodException,
          IllegalAccessException, InvocationTargetException, InstantiationException {
    Volume volume = unit.getConstructor(double.class).newInstance(miliLiterValue());
    volume.applyConversionFactor();
    return (T) volume;
  }

  private double miliLiterValue() {
    return value * getConversionFactor();
  }

  private void applyConversionFactor() {
    value = value / getConversionFactor();
  }

  @Override
  public boolean equals(Object obj) {
    boolean areEqual = false;

    if (obj instanceof Volume) {
      areEqual = miliLiterValue() == ((Volume) obj).miliLiterValue();
    }

    return areEqual;
  }

  @Override
  public String toString() {
    return value + " ";
  }
}
