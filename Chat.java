@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chat {
    private String content;
    private String senderId;
    private String sender;
    private String receiverId;
    private String receiver;
    private Timestamp timestamp;
    private boolean isUserSender;


    public void setIsUserSender(boolean isUserSender) {
        this.isUserSender = isUserSender;
    }
}
