package com.nova.skills.model;

import lombok.Data;

import java.util.List;

@Data
public class Test {

    private Long testId;

    private List<Question> questions;

    private Integer percent;
}
