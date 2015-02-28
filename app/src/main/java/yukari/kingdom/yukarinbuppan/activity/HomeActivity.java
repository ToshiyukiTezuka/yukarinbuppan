package yukari.kingdom.yukarinbuppan.activity;

import android.app.Activity;
import android.os.Bundle;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;
import yukari.kingdom.yukarinbuppan.fragment.HomeFragment;

public class HomeActivity extends Activity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "up59njwmllxX2I1h9NoclQsYF";
    private static final String TWITTER_SECRET = "u0jmuEjHaA32XT1aijedXEeHkrUH3U7ay1qRkJvCggrJi6fOqB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(android.R.id.content, HomeFragment.newInstance()).commit();
        }
    }
}
