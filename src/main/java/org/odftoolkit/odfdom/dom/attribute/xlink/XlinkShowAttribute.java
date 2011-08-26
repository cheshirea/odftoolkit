/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    
package org.odftoolkit.odfdom.dom.attribute.xlink;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfAttribute;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.element.db.DbComponentElement;
import org.odftoolkit.odfdom.dom.element.db.DbConnectionResourceElement;
import org.odftoolkit.odfdom.dom.element.db.DbJavaClasspathElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAppletElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAreaCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAreaPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAreaRectangleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFillImageElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFloatingFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawImageElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawObjectElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawObjectOleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPluginElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaAutoReloadElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaHyperlinkBehaviourElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationEventListenerElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationSoundElement;
import org.odftoolkit.odfdom.dom.element.style.StyleBackgroundImageElement;
import org.odftoolkit.odfdom.dom.element.text.TextAElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleImageElement;
import org.odftoolkit.odfdom.dom.element.text.TextSectionSourceElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute xlink:show}.
 *
 */
public class XlinkShowAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.XLINK), "show" );
	public static final String DEFAULT_VALUE_EMBED = Value.EMBED.toString();
	public static final String DEFAULT_VALUE_NONE = Value.NONE.toString();
	public static final String DEFAULT_VALUE_REPLACE = Value.REPLACE.toString();

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute xlink:show}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public XlinkShowAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute xlink:show}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}
	
	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * The value set of {@odf.attribute xlink:show}.
	 */
	public enum Value {
	 
	 EMBED( "embed" ), NEW( "new" ), NONE( "none" ), REPLACE( "replace" );
              
		private String mValue;

		Value( String value )
		{
			mValue = value;
		}
	 	
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static Value enumValueOf( String value )
	    {
	        for( Value aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	 
	/**
	 * @param attrValue The <code>Enum</code> value of the attribute.
	 */
	public void setEnumValue(Value attrValue) {
		setValue(attrValue.toString());
	}
    
	/**
	 * @return Returns the <code>Enum</code> value of the attribute
	 */
	public Value getEnumValue(){
		return Value.enumValueOf(this.getValue());
	}
    
	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 */
	@Override
	public void setValue(String attrValue) {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof DbComponentElement ){
					super.setValue(DbComponentElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DbConnectionResourceElement ){
					super.setValue(DbConnectionResourceElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DbJavaClasspathElement ){
					super.setValue(DbJavaClasspathElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawAElement ){
					super.setValue(DrawAElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawAppletElement ){
					super.setValue(DrawAppletElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawAreaCircleElement ){
					super.setValue(DrawAreaCircleElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawAreaPolygonElement ){
					super.setValue(DrawAreaPolygonElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawAreaRectangleElement ){
					super.setValue(DrawAreaRectangleElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawFillImageElement ){
					super.setValue(DrawFillImageElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawFloatingFrameElement ){
					super.setValue(DrawFloatingFrameElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawImageElement ){
					super.setValue(DrawImageElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawObjectElement ){
					super.setValue(DrawObjectElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawObjectOleElement ){
					super.setValue(DrawObjectOleElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawPluginElement ){
					super.setValue(DrawPluginElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof MetaAutoReloadElement ){
					super.setValue(MetaAutoReloadElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof MetaHyperlinkBehaviourElement ){
					super.setValue(MetaHyperlinkBehaviourElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof PresentationEventListenerElement ){
					super.setValue(PresentationEventListenerElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof PresentationSoundElement ){
					super.setValue(PresentationSoundElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof StyleBackgroundImageElement ){
					super.setValue(StyleBackgroundImageElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof TextAElement ){
					super.setValue(TextAElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof TextListLevelStyleImageElement ){
					super.setValue(TextListLevelStyleImageElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof TextSectionSourceElement ){
					super.setValue(TextSectionSourceElement.XlinkShowAttributeValue.enumValueOf(attrValue).toString());
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw (e);
			}
		}else{
			//2DO:what should do when the owner element is null?
			super.setValue(attrValue);
		}
	}
    
	/**
	 * @return Returns the <code>String</code> value of the attribute
	 */
	@Override
	public String getValue(){
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof DbComponentElement ){
					return DbComponentElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DbConnectionResourceElement ){
					return DbConnectionResourceElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DbJavaClasspathElement ){
					return DbJavaClasspathElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawAElement ){
					return DrawAElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawAppletElement ){
					return DrawAppletElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawAreaCircleElement ){
					return DrawAreaCircleElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawAreaPolygonElement ){
					return DrawAreaPolygonElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawAreaRectangleElement ){
					return DrawAreaRectangleElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawFillImageElement ){
					return DrawFillImageElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawFloatingFrameElement ){
					return DrawFloatingFrameElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawImageElement ){
					return DrawImageElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawObjectElement ){
					return DrawObjectElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawObjectOleElement ){
					return DrawObjectOleElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawPluginElement ){
					return DrawPluginElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof MetaAutoReloadElement ){
					return MetaAutoReloadElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof MetaHyperlinkBehaviourElement ){
					return MetaHyperlinkBehaviourElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof PresentationEventListenerElement ){
					return PresentationEventListenerElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof PresentationSoundElement ){
					return PresentationSoundElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof StyleBackgroundImageElement ){
					return StyleBackgroundImageElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof TextAElement ){
					return TextAElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof TextListLevelStyleImageElement ){
					return TextListLevelStyleImageElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof TextSectionSourceElement ){
					return TextSectionSourceElement.XlinkShowAttributeValue.enumValueOf(super.getValue()).toString();
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw new NumberFormatException("the value of xlink:show is not valid");
			}
		}else{
			//2DO:what should do when the owner element is null?
			return super.getValue();
		}
		return null;
	}
	/**
	 * Returns the default value of {@odf.attribute xlink:show} dependent of its element name
	 * 
	 * @return the default value as <code>String</code>, 
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		String defaultValue = null;
		if (parentElement != null) {
			if( parentElement instanceof DbConnectionResourceElement ){
				defaultValue = DEFAULT_VALUE_NONE;
			}else if( parentElement instanceof DbJavaClasspathElement ){
				defaultValue = DEFAULT_VALUE_NONE;
			}else if( parentElement instanceof DrawAppletElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof DrawFillImageElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof DrawFloatingFrameElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof DrawImageElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof DrawObjectElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof DrawObjectOleElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof DrawPluginElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof MetaAutoReloadElement ){
				defaultValue = DEFAULT_VALUE_REPLACE;
			}else if( parentElement instanceof PresentationEventListenerElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof StyleBackgroundImageElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof TextListLevelStyleImageElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}else if( parentElement instanceof TextSectionSourceElement ){
				defaultValue = DEFAULT_VALUE_EMBED;
			}			
		}
		return defaultValue;
	}

	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if {@odf.attribute xlink:show} has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return getOwnerElement() == null ? false : true;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}
