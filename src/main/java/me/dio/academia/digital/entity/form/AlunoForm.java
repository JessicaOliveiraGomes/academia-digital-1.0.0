package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoForm {

	
	@NotEmpty (message = "Preencha os campos corretamente.")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	private String nome;
	
	
	@NotEmpty (message = "Preencha os campos corretamente.")
	@CPF(message = "'${validatedValue}' é invalido!")
	private String cpf;
	
	
	@NotEmpty (message = "Preencha os campos corretamente.")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	private String bairro;
	
	
	@NotNull (message = "Preencha os campos corretamente.")
	@Past(message = "Data '${validatedValue}' é invalida.")
	private LocalDate dataDeNascimento;
}
