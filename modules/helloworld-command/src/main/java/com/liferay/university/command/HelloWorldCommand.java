package com.liferay.university.command;

import java.lang.Object;

import com.liferay.university.hello.api.HelloService;
import org.osgi.service.component.annotations.*;

/**
 * @author lucas.neves
 */
@Component(
        immediate = true,
        property = {
                "osgi.command.function=say",
                "osgi.command.scope=custom"
        },
        service = Object.class
)
public class HelloWorldCommand {

    @Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, cardinality = ReferenceCardinality.MANDATORY)
    protected void setHelloService(HelloService helloService) {
        System.out.println("Setting helloService " + helloService);
        this.helloService = helloService;
    }

    protected void unsetHelloService(HelloService helloService) {
        System.out.println("Unsetting helloService " + helloService);
        if (helloService == this.helloService) {
            this.helloService = null;
        }
    }

    private HelloService helloService;

    public void say(String what) {
        System.out.println(helloService.hello(what));
    }
}