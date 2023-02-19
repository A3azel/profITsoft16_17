package com.example.profITsoft16_17.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Declaration {
    @Field("position_en")
    String positionEn;
    @Field("url")
    String url;
    @Field("income")
    String income;
    @Field("region_uk")
    String regionUk;
    @Field("office_en")
    String officeEn;
    @Field("position_uk")
    String positionUk;
    @Field("year")
    String year;
    @Field("office_uk")
    String officeUk;
    @Field("region_en")
    String regionEn;
    @Field("family_income")
    String familyIncome;
}
