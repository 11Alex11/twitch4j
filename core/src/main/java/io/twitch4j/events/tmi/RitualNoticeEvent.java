/*
 * MIT License
 *
 * Copyright (c) 2018 twitch4j
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.twitch4j.events.tmi;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.twitch4j.impl.events.tmi.RitualNoticeEventBuilder;
import io.twitch4j.tmi.model.tags.Badge;

import java.awt.*;
import java.util.List;

@JsonDeserialize(builder = RitualNoticeEventBuilder.class)
public abstract class RitualNoticeEvent extends ChannelUserEvent {
    public abstract List<Badge> getBadges();

    public abstract Color getColor();

    public abstract boolean hasMod();

    public abstract boolean isSubscriber();

    public abstract boolean hasTurbo();

    public abstract String getMessage();
}