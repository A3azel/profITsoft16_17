package com.example.profITsoft16_17.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

@Builder
@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class PopularNameResponse {
    @Id
    String popularName;
    Integer popularNameCount;
}
