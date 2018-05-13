package rescue.food.hacks.org.foodrescue;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class FoodRescueApplication extends Application {

    public static RealmConfiguration configuration;
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        configuration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(configuration);
    }
}
