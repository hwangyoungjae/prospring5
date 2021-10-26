package org.youngjae.prospring5.ch2.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.youngjae.prospring5.ch2.decoupled.HelloWorldMessageProvider;
import org.youngjae.prospring5.ch2.decoupled.MessageProvider;
import org.youngjae.prospring5.ch2.decoupled.MessageRenderer;
import org.youngjae.prospring5.ch2.decoupled.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
