package com.eyougo.dubbo.spring;

import com.intellij.spring.model.xml.BeanNameProvider;
import com.intellij.spring.model.xml.DomSpringBean;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mei on 01/12/2017.
 */
public class DubboReferenceBeanNameProvider implements BeanNameProvider{
    @Nullable
    @Override
    public String getBeanName(DomSpringBean domSpringBean) {
        return domSpringBean.getId().getStringValue();
    }
}
