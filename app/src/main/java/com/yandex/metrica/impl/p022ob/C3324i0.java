package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.impl.p022ob.C3739y;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.i0 */
/* loaded from: classes2.dex */
public final class C3324i0 {

    /* renamed from: a */
    private Context f23614a;

    /* renamed from: b */
    private final C3739y.b f23615b;

    /* renamed from: c */
    private final C3739y f23616c;

    /* renamed from: d */
    private final IReporter f23617d;

    /* renamed from: com.yandex.metrica.impl.ob.i0$a */
    public static final class a implements C3739y.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C3739y.b
        /* renamed from: a */
        public final void mo13943a(Activity activity, C3739y.a aVar) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 1) {
                C3324i0.this.f23617d.resumeSession();
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                C3324i0.this.f23617d.pauseSession();
            }
        }
    }

    public C3324i0(C3739y c3739y) {
        this(c3739y, null, 2);
    }

    public C3324i0(C3739y c3739y, IReporter iReporter) {
        this.f23616c = c3739y;
        this.f23617d = iReporter;
        this.f23615b = new a();
    }

    /* renamed from: a */
    public final synchronized void m16074a(Context context) {
        if (this.f23614a == null) {
            Context applicationContext = context.getApplicationContext();
            this.f23616c.m17202a(applicationContext);
            this.f23616c.m17203a(this.f23615b, C3739y.a.RESUMED, C3739y.a.PAUSED);
            this.f23614a = applicationContext;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3324i0(C3739y c3739y, IReporter iReporter, int i) {
        InterfaceC3016W0 interfaceC3016W0M14711a;
        if ((i & 2) != 0) {
            interfaceC3016W0M14711a = C2834Oh.m14711a();
            O90.m5967e(interfaceC3016W0M14711a, "YandexMetricaSelfReportFacade.getReporter()");
        } else {
            interfaceC3016W0M14711a = null;
        }
        this(c3739y, interfaceC3016W0M14711a);
    }
}
