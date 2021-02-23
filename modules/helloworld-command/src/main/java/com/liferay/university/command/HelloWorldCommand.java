package com.liferay.university.command;

import java.lang.Object;

import com.liferay.university.hello.api.HelloService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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

	@Reference
	private HelloService helloService;

	public void say(String what){
		System.out.println(helloService.hello(what));
	}
}