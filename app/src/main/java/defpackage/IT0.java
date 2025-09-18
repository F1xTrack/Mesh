package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class IT0 implements InterfaceC4198hg, InterfaceC6937ry {
    public final C5948mm0 a;
    public final AbstractC5738lg b;
    public OZ0 c;

    public IT0(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, HT0 ht0) {
        this.a = c5948mm0;
        ht0.getClass();
        C6090nW c6090nWM0 = ht0.a.M0();
        this.b = c6090nWM0;
        abstractC6120ng.e(c6090nWM0);
        c6090nWM0.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
    }
}
