package camera.cam.listeners;

import android.app.Activity;
import android.view.View;

import camera.cam.dialogs.ChooseBaseDialog;
import camera.cam.interfaces.myOnClickListener;

public class SettingsListener implements myOnClickListener {

    private Activity activity;

    public SettingsListener(Activity act) {
        this.activity = act;
    }

    @Override
    public void onClick(View v) {
        ChooseBaseDialog dialogFragment = new ChooseBaseDialog();
        dialogFragment.show(activity.getFragmentManager(), "DialogFragment");
    }
}
