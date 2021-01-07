package com.rassus.humiditymicroservice.utils;

import com.rassus.humiditymicroservice.domain.entities.Measurement;
import com.rassus.humiditymicroservice.services.MeasurementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class InitializingBeanExample implements InitializingBean {

    private final MeasurementService service;

    public InitializingBeanExample(MeasurementService service) {
        this.service = service;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        MeasurementReader reader = new MeasurementReader();
        List<Measurement> measurements = reader.getMeasurements();
        for (Measurement measurement : measurements) {
            service.save(measurement);
        }
    }
}