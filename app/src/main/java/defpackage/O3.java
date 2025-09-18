package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class O3 extends BroadcastReceiver {
    public boolean a = false;
    public Boolean b;
    public final /* synthetic */ P3 c;

    public O3(P3 p3) {
        this.c = p3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        String action = intent == null ? null : intent.getAction();
        if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
            z = false;
        } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
            return;
        } else {
            z = true;
        }
        Boolean bool = this.b;
        if (bool == null || bool.booleanValue() != z) {
            this.b = Boolean.valueOf(z);
            this.c.c.onAmazonFireDeviceConnectivityChanged(z);
        }
    }
}
