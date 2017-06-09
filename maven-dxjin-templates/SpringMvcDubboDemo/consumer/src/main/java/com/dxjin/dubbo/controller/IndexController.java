package com.dxjin.dubbo.controller;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.dxjin.dubbo.demo.test.TestRegistryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class IndexController {

    //	@Autowired
    @Resource
    private TestRegistryService testRegistryService;

    @RequestMapping("/hello")
    public String index(@RequestParam(value = "man", required = false) String man, Model model) {
        String name;
        if (StringUtils.isNotEmpty(man)) {
            name = testRegistryService.hello(man);
        } else {
            name = testRegistryService.hello("man" + 1);
        }
        System.out.println("man==" + name);
        model.addAttribute("result", "man==" + name);
        return "result";
    }


    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("consumer start");
        TestRegistryService testRegistryService = context.getBean(TestRegistryService.class);
        System.out.println("consumer");
        System.out.println(testRegistryService.hello("consumer"));

    }

}
