package GraphQL.media_service.service;

import GraphQL.media_service.pojo.Media;
import GraphQL.media_service.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * MediaService holds methods to call different requests
 * the MongoDB database directly.
 */
@Service
public class MediaService {
    @Autowired
    MediaRepository mediaRepository;

    //Finds specific media data by id
    public Media getById(String id){
        return mediaRepository.findById(id).get();
    }
    //Finds all media
    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }
    //Adds new media to DB
    public Media addMedia (Media media) {
        media.setType(media.getType());
        media.setRegion(media.getRegion());
        media.setRelease(media.getRelease());
        media.setSales(media.getSales());
        mediaRepository.save(media);
        return media;
    }
    //Updates current existing media
    public Media updateMedia (Media updateMedia) {
        System.out.println("ID: " + updateMedia.getId());
        Media media = mediaRepository.findById(updateMedia.getId()).get();
        media.setType(updateMedia.getType());
        media.setRegion(updateMedia.getRegion());
        media.setRelease(updateMedia.getRelease());
        media.setSales(updateMedia.getSales());
        mediaRepository.save(media);
        return media;
    }
}
