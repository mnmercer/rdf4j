/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
/* Generated By:JJTree: Do not edit this line. ASTProjectionElem.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTProjectionElem extends SimpleNode {

	public ASTProjectionElem(int id) {
		super(id);
	}

	public ASTProjectionElem(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	@Override
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data)
		throws VisitorException
	{
		return visitor.visit(this, data);
	}

	public boolean hasAlias() {
		return getAlias() != null;
	}

	public String getAlias() {
		if (children.size() >= 2) {
			Node aliasNode = children.get(1);

			if (aliasNode instanceof ASTString) {
				return ((ASTString)aliasNode).getValue();
			}
			else if (aliasNode instanceof ASTVar) {
				return ((ASTVar)aliasNode).getName();
			}
		}

		return null;
	}
}
/* JavaCC - OriginalChecksum=ed67c3c7a74ebd8df6304268b81f702d (do not edit this line) */
