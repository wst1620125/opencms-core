/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/gwt/client/draganddrop/Attic/I_CmsLayoutBundle.java,v $
 * Date   : $Date: 2010/04/16 13:54:15 $
 * Version: $Revision: 1.6 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.gwt.client.draganddrop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.Shared;

/**
 * Client bundle containing CSS resources needed for drag and drop.<p>
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.6 $
 * 
 * @since 8.0.0
 */
public interface I_CmsLayoutBundle extends org.opencms.gwt.client.ui.css.I_CmsLayoutBundle {

    /** A fraction of the drag and drop CSS also used in the container-page editor to show and hide element buttons. */
    @Shared
    interface I_CmsDragCss extends CssResource {

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragElement();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragging();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragPlaceholder();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragStarted();
    }

    /** The drag and drop CSS. */
    interface I_CmsDragDropCss extends I_CmsDragCss {

        /**
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String clearFix();

        /**
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String currentTarget();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragElementBackground();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragElementBorder();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragSubContainer();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragTarget();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String overlayShow();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String placeholderOverlay();

    }

    /** The layout bundle instance. */
    I_CmsLayoutBundle INSTANCE = GWT.create(I_CmsLayoutBundle.class);

    /**
     * Access method.<p>
     * 
     * @return the drag and drop CSS
     */
    @Source("css/dragdrop.css")
    I_CmsDragDropCss dragdropCss();

}
