package com.gz.springbootsecurityexample.repository;

import com.gz.springbootsecurityexample.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiaozefeng
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    SysUser findByUsername(String username);
}
