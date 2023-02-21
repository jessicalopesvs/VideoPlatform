package jessl.video.controller;

import jessl.video.dto.DadosVideos;
import jessl.video.model.Video;
import jessl.video.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("video")
public class videoController {

    @Autowired
    private VideoRepository repository;

    @PostMapping
    public void upload (@RequestBody DadosVideos video){
        repository.save(new Video(video));

    }
}
