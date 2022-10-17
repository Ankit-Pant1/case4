package com.gl.LoginAuthentication.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gl.LoginAuthentication.bean.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser,String> {
	Optional<MyUser> findUserByUserId(String userId);
}
