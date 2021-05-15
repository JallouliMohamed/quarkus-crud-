package service.mapper;

import domain.Publication;
import org.mapstruct.Mapper;
import service.dto.PublicationDTO;

import java.util.List;

@Mapper(componentModel = "cdi", uses = {})
public interface PublicationMapper extends EntityMapper<PublicationDTO, Publication> {
    Publication toEntity(PublicationDTO dto);


    PublicationDTO toDto(Publication entity);


    List<Publication> toEntity(List<PublicationDTO> dtoList);


    List<PublicationDTO> toDto(List<Publication> entityList);
}
