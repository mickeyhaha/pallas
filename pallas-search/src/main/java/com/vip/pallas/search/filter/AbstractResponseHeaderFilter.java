/**
 * Copyright 2019 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.pallas.search.filter;

import com.vip.pallas.search.filter.base.AbstractFilter;
import com.vip.pallas.search.filter.base.AbstractFilterContext;
import com.vip.pallas.search.filter.common.SessionContext;

/**
 * Created by fish24k on 16/11/24.
 */
public abstract class AbstractResponseHeaderFilter extends AbstractFilter {
	@Override
	public void run(AbstractFilterContext filterContext, SessionContext sessionContext) throws Exception {
		fireNextFilter(filterContext, sessionContext);
	}

	public abstract void fireNextFilter(AbstractFilterContext filterContext, SessionContext sessionContext);

}
