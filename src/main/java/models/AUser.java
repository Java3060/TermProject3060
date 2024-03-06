package models;

import com.google.cloud.firestore.annotation.DocumentId;
import io.micrometer.common.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class AUser {

    @DocumentId
    private @Nullable String UserID;
    private String email;
    private String[] FriendsList;


}