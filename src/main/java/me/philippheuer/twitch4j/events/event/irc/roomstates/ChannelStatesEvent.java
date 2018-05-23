package me.philippheuer.twitch4j.events.event.irc.roomstates;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import me.philippheuer.twitch4j.events.event.AbstractChannelEvent;
import twitch4j.api.kraken.json.Channel;

@Data
@Getter
@EqualsAndHashCode(callSuper = false)
public abstract class ChannelStatesEvent extends AbstractChannelEvent{

	private final boolean active;

	public ChannelStatesEvent(Channel channel, boolean active) {
		super(channel);
		this.active = active;
	}
}
