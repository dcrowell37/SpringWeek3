package com.pt.jeep.service;

import java.util.List;
import com.pt.jeep.entity.Jeep;
import com.pt.jeep.entity.JeepModel;

public interface JeepSalesService {

  
  
  List<Jeep> fetchJeeps(JeepModel model, String trim);

}
