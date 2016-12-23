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
package com.github.aistomin.tomcat.utils.mock;

import com.github.aistomin.tomcat.utils.WebApps;
import java.io.File;
import java.util.List;
import org.apache.commons.lang3.NotImplementedException;

/**
 * Mock Tomcat's webapps implementation.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public final class MockWebApps implements WebApps {

    /**
     * Deploy war files.
     * @param files War files list.
     * @todo: Let's implement this method and solve issue #14.
     */
    public void deploy(final List<File> files) {
        throw new NotImplementedException(
            String.format(
                "%s.deploy() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    /**
     * Un-deploy applications.
     * @param apps Applications list.
     * @todo: Let's implement this method and solve issue #15.
     */
    public void undeploy(final List<String> apps) {
        throw new NotImplementedException(
            String.format(
                "%s.undeploy() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }
}
