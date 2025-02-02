package com.poc.patinaje.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "trainings_time")
public class TrainingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "coach_id", nullable = false)
    private Coach coach;

    @ManyToOne
    @JoinColumn(name = "skater_id", nullable = false)
    private Skater skater;

    @ManyToOne
    @JoinColumn(name = "roller_rink_id")
    private RollerRink rink;

    @Column(nullable = false, precision = 6, scale = 2)
    private BigDecimal time;

    @Column(name = "date", nullable = false, updatable = false)
    private LocalDateTime registeredAt = LocalDateTime.now();


}
