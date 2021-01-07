package com.rassus.humiditymicroservice.repositories;

import com.rassus.humiditymicroservice.domain.entities.Measurement;
import org.springframework.data.repository.CrudRepository;

public interface MeasurementRepository extends CrudRepository<Measurement, Long> {
}
