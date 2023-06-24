package com.woodwing.calculator.model;

import com.woodwing.calculator.common.enumeration.DistanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CalculateDistanceInputModel implements Serializable {
  private static final long serialVersionUID = -2109647022451711603L;

  @NotNull
  private double inputOneValue;

  @NotNull
  private DistanceType inputOneUnit;

  @NotNull
  private double inputTwoValue;

  @NotNull
  private DistanceType inputTwoUnit;

  @NotNull
  private DistanceType outputUnit;

}
