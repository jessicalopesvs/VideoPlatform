package jessl.video.model;

import jakarta.persistence.*;
import jessl.video.dto.DadosVideos;
import lombok.*;


@Table(name="videos")
@Entity(name = "video")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Video {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String url;

    public Video (DadosVideos dados){
        this.title = dados.title();
        this.description = dados.description();
        this.url = dados.url();
    }

}
