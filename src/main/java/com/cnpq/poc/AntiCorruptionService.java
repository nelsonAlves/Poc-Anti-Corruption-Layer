package com.cnpq.poc;

import org.springframework.stereotype.Service;

import com.cnpq.poc.antigo.lattes.EntidadeAntigoLattes;
import com.cnpq.poc.camada.antcorruption.NovoLattesTradutor;
import com.cnpq.poc.novo.lattes.EntidadeNovoLattes;

/**
 * Serviço Spring que utiliza a Camada Anti-Corrupção
 */

@Service
public class AntiCorruptionService {

	private NovoLattesTradutor sistemaTradutor;

	public AntiCorruptionService(NovoLattesTradutor sistemaTradutor) {

		this.sistemaTradutor = sistemaTradutor;
	}
	
	public EntidadeNovoLattes obterDadosAntigoLattes(EntidadeAntigoLattes antigoLattes) {
		
		// Traduzir dados de Sistema Antigo para o Sistema Novo
		EntidadeNovoLattes novoLattes = sistemaTradutor.traduzir(antigoLattes);
		
		// Exemplo Lógica de negócio com o Novo Lates
		validarEntidadeNovoLattes(novoLattes);
		
		return novoLattes;
	}

	private void validarEntidadeNovoLattes(EntidadeNovoLattes novoLattes) {
		
		// Exemplo de regra de negócio: Verificar se o nome não está vazio
		
		if(novoLattes.getNome() == null || novoLattes.getNome().isEmpty()) {
			
			throw new IllegalArgumentException("O nome não pode ser nulo!");
		}
		
		// Adicionar outras regras de negócio conforme necessário
	}
}
