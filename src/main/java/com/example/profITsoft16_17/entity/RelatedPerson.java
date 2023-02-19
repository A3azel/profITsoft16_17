package com.example.profITsoft16_17.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class RelatedPerson {
    @Field("relationship_type_en")
    String relationshipTypeEn;
    @Field("date_established")
    String dateEstablished;
    @Field("person_en")
    String personEn;
    @Field("date_confirmed")
    String dateConfirmed;
    @Field("is_pep")
    boolean isPep;
    @Field("person_uk")
    String personUk;
    @Field("relationship_type")
    String relationshipType;
}
