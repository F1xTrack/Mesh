package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.AbstractC0314Du;
import defpackage.AbstractC8449zu;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.fb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4549fb {
    public final C4564g2 a = new C4564g2();
    public final C4735n6 b = new C4735n6();
    public C4942vm c;
    public boolean d;
    public boolean e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, Qa qa) {
        if (this.e) {
            return;
        }
        AbstractC0314Du.n(this.b.a, new Ca[]{this.a.a(context, appMetricaConfig, qa)});
        this.e = true;
    }

    public final synchronized void b() {
        if (this.d) {
            return;
        }
        C4735n6 c4735n6 = this.b;
        ArrayList arrayList = C4805q4.h().i.a;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c4735n6.a.addAll(arrayList2);
        this.d = true;
    }

    public final synchronized void c() {
        try {
            if (this.c != null) {
                return;
            }
            P1 p1 = new P1(this.b);
            this.c = new C4942vm(p1);
            C4918um c4918um = new C4918um();
            c4918um.a.add(p1);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c4918um.a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c4918um);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.b.a.clear();
        this.d = false;
        this.e = false;
    }
}
