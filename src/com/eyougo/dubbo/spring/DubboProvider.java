package com.eyougo.dubbo.spring;

import com.intellij.spring.model.xml.BeanName;
import com.intellij.spring.model.xml.BeanType;
import com.intellij.spring.model.xml.DomSpringBean;
import com.intellij.util.xml.Stubbed;
import com.intellij.util.xml.StubbedOccurrence;

/**
 * @author mei
 * @date 07/12/2017
 */
@Stubbed
@StubbedOccurrence
@BeanType("com.alibaba.dubbo.config.ProviderConfig")
@BeanName(provider = DubboBeanNameProvider.class)
public interface DubboProvider extends DomSpringBean, DubboElement {
}
