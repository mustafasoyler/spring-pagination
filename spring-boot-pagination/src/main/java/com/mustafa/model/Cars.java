package com.mustafa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@Table(name = "cars")
public class Cars {
    @Id
    private Long id;
    private String name;
    private String brand;
    private Date productionDate;
}
