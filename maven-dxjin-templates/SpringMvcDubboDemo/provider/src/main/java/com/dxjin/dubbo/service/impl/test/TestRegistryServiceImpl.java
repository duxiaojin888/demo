package com.dxjin.dubbo.service.impl.test;

import com.dxjin.dubbo.demo.test.TestRegistryService;
import org.springframework.stereotype.Service;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {
	public String hello(String name) {
		return "hello" + name;
	}
}
