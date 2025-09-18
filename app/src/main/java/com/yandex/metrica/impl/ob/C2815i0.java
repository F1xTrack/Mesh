package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.impl.ob.C3217y;
import defpackage.O90;

/* renamed from: com.yandex.metrica.impl.ob.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2815i0 {
    private Context a;
    private final C3217y.b b;
    private final C3217y c;
    private final IReporter d;

    /* renamed from: com.yandex.metrica.impl.ob.i0$a */
    public static final class a implements C3217y.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C3217y.b
        public final void a(Activity activity, C3217y.a aVar) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 1) {
                C2815i0.this.d.resumeSession();
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                C2815i0.this.d.pauseSession();
            }
        }
    }

    public C2815i0(C3217y c3217y) {
        this(c3217y, null, 2);
    }

    public C2815i0(C3217y c3217y, IReporter iReporter) {
        this.c = c3217y;
        this.d = iReporter;
        this.b = new a();
    }

    public final synchronized void a(Context context) {
        if (this.a == null) {
            Context applicationContext = context.getApplicationContext();
            this.c.a(applicationContext);
            this.c.a(this.b, C3217y.a.RESUMED, C3217y.a.PAUSED);
            this.a = applicationContext;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2815i0(C3217y c3217y, IReporter iReporter, int i) {
        W0 w0A;
        if ((i & 2) != 0) {
            w0A = Oh.a();
            O90.e(w0A, "YandexMetricaSelfReportFacade.getReporter()");
        } else {
            w0A = null;
        }
        this(c3217y, w0A);
    }
}
