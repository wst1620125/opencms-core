/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/galleries/client/preview/ui/Attic/CmsImageInfoTab.java,v $
 * Date   : $Date: 2010/08/26 13:34:10 $
 * Version: $Revision: 1.1 $
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

package org.opencms.ade.galleries.client.preview.ui;

import org.opencms.ade.galleries.client.preview.CmsImagePreviewHandler;
import org.opencms.ade.galleries.shared.CmsImageInfoBean;
import org.opencms.ade.galleries.shared.I_CmsGalleryProviderConstants.GalleryMode;

/**
 * Simple image tag properties form, use in editor mode only.<p>
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0.
 */
public class CmsImageInfoTab extends A_CmsPreviewDetailTab {

    /** The preview handler. */
    private CmsImagePreviewHandler m_handler;

    private CmsImageInfoDisplay m_display;

    /**
     * The constructor.<p>
     * 
     * @param dialogMode the mode of the gallery
     * @param height the height of the tab
     * @param width the width of the height
     * @param handler the preview handler
     */
    public CmsImageInfoTab(GalleryMode dialogMode, int height, int width, CmsImagePreviewHandler handler) {

        super(dialogMode, height, width);
        m_handler = handler;
        m_display = new CmsImageInfoDisplay();
        m_main.insert(m_display, 0);
    }

    /**
     * Displays the provided image information.<p>
     * 
     * @param imageInfo the image information
     */
    public void fillContent(CmsImageInfoBean imageInfo) {

        m_display.fillContent(imageInfo);
    }

    /**
     * @see org.opencms.ade.galleries.client.preview.ui.A_CmsPreviewDetailTab#getHandler()
     */
    @Override
    protected CmsImagePreviewHandler getHandler() {

        return m_handler;
    }

}
