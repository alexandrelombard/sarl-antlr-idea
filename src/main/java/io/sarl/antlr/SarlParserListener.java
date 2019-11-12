// Generated from SarlParser.g4 by ANTLR 4.7.2

package io.sarl.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SarlParser}.
 */
public interface SarlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SarlParser#sarlFile}.
	 * @param ctx the parse tree
	 */
	void enterSarlFile(SarlParser.SarlFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#sarlFile}.
	 * @param ctx the parse tree
	 */
	void exitSarlFile(SarlParser.SarlFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SarlParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SarlParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#preamble}.
	 * @param ctx the parse tree
	 */
	void enterPreamble(SarlParser.PreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#preamble}.
	 * @param ctx the parse tree
	 */
	void exitPreamble(SarlParser.PreambleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#fileAnnotations}.
	 * @param ctx the parse tree
	 */
	void enterFileAnnotations(SarlParser.FileAnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#fileAnnotations}.
	 * @param ctx the parse tree
	 */
	void exitFileAnnotations(SarlParser.FileAnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterFileAnnotation(SarlParser.FileAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitFileAnnotation(SarlParser.FileAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void enterPackageHeader(SarlParser.PackageHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void exitPackageHeader(SarlParser.PackageHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(SarlParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(SarlParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(SarlParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(SarlParser.ImportHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(SarlParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(SarlParser.ImportAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelObject(SarlParser.TopLevelObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelObject(SarlParser.TopLevelObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SarlParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SarlParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#agentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAgentDeclaration(SarlParser.AgentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#agentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAgentDeclaration(SarlParser.AgentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#behaviorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorDeclaration(SarlParser.BehaviorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#behaviorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorDeclaration(SarlParser.BehaviorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#capacityDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCapacityDeclaration(SarlParser.CapacityDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#capacityDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCapacityDeclaration(SarlParser.CapacityDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#eventDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEventDeclaration(SarlParser.EventDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#eventDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEventDeclaration(SarlParser.EventDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#skillDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSkillDeclaration(SarlParser.SkillDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#skillDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSkillDeclaration(SarlParser.SkillDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(SarlParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(SarlParser.PrimaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void enterClassParameters(SarlParser.ClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void exitClassParameters(SarlParser.ClassParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void enterClassParameter(SarlParser.ClassParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void exitClassParameter(SarlParser.ClassParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifiers(SarlParser.DelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifiers(SarlParser.DelegationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifier(SarlParser.DelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifier(SarlParser.DelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInvocation(SarlParser.ConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInvocation(SarlParser.ConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitDelegation(SarlParser.ExplicitDelegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitDelegation(SarlParser.ExplicitDelegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(SarlParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(SarlParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#agentBody}.
	 * @param ctx the parse tree
	 */
	void enterAgentBody(SarlParser.AgentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#agentBody}.
	 * @param ctx the parse tree
	 */
	void exitAgentBody(SarlParser.AgentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#behaviorBody}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorBody(SarlParser.BehaviorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#behaviorBody}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorBody(SarlParser.BehaviorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(SarlParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(SarlParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#agentMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAgentMemberDeclaration(SarlParser.AgentMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#agentMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAgentMemberDeclaration(SarlParser.AgentMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#behaviorMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorMemberDeclaration(SarlParser.BehaviorMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#behaviorMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorMemberDeclaration(SarlParser.BehaviorMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousInitializer(SarlParser.AnonymousInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousInitializer(SarlParser.AnonymousInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(SarlParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(SarlParser.SecondaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDelegationCall(SarlParser.ConstructorDelegationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDelegationCall(SarlParser.ConstructorDelegationCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassBody(SarlParser.EnumClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassBody(SarlParser.EnumClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(SarlParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(SarlParser.EnumEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(SarlParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(SarlParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SarlParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SarlParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameters(SarlParser.FunctionValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameters(SarlParser.FunctionValueParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameter(SarlParser.FunctionValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameter(SarlParser.FunctionValueParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SarlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SarlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(SarlParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(SarlParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#onDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOnDeclaration(SarlParser.OnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#onDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOnDeclaration(SarlParser.OnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(SarlParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(SarlParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObject(SarlParser.CompanionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObject(SarlParser.CompanionObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(SarlParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(SarlParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultiVariableDeclaration(SarlParser.MultiVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultiVariableDeclaration(SarlParser.MultiVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SarlParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SarlParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(SarlParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(SarlParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(SarlParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(SarlParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(SarlParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(SarlParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(SarlParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(SarlParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(SarlParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(SarlParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SarlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SarlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeModifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifierList(SarlParser.TypeModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeModifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifierList(SarlParser.TypeModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(SarlParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(SarlParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(SarlParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(SarlParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(SarlParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(SarlParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(SarlParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(SarlParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionTypeReceiver}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeReceiver(SarlParser.FunctionTypeReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionTypeReceiver}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeReceiver(SarlParser.FunctionTypeReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#userType}.
	 * @param ctx the parse tree
	 */
	void enterUserType(SarlParser.UserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#userType}.
	 * @param ctx the parse tree
	 */
	void exitUserType(SarlParser.UserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUserType(SarlParser.SimpleUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUserType(SarlParser.SimpleUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameters(SarlParser.FunctionTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameters(SarlParser.FunctionTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraints(SarlParser.TypeConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraints(SarlParser.TypeConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraint(SarlParser.TypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraint(SarlParser.TypeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SarlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SarlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SarlParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SarlParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SarlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SarlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#blockLevelExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlockLevelExpression(SarlParser.BlockLevelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#blockLevelExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlockLevelExpression(SarlParser.BlockLevelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SarlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SarlParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SarlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SarlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(SarlParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(SarlParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(SarlParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(SarlParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#equalityComparison}.
	 * @param ctx the parse tree
	 */
	void enterEqualityComparison(SarlParser.EqualityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#equalityComparison}.
	 * @param ctx the parse tree
	 */
	void exitEqualityComparison(SarlParser.EqualityComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SarlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SarlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#namedInfix}.
	 * @param ctx the parse tree
	 */
	void enterNamedInfix(SarlParser.NamedInfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#namedInfix}.
	 * @param ctx the parse tree
	 */
	void exitNamedInfix(SarlParser.NamedInfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(SarlParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(SarlParser.ElvisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunctionCall(SarlParser.InfixFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunctionCall(SarlParser.InfixFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(SarlParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(SarlParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SarlParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SarlParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SarlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SarlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeRHS}.
	 * @param ctx the parse tree
	 */
	void enterTypeRHS(SarlParser.TypeRHSContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeRHS}.
	 * @param ctx the parse tree
	 */
	void exitTypeRHS(SarlParser.TypeRHSContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryExpression(SarlParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryExpression(SarlParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryExpression(SarlParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryExpression(SarlParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(SarlParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(SarlParser.AtomicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SarlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SarlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(SarlParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(SarlParser.CallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedLambda(SarlParser.AnnotatedLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedLambda(SarlParser.AnnotatedLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(SarlParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(SarlParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(SarlParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(SarlParser.ValueArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(SarlParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(SarlParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjection(SarlParser.TypeProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjection(SarlParser.TypeProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeProjectionModifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifierList(SarlParser.TypeProjectionModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeProjectionModifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifierList(SarlParser.TypeProjectionModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void enterValueArgument(SarlParser.ValueArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void exitValueArgument(SarlParser.ValueArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(SarlParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(SarlParser.LiteralConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SarlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SarlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(SarlParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(SarlParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(SarlParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(SarlParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(SarlParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(SarlParser.LineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterLineStringExpression(SarlParser.LineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitLineStringExpression(SarlParser.LineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(SarlParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(SarlParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringExpression(SarlParser.MultiLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringExpression(SarlParser.MultiLineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(SarlParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(SarlParser.FunctionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(SarlParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(SarlParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameter(SarlParser.LambdaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameter(SarlParser.LambdaParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(SarlParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(SarlParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(SarlParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(SarlParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(SarlParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(SarlParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(SarlParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(SarlParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(SarlParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(SarlParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(SarlParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(SarlParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void enterControlStructureBody(SarlParser.ControlStructureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void exitControlStructureBody(SarlParser.ControlStructureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpression(SarlParser.WhenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpression(SarlParser.WhenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(SarlParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(SarlParser.WhenEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(SarlParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(SarlParser.WhenConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void enterRangeTest(SarlParser.RangeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void exitRangeTest(SarlParser.RangeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void enterTypeTest(SarlParser.TypeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void exitTypeTest(SarlParser.TypeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(SarlParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(SarlParser.TryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(SarlParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(SarlParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(SarlParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(SarlParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpression(SarlParser.LoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpression(SarlParser.LoopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(SarlParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(SarlParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpression(SarlParser.WhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpression(SarlParser.WhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#doWhileExpression}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileExpression(SarlParser.DoWhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#doWhileExpression}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileExpression(SarlParser.DoWhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void enterJumpExpression(SarlParser.JumpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void exitJumpExpression(SarlParser.JumpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void enterCallableReference(SarlParser.CallableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void exitCallableReference(SarlParser.CallableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SarlParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SarlParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#equalityOperation}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperation(SarlParser.EqualityOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#equalityOperation}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperation(SarlParser.EqualityOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SarlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SarlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(SarlParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(SarlParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(SarlParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(SarlParser.IsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(SarlParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(SarlParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#multiplicativeOperation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperation(SarlParser.MultiplicativeOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#multiplicativeOperation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperation(SarlParser.MultiplicativeOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeOperation}.
	 * @param ctx the parse tree
	 */
	void enterTypeOperation(SarlParser.TypeOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeOperation}.
	 * @param ctx the parse tree
	 */
	void exitTypeOperation(SarlParser.TypeOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#prefixUnaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperation(SarlParser.PrefixUnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#prefixUnaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperation(SarlParser.PrefixUnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#postfixUnaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperation(SarlParser.PostfixUnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#postfixUnaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperation(SarlParser.PostfixUnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOperator(SarlParser.MemberAccessOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOperator(SarlParser.MemberAccessOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(SarlParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(SarlParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(SarlParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(SarlParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(SarlParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(SarlParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(SarlParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(SarlParser.MemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityModifier(SarlParser.VisibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityModifier(SarlParser.VisibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#varianceAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterVarianceAnnotation(SarlParser.VarianceAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#varianceAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitVarianceAnnotation(SarlParser.VarianceAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifier(SarlParser.FunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifier(SarlParser.FunctionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifier(SarlParser.PropertyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifier(SarlParser.PropertyModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceModifier(SarlParser.InheritanceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceModifier(SarlParser.InheritanceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifier(SarlParser.ParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifier(SarlParser.ParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(SarlParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(SarlParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(SarlParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(SarlParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(SarlParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(SarlParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SarlParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SarlParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationList(SarlParser.AnnotationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationList(SarlParser.AnnotationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationUseSiteTarget(SarlParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationUseSiteTarget(SarlParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedAnnotation(SarlParser.UnescapedAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedAnnotation(SarlParser.UnescapedAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SarlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SarlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(SarlParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(SarlParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(SarlParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(SarlParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SarlParser#anysemi}.
	 * @param ctx the parse tree
	 */
	void enterAnysemi(SarlParser.AnysemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SarlParser#anysemi}.
	 * @param ctx the parse tree
	 */
	void exitAnysemi(SarlParser.AnysemiContext ctx);
}