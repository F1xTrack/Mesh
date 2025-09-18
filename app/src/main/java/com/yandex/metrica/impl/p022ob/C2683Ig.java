package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.database.Cursor;
import com.yandex.metrica.impl.p022ob.C2858Pg;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Ig */
/* loaded from: classes2.dex */
public class C2683Ig {

    /* renamed from: a */
    private final Context f21433a;

    /* renamed from: b */
    private Cursor f21434b;

    public C2683Ig(Context context) {
        this.f21433a = context;
    }

    /* renamed from: a */
    public void m14348a(InterfaceC3057Xg interfaceC3057Xg) {
        try {
            try {
                FutureTask futureTask = new FutureTask(new CallableC2658Hg(this));
                C2842P0.m14728i().m14748s().m17348a(futureTask).start();
                C2608Fg c2608Fg = (C2608Fg) futureTask.get(5L, TimeUnit.SECONDS);
                C2968U2.m15239a(this.f21434b);
                ((C2858Pg.a) interfaceC3057Xg).mo14789a(c2608Fg);
            } catch (Throwable unused) {
                C2833Og c2833Og = C2833Og.this;
                C2833Og.m14705a(c2833Og, null, C2833Og.m14707c(c2833Og));
            }
        } finally {
            C2968U2.m15239a(this.f21434b);
        }
    }
}
