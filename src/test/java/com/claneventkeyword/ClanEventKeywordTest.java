package com.claneventkeyword;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ClanEventKeywordTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ClanEventKeywordPlugin.class);
		RuneLite.main(args);
	}
}