package models;

import Util.Utility;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class RestRecommendations {
    @Getter
private List<DocumentReference> assignedUsers;
    private DocumentReference createdBy;

    public RestRecommendations(String recId, String title, String description, int movieID, Timestamp recDate, List<DocumentReference> assignedUsers, DocumentReference createdBy) {
        super(recId, title, description, movieID, recDate);
        this.assignedUsers = assignedUsers;
        this.createdBy = createdBy;
    }
// Setters and Getters for String parameters to perform Firestore queries

    public void setCreatedBy(String createdBy) {
        // Perform Firebase Firestore query to retrieve DocumentReference for createBy
        this.createdBy = Utility.retrieveDocumentReference("Users", createdBy);
    }

    public void setAssignedUsers(ArrayList<String> assignedUsers) {

        this.assignedUsers = new ArrayList<>();
        for(String user : assignedUsers) {
            this.assignedUsers.add(Utility.retrieveDocumentReference("Users", user));
        }
    }
}
