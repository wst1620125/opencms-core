/*
 * File   : $Source: /alkacon/cvs/opencms/src/org/opencms/setup/xml/Attic/CmsXmlUpdateLocalizationKeys.java,v $
 * Date   : $Date: 2006/03/23 17:47:21 $
 * Version: $Revision: 1.1.2.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (c) 2005 Alkacon Software GmbH (http://www.alkacon.com)
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
 * For further information about Alkacon Software GmbH, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.setup.xml;

import org.opencms.configuration.I_CmsXmlConfiguration;
import org.opencms.util.CmsStringUtil;
import org.opencms.xml.CmsXmlUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Branch;
import org.dom4j.Document;
import org.dom4j.Node;

/**
 * Updates localization keys.<p>
 * 
 * @author Michael Moossen
 * 
 * @version $Revision: 1.1.2.1 $ 
 * 
 * @since 6.1.8 
 */
public class CmsXmlUpdateLocalizationKeys extends A_CmsXmlWorkplace {

    /** The new localization keys. */
    private List m_newKeys;

    /** The old localization keys. */
    private List m_oldKeys;

    /** List of xpaths to update. */
    private List m_xpaths;

    /**
     * @see org.opencms.setup.xml.I_CmsSetupXmlUpdate#getName()
     */
    public String getName() {

        return "Update localization keys";
    }

    /**
     * Returns the new Keys.<p>
     *
     * @return the new Keys
     */
    public List getNewKeys() {

        if (m_newKeys == null) {
            m_newKeys = new ArrayList();
            m_newKeys.add("GUI_FILEICON_FOLDER_0");
            m_newKeys.add("GUI_FILEICON_EXTENDEDFOLDER_0");
            m_newKeys.add("GUI_FILEICON_STRUCTURECONTENT_0");
            m_newKeys.add("GUI_FILEICON_XMLPAGE_0");
            m_newKeys.add("GUI_FILEICON_PLAIN_0");
            m_newKeys.add("GUI_FILEICON_IMAGE_0");
            m_newKeys.add("GUI_FILEICON_JSP_0");
            m_newKeys.add("GUI_FILEICON_BINARY_0");
            m_newKeys.add("GUI_FILEICON_POINTER_0");
            m_newKeys.add("GUI_FILEICON_XMLTEMPLATE_0");
            m_newKeys.add("GUI_FILEICON_LINK_0");
            m_newKeys.add("GUI_FILEICON_UPLOAD_0");
            m_newKeys.add("GUI_FILEICON_IMAGEGALLERY_0");
            m_newKeys.add("GUI_FILEICON_DOWNLOADGALLERY_0");
            m_newKeys.add("GUI_FILEICON_LINKGALLERY_0");
            m_newKeys.add("GUI_FILEICON_HTMLGALLERY_0");
            m_newKeys.add("GUI_FILEICON_TABLEGALLERY_0");
            m_newKeys.add("GUI_FILEICON_XMLCONTENT_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_LOCK_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_OVERRIDELOCK_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_UNLOCK_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_COPYTOPROJECT_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_PUBLISH_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_OPENGALLERY_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_RENAMEIMAGES_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_COMMENTIMAGES_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_PAGEEDIT_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_EDITSOURCE_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_EDITLINK_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_EDIT_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_COPY_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_MOVE_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_DELETE_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_REPLACE_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_TOUCH_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_AVAILABILITY_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_UNDOCHANGES_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_UNDELETE_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_SHOWSIBLINGS_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_ACCESS_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_SECURE_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_TYPE_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_CHNAV_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_EDITCONTROLFILE_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_HISTORY_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_PROPERTY_0");
            m_newKeys.add("GUI_EXPLORER_CONTEXT_MOVE_MULTI_0");
        }
        return m_newKeys;
    }

