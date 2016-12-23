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

    @Override
    public void create() {
        throw new NotImplementedException(
            String.format(
                "%s.create() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    @Override
    public void delete() {
        throw new NotImplementedException(
            String.format(
                "%s.delete() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    @Override
    public void start() {
        throw new NotImplementedException(
            String.format(
                "%s.start() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    @Override
    public void stop() {
        throw new NotImplementedException(
            String.format(
                "%s.stop() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    @Override
    public WebApps webapps() {
        throw new NotImplementedException(
            String.format(
                "%s.webapps() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }
}
