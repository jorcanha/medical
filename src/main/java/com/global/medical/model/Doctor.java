package com.global.medical.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;



}
