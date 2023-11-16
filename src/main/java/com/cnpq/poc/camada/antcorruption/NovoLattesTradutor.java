package com.cnpq.poc.camada.antcorruption;

import com.cnpq.poc.antigo.lattes.EntidadeAntigoLattes;
import com.cnpq.poc.novo.lattes.EntidadeNovoLattes;

/**
 * Tradutor para Antigo Lattes
 */
public class NovoLattesTradutor {

	private NovoLattesAdapter novoLattesAdapter;

	
	public NovoLattesTradutor(NovoLattesAdapter novoLattesAdapter) {
	
		this.novoLattesAdapter = novoLattesAdapter;
	}
	
	public EntidadeNovoLattes traduzir(EntidadeAntigoLattes antigoLattes) {
		
		return novoLattesAdapter.adaptar(antigoLattes);
	}
	
}
