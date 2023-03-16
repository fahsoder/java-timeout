package br.com.fahsoder.javatimeout.service;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TimeoutExempleService {

    public String getExceedTimeout() {
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(500);
        factory.setReadTimeout(500);
        restTemplate.setRequestFactory(factory);

        return restTemplate.getForObject("http://127.0.0.1:5000/api/hello", String.class);
    }

    public String getSimpleResponse() {
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(500);
        factory.setReadTimeout(500);
        restTemplate.setRequestFactory(factory);

        return restTemplate.getForObject("http://127.0.0.1:5000/api/fast-hello", String.class);
    }
}
