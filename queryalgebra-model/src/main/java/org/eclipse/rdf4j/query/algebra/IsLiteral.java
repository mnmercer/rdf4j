/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j.query.algebra;

public class IsLiteral extends UnaryValueOperator {

	/*--------------*
	 * Constructors *
	 *--------------*/

	public IsLiteral() {
	}

	public IsLiteral(ValueExpr arg) {
		super(arg);
	}

	/*---------*
	 * Methods *
	 *---------*/

	@Override
	public <X extends Exception> void visit(QueryModelVisitor<X> visitor)
		throws X
	{
		visitor.meet(this);
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof IsLiteral && super.equals(other);
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ "IsLiteral".hashCode();
	}

	@Override
	public IsLiteral clone() {
		return (IsLiteral)super.clone();
	}
}
