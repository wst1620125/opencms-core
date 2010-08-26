/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/gwt/shared/rpc/Attic/I_CmsCoreService.java,v $
 * Date   : $Date: 2010/08/26 13:34:27 $
 * Version: $Revision: 1.13 $
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

package org.opencms.gwt.shared.rpc;

import org.opencms.gwt.CmsRpcException;
import org.opencms.gwt.shared.CmsCategoryTreeEntry;
import org.opencms.gwt.shared.CmsContextMenuEntryBean;
import org.opencms.gwt.shared.CmsCoreData;
import org.opencms.gwt.shared.CmsCoreData.AdeContext;
import org.opencms.gwt.shared.CmsValidationQuery;
import org.opencms.gwt.shared.CmsValidationResult;
import org.opencms.util.CmsUUID;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Provides general core services.<p>
 * 
 * @author Michael Moossen
 * 
 * @version $Revision: 1.13 $ 
 * 
 * @since 8.0.0
 * 
 * @see org.opencms.gwt.CmsCoreService
 * @see org.opencms.gwt.shared.rpc.I_CmsCoreService
 * @see org.opencms.gwt.shared.rpc.I_CmsCoreServiceAsync
 */
@RemoteServiceRelativePath("org.opencms.gwt.CmsCoreService.gwt")
public interface I_CmsCoreService extends RemoteService {

    /** A constant that signals that we are in the container page context. */
    String CONTEXT_CONTAINERPAGE = "containerpage";

    /** A constant that signals that we are in the sitemap context. */
    String CONTEXT_SITEMAP = "sitemap";

    /**
     * Creates a new UUID.<p>
     * 
     * @return the created UUID
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    CmsUUID createUUID() throws CmsRpcException;

    /**
     * Returns the categories for the given search parameters.<p>
     * 
     * @param fromCatPath the category path to start with, can be <code>null</code> or empty to use the root
     * @param includeSubCats if to include all categories, or first level child categories only
     * @param refVfsPaths the reference paths, can be <code>null</code> to only use the system repository
     * 
     * @return the resource categories
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    CmsCategoryTreeEntry getCategories(String fromCatPath, boolean includeSubCats, List<String> refVfsPaths)
    throws CmsRpcException;

    /**
     * Returns the context menu entries for the given URI.<p>
     * 
     * @param uri the current requested URI
     * @param context the ade context (sitemap or containerpage)
     * 
     * @return the context menu entries 
     * 
     * @throws CmsRpcException if something goes wrong
     */
    List<CmsContextMenuEntryBean> getContextMenuEntries(String uri, AdeContext context) throws CmsRpcException;

    /**
     * Locks the given resource.<p>
     * 
     * @param uri the resource URI 
     * 
     * @return <code>null</code> if successful, an error message if not 
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    String lock(String uri) throws CmsRpcException;

    /**
     * Locks the given resource with a temporary lock.<p>
     * 
     * @param uri the resource URI 
     * 
     * @return <code>null</code> if successful, an error message if not 
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    String lockTemp(String uri) throws CmsRpcException;

    /**
     * Locks the given resource with a temporary lock additionally checking that 
     * the given resource has not been modified after the given timestamp.<p>
     * 
     * @param uri the resource URI 
     * @param modification the timestamp to check
     * 
     * @return <code>null</code> if successful, an error message if not 
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    String lockTempAndCheckModification(String uri, long modification) throws CmsRpcException;

    /**
     * Generates core data for prefetching in the host page.<p>
     * 
     * @return the core data
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    CmsCoreData prefetch() throws CmsRpcException;

    /**
     * Translates an URL name of a sitemap entry to a valid form containing no illegal characters.<p>
     * 
     * @param urlName the url name to be translated
     *  
     * @return the translated URL name
     *  
     * @throws CmsRpcException if something goes wrong 
     */
    String translateUrlName(String urlName) throws CmsRpcException;

    /**
     * Unlocks the given resource.<p>
     * 
     * @param uri the resource URI 
     * 
     * @return <code>null</code> if successful, an error message if not 
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    String unlock(String uri) throws CmsRpcException;

    /**
     * Performs a batch of validations and returns the results.<p>
     * 
     * @param validationQueries a map from field names to validation queries
     * 
     * @return a map from field names to validation results
     *  
     * @throws CmsRpcException if something goes wrong 
     */
    Map<String, CmsValidationResult> validate(Map<String, CmsValidationQuery> validationQueries) throws CmsRpcException;
}
