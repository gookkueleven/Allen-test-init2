package kooknaja;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.*;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by ratchasit.amo on 10/18/2016.
    RestTemplate restTemplate = new RestTemplate();
 */
    @RunWith(MockitoJUnitRunner.class)
    public class applicationTest {

    @InjectMocks
    CallAPI callAPI = new CallAPI();

    @Mock
    RestTemplate restTemplate;

    @Mock
    ResponseEntity responseEntity;

    @Before
    public void setup() {
        mockRestServiceServer = MockRestServiceServer.createServer(restTemplate);
    }

    @Test
    public void testTestAPI_shouldReturnString_GookkuEleven(){
        when(responseEntity.getBody()).thenReturn("GookkuEleven");
        when(restTemplate.exchange(any(String.class), any(HttpMethod.class), any(HttpEntity.class), any(Class.class))).thenReturn(responseEntity);
        String res = callAPI.testAPI();

        Assert.assertEquals("GookkuEleven", res);
//
//        mockRestServiceServer.verify();
//        assertThat(result, allOf(containsString("SUCCESS"),
//                containsString("GookkuEleven")));
    }

}
