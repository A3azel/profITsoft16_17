package com.example.profITsoft16_17.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@ToString
@FieldDefaults(level= AccessLevel.PRIVATE)
@Document("Test")
public class Pep {
    @Id
    String id;
    @JsonProperty("also_known_as_en")
    @Field("also_known_as_en")
    String alsoKnownAsEn;
    @JsonProperty("date_of_birth")
    @Field("date_of_birth")
    String dateOfBirth;
    @JsonProperty("died")
    @Field("died")
    boolean died;
    @JsonProperty("first_name")
    @Field("first_name")
    String firstName;
    @JsonProperty("first_name_en")
    @Field("first_name_en")
    String firstNameEn;
    @JsonProperty("full_name")
    @Field("full_name")
    String fullName;
    @JsonProperty("full_name_en")
    @Field("full_name_en")
    String fullNameEn;
    @JsonProperty("is_pep")
    @Field("is_pep")
    boolean isPep;
    @JsonProperty("last_name")
    @Field("last_name")
    String lastName;
    @JsonProperty("last_name_en")
    @Field("last_name_en")
    String lastNameEn;
    @JsonProperty("names")
    @Field("names")
    String names;
    @JsonProperty("patronymic")
    @Field("patronymic")
    String patronymic;
    @JsonProperty("patronymic_en")
    @Field("patronymic_en")
    String patronymicEn;
    @JsonProperty("photo")
    @Field("photo")
    String photo;
    @JsonProperty("related_persons")
    @Field("related_persons")
    List<RelatedPerson> relatedPersons;
    @JsonProperty("type_of_official")
    @Field("type_of_official")
    String typeOfOfficial;
    @JsonProperty("type_of_official_en")
    @Field("type_of_official_en")
    String typeOfOfficialEn;
    @JsonProperty("url")
    @Field("url")
    String url;
    @JsonProperty("last_job_title")
    @Field("last_job_title")
    String lastJobTitle;
    @JsonProperty("last_job_title_en")
    @Field("last_job_title_en")
    String lastJobTitleEn;
    @JsonProperty("last_workplace")
    @Field("last_workplace")
    String lastWorkplace;
    @JsonProperty("last_workplace_en")
    @Field("last_workplace_en")
    String lastWorkplaceEn;
    @JsonProperty("related_companies")
    @Field("related_companies")
    List<RelatedCompany> relatedCompanies;
    @JsonProperty("also_known_as_uk")
    @Field("also_known_as_uk")
    String alsoKnownAsUk;
    @JsonProperty("declarations")
    @Field("declarations")
    List<Declaration> declarations;
    @JsonProperty("reputation_assets_en")
    @Field("reputation_assets_en")
    String reputationAssetsEn;
    @JsonProperty("reputation_assets_uk")
    @Field("reputation_assets_uk")
    String reputationAssetsUk;
    @JsonProperty("reputation_convictions_en")
    @Field("reputation_convictions_en")
    String reputationConvictionsEn;
    @JsonProperty("reputation_convictions_uk")
    @Field("reputation_convictions_uk")
    String reputationConvictionsUk;
    @JsonProperty("reputation_crimes_en")
    @Field("reputation_crimes_en")
    String reputationCrimesEn;
    @JsonProperty("reputation_crimes_uk")
    @Field("reputation_crimes_uk")
    String reputationCrimesUk;
    @JsonProperty("reputation_manhunt_en")
    @Field("reputation_manhunt_en")
    String reputationManhuntEn;
    @JsonProperty("reputation_manhunt_uk")
    @Field("reputation_manhunt_uk")
    String reputationManhuntUk;
    @JsonProperty("reputation_sanctions_en")
    @Field("reputation_sanctions_en")
    String reputationSanctionsEn;
    @JsonProperty("reputation_sanctions_uk")
    @Field("reputation_sanctions_uk")
    String reputationSanctionsUk;
    @JsonProperty("wiki_en")
    @Field("wiki_en")
    String wikiEn;
    @JsonProperty("wiki_uk")
    @Field("wiki_uk")
    String wikiUk;
    @JsonProperty("city_of_birth_uk")//
    @Field("city_of_birth_uk")//
    String cityOfBirthUk;
    @JsonProperty("city_of_birth_en")//
    @Field("city_of_birth_en")//
    String cityOfBirthEn;
    @JsonProperty("reason_of_termination")
    @Field("reason_of_termination")
    String reasonOfTermination;
    @JsonProperty("reason_of_termination_en")
    @Field("reason_of_termination_en")
    String reasonOfTerminationEn;
    @JsonProperty("termination_date_human")
    @Field("termination_date_human")
    String terminationDateHuman;
    @JsonProperty("related_countries")
    @Field("related_countries")
    List<RelatedCountry> relatedCountries;
}
