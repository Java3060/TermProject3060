package model.Jobs;

import com.google.cloud.Timestamp;
import model.Users;

import java.util.List;

public class Recommendations extends ARecommendations {
    private List<Users> assignedUsers;
    private Users createdBy;

    public Recommendations(public ARecommendations( String recId, String title, String description, int movieID, Timestamp recDate) {
        super(recId,  title,  description, movieID, recDate);
        this.assignedUsers = assignedUsers;
        this.createdBy = createdBy;
    }
}
