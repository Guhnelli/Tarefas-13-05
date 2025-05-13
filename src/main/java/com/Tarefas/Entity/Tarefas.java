package com.Tarefas.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // gerador altmatico de geter e seter |
@NoArgsConstructor // sem argumentos } lombok
@AllArgsConstructor // todos os argumentos |
@Entity
@Table(name = "tarefas")

public class Tarefas {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		@NotBlank
		private String nome;
		private String descricao;
		
		


}
