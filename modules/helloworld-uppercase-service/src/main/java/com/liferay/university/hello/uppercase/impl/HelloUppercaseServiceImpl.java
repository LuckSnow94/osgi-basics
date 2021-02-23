package com.liferay.university.hello.uppercase.impl;

import com.liferay.university.hello.api.HelloService;

import org.osgi.service.component.annotations.Component;

import java.util.Locale;

/**
 * @author lucas.neves
 */
@Component(
	immediate = true,
	property = {
		"service.ranking:Integer=100"
	},
	service = HelloService.class
)
public class HelloUppercaseServiceImpl implements HelloService {

	@Override
	public String hello(String parameter) {
		return parameter.toUpperCase();
	}

}