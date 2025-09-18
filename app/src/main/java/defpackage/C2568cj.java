package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cj */
/* loaded from: classes2.dex */
public final class C2568cj extends BroadcastReceiver {
    public boolean a = false;
    public final /* synthetic */ C3444dj b;

    public C2568cj(C3444dj c3444dj) {
        this.b = c3444dj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        this.b.f();
    }
}
