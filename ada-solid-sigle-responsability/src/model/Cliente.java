package model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cliente {

	private String nome;
	private String cpf;
	private Date dataNascimento;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getEmail() {
		return cpf;
	}

	public void setEmail(String email) {
		this.cpf = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {

		Calendar atual = new GregorianCalendar();

		Calendar nascimento = new GregorianCalendar();

		int idade = 0;

		if (this.getDataNascimento() != null) {
			nascimento.setTime(this.getDataNascimento());

			int ano = atual.get(Calendar.YEAR);
			int mes = atual.get(Calendar.MONTH) + 1;
			int dia = atual.get(Calendar.DAY_OF_MONTH);

			int anoNasc = nascimento.get(Calendar.YEAR);
			int mesNasc = nascimento.get(Calendar.MONTH) + 1;
			int diaNasc = nascimento.get(Calendar.DAY_OF_MONTH);

			idade = ano - anoNasc;

			// Calculando diferencas de mes e dia.
			if (mes < mesNasc) {
				idade--;
			} else {
				if (dia < diaNasc) {
					idade--;
				}
			}

		}

		return idade;

	}

}
