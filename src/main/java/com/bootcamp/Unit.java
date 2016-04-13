package com.bootcamp;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Jagpreet on 12/04/16.
 */
public interface Unit<T extends Unit> {

  default T convertTo(Class<T> unit)
          throws ClassNotFoundException, NoSuchMethodException,
          IllegalAccessException, InvocationTargetException, InstantiationException {
    Unit value = unit.getConstructor(double.class).newInstance(baseValue());
    value.applyConversionFactor();
    return (T) value;
  }

  default T add(T unit)
          throws IllegalAccessException, InstantiationException,
          NoSuchMethodException, InvocationTargetException {

    Unit value = unit.getClass().getConstructor(double.class)
            .newInstance(baseValue() + ((Unit) unit).baseValue());
    value.applyConversionFactor();
    return (T) value;
  }

  double baseValue();

  void applyConversionFactor();
}
