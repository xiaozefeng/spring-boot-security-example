package com.gz.springbootsecurityexample.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaozefeng
 */
@Setter
@Getter
public class Msg {
    private String title;

    private String content;

    private String etraInfo;

    public Msg(String title, String content, String etraInfo) {
        this.title = title;
        this.content = content;
        this.etraInfo = etraInfo;
    }

    public Msg() {
    }
}
