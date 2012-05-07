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

import java.lang.annotation.Annotation;

/**
 * A modified annotation
 *
 * @author Stuart Douglas
 */
public class ChangedAnnotation extends Changed<Annotation> {

    private final AnnotationTarget annotationTarget;
    private final Class<? extends  Annotation> annotationType;

    public ChangedAnnotation(Annotation modified, Annotation existing, ChangeType type, AnnotationTarget annotationTarget, final Class<? extends Annotation> annotationType) {
        super(modified, existing, type);
        this.annotationTarget = annotationTarget;
        this.annotationType = annotationType;
    }

    public AnnotationTarget getAnnotationTarget() {
        return annotationTarget;
    }

    public Class<? extends Annotation> getAnnotationType() {
        return annotationType;
    }
}
