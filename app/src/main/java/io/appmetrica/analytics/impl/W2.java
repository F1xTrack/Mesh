package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class W2 implements InterfaceC4939vj {
    public final ArrayList a;
    public Intent b;
    public final Context c;
    public final K5 d;

    public W2(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.a.add(consumer);
        return this.b;
    }

    public final void b() {
        this.b = null;
        K5 k5 = this.d;
        Context context = this.c;
        synchronized (k5) {
            if (k5.b) {
                try {
                    context.unregisterReceiver(k5.a);
                    k5.b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4939vj
    public final synchronized void onCreate() {
        Intent intentA = a();
        this.b = intentA;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentA);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4939vj
    public final synchronized void onDestroy() {
        this.b = null;
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public W2(Context context, ICommonExecutor iCommonExecutor, int i) {
        this.a = new ArrayList();
        this.b = null;
        this.c = context;
        this.d = J5.a(new A2(new V2(this), iCommonExecutor));
    }

    public final Intent a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        K5 k5 = this.d;
        Context context = this.c;
        synchronized (k5) {
            try {
                intentRegisterReceiver = context.registerReceiver(k5.a, intentFilter);
                try {
                    k5.b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intentRegisterReceiver = null;
            }
        }
        return intentRegisterReceiver;
    }
}
