package org.youngjae.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.youngjae.prospring5.ch2.decoupled.MessageRenderer;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("renderer",
                MessageRenderer.class);
        messageRenderer.render();
        ctx.close();
    }
}
