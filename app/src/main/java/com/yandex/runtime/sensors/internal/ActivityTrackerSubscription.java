package com.yandex.runtime.sensors.internal;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.tasks.Task;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000.C9450g32;
import p000.InterfaceC8348Tx0;
import p000.InterfaceC9307ey0;
import p000.Y81;

/* loaded from: classes2.dex */
public class ActivityTrackerSubscription {
    private static final String BROADCAST_ACTION = "activityRecognitionAction";
    private static final int FLAG_MUTABLE = 33554432;
    private static final long MS_IN_SEC = 1000;
    private static final String TAG = "com.yandex.runtime.sensors.internal.ActivityTrackerSubscription";
    private BroadcastReceiver broadcastReceiver_;
    private ActivityRecognitionClient client_;
    private boolean connected_;
    private NativeObject nativeObject_;
    private PendingIntent pendingIntent_;

    public class ActivityTrackerBroadcastReceiver extends BroadcastReceiver {
        private ActivityTrackerBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ActivityRecognitionResult.hasResult(intent)) {
                ActivityTrackerSubscription.this.handle(ActivityRecognitionResult.extractResult(intent));
            }
        }
    }

    public ActivityTrackerSubscription(NativeObject nativeObject, int i) {
        this.connected_ = false;
        this.nativeObject_ = nativeObject;
        Intent intent = new Intent();
        intent.setAction(BROADCAST_ACTION);
        intent.setPackage(Runtime.getApplicationContext().getPackageName());
        this.pendingIntent_ = PendingIntent.getBroadcast(Runtime.getApplicationContext(), 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        this.client_ = ActivityRecognition.getClient(Runtime.getApplicationContext());
        this.broadcastReceiver_ = new ActivityTrackerBroadcastReceiver();
        Task taskRequestActivityUpdates = this.client_.requestActivityUpdates(i * MS_IN_SEC, this.pendingIntent_);
        InterfaceC9307ey0 interfaceC9307ey0 = new InterfaceC9307ey0() { // from class: com.yandex.runtime.sensors.internal.ActivityTrackerSubscription.1
            @Override // p000.InterfaceC9307ey0
            public void onSuccess(Object obj) {
                String unused = ActivityTrackerSubscription.TAG;
            }
        };
        C9450g32 c9450g32 = (C9450g32) taskRequestActivityUpdates;
        c9450g32.getClass();
        c9450g32.mo11138e(Y81.f14171a, interfaceC9307ey0);
        taskRequestActivityUpdates.mo11136c(new InterfaceC8348Tx0() { // from class: com.yandex.runtime.sensors.internal.ActivityTrackerSubscription.2
            @Override // p000.InterfaceC8348Tx0
            public void onFailure(Exception exc) {
                String unused = ActivityTrackerSubscription.TAG;
                exc.getMessage();
            }
        });
        Runtime.getApplicationContext().registerReceiver(this.broadcastReceiver_, new IntentFilter(BROADCAST_ACTION));
        this.connected_ = true;
    }

    private void doStop() {
        this.client_.removeActivityUpdates(this.pendingIntent_);
        Runtime.getApplicationContext().unregisterReceiver(this.broadcastReceiver_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handle(ActivityRecognitionResult activityRecognitionResult) {
        HashMap map = new HashMap();
        Iterator<DetectedActivity> it = activityRecognitionResult.getProbableActivities().iterator();
        while (it.hasNext()) {
            int type = it.next().getType();
            if (type != 2) {
                map.put(Integer.valueOf(type), Float.valueOf(r1.getConfidence() / 100.0f));
            }
        }
        updateActivity(this.nativeObject_, map);
    }

    public static boolean isActivityTrackerAvailable() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(Runtime.getApplicationContext()) == 0;
    }

    public static native void updateActivity(NativeObject nativeObject, Map map);

    public void stop() {
        if (this.connected_) {
            doStop();
            this.connected_ = false;
        }
    }
}
