package com.br.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.candidato.CandidatoModel;

public class Candidato {
	public static void main(String[] args) {

		List<CandidatoModel> listaCandidato = new ArrayList<CandidatoModel>();
		listaCandidato = cadastraCandidato();

		for (CandidatoModel candidato : listaCandidato) {
			System.out.println(candidato);
		}

		System.out.println("\n-----Votação------\n");
		listaCandidato = eleicao2(listaCandidato);

		System.out.println(listaCandidato);

		apuracao(listaCandidato);
	}

	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;

	}

	public static List<CandidatoModel> cadastraCandidato() {
		List<CandidatoModel> listaC = new ArrayList<CandidatoModel>();
		int controle = 1;
		while (controle == 1) {
			Scanner scan = entrada();
			Scanner scan2 = entrada();

			System.out.println("Deseja incuir un candidato\n" + "Digite 1 para sim ou 0 para não");
			int opcao = scan.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o nome do candidato");
				String nome = scan2.nextLine();

				System.out.println("Digite o numero do candidato");
				int numero = scan.nextInt();

				CandidatoModel candidato = new CandidatoModel(nome, numero);

				listaC.add(candidato);

				System.out.println("Deseja incluir outro candidato?\n" + "Digite S para sim ou N para não");
				String opcao2 = scan2.nextLine();

				if (opcao2.equalsIgnoreCase("S")) {
					controle = 1;
				} else {
					controle = 0;
				}

			}

		}
		return listaC;
	}

	public static List<CandidatoModel> eleicao2(List<CandidatoModel> lista) {
		List<CandidatoModel> lista2 = new ArrayList<CandidatoModel>();
		lista2 = lista;
		int controle = 1;
		while (controle == 1) {
			Scanner scan = entrada();
			Scanner scan2 = entrada();
			System.out.println("Digite o numero do seu candidato");
			int voto = scan.nextInt();

			for (CandidatoModel candidato : lista2) {

				if (voto == candidato.getNumero()) {
					candidato.setVotos(candidato.getVotos() + 1);
					System.out.println(candidato.getNome() + " Ganhou mais um voto");
					System.out.println(candidato.getVotos());
				} else {
					System.out.println("Candidado não cadastrado");
				}

			}

			System.out.println("Deseja inserir mais um voto\n" + "S para sim, N para não");
			String continua = scan2.nextLine();

			if (continua.equalsIgnoreCase("S")) {
				controle = 1;
			} else if (continua.equalsIgnoreCase("N")) {
				controle = 0;
			}
		}

		return lista2;
	}

	private String getNome() {
		return null;
	}

	private void setVotos(int i) {
		
	}

	private int getVotos() {
		return 0;
	}

	private int getNumero() {
		
return 0;
	}

	public static void apuracao(List<CandidatoModel> lista) {
		CandidatoModel eleito = new CandidatoModel();
		eleito = lista.get(0);

		for (CandidatoModel candidato : lista) {
			if (candidato.getVotos() > eleito.getVotos()) {
				eleito = candidato;
			}

		}
		System.out.println("\n--------APURAÇÃO-------\n" + "Numero-----Nome----------Votos");
		System.out.println(eleito.toString(null));

	}

}
