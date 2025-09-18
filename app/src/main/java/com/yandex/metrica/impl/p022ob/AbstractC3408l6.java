package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3564r6;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.l6 */
/* loaded from: classes2.dex */
public abstract class AbstractC3408l6 implements InterfaceC3486o6<C3538q6> {

    /* renamed from: a */
    private final C3250f4 f24172a;

    /* renamed from: b */
    private final C3642u6 f24173b;

    /* renamed from: c */
    private final C3746y6 f24174c;

    /* renamed from: d */
    private final C3616t6 f24175d;

    /* renamed from: e */
    private final InterfaceC3016W0 f24176e;

    /* renamed from: f */
    private final C2814Nm f24177f;

    public AbstractC3408l6(C3250f4 c3250f4, C3642u6 c3642u6, C3746y6 c3746y6, C3616t6 c3616t6, InterfaceC3016W0 interfaceC3016W0, C2814Nm c2814Nm) {
        this.f24172a = c3250f4;
        this.f24173b = c3642u6;
        this.f24174c = c3746y6;
        this.f24175d = c3616t6;
        this.f24176e = interfaceC3016W0;
        this.f24177f = c2814Nm;
    }

    /* renamed from: a */
    public C3512p6 m16377a(Object obj) {
        C3538q6 c3538q6 = (C3538q6) obj;
        if (this.f24174c.m17229h()) {
            this.f24176e.reportEvent("create session with non-empty storage");
        }
        C3250f4 c3250f4 = this.f24172a;
        C3746y6 c3746y6 = this.f24174c;
        long jM16901a = this.f24173b.m16901a();
        C3746y6 c3746y6M17223d = this.f24174c.m17223d(jM16901a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c3746y6M17223d.m17225e(timeUnit.toSeconds(c3538q6.f24535a)).m17216a(c3538q6.f24535a).m17221c(0L).m17217a(true).m17220b();
        this.f24172a.m15910i().m16834a(jM16901a, this.f24175d.m16810b(), timeUnit.toSeconds(c3538q6.f24536b));
        return new C3512p6(c3250f4, c3746y6, m16378a(), new C2814Nm());
    }

    /* renamed from: b */
    public final C3512p6 m16379b() {
        if (this.f24174c.m17229h()) {
            return new C3512p6(this.f24172a, this.f24174c, m16378a(), this.f24177f);
        }
        return null;
    }

    /* renamed from: a */
    public C3564r6 m16378a() {
        C3564r6.b bVarM16672d = new C3564r6.b(this.f24175d).m16668a(this.f24174c.m17230i()).m16670b(this.f24174c.m17226e()).m16669a(this.f24174c.m17222c()).m16671c(this.f24174c.m17227f()).m16672d(this.f24174c.m17228g());
        bVarM16672d.f24593a = this.f24174c.m17224d();
        return new C3564r6(bVarM16672d);
    }
}
