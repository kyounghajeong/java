package com.spring.skyairmy.vo;

public class SkyAirVO 
{
	private String M_CODE = "";
	private String M_NAME = "";
	private String M_ID = "";
	private String M_PW = "";
	private String M_TEL = "";
	private String M_ADDR = "";
	private String M_NEW = "";
	private String M_UPDATE = "";
	private String M_DELETEYN = "";
	
	private String R_TICKET = "";
	private String R_TOD = "";
	private String R_TOA = "";
	private String R_START = "";
	private String R_END = "";
	private String R_SEAT = "";
	private String R_PEOPLE = "";
	private String R_SUM = "";
	private String R_KORNAME = "";
	private String R_ENLAST = "";
	private String R_ENFIRST = "";
	private String R_BIRTH = "";
	private String R_MAIL = "";
	private String R_TEL = "";
	private String R_NEW = "";
	private String R_UPDATE = "";
	private String R_DELETEYN = "";

	private String T_TICKET = "";
	private String T_TOD = "";
	private String T_TOA = "";
	private String T_START = "";
	private String T_END = "";
	private String T_SEAT = "";
	private String T_AIRLINE = "";
	private String T_SUM = "";
	private String T_PERIOD = "";
	private String T_COUNT = "";
	private String T_NEW = "";
	private String T_UPDATE = "";
	private String T_DELETEYN = "";
	
	private String userid = "";
	private String userpass = "";
	private String username = "";
	private String usertel = "";
	private String useraddr = "";
	private String userdeleteyn = "";

	public String getuserid() { return userid; }
	public String getuserpass() { return userpass; }
	public String getusername() { return username; }
	public String getusertel() { return usertel; }
	public String getuseraddr() { return useraddr; }
	public String getuserdeleteyn() { return userdeleteyn; }

	public void setuserid(String userid) { this.userid = userid; }
	public void setuserpass(String userpass) { this.userpass = userpass; }
	public void setusername(String username) { this.username = username; }
	public void setusertel(String usertel) { this.usertel = usertel; }
	public void setuseraddr(String useraddr) { this.useraddr = useraddr; }
	public void setuserdeleteyn(String userdeleteyn) { this.userdeleteyn = userdeleteyn; }


	
	private String user_login_name = "";
	public String getuser_login_name() { return user_login_name; }
	public void setuser_login_name(String user_login_name) { this.user_login_name = user_login_name; }

	private String user_login_id = "";
	public String getuser_login_id() { return user_login_id; }
	public void setuser_login_id(String user_login_id) { this.user_login_id = user_login_id; }

	private String user_login_tel = "";
	public String getuser_login_tel() { return user_login_tel; }
	public void setuser_login_tel(String user_login_tel) { this.user_login_tel = user_login_tel; }

	private String user_login_addr = "";
	public String getuser_login_addr() { return user_login_addr; }
	public void setuser_login_addr(String user_login_addr) { this.user_login_addr = user_login_addr; }
	
	private String idcheck = "";
	public String getidcheck() { return idcheck; }
	public void setidcheck(String idcheck) { this.idcheck = idcheck; }

	private String idfind = "";
	public String getidfind() { return idfind; }
	public void setidfind(String idfind) { this.idfind = idfind; }
	
	private int idcount = 0;
	public int getidcount() { return idcount; }
	public void setidcount(int idcount) { this.idcount = idcount; }
	
	public String getM_CODE() { return M_CODE; }
	public String getM_NAME() { return M_NAME; }
	public String getM_ID() { return M_ID; }
	public String getM_PW() { return M_PW; }
	public String getM_TEL() { return M_TEL; }
	public String getM_ADDR() { return M_ADDR; }
	public String getM_NEW() { return M_NEW; }
	public String getM_UPDATE() { return M_UPDATE; }
	public String getM_DELETEYN() { return M_DELETEYN; }
	
	public String getR_TOD() { return R_TICKET; }
	public String getR_TOA() { return R_TOD; }
	public String getR_START() { return R_TOA; }
	public String getR_END() { return R_START; }
	public String getR_SEAT() { return R_END; }
	public String getR_PEOPLE() { return R_SEAT; }
	public String getR_SUM() { return R_PEOPLE; }
	public String getR_KORNAME() { return R_SUM; }
	public String getR_ENLAST() { return R_KORNAME; }
	public String getR_ENFIRST() { return R_ENLAST; }
	public String getR_BIRTH() { return R_ENFIRST; }
	public String getR_MAIL() { return R_BIRTH; }
	public String getR_TEL() { return R_MAIL; }
	public String getR_NEW() { return R_TEL; }
	public String getR_UPDATE() { return R_NEW; }
	public String getR_DELETEYN() { return R_UPDATE; }

