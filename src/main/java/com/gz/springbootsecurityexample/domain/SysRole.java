package com.gz.springbootsecurityexample.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author xiaozefeng
 */
@Getter
@Setter
@Entity
public class SysRole {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
