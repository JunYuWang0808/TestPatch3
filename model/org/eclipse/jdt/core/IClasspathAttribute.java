/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.core;

/**
 * A classpath attribute defines a name/value pair that can be persisted with a classpath entry. Such an attribute
 * can be created using the factory method {@link JavaCore#newClasspathAttribute(String, String) newClasspathAttribute(String name, String value)}.
 * 
 * @see JavaCore#newContainerEntry(
 *			org.eclipse.core.runtime.IPath containerPath, 
 *			org.eclipse.core.runtime.IPath[] accessibleFiles, 
 *			org.eclipse.core.runtime.IPath[] nonAccessibleFiles, 
 *			IClasspathAttribute[] extraAttributes,
 *			boolean isExported)
 * @see JavaCore#newLibraryEntry(
 *			org.eclipse.core.runtime.IPath path,
 *			org.eclipse.core.runtime.IPath sourceAttachmentPath,
 *			org.eclipse.core.runtime.IPath sourceAttachmentRootPath,
 *			org.eclipse.core.runtime.IPath[] accessibleFiles, 
 *			org.eclipse.core.runtime.IPath[] nonAccessibleFiles, 
 *			IClasspathAttribute[] extraAttributes,
 *			boolean isExported)
 * @see JavaCore#newProjectEntry(
 *			org.eclipse.core.runtime.IPath path, 
 *			org.eclipse.core.runtime.IPath[] accessibleFiles, 
 *			org.eclipse.core.runtime.IPath[] nonAccessibleFiles, 
 *			IClasspathAttribute[] extraAttributes,
 *			boolean isExported)	
 * @see JavaCore#newSourceEntry(
 * 			org.eclipse.core.runtime.IPath path, 
 * 			org.eclipse.core.runtime.IPath[] inclusionPatterns, 
 * 			org.eclipse.core.runtime.IPath[] exclusionPatterns, 
 * 			org.eclipse.core.runtime.IPath specificOutputLocation, 
 * 			IClasspathAttribute[] extraAttributes)
 * @see JavaCore#newVariableEntry(
 *			org.eclipse.core.runtime.IPath variablePath,
 *			org.eclipse.core.runtime.IPath variableSourceAttachmentPath,
 *			org.eclipse.core.runtime.IPath variableSourceAttachmentRootPath,
 *			org.eclipse.core.runtime.IPath[] accessibleFiles, 
 *			org.eclipse.core.runtime.IPath[] nonAccessibleFiles, 
 *			IClasspathAttribute[] extraAttributes,
 *			boolean isExported)
 * @since 3.1
 */
public interface IClasspathAttribute {
	
	/**
	 * Returns the name of this classpath attribute.
	 * 
	 * @return the name of this classpath attribute.
	 * @since 3.1
	 */
	String getName();
	
	/**
	 * Returns the value of this classpath attribute.
	 * 
	 * @return the value of this classpath attribute.
	 * @since 3.1
	 */
	String getValue();

}
