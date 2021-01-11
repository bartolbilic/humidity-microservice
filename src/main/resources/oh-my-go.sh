#!/usr/bin/env bash
echo 'Starting to wait for eureka...'
./wait-for-it.sh --timeout=60 --strict eureka-server:8761 -- java -cp /app/resources:/app/classes:/app/libs/* com.rassus.humiditymicroservice.HumidityMicroserviceApplication
