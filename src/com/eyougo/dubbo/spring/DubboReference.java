package com.eyougo.dubbo.spring;

import com.intellij.spring.model.xml.BeanName;
import com.intellij.spring.model.xml.BeanType;
import com.intellij.spring.model.xml.DomSpringBean;
import com.intellij.spring.model.xml.beans.Identified;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Stubbed;
import com.intellij.util.xml.StubbedOccurrence;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mei on 30/11/2017.
 */

@Stubbed
@StubbedOccurrence
@BeanName(provider = DubboReferenceBeanNameProvider.class)
@BeanType(provider = DubboReferenceBeanTypeProvider.class)
public interface DubboReference extends DomSpringBean, Identified, DubboReferenceElement {

    @Stubbed
    @NotNull
    GenericAttributeValue<String> getInterface();
}
