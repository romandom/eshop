package com.example.demo.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "images")
@Entity
@Data
public class InformationEntity {

	@GeneratedValue
	@Id
	private int id;

	@Column(name = "fountain")
	private String image;

}
