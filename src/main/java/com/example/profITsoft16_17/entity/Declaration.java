package com.example.profITsoft16_17.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@ToString
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Declaration {
    @JsonProperty("position_en")
    String positionEn;
    @JsonProperty("url")
    String url;
    @JsonProperty("income")
    String income;
    @JsonProperty("region_uk")
    String regionUk;
    @JsonProperty("office_en")
    String officeEn;
    @JsonProperty("position_uk")
    String positionUk;
    @JsonProperty("year")
    String year;
    @JsonProperty("office_uk")
    String officeUk;
    @JsonProperty("region_en")
    String regionEn;
    @JsonProperty("family_income")
    String familyIncome;
}
