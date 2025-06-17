package com.Spring.Student.Internship.Portal.Model.Mappers;

import com.Spring.Student.Internship.Portal.Model.Dtos.InternDtos.InternResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Intern;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InternMapper {
    InternResDto toResponse(Intern intern);
    List<InternResDto>toResponses(List<Intern >interns);
}
