package p000;

import java.io.IOException;

/* renamed from: ax0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8788ax0 extends AbstractC11058sd1 {

    /* renamed from: b */
    public static final C0261E8 f16691b = new C0261E8(2);

    /* renamed from: a */
    public final C9189e20 f16692a;

    public C8788ax0(C9189e20 c9189e20) {
        this.f16692a = c9189e20;
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        if (obj == null) {
            c7890Lc0.m5034J();
            return;
        }
        Class<?> cls = obj.getClass();
        C9189e20 c9189e20 = this.f16692a;
        c9189e20.getClass();
        AbstractC11058sd1 abstractC11058sd1M17821b = c9189e20.m17821b(new C11825ye1(cls));
        if (!(abstractC11058sd1M17821b instanceof C8788ax0)) {
            abstractC11058sd1M17821b.mo246a(c7890Lc0, obj);
        } else {
            c7890Lc0.m5045o();
            c7890Lc0.m5048x();
        }
    }
}
