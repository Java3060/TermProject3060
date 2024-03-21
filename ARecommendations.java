package model.Jobs;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import com.google.protobuf.util.Timestamps;

import java.text.ParseException;

public class ARecommendations {
    @DocumentId
    protected @Nullable String recId;
    protected String title;
    protected String description;
    protected int MovieID;
    protected Timestamp RecDate;

    public ARecommendations(String recId, String title, String description, int movieID, Timestamp recDate) {
    }


    public void setRecDate(String postedAt) throws ParseException {
        this.RecDate = Timestamp.fromProto(Timestamps.parse(postedAt));
    }
}
