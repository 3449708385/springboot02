package com.mgp.sb.onedao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;
import com.mgp.sb.beans.User;

@Repository("userDaoOne")
public interface UserDaoOne {

	@Insert("INSERT INTO SYS_USER(USERNAME,NICKNAME) VALUES (#{username},#{nickname})")
	int insert(User user);
	
	int insertXml(User user);

}
