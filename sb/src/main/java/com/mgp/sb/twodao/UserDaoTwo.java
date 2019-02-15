package com.mgp.sb.twodao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;
import com.mgp.sb.beans.User;

@Repository("userDaoTwo")
public interface UserDaoTwo {

	@Insert("INSERT INTO SYS_USER(USERNAME,NICKNAME) VALUES (#{username},#{nickname})")
	int insert(User user);
	
	int insertXml(User user);

}
