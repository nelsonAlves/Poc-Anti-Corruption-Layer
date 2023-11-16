package com.cnpq.poc.camada.antcorruption;

import com.cnpq.poc.antigo.lattes.EntidadeAntigoLattes;
import com.cnpq.poc.novo.lattes.EntidadeNovoLattes;

/**
 * Adaptador para Novo Lattes
 */

public class NovoLattesAdapter {

	public EntidadeNovoLattes adaptar(EntidadeAntigoLattes antigoLattes) {
		
		EntidadeNovoLattes novoLattes = new EntidadeNovoLattes();
		novoLattes.setId(antigoLattes.getCodigo());
		novoLattes.setNome(antigoLattes.getUsuario());
		novoLattes.setTexto(antigoLattes.getDescricao());
		
		return novoLattes;
	}
}
