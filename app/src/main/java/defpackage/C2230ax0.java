package defpackage;

import java.io.IOException;

/* renamed from: ax0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2230ax0 extends AbstractC7067sd1 {
    public static final E8 b = new E8(2);
    public final C3504e20 a;

    public C2230ax0(C3504e20 c3504e20) {
        this.a = c3504e20;
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        if (obj == null) {
            c0885Lc0.J();
            return;
        }
        Class<?> cls = obj.getClass();
        C3504e20 c3504e20 = this.a;
        c3504e20.getClass();
        AbstractC7067sd1 abstractC7067sd1B = c3504e20.b(new C8213ye1(cls));
        if (!(abstractC7067sd1B instanceof C2230ax0)) {
            abstractC7067sd1B.a(c0885Lc0, obj);
        } else {
            c0885Lc0.o();
            c0885Lc0.x();
        }
    }
}
