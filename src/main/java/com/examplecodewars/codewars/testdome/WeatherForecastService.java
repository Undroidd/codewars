package com.examplecodewars.codewars.testdome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.*;
import org.springframework.scheduling.annotation.*;
import org.springframework.scheduling.concurrent.*;
import org.springframework.stereotype.*;

//5 min
@FunctionalInterface
interface TemperatureMeasurementCallback {
    public void temperatureMeasured(int temperature);
}
interface Thermometer {
    public int measure();
}

@Configuration
@Import({FakeThermometer.class, WeatherForecastService.class})
@EnableScheduling
class Confige {

    @Bean
    public TemperatureMeasurementCallback callback() {
        return (temperature) -> System.out.println(temperature);
    }
}


@Component
@Scope("prototype")
class FakeThermometer implements Thermometer {

    private int currentTemperature = 21;

    @Override
    public int measure() { return currentTemperature++; }
}

@Service
public class WeatherForecastService {

    @Autowired
    private Thermometer thermometer;
    @Autowired
    private TemperatureMeasurementCallback callback;

    @Scheduled(fixedDelay=50)
    public void takeTemperatureMeasurement() {
        int temperature = thermometer.measure();
        callback.temperatureMeasured(temperature);
    }
}
