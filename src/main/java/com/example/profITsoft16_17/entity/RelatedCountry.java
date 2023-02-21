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
public class RelatedCountry {
    @JsonProperty("date_established")
    String dateEstablished;
    @JsonProperty("date_finished")
    String dateFinished;
    @JsonProperty("date_confirmed")
    String dateConfirmed;
    @JsonProperty("to_country_en")
    String toCountryEn;
    @JsonProperty("to_country_uk")
    String toCountryUk;
    @JsonProperty("relationship_type")
    String relationshipType;
}
