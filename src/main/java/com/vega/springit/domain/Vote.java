package com.vega.springit.domain;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@Entity
public class Vote {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private int vote;
}
