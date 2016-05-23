/*
 * This file is part of Inferno, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016, Max Roncace and contributors <me@caseif.net>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.caseif.flint.inferno;

import net.caseif.flint.FlintCore;
import net.caseif.flint.common.CommonCore;
import net.caseif.flint.common.component.CommonComponent;
import net.caseif.flint.common.util.agent.chat.IChatAgent;
import net.caseif.flint.minigame.Minigame;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.StringUtils;

/**
 * The Sponge implementation of {@link FlintCore}.
 */
public class InfernoCore extends CommonCore {

    @Override
    protected void logInfo0(String message) {
        InfernoPlugin.getInstance().getLogger().info(message);
    }

    @Override
    protected void logWarning0(String message) {
        InfernoPlugin.getInstance().getLogger().warn(message);
    }

    @Override
    protected void logSevere0(String message) {
        InfernoPlugin.getInstance().getLogger().error(message);
    }

    @Override
    protected void logVerbose0(String message) {
        this.logInfo0(message); //TODO: do config check for verbosity
    }

    @Override
    protected void orphan0(CommonComponent<?> component) {
        throw new NotImplementedException("TODO");
    }

    @Override
    protected IChatAgent getChatAgent0() {
        throw new NotImplementedException("TODO");
    }

    @Override
    protected String getImplementationName0() {
        return StringUtils.capitalize(InfernoCore.class.getPackage().getImplementationTitle());
    }

    @Override
    protected Minigame registerPlugin0(String pluginId) throws IllegalStateException {
        throw new NotImplementedException("TODO");
    }
}