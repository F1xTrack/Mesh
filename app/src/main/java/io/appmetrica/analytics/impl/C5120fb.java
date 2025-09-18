package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC0246Du;
import p000.AbstractC7293zu;

/* renamed from: io.appmetrica.analytics.impl.fb */
/* loaded from: classes2.dex */
public final class C5120fb {

    /* renamed from: a */
    public final C5136g2 f31678a = new C5136g2();

    /* renamed from: b */
    public final C5315n6 f31679b = new C5315n6();

    /* renamed from: c */
    public C5531vm f31680c;

    /* renamed from: d */
    public boolean f31681d;

    /* renamed from: e */
    public boolean f31682e;

    /* renamed from: a */
    public final synchronized void m20383a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC4755Qa interfaceC4755Qa) {
        if (this.f31682e) {
            return;
        }
        AbstractC0246Du.m1921n(this.f31679b.f32244a, new InterfaceC4417Ca[]{this.f31678a.m20406a(context, appMetricaConfig, interfaceC4755Qa)});
        this.f31682e = true;
    }

    /* renamed from: b */
    public final synchronized void m20384b() {
        if (this.f31681d) {
            return;
        }
        C5315n6 c5315n6 = this.f31679b;
        ArrayList arrayList = C5388q4.m20928h().f32426i.f32022a;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c5315n6.f32244a.addAll(arrayList2);
        this.f31681d = true;
    }

    /* renamed from: c */
    public final synchronized void m20385c() {
        try {
            if (this.f31680c != null) {
                return;
            }
            C4722P1 c4722p1 = new C4722P1(this.f31679b);
            this.f31680c = new C5531vm(c4722p1);
            C5506um c5506um = new C5506um();
            c5506um.f32710a.add(c4722p1);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c5506um.f32710a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c5506um);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m20382a() {
        this.f31679b.f32244a.clear();
        this.f31681d = false;
        this.f31682e = false;
    }
}
