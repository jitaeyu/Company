package com.jitae.company;

import java.util.ArrayList;

public interface Mapper {

	public void newsign(String id,String pw,String name, String team, String joindate, String jobgrade, String phone);
	public ArrayList<UserDTO> login(String id,String pw);
	public ArrayList<UserDTO> myinfo(String id);
	public void modifymyinfo(String pw,String name, String team, String joindate, String jobgrade, String phone,String id);
	public ArrayList<Calendar> calenList();
}
