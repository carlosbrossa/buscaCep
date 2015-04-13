package br.com.netshoes.builder;

/**
 * Created by cbrossa on 12/04/15.
 */
public interface ResponseBuilder<T,V> {

    T build(V v);
}
