// Generated from MyGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#listValues}.
	 * @param ctx the parse tree
	 */
	void enterListValues(@NotNull MyGrammarParser.ListValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#listValues}.
	 * @param ctx the parse tree
	 */
	void exitListValues(@NotNull MyGrammarParser.ListValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(@NotNull MyGrammarParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(@NotNull MyGrammarParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterSetVar(@NotNull MyGrammarParser.SetVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitSetVar(@NotNull MyGrammarParser.SetVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#calcStep}.
	 * @param ctx the parse tree
	 */
	void enterCalcStep(@NotNull MyGrammarParser.CalcStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#calcStep}.
	 * @param ctx the parse tree
	 */
	void exitCalcStep(@NotNull MyGrammarParser.CalcStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull MyGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull MyGrammarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(@NotNull MyGrammarParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(@NotNull MyGrammarParser.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull MyGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull MyGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#computation}.
	 * @param ctx the parse tree
	 */
	void enterComputation(@NotNull MyGrammarParser.ComputationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#computation}.
	 * @param ctx the parse tree
	 */
	void exitComputation(@NotNull MyGrammarParser.ComputationContext ctx);
}