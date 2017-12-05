package com.eyougo.dubbo.spring;

import com.intellij.spring.model.xml.BeanTypeProvider;
import com.intellij.spring.model.xml.DomSpringBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mei on 01/12/2017.
 */
public class DubboReferenceBeanTypeProvider implements BeanTypeProvider {
    @NotNull
    @Override
    public String[] getBeanTypeCandidates() {
        return new String[0];
    }

    @Nullable
    @Override
    public String getBeanType(DomSpringBean domSpringBean) {
        return ((DubboReference) domSpringBean).getInterface().getStringValue();
    }
}
