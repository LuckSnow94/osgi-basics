package com.liferay.univerity.hello.impl;

import com.liferay.university.hello.api.HelloService;
import org.osgi.service.component.annotations.Component;

/**
 * @author lucas.neves
 */
@Component(
	immediate = true,
	property = {
	},
	service = HelloService.class
)
public class HelloServiceImpl implements HelloService {
	@Override
	public String hello(String parameter) {
		return "changed "+parameter+" changed";
	}

}