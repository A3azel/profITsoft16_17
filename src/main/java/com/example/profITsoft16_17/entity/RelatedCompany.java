package com.example.profITsoft16_17.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class RelatedCompany {
    @Field("relationship_type_en")
    String relationshipTypeEn;
    @Field("to_company_short_en")
    String toCompanyShortEn;
    @Field("date_established")
    String dateEstablished;
    @Field("to_company_edrpou")
    String toCompanyEdrpou;
    @Field("to_company_founded")
    String toCompanyFounded;
    @Field("date_finished")
    String dateFinished;
    @Field("to_company_is_state")
    boolean toCompanyIsState;
    @Field("share")
    String share;
    @Field("date_confirmed")
    String dateConfirmed;
    @Field("to_company_uk")
    String toCompanyUk;
    @Field("to_company_short_uk")
    String toCompanyShortUk;
    @Field("to_company_en")
    String toCompanyEn;
    @Field("relationship_type_uk")
    String relationshipTypeUk;
}
