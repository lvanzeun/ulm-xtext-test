/*
 * generated by Xtext 2.14.0
 */
package org.ulm.metaulm.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.ulm.metaulm.xtext.services.UlmDsl2GrammarAccess;

@SuppressWarnings("all")
public class UlmDsl2SyntacticSequencer extends AbstractSyntacticSequencer {

	protected UlmDsl2GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Context___AttributesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_Context___EntitiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_Context___LookupsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_Entity___FeaturesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UlmDsl2GrammarAccess) access;
		match_Context___AttributesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContextAccess().getAttributesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4_3()));
		match_Context___EntitiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContextAccess().getEntitiesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_3()));
		match_Context___LookupsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContextAccess().getLookupsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_5_3()));
		match_Entity___FeaturesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEntityAccess().getFeaturesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Context___AttributesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_Context___AttributesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Context___EntitiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_Context___EntitiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Context___LookupsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_Context___LookupsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entity___FeaturesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_Entity___FeaturesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('attributes' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     version=Version '{' (ambiguity) 'lookups' '{' lookups+=Lookup
	 *     version=Version '{' (ambiguity) ('lookups' '{' '}')? 'entities' '{' entities+=Entity
	 *     version=Version '{' (ambiguity) ('lookups' '{' '}')? ('entities' '{' '}')? '}' (rule end)
	 */
	protected void emit_Context___AttributesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('entities' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     attributes+=Attribute '}' ('lookups' '{' '}')? (ambiguity) '}' (rule end)
	 *     lookups+=Lookup '}' (ambiguity) '}' (rule end)
	 *     version=Version '{' ('attributes' '{' '}')? ('lookups' '{' '}')? (ambiguity) '}' (rule end)
	 */
	protected void emit_Context___EntitiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('lookups' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     attributes+=Attribute '}' (ambiguity) 'entities' '{' entities+=Entity
	 *     attributes+=Attribute '}' (ambiguity) ('entities' '{' '}')? '}' (rule end)
	 *     version=Version '{' ('attributes' '{' '}')? (ambiguity) 'entities' '{' entities+=Entity
	 *     version=Version '{' ('attributes' '{' '}')? (ambiguity) ('entities' '{' '}')? '}' (rule end)
	 */
	protected void emit_Context___LookupsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('features' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     desc=STRING '{' (ambiguity) '}' (rule end)
	 *     name=ID '{' (ambiguity) '}' (rule end)
	 *     superType=[Entity|ID] '{' (ambiguity) '}' (rule end)
	 */
	protected void emit_Entity___FeaturesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
