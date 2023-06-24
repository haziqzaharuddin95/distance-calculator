package com.woodwing.calculator.controller;

import com.woodwing.calculator.model.CalculateDistanceInputModel;
import com.woodwing.calculator.model.CalculateDistanceOutputModel;
import com.woodwing.calculator.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.woodwing.calculator.common.ApiUrlConstants.URL_API_CALCULATE_DISTANCE;

@RestController
public class CalculatorApiController {
  private static final Logger LOG = LoggerFactory.getLogger(CalculatorApiController.class);

  private final CalculatorService calculatorService;

  @Autowired
  public CalculatorApiController(CalculatorService calculatorService){
    this.calculatorService = calculatorService;
  }

  @PostMapping(URL_API_CALCULATE_DISTANCE)
  @ResponseBody
  public CalculateDistanceOutputModel calculateDistance(@Valid @RequestBody CalculateDistanceInputModel inputModel) {
    return calculatorService.calculateDistance(inputModel);
  }
}
