/*
 * Copyright 2012, Stuart Douglas, and individual contributors as indicated
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.fakereplace.api;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author Stuart Douglas
 */
public class ChangedMethod implements AnnotationTarget {

    private final String name;
    private final Class<?> returnType;
    private final Type genericReturnType;
    private final List<Class<?>> parameterTypes;
    private final List<Type> genericTypes;
    private final int modifiers;
    private final Set<ChangedAnnotation> changedAnnotations;

    public ChangedMethod(List<Type> genericTypes, List<Class<?>> parameterTypes, Class<?> returnType, Set<ChangedAnnotation> changedAnnotations, int modifiers, final Type genericReturnType, final  String name) {
        this.genericTypes = genericTypes;
        this.parameterTypes = parameterTypes;
        this.returnType = returnType;
        this.changedAnnotations = changedAnnotations;
        this.modifiers = modifiers;
        this.genericReturnType = genericReturnType;
        this.name = name;
    }


    public Set<ChangedAnnotation> getChangedAnnotations() {
        return Collections.unmodifiableSet(changedAnnotations);
    }

    public String getName() {
        return name;
    }

    public Class<?> getReturnType() {
        return returnType;
    }

    public Type getGenericReturnType() {
        return genericReturnType;
    }

    public List<Class<?>> getParameterTypes() {
        return Collections.unmodifiableList(parameterTypes);
    }

    public List<Type> getGenericTypes() {
        return Collections.unmodifiableList(genericTypes);
    }

    public int getModifiers() {
        return modifiers;
    }
}
