package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.IReporter;
import p000.C8125Pp1;

/* renamed from: io.appmetrica.analytics.impl.I5 */
/* loaded from: classes2.dex */
public final class C4558I5 {

    /* renamed from: a */
    public final C5358p f30272a;

    /* renamed from: b */
    public final IReporter f30273b;

    /* renamed from: c */
    public Context f30274c;

    /* renamed from: d */
    public final InterfaceC5308n f30275d;

    public C4558I5(C5358p c5358p) {
        this(c5358p, 0);
    }

    /* renamed from: a */
    public static final void m19492a(C4558I5 c4558i5, Activity activity, EnumC5283m enumC5283m) {
        int iOrdinal = enumC5283m.ordinal();
        if (iOrdinal == 1) {
            c4558i5.f30273b.resumeSession();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            c4558i5.f30273b.pauseSession();
        }
    }

    public C4558I5(C5358p c5358p, IReporter iReporter) {
        this.f30272a = c5358p;
        this.f30273b = iReporter;
        this.f30275d = new C8125Pp1(2, this);
    }

    /* renamed from: a */
    public final synchronized void m19493a(Context context) {
        if (this.f30274c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f30272a.m20893a(applicationContext);
            this.f30272a.m20894a(this.f30275d, EnumC5283m.RESUMED, EnumC5283m.PAUSED);
            this.f30274c = applicationContext;
        }
    }

    public /* synthetic */ C4558I5(C5358p c5358p, int i) {
        this(c5358p, AbstractC5235k1.m20601a());
    }
}
