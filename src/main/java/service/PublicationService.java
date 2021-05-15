package service;

import service.dto.PublicationDTO;

import java.util.List;

public interface PublicationService {
    PublicationDTO save(PublicationDTO publicationDTO);
    List<PublicationDTO> findPublication();
}
