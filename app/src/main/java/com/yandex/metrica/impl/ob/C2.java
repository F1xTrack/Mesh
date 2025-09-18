package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;

/* loaded from: classes2.dex */
public class C2 {
    private final String a;
    private final Context b;
    private final com.yandex.metrica.c c;
    private final E2 d;

    public C2(String str, Context context, com.yandex.metrica.c cVar, E2 e2) {
        this.a = str;
        this.b = context;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            this.c = com.yandex.metrica.c.SELF_DIAGNOSTIC_MAIN;
        } else if (iOrdinal != 1) {
            this.c = null;
        } else {
            this.c = com.yandex.metrica.c.SELF_DIAGNOSTIC_MANUAL;
        }
        this.d = e2;
    }

    public void a(C2864k0 c2864k0) {
        if (this.c != null) {
            try {
                String str = this.a;
                CounterConfiguration counterConfiguration = new CounterConfiguration();
                synchronized (counterConfiguration) {
                    counterConfiguration.j(str);
                }
                counterConfiguration.c(this.c);
                this.d.a(c2864k0.b(new C2866k2(new U3(this.b, (ResultReceiver) null), counterConfiguration, null).c()));
            } catch (Throwable unused) {
            }
        }
    }
}
