package com.woodwing.calculator.model;

import com.woodwing.calculator.common.enumeration.DistanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CalculateDistanceOutputModel implements Serializable {
  private static final long serialVersionUID = 5719011960523705975L;

  private double value;
  private DistanceType unit;

}