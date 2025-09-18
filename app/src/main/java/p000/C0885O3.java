package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: O3 */
/* loaded from: classes2.dex */
public final class C0885O3 extends BroadcastReceiver {

    /* renamed from: a */
    public boolean f8192a = false;

    /* renamed from: b */
    public Boolean f8193b;

    /* renamed from: c */
    public final /* synthetic */ C0948P3 f8194c;

    public C0885O3(C0948P3 c0948p3) {
        this.f8194c = c0948p3;
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
        Boolean bool = this.f8193b;
        if (bool == null || bool.booleanValue() != z) {
            this.f8193b = Boolean.valueOf(z);
            this.f8194c.f8806c.onAmazonFireDeviceConnectivityChanged(z);
        }
    }
}
