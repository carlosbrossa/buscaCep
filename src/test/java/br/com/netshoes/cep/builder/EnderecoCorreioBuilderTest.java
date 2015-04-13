package br.com.netshoes.cep.builder;

import br.com.netshoes.model.ResponseHttp;
import com.sun.jersey.api.client.ClientResponse;
import junit.framework.TestCase;

/**
 * Created by joao on 13/04/15.
 */
public class EnderecoCorreioBuilderTest extends TestCase {

    EnderecoCorreioBuilder enderecoCorreioBuilder;
    ClientResponse clientResponse;

    public void testBuild(){
        ResponseHttp build = enderecoCorreioBuilder.build(clientResponse);
        assertNotNull(build);
    }

}