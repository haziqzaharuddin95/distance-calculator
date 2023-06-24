package com.woodwing.calculator.service.impl;

import com.woodwing.calculator.common.enumeration.DistanceType;
import com.woodwing.calculator.model.CalculateDistanceInputModel;
import com.woodwing.calculator.model.CalculateDistanceOutputModel;
import com.woodwing.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Autowired
  public CalculatorServiceImpl(){}

  @Override
  public CalculateDistanceOutputModel calculateDistance(CalculateDistanceInputModel inputModel) {
    double inputOne = inputModel.getInputOneUnit() == inputModel.getOutputUnit() ?
        inputModel.getInputOneValue() :
        convertInput(inputModel.getInputOneValue(), inputModel.getOutputUnit());

    double inputTwo = inputModel.getInputTwoUnit() == inputModel.getOutputUnit() ?
        inputModel.getInputTwoValue() :
        convertInput(inputModel.getInputTwoValue(), inputModel.getOutputUnit());

    double outputValue = Math.round((inputOne + inputTwo) * 100.0) / 100.0;

    CalculateDistanceOutputModel outputModel = new CalculateDistanceOutputModel();
    outputModel.setUnit(inputModel.getOutputUnit());
    outputModel.setValue(outputValue);

    return outputModel;
  }

  private double convertInput(double value, DistanceType distanceType) {
    return distanceType == DistanceType.METER ? (value / 1.094 ) : (value * 1.094);
  }
}
