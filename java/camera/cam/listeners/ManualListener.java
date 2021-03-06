package camera.cam.listeners;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import camera.cam.ManualActivity;
import camera.cam.interfaces.myOnClickListener;

public class ManualListener implements myOnClickListener {
    private Activity activity;

    public ManualListener(Activity act) {
        this.activity = act;
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(activity.getApplicationContext(), ManualActivity.class);
        activity.startActivity(intent);
    }
}
