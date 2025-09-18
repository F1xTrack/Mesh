package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import defpackage.C1236Pp1;
import io.appmetrica.analytics.IReporter;

/* loaded from: classes2.dex */
public final class I5 {
    public final C4776p a;
    public final IReporter b;
    public Context c;
    public final InterfaceC4728n d;

    public I5(C4776p c4776p) {
        this(c4776p, 0);
    }

    public static final void a(I5 i5, Activity activity, EnumC4704m enumC4704m) {
        int iOrdinal = enumC4704m.ordinal();
        if (iOrdinal == 1) {
            i5.b.resumeSession();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i5.b.pauseSession();
        }
    }

    public I5(C4776p c4776p, IReporter iReporter) {
        this.a = c4776p;
        this.b = iReporter;
        this.d = new C1236Pp1(2, this);
    }

    public final synchronized void a(Context context) {
        if (this.c == null) {
            Context applicationContext = context.getApplicationContext();
            this.a.a(applicationContext);
            this.a.a(this.d, EnumC4704m.RESUMED, EnumC4704m.PAUSED);
            this.c = applicationContext;
        }
    }

    public /* synthetic */ I5(C4776p c4776p, int i) {
        this(c4776p, AbstractC4658k1.a());
    }
}
