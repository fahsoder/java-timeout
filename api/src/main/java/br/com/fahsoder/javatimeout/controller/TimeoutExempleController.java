package br.com.fahsoder.javatimeout.controller;

import br.com.fahsoder.javatimeout.service.TimeoutExempleService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TimeoutExempleController {

    private final TimeoutExempleService timeoutExempleService;

    @GetMapping("/get-timeout")
    public String getTimeout() {
        return timeoutExempleService.getExceedTimeout();
    }
    @GetMapping("/get-simple-response")
    public String getSimpleResponse() {
        return timeoutExempleService.getSimpleResponse();
    }

}