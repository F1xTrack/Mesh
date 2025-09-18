package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Y0 */
/* loaded from: classes2.dex */
public final class RunnableC4936Y0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f31080a;

    /* renamed from: b */
    public final /* synthetic */ StartupParamsCallback f31081b;

    /* renamed from: c */
    public final /* synthetic */ List f31082c;

    /* renamed from: d */
    public final /* synthetic */ C5185i1 f31083d;

    public RunnableC4936Y0(C5185i1 c5185i1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f31083d = c5185i1;
        this.f31080a = context;
        this.f31081b = startupParamsCallback;
        this.f31082c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5334o0 c5334o0 = this.f31083d.f31880a;
        Context applicationContext = this.f31080a.getApplicationContext();
        c5334o0.getClass();
        C5309n0 c5309n0M20763a = C5309n0.m20763a(applicationContext, false);
        c5309n0M20763a.m20789k().mo20994a(this.f31081b, this.f31082c);
    }
}
