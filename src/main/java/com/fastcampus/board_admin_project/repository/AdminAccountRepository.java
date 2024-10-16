package com.fastcampus.board_admin_project.repository;

import com.fastcampus.board_admin_project.domain.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, String> {

}
