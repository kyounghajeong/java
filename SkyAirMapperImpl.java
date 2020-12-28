package com.spring.skyairmy.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.spring.skyairmy.vo.SkyAirVO;

public class SkyAirMapperImpl extends SqlSessionDaoSupport implements SkyAirMapper 
{	
	private final String PACKAGE_PATH = "com.spring.skyair.dao.SkyAirDAO.";
	
	@Override
	public int SkyAirsignup(SkyAirVO param) 
	{
		System.out.println(" SkyAirMapperImpl >>> SkyAirsignup");		
		return (int)getSqlSession().insert(PACKAGE_PATH+"SkyAirsignup");	
	}
	
	@Override
	public List<SkyAirVO> SkyAirlogincheck(SkyAirVO param)
	{
		System.out.println(" SkyAirMapperImpl >>> SkyAirlogincheck");		
		return getSqlSession().selectOne(PACKAGE_PATH+"SkyAirlogincheckA");
	}
	
	@Override
	public int SkyAirsignupidcheck(SkyAirVO param)
	{
		System.out.println(" SkyAirMapperImpl >>> SkyAirsignupidcheck");		
		return (int)getSqlSession().selectOne(PACKAGE_PATH+"SkyAirsignupidcheck");
	}
	
	@Override
	public List<SkyAirVO> SkyAiridfindsand(SkyAirVO param) throws Exception
	{
		System.out.println(" SkyAirMapperImpl >>> SkyAiridfindsand");		
		return getSqlSession().selectList(PACKAGE_PATH+"SkyAiridfindsand");
	}
}