package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: LU */
/* loaded from: classes.dex */
public final class C0723LU extends BroadcastReceiver {

    /* renamed from: b */
    public static final AtomicReference f6661b = new AtomicReference();

    /* renamed from: a */
    public final Context f6662a;

    public C0723LU(Context context) {
        this.f6662a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C0786MU.f7172k) {
            try {
                Iterator it = ((C6993v8) C0786MU.f7173l.values()).iterator();
                while (it.hasNext()) {
                    ((C0786MU) it.next()).m5382g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6662a.unregisterReceiver(this);
    }
}
