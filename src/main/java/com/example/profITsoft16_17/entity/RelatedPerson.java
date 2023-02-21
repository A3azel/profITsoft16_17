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
public class RelatedPerson {
    @JsonProperty("relationship_type_en")
    String relationshipTypeEn;
    @JsonProperty("date_established")
    String dateEstablished;
    @JsonProperty("person_en")
    String personEn;
    @JsonProperty("date_confirmed")
    String dateConfirmed;
    @JsonProperty("is_pep")
    boolean isPep;
    @JsonProperty("date_finished")
    String dateFinished;
    @JsonProperty("person_uk")
    String personUk;
    @JsonProperty("relationship_type")
    String relationshipType;
}
