// Generated from MyGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(MyGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(MyGrammarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterSetVar(MyGrammarParser.SetVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitSetVar(MyGrammarParser.SetVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#calcStep}.
	 * @param ctx the parse tree
	 */
	void enterCalcStep(MyGrammarParser.CalcStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#calcStep}.
	 * @param ctx the parse tree
	 */
	void exitCalcStep(MyGrammarParser.CalcStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#computation}.
	 * @param ctx the parse tree
	 */
	void enterComputation(MyGrammarParser.ComputationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#computation}.
	 * @param ctx the parse tree
	 */
	void exitComputation(MyGrammarParser.ComputationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#listValues}.
	 * @param ctx the parse tree
	 */
	void enterListValues(MyGrammarParser.ListValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#listValues}.
	 * @param ctx the parse tree
	 */
	void exitListValues(MyGrammarParser.ListValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(MyGrammarParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(MyGrammarParser.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(MyGrammarParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(MyGrammarParser.AssignOpContext ctx);
}