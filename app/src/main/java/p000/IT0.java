package p000;

import java.util.List;

/* loaded from: classes.dex */
public final class IT0 implements InterfaceC4194hg, InterfaceC6793ry {

    /* renamed from: a */
    public final C10307mm0 f4945a;

    /* renamed from: b */
    public final AbstractC6378lg f4946b;

    /* renamed from: c */
    public OZ0 f4947c;

    public IT0(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, HT0 ht0) {
        this.f4945a = c10307mm0;
        ht0.getClass();
        C6494nW c6494nWMo4553M0 = ht0.f4316a.mo4553M0();
        this.f4946b = c6494nWMo4553M0;
        abstractC6504ng.m23162e(c6494nWMo4553M0);
        c6494nWMo4553M0.m22527a(this);
    }

    /* renamed from: c */
    public static int m3880c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f4945a.invalidateSelf();
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
    }
}
