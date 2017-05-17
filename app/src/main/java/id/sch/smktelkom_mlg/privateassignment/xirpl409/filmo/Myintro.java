package id.sch.smktelkom_mlg.privateassignment.xirpl409.filmo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Myintro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Filmo",
                "Film Information",
                R.drawable.ic_whatshot_black_24dp,
                Color.parseColor("#FF6347")));

        addSlide(AppIntroFragment.newInstance("Menyediakan berita terkini mengenai film",
                "Welcome",
                R.drawable.ic_local_movies_black_24dp,
                Color.parseColor("#CD5C5C")));

        addSlide(AppIntroFragment.newInstance("Film terbaik saat ini",
                "Top Film",
                R.drawable.ic_stars_black_24dp,
                Color.parseColor("#E9967A")));

        addSlide(AppIntroFragment.newInstance("Film yang sedang diputar",
                "Now Playing",
                R.drawable.ic_play_circle_outline_black_24dp,
                Color.parseColor("#FFA07A")));

        addSlide(AppIntroFragment.newInstance("Film yang akan datang",
                "Coming Soon",
                R.drawable.ic_update_black_24dp,
                Color.parseColor("#DB7093")));

        addSlide(AppIntroFragment.newInstance("Dapatkan informasi film terkini hanya di filmo",
                "Enjoy it",
                R.drawable.ic_live_tv_black_24dp,
                Color.parseColor("#FF6347")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));
    }

    @Override
    public void onDonePressed() {
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        finish();
    }

    @Override
    public void onSlideChanged() {
        Toast.makeText(this, "Go Slide Changed", Toast.LENGTH_SHORT).show();
    }

}
