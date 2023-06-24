package com.woodwing.calculator.service;

import com.woodwing.calculator.model.CalculateDistanceInputModel;
import com.woodwing.calculator.model.CalculateDistanceOutputModel;

public interface CalculatorService {
  CalculateDistanceOutputModel calculateDistance(CalculateDistanceInputModel inputModel);
}
