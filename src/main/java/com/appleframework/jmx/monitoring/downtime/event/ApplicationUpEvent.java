/**
 * Copyright 2004-2006 jManage.org
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
package com.appleframework.jmx.monitoring.downtime.event;

import com.appleframework.jmx.core.config.ApplicationConfig;
import com.appleframework.jmx.core.config.event.ApplicationEvent;

/**
 *
 * @author Rakesh Kalra
 */
public class ApplicationUpEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public ApplicationUpEvent(ApplicationConfig appConfig){
        super(appConfig);
    }
    
    public ApplicationUpEvent(ApplicationConfig appConfig, long time) {
        super(appConfig, time);
    }
}
