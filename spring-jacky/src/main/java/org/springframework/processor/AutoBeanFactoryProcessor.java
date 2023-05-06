package org.springframework.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class AutoBeanFactoryProcessor implements BeanFactoryPostProcessor {


    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition apiInfoMapper = beanFactory.getBeanDefinition("userService");
        apiInfoMapper.setBeanClassName("org.springframework.spring.service.impl.UserServiceImpl");
       // apiInfoMapper.setScope("prototype");

    }


}
