package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class LU extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public LU(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (MU.k) {
            try {
                Iterator it = ((C7545v8) MU.l.values()).iterator();
                while (it.hasNext()) {
                    ((MU) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.unregisterReceiver(this);
    }
}
