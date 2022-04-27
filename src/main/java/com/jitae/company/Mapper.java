package com.jitae.company;

import java.util.ArrayList;

public interface Mapper {

	public void newsign(String id,String pw,String name, String team, String joindate, String jobgrade);
	public ArrayList<UserDTO> login(String id,String pw);
}
