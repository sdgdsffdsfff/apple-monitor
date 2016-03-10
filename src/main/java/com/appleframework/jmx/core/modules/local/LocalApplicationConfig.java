/**
 * Copyright 2004-2005 jManage.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.appleframework.jmx.core.modules.local;

import com.appleframework.jmx.core.config.ApplicationConfig;

/**
 *
 * date:  Mar 19, 2006
 * @author	Rakesh Kalra
 */
public class LocalApplicationConfig extends ApplicationConfig {

    public String getHost() {
        return super.getHost();
    }

    public Integer getPort() {
        return super.getPort();
    }
    
    public String getURL() {
    	return "";
    }
}
