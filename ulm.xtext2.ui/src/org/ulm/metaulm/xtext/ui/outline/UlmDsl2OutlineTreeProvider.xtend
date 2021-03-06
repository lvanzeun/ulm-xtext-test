/*
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.ulm.metaulm.xtext.ulmDsl2.Attribute
import org.ulm.metaulm.xtext.ulmDsl2.LookupIntValue
import org.ulm.metaulm.xtext.ulmDsl2.LookupStringValue
import org.ulm.metaulm.xtext.ulmDsl2.Feature
import org.ulm.metaulm.xtext.ulmDsl2.Context
import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.ui.editor.outline.IOutlineNode

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class UlmDsl2OutlineTreeProvider extends DefaultOutlineTreeProvider {

	def _isLeaf(Attribute a) { true }

	def _isLeaf(LookupIntValue liv) { true }

	def _isLeaf(LookupStringValue lsv) { true }

	def _isLeaf(Feature f) { true }
	
	def _createChildren(IOutlineNode parentNode, Context contextElement) {
			
			val gan = new AbstractOutlineNode(parentNode, null as Image, "Attributes", false) {}
			
			for (g : contextElement.attributes) {
				createNode(gan, g)
			}
			val gbn = new AbstractOutlineNode(parentNode, null as Image, "Lookups", false) {}
			for (g : contextElement.lookups) {
				createNode(gbn, g)
			}
			
			val gcn = new AbstractOutlineNode(parentNode, null as Image, "Entities", false) {}
			for (g : contextElement.entities) {
				createNode(gcn, g)
			}
		}
	}
