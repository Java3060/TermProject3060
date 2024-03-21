package models;
@Data
@AllArgsConstructor 
@NoArgsConstructor
public class User { 
    @DocumentId
    private @Nullable String userId;
    private String username;
    private String email;
    private List<String> roles;
    private String image;
    
}
