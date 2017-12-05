package com.eyougo.dubbo.spring;

import com.intellij.spring.model.xml.DomSpringBeanImpl;

/**
 * Created by mei on 01/12/2017.
 */
public abstract class DubboReferenceImpl extends DomSpringBeanImpl implements DubboReference {
//    @Nullable
//    @Override
//    public PsiClass getBeanClass(@Nullable Set<AbstractDomSpringBean> visited, boolean considerFactories) {
//        if(visited != null && visited.contains(this)) {
//            return null;
//        } else {
//            PsiClass psiClass = super.getBeanClass(visited, considerFactories);
//            if (psiClass != null) {
//                return psiClass;
//            } else {
//                String value = this.getInterface().getStringValue();
//                Project project = this.getPsiManager().getProject();
//                PsiClass psiClass1 = JavaPsiFacade.getInstance(project).findClass(value,
//                        GlobalSearchScope.allScope(project));
//                if (psiClass1 != null) {
//                    if(visited == null) {
//                        visited = new THashSet();
//                    }
//
//                    visited.add(this);
//
//                    return psiClass1;
//                }
//            }
//        }
//
//
//        return super.getBeanClass(visited, considerFactories);
//    }
}

