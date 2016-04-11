package com.bootcamp;

public abstract class Measurement {

  protected double value;

  public Measurement() {

  }

  public Measurement(double value) {
    this.value = value;
  }

  public <T extends Measurement> T convertTo(Class<T> unit)
          throws IllegalAccessException, InstantiationException {
    return unit.newInstance().fromCentimeter(centimeterValue());
  }

  public abstract double centimeterValue();

  protected abstract <T extends Measurement> T fromCentimeter(double centimeterValue);

  protected <T extends Measurement> T add(T measurement)
          throws IllegalAccessException, InstantiationException {
    return measurement.getClass().newInstance().fromCentimeter
            (centimeterValue() + measurement.centimeterValue());
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
    return value + " ";
  }
}
