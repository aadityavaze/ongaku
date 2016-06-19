
/**
 * Created by Vaze on 6/18/2016.
 */
package outofcheeseerror.codevad.ongaku;

import android.os.Bundle;
import android.preference.PreferenceActivity;



public class Settings extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        addPreferencesFromResource(R.xml.preferences);
    }
}
