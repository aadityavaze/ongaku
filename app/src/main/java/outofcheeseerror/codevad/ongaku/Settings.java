

package outofcheeseerror.codevad.ongaku;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Activity for MainActivity settings.
 * Started when the user click Settings from the activity_main menu.
 * @author Levente Bagi
 */
public class Settings extends PreferenceActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        addPreferencesFromResource(R.xml.preferences);
    }
}
