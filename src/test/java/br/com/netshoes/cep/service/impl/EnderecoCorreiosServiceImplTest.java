package br.com.netshoes.cep.service.impl;

import br.com.netshoes.model.ResponseHttp;
import junit.framework.TestCase;

/**
 * Created by joao on 13/04/15.
 */
public class EnderecoCorreiosServiceImplTest extends TestCase {

    EnderecoCorreiosServiceImpl enderecoCorreiosService;

    public void testFind() throws Exception {
        ResponseHttp responseHttp = enderecoCorreiosService.find("03171010");
        assertEquals(responseHttp.getHttpStatusCode(), 200);
    }
}