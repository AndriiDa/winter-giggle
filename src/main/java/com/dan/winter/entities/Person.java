package com.dan.winter.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person extends BaseEntity{

  @Column(name = "firstName")
  private String firstName;

  @Column(name = "secondName")
  private String secondName;


}
