package com.claneventkeyword;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface ClanEventKeywordConfig extends Config
{
	@ConfigItem(
		keyName = "keyword",
		name = "Keyword",
		description = "Keyword that should be drawn to the screen"
	)
	default String keyword()
	{
		return "Change this to the keyword in the settings";
	}

	@ConfigItem(
			keyName = "shouldshowtimestamp",
			name = "Show timestamp",
			description = "Enable or disable the timestamp"
	)
	default boolean shouldShowTimestamp()
	{
		return false;
	}
}