    /**
     * Returns the old Keys.<p>
     *
     * @return the old Keys
     */
    public List getOldKeys() {

        if (m_oldKeys == null) {
            m_oldKeys = new ArrayList();
            m_oldKeys.add("fileicon.folder");
            m_oldKeys.add("fileicon.extendedfolder");
            m_oldKeys.add("fileicon.structurecontent");
            m_oldKeys.add("fileicon.xmlpage");
            m_oldKeys.add("fileicon.plain");
            m_oldKeys.add("fileicon.image");
            m_oldKeys.add("fileicon.jsp");
            m_oldKeys.add("fileicon.binary");
            m_oldKeys.add("fileicon.pointer");
            m_oldKeys.add("fileicon.XMLTemplate");
            m_oldKeys.add("fileicon.link");
            m_oldKeys.add("fileicon.upload");
            m_oldKeys.add("fileicon.imagegallery");
            m_oldKeys.add("fileicon.downloadgallery");
            m_oldKeys.add("fileicon.linkgallery");
            m_oldKeys.add("fileicon.htmlgallery");
            m_oldKeys.add("fileicon.tablegallery");
            m_oldKeys.add("fileicon.xmlcontent");
            m_oldKeys.add("explorer.context.lock");
            m_oldKeys.add("explorer.context.overridelock");
            m_oldKeys.add("explorer.context.unlock");
            m_oldKeys.add("explorer.context.copytoproject");
            m_oldKeys.add("explorer.context.publish");
            m_oldKeys.add("explorer.context.opengallery");
            m_oldKeys.add("explorer.context.renameimages");
            m_oldKeys.add("explorer.context.commentimages");
            m_oldKeys.add("explorer.context.pageedit");
            m_oldKeys.add("explorer.context.editsource");
            m_oldKeys.add("explorer.context.editlink");
            m_oldKeys.add("explorer.context.edit");
            m_oldKeys.add("explorer.context.copy");
            m_oldKeys.add("explorer.context.move");
            m_oldKeys.add("explorer.context.delete");
            m_oldKeys.add("explorer.context.replace");
            m_oldKeys.add("explorer.context.touch");
            m_oldKeys.add("explorer.context.availability");
            m_oldKeys.add("explorer.context.undochanges");
            m_oldKeys.add("explorer.context.undelete");
            m_oldKeys.add("explorer.context.showsiblings");
            m_oldKeys.add("explorer.context.access");
            m_oldKeys.add("explorer.context.secure");
            m_oldKeys.add("explorer.context.type");
            m_oldKeys.add("explorer.context.chnav");
            m_oldKeys.add("explorer.context.editcontrolfile");
            m_oldKeys.add("explorer.context.history");
            m_oldKeys.add("explorer.context.property");
            m_oldKeys.add("explorer.context.move.multi");
        }
        return m_oldKeys;
    }

    /**
     * @see org.opencms.setup.xml.A_CmsSetupXmlUpdate#executeUpdate(org.dom4j.Document, java.lang.String)
     */
    protected boolean executeUpdate(Document document, String xpath) {

        Node node = document.selectSingleNode(xpath);
        if (node != null) {
            String key = xpath.substring(10, xpath.length() - 7);
            int pos = getOldKeys().indexOf(key);
            CmsSetupXmlHelper.setValue(document, xpath, (String)getNewKeys().get(pos));
            return true;
        }
        return false;
    }

    /**
     * @see org.opencms.setup.xml.A_CmsSetupXmlUpdate#getNodeRelation()
     */
    protected int getNodeRelation() {

        return 2;
    }

    /**
     * @see org.opencms.setup.xml.A_CmsSetupXmlUpdate#getXPathsToUpdate()
     */
    protected List getXPathsToUpdate() {

        if (m_xpaths == null) {
            // //*[@key='${key}']/@key
            StringBuffer xp = new StringBuffer(256);
            xp.append("//*[@");
            xp.append(I_CmsXmlConfiguration.A_KEY);
            xp.append("='${key}']/@");
            xp.append(I_CmsXmlConfiguration.A_KEY);

            m_xpaths = new ArrayList();
            Iterator it = getOldKeys().iterator();
            while (it.hasNext()) {
                m_xpaths.add(CmsStringUtil.substitute(xp.toString(), "${key}", (String)it.next()));
            }
        }
        return m_xpaths;
    }

    /**
     * @see org.opencms.setup.xml.A_CmsSetupXmlUpdate#prepareDoc(org.dom4j.Document)
     */
    protected Document prepareDoc(Document doc) {

        Document newDoc = super.prepareDoc(doc);
        String xpath = "/opencms/workplace/explorertypes";
        Node node = doc.selectSingleNode(xpath);
        CmsSetupXmlHelper.setValue(newDoc, CmsXmlUtils.removeLastXpathElement(xpath), "");
        node = (Node)node.clone();
        node.setParent(null);
        ((Branch)newDoc.selectSingleNode(CmsXmlUtils.removeLastXpathElement(xpath))).add(node);
        return newDoc;
    }

}