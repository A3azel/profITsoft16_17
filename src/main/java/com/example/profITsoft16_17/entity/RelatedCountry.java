package com.example.profITsoft16_17.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class RelatedCountry {
    @Field("date_established")
    String dateEstablished;
    @Field("date_finished")
    String dateFinished;
    @Field("date_confirmed")
    String dateConfirmed;
    @Field("to_country_en")
    String toCountryEn;
    @Field("to_country_uk")
    String toCountryUk;
    @Field("relationship_type")
    String relationshipType;
}
