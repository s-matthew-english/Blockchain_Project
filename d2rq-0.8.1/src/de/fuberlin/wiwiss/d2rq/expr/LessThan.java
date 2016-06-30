package de.fuberlin.wiwiss.d2rq.expr;

import de.fuberlin.wiwiss.d2rq.algebra.ColumnRenamer;


public class LessThan extends BinaryOperator {

	public LessThan(Expression expr1, Expression expr2) {
		super(expr1, expr2, "<");
	}

	public Expression renameAttributes(ColumnRenamer columnRenamer) {
		return new LessThan(expr1.renameAttributes(columnRenamer), expr2.renameAttributes(columnRenamer));
	}
}
