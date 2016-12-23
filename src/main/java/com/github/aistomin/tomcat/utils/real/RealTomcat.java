/**
 * Copyright (c) 2016, Istomin Andrei
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.aistomin.tomcat.utils.real;

import com.github.aistomin.tomcat.utils.Tomcat;
import com.github.aistomin.tomcat.utils.WebApps;
import org.apache.commons.lang3.NotImplementedException;

/**
 * Real Tomcat implementation.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public final class RealTomcat implements Tomcat {

    /**
     * Create Tomcat instance.
     * @todo: Let's implement this method and solve issue #16.
     */
    public void create() {
        throw new NotImplementedException(
            String.format(
                "%s.create() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    /**
     * Delete Tomcat instance.
     * @todo: Let's implement this method and solve issue #17.
     */
    public void delete() {
        throw new NotImplementedException(
            String.format(
                "%s.delete() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    /**
     * Start Tomcat instance.
     * @todo: Let's implement this method and solve issue #18.
     */
    public void start() {
        throw new NotImplementedException(
            String.format(
                "%s.start() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    /**
     * Stop Tomcat instance.
     * @todo: Let's implement this method and solve issue #19.
     */
    public void stop() {
        throw new NotImplementedException(
            String.format(
                "%s.stop() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    /**
     * Tomcat's webapps.
     * @return Webapps.
     * @todo: Let's implement this method and solve issue #20.
     */
    public WebApps webapps() {
        throw new NotImplementedException(
            String.format(
                "%s.webapps() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }
}
