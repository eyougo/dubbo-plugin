package com.eyougo.dubbo.spring;

import com.intellij.spring.dom.CustomNamespaceRegistrar;
import com.intellij.spring.dom.SpringCustomNamespaces;
import com.intellij.util.xml.reflect.DomExtensionsRegistrar;

/**
 * Created by mei on 30/11/2017.
 */
public class DubboCustomNamespaces extends SpringCustomNamespaces {
    @Override
    public NamespacePolicies getNamespacePolicies() {
        return (new NamespacePolicies()).add("Dubbo namespace key", new String[]{"http://code.alibabatech.com/schema/dubbo"});
    }

    @Override
    public void registerExtensions(DomExtensionsRegistrar registrar) {
        CustomNamespaceRegistrar.create(registrar, "Dubbo namespace key").add("reference", DubboReference.class);
    }
}
