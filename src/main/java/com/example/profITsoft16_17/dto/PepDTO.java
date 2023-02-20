package com.example.profITsoft16_17.dto;

import com.example.profITsoft16_17.entity.Pep;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class PepDTO {
    String fullName;
    String fullNameEn;
    String dateOfBirth;
    boolean isPep;
    String lastJobTitle;
    String lastWorkplace;

    public static PepDTO createPepDTO(Pep pep){
        return PepDTO.builder()
                .fullName(pep.getFullName())
                .fullNameEn(pep.getFullNameEn())
                .dateOfBirth(pep.getDateOfBirth())
                .isPep(pep.isPep())
                .lastJobTitle(pep.getLastJobTitle())
                .lastWorkplace(pep.getLastWorkplace())
                .build();
    }
}
