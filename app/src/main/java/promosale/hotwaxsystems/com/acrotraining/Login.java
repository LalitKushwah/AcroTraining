package promosale.hotwaxsystems.com.acrotraining;

  import com.google.gson.annotations.Expose;
  import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("success")
    @Expose
    private Integer success;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
