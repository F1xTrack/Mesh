package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C3044r6;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.l6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2895l6 implements InterfaceC2970o6<C3020q6> {
    private final C2744f4 a;
    private final C3119u6 b;
    private final C3224y6 c;
    private final C3094t6 d;
    private final W0 e;
    private final Nm f;

    public AbstractC2895l6(C2744f4 c2744f4, C3119u6 c3119u6, C3224y6 c3224y6, C3094t6 c3094t6, W0 w0, Nm nm) {
        this.a = c2744f4;
        this.b = c3119u6;
        this.c = c3224y6;
        this.d = c3094t6;
        this.e = w0;
        this.f = nm;
    }

    public C2995p6 a(Object obj) {
        C3020q6 c3020q6 = (C3020q6) obj;
        if (this.c.h()) {
            this.e.reportEvent("create session with non-empty storage");
        }
        C2744f4 c2744f4 = this.a;
        C3224y6 c3224y6 = this.c;
        long jA = this.b.a();
        C3224y6 c3224y6D = this.c.d(jA);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c3224y6D.e(timeUnit.toSeconds(c3020q6.a)).a(c3020q6.a).c(0L).a(true).b();
        this.a.i().a(jA, this.d.b(), timeUnit.toSeconds(c3020q6.b));
        return new C2995p6(c2744f4, c3224y6, a(), new Nm());
    }

    public final C2995p6 b() {
        if (this.c.h()) {
            return new C2995p6(this.a, this.c, a(), this.f);
        }
        return null;
    }

    public C3044r6 a() {
        C3044r6.b bVarD = new C3044r6.b(this.d).a(this.c.i()).b(this.c.e()).a(this.c.c()).c(this.c.f()).d(this.c.g());
        bVarD.a = this.c.d();
        return new C3044r6(bVarD);
    }
}
