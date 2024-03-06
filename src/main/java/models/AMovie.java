package models;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import io.micrometer.common.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class AMovie {

    @DocumentId
    private @Nullable int MovieID;
    private String Title;
    private String Genre;
    private Timestamp ReleaseDate;
    private String Overview;
    private int Rating;
    private int TMDBID;


}