	public String getT_TICKET() { return T_TICKET; }
	public String getT_TOD() { return T_TOD; }
	public String getT_TOA() { return T_TOA; }
	public String getT_START() { return T_START; }
	public String getT_END() { return T_END; }
	public String getT_SEAT() { return T_SEAT; }
	public String getT_AIRLINE() { return T_AIRLINE; }
	public String getT_SUM() { return T_SUM; }
	public String getT_PERIOD() { return T_PERIOD; }
	public String getT_COUNT() { return T_COUNT; }
	public String getT_NEW() { return T_NEW; }
	public String getT_UPDATE() { return T_UPDATE; }
	public String getT_DELETEYN() { return T_DELETEYN; }

	
	public void setM_CODE(String M_CODE) { this.M_CODE = M_CODE; }
	public void setM_NAME(String M_NAME) { this.M_NAME = M_NAME; }
	public void setM_ID(String M_ID) { this.M_ID = M_ID; }
	public void setM_PW(String M_PW) { this.M_PW = M_PW; }
	public void setM_TEL(String M_TEL) { this.M_TEL = M_TEL; }
	public void setM_ADDR(String M_ADDR) { this.M_ADDR = M_ADDR; }
	public void setM_NEW(String M_NEW) { this.M_NEW = M_NEW; }
	public void setM_UPDATE(String M_UPDATE) { this.M_UPDATE = M_UPDATE; }
	public void setM_DELETEYN(String M_DELETEYN) { this.M_DELETEYN = M_DELETEYN; }
	public void setR_TICKET(String R_TICKET) { this.R_TICKET = R_TICKET; }
	public void setR_TOD(String R_TOD) { this.R_TOD = R_TOD; }
	public void setR_TOA(String R_TOA) { this.R_TOA = R_TOA; }
	public void setR_START(String R_START) { this.R_START = R_START; }
	public void setR_END(String R_END) { this.R_END = R_END; }
	public void setR_SEAT(String R_SEAT) { this.R_SEAT = R_SEAT; }
	public void setR_PEOPLE(String R_PEOPLE) { this.R_PEOPLE = R_PEOPLE; }
	public void setR_SUM(String R_SUM) { this.R_SUM = R_SUM; }
	public void setR_KORNAME(String R_KORNAME) { this.R_KORNAME = R_KORNAME; }
	public void setR_ENLAST(String R_ENLAST) { this.R_ENLAST = R_ENLAST; }
	public void setR_ENFIRST(String R_ENFIRST) { this.R_ENFIRST = R_ENFIRST; }
	public void setR_BIRTH(String R_BIRTH) { this.R_BIRTH = R_BIRTH; }
	public void setR_MAIL(String R_MAIL) { this.R_MAIL = R_MAIL; }
	public void setR_TEL(String R_TEL) { this.R_TEL = R_TEL; }
	public void setR_NEW(String R_NEW) { this.R_NEW = R_NEW; }
	public void setR_UPDATE(String R_UPDATE) { this.R_UPDATE = R_UPDATE; }
	public void setR_DELETEYN(String R_DELETEYN) { this.R_DELETEYN = R_DELETEYN; }
	public void setT_TICKET(String T_TICKET) { this.T_TICKET = T_TICKET; }
	public void setT_TOD(String T_TOD) { this.T_TOD = T_TOD; }
	public void setT_TOA(String T_TOA) { this.T_TOA = T_TOA; }
	public void setT_START(String T_START) { this.T_START = T_START; }
	public void setT_END(String T_END) { this.T_END = T_END; }
	public void setT_SEAT(String T_SEAT) { this.T_SEAT = T_SEAT; }
	public void setT_AIRLINE(String T_AIRLINE) { this.T_AIRLINE = T_AIRLINE; }
	public void setT_SUM(String T_SUM) { this.T_SUM = T_SUM; }
	public void setT_PERIOD(String T_PERIOD) { this.T_PERIOD = T_PERIOD; }
	public void setT_COUNT(String T_COUNT) { this.T_COUNT = T_COUNT; }
	public void setT_NEW(String T_NEW) { this.T_NEW = T_NEW; }
	public void setT_UPDATE(String T_UPDATE) { this.T_UPDATE = T_UPDATE; }
	public void setT_DELETEYN(String T_DELETEYN) { this.T_DELETEYN = T_DELETEYN; }


}
