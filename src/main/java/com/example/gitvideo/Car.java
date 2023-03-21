package com.example.gitvideo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Car {
  private int id;
  private String brand;


  public void startEngine() {
    log.info("др-др-др-др-др");
  }
}
