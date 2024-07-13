package com.valdesius.crossedpathsstories.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "encounter")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Encounter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long encounter_id;

    @Column(name = "timestamp")
    Long timestamp;

}
