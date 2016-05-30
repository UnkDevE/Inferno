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

package net.caseif.flint.inferno.util.factory;

import net.caseif.flint.common.arena.CommonArena;
import net.caseif.flint.common.minigame.CommonMinigame;
import net.caseif.flint.common.util.factory.IArenaFactory;
import net.caseif.flint.inferno.arena.InfernoArena;
import net.caseif.flint.util.physical.Boundary;
import net.caseif.flint.util.physical.Location3D;

/**
 * The implementation of {@link IArenaFactory}.
 */
public class InfernoArenaFactory implements IArenaFactory {

    @Override
    public CommonArena createArena(CommonMinigame parent, String id, String name, Location3D initialSpawn,
            Boundary boundary) {
        return new InfernoArena(parent, id, name, initialSpawn, boundary);
    }
}
