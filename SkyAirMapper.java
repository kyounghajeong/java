package com.spring.skyairmy.dao;

import java.util.List;

import com.spring.skyairmy.vo.SkyAirVO;

public interface SkyAirMapper 
{	
	public int SkyAirsignup(SkyAirVO param) ;
	public List<SkyAirVO> SkyAirlogincheck(SkyAirVO param);
	public int SkyAirsignupidcheck(SkyAirVO param);
	public List<SkyAirVO> SkyAiridfindsand(SkyAirVO param) throws Exception;	
}
