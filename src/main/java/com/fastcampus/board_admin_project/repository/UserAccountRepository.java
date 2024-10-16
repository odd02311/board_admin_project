package com.fastcampus.board_admin_project.repository;

import com.fastcampus.board_admin_project.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {

}
