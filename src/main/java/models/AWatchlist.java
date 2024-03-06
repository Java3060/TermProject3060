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

public abstract class AWatchlist {

    @DocumentId
    private @Nullable int WListID;
    private int MovieID;
    private int UserID;
    private boolean Watched;
    private Timestamp AddedDate;


}
