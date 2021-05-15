package service.impl;

import domain.Publication;
import repository.PublicationRepository;
import service.PublicationService;
import service.dto.PublicationDTO;
import service.mapper.PublicationMapper;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
@Transactional
public class PublicationServiceImpl implements PublicationService {
    private final PublicationRepository publicationRepository;
    private final PublicationMapper publicationMapper;
    @Inject
    public PublicationServiceImpl(PublicationRepository publicationRepository,PublicationMapper publicationMapper) {
        this.publicationRepository = publicationRepository;
        this.publicationMapper=publicationMapper;
    }

    @Override
    public PublicationDTO save(PublicationDTO publicationDTO) {
        Publication publication = publicationMapper.toEntity(publicationDTO);
        return publicationMapper.toDto(publicationRepository.save(publication));
    }

    @Override
    public List<PublicationDTO> findPublication() {
        return  publicationRepository.findAll().stream().map(publicationMapper::toDto).collect(Collectors.toList());
    }
}
