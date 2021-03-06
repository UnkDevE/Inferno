/*
 * This file is part of Inferno, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016, Max Roncace <me@caseif.net>
 * Copyright (c) 2016, contributors
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

package net.caseif.flint.inferno.util.factory;

import net.caseif.flint.common.util.factory.IArenaFactory;
import net.caseif.flint.common.util.factory.IFactoryRegistry;
import net.caseif.flint.common.util.factory.ILobbySignFactory;
import net.caseif.flint.common.util.factory.IMinigameFactory;
import net.caseif.flint.common.util.factory.IRollbackAgentFactory;
import net.caseif.flint.common.util.factory.IRoundFactory;

/**
 * The implementation of {@link IFactoryRegistry}.
 */
public class InfernoFactoryRegistry implements IFactoryRegistry {

    private final InfernoMinigameFactory minigameFactory = new InfernoMinigameFactory();
    private final InfernoArenaFactory arenaFactory = new InfernoArenaFactory();
    private final InfernoRoundFactory roundFactory = new InfernoRoundFactory();
    private final InfernoLobbySignFactory lobbySignFactory = new InfernoLobbySignFactory();
    private final InfernoRollbackAgentFactory rollbackAgentFactory = new InfernoRollbackAgentFactory();

    @Override
    public IMinigameFactory getMinigameFactory() {
        return this.minigameFactory;
    }

    @Override
    public IArenaFactory getArenaFactory() {
        return this.arenaFactory;
    }

    @Override
    public IRoundFactory getRoundFactory() {
        return this.roundFactory;
    }

    @Override
    public ILobbySignFactory getLobbySignFactory() {
        return this.lobbySignFactory;
    }

    @Override
    public IRollbackAgentFactory getRollbackAgentFactory() {
        return this.rollbackAgentFactory;
    }
}
