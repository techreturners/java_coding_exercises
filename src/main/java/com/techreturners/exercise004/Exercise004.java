package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDate date;
    private LocalDateTime dateTime;
    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay().plusSeconds(1000000000);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
    return this.dateTime;
    }
}
