package com.eyougo.dubbo.spring;

import com.intellij.spring.model.xml.BeanNameProvider;
import com.intellij.spring.model.xml.DomSpringBean;
import org.jetbrains.annotations.Nullable;

/**
 * @author mei
 * @date 05/12/2017
 */
public class DubboBeanNameProvider implements BeanNameProvider{
    @Nullable
    @Override
    public String getBeanName(DomSpringBean domSpringBean) {
        String id = domSpringBean.getId().getStringValue();
        if (id != null && id.length() > 0) {
            return id;
        }
        if (domSpringBean instanceof DubboApplication) {
            return ((DubboApplication) domSpringBean).getName().getValue();
        }
        return domSpringBean.getBeanType().getCanonicalText();
    }
}
