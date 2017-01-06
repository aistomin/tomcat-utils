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

import com.github.aistomin.tomcat.utils.Bash;
import org.apache.commons.lang3.NotImplementedException;

/**
 * Unix bash implementation.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public final class UnixBash implements Bash {

    /**
     * Execute bash command synchronously.
     * @param cmd Bash command that needs to be executed.
     * @return Exit code.
     * @todo: Let's implement this method and solve issue #28.
     */
    public int executeSync(final String cmd) {
        throw new NotImplementedException(
            String.format(
                "%s.executeSync() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }

    /**
     * Execute bash command asynchronously.
     * @param cmd Bash command that needs to be executed.
     * @return Exit code.
     * @todo: Let's implement this method and solve issue #29.
     */
    public int executeAsync(final String cmd) {
        throw new NotImplementedException(
            String.format(
                "%s.executeAsync() method is not implemented.",
                this.getClass().getCanonicalName()
            )
        );
    }
}
