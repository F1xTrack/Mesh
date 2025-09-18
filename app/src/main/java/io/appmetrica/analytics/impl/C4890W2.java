package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.W2 */
/* loaded from: classes2.dex */
public final class C4890W2 implements InterfaceC5528vj {

    /* renamed from: a */
    public final ArrayList f30892a;

    /* renamed from: b */
    public Intent f30893b;

    /* renamed from: c */
    public final Context f30894c;

    /* renamed from: d */
    public final C4606K5 f30895d;

    public C4890W2(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    /* renamed from: a */
    public final synchronized Intent m19929a(Consumer<Intent> consumer) {
        this.f30892a.add(consumer);
        return this.f30893b;
    }

    /* renamed from: b */
    public final void m19930b() {
        this.f30893b = null;
        C4606K5 c4606k5 = this.f30895d;
        Context context = this.f30894c;
        synchronized (c4606k5) {
            if (c4606k5.f30385b) {
                try {
                    context.unregisterReceiver(c4606k5.f30384a);
                    c4606k5.f30385b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5528vj
    public final synchronized void onCreate() {
        Intent intentM19928a = m19928a();
        this.f30893b = intentM19928a;
        Iterator it = this.f30892a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentM19928a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5528vj
    public final synchronized void onDestroy() {
        this.f30893b = null;
        m19930b();
        Iterator it = this.f30892a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public C4890W2(Context context, ICommonExecutor iCommonExecutor, int i) {
        this.f30892a = new ArrayList();
        this.f30893b = null;
        this.f30894c = context;
        this.f30895d = AbstractC4582J5.m19528a(new C4359A2(new C4866V2(this), iCommonExecutor));
    }

    /* renamed from: a */
    public final Intent m19928a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        C4606K5 c4606k5 = this.f30895d;
        Context context = this.f30894c;
        synchronized (c4606k5) {
            try {
                intentRegisterReceiver = context.registerReceiver(c4606k5.f30384a, intentFilter);
                try {
                    c4606k5.f30385b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intentRegisterReceiver = null;
            }
        }
        return intentRegisterReceiver;
    }
}
