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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextRefNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextReferenceFormatAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:sequence-ref}.
 *
 */
public abstract class TextSequenceRefElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "sequence-ref" );

	/**
	 * The value set of {@odf.attribute text:reference-format}.
	 */
	 public enum TextReferenceFormatAttributeValue {
	 
	 CAPTION( TextReferenceFormatAttribute.Value.CAPTION.toString() ), CATEGORY_AND_VALUE( TextReferenceFormatAttribute.Value.CATEGORY_AND_VALUE.toString() ), CHAPTER( TextReferenceFormatAttribute.Value.CHAPTER.toString() ), DIRECTION( TextReferenceFormatAttribute.Value.DIRECTION.toString() ), PAGE( TextReferenceFormatAttribute.Value.PAGE.toString() ), TEXT( TextReferenceFormatAttribute.Value.TEXT.toString() ), VALUE( TextReferenceFormatAttribute.Value.VALUE.toString() );
              
		private String mValue;
	 	
		TextReferenceFormatAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static TextReferenceFormatAttributeValue enumValueOf( String value )
	    {
	        for( TextReferenceFormatAttributeValue aIter : values() )
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
	 * Create the instance of <code>TextSequenceRefElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextSequenceRefElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:sequence-ref}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextRefNameAttribute</code> , See {@odf.attribute text:ref-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextRefNameAttribute()
	{
		TextRefNameAttribute attr = (TextRefNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "ref-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextRefNameAttribute</code> , See {@odf.attribute text:ref-name}
	 *
	 * @param textRefNameValue   The type is <code>String</code>
	 */
	public void setTextRefNameAttribute( String textRefNameValue )
	{
		TextRefNameAttribute attr =  new TextRefNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textRefNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextReferenceFormatAttribute</code> , See {@odf.attribute text:reference-format}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextReferenceFormatAttribute()
	{
		TextReferenceFormatAttribute attr = (TextReferenceFormatAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "reference-format" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextReferenceFormatAttribute</code> , See {@odf.attribute text:reference-format}
	 *
	 * @param textReferenceFormatValue   The type is <code>String</code>
	 */
	public void setTextReferenceFormatAttribute( String textReferenceFormatValue )
	{
		TextReferenceFormatAttribute attr =  new TextReferenceFormatAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textReferenceFormatValue );
	}

}
