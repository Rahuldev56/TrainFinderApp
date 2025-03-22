package com.spark.Train.repo;

import com.spark.Train.entity.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainScheduleRepository extends JpaRepository<TrainSchedule,Long> {

    List<TrainSchedule> findBySource_StationCodeAndDestination_StationCode(String sourceCode, String destinationCode);
    List<TrainSchedule> findBySource_StationNameAndDestination_StationName(String sourceName,String destinationName);
}
