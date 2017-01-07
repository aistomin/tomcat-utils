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
package com.github.aistomin.tomcat.utils;

/**
 * Bash scripts executor.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public interface Bash {

    /**
     * Execute bash command synchronously.
     * @param cmd Bash command that needs to be executed.
     * @return Exit code.
     */
    int executeSync(String cmd);

    /**
     * Execute bash command synchronously and return output of the command
     * execution.
     * @param cmd Bash command that needs to be executed.
     * @return Exit code.
     */
    String executeSyncAndReturnOutput(String cmd);

    /**
     * Execute bash command asynchronously.
     * @param cmd Bash command that needs to be executed.
     * @return Exit code.
     */
    int executeAsync(String cmd);
}
