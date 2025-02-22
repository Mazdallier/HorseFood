package com.lothrazar.samshorsefood;

import net.minecraftforge.common.config.Configuration;

public class ConfigRegistry 
{

	private static Configuration config;
	public ConfigRegistry(Configuration cfg)
	{
		config = cfg;
		config.load();

		String category = Configuration.CATEGORY_GENERAL;
		
		ItemHorseFood.HEARTS_MAX = config.getInt("hearts_max", category, 20, 1, 100, "Maximum number of upgraded hearts");
		ItemHorseFood.JUMP_MAX = config.getInt("jump_max", category, 6, 1, 20, "Maximum value of jump.  Naturally spawned/bred horses seem to max out at 5.5");
		ItemHorseFood.SPEED_MAX = config.getInt("speed_max", category, 50, 1, 99, "Maximum value of speed (this is NOT blocks/per second or anything like that)");
		
	
		if(config.hasChanged()){config.save();}
	}
}
