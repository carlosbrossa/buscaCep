package br.com.netshoes.cep.service;

import br.com.netshoes.cep.model.Endereco;

/**
 * Created by cbrossa on 12/04/15.
 */
public interface EnderecoService<T,V> {
    public T find(V param);
}
