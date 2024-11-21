package com.ms.email.mappers;

import com.ms.email.domain.EmailModel;
import com.ms.email.dtos.EmailDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmailMapper {
    EmailMapper INSTANCE = Mappers.getMapper(EmailMapper.class);

    @Mapping(source = "userId", target = "userId")
    @Mapping(source = "emailTo", target = "emailTo")
    @Mapping(source = "subject", target = "subject")
    @Mapping(source = "text", target = "text")
    EmailModel toModel(EmailDTO emailDTO);
}
