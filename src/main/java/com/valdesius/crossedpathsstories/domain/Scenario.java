package com.valdesius.crossedpathsstories.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "scenarios")
@Entity
@Builder

public class Scenario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long scenario_id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;
}
