package org.youngjae.prospring5.ch3;

import org.springframework.stereotype.Component;
import org.youngjae.prospring5.ch2.decoupled.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
