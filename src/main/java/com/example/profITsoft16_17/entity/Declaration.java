package com.example.profITsoft16_17.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@ToString
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Declaration {
    @JsonProperty("position_en")
    @Field("position_en")
    String positionEn;
    @JsonProperty("url")
    @Field("url")
    String url;
    @JsonProperty("income")
    @Field("income")
    String income;
    @JsonProperty("region_uk")
    @Field("region_uk")
    String regionUk;
    @JsonProperty("office_en")
    @Field("office_en")
    String officeEn;
    @JsonProperty("position_uk")
    @Field("position_uk")
    String positionUk;
    @JsonProperty("year")
    @Field("year")
    String year;
    @JsonProperty("office_uk")
    @Field("office_uk")
    String officeUk;
    @JsonProperty("region_en")
    @Field("region_en")
    String regionEn;
    @JsonProperty("family_income")
    @Field("family_income")
    String familyIncome;
}
