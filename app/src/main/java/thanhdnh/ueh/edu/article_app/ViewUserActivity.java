package thanhdnh.ueh.edu.article_app;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class ViewUserActivity extends AppCompatActivity {
  ImageView iv_detail;
  TextView tv_detail_username, tv_detail_password, tv_detail_bio;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_user);
    if (getSupportActionBar() != null) {
      getSupportActionBar().hide();
    }

    iv_detail = findViewById(R.id.iv_detail);
    tv_detail_username = findViewById(R.id.tv_detail_username);
    tv_detail_password = findViewById(R.id.tv_detail_password);
    tv_detail_bio = findViewById(R.id.tv_detail_bio);

    int id = (int) getIntent().getLongExtra("id", 0);

    User user = UserData.getUserFromId(id);
    if (user != null) {
      if (user.getUi_profile() != null && !user.getUi_profile().isEmpty()) {
        Picasso.get().load(user.getUi_profile()).resize(400, 500).centerCrop().into(iv_detail);
      }
      tv_detail_username.setText(user.getUsername() != null ? user.getUsername() : "");
      tv_detail_password.setText(user.getPassword() != null ? "Password: " + user.getPassword() : "");
      tv_detail_bio.setText(user.getShort_bio() != null ? user.getShort_bio() : "");
    }
  }
}
