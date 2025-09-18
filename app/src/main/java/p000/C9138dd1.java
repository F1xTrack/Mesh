package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9138dd1 implements InterfaceC6793ry, InterfaceC4194hg {

    /* renamed from: a */
    public final boolean f26170a;

    /* renamed from: b */
    public final ArrayList f26171b = new ArrayList();

    /* renamed from: c */
    public final int f26172c;

    /* renamed from: d */
    public final C6494nW f26173d;

    /* renamed from: e */
    public final C6494nW f26174e;

    /* renamed from: f */
    public final C6494nW f26175f;

    public C9138dd1(AbstractC6504ng abstractC6504ng, C9568h01 c9568h01) {
        c9568h01.getClass();
        this.f26170a = c9568h01.f28152e;
        this.f26172c = c9568h01.f28148a;
        C6494nW c6494nWMo4553M0 = c9568h01.f28149b.mo4553M0();
        this.f26173d = c6494nWMo4553M0;
        C6494nW c6494nWMo4553M02 = c9568h01.f28150c.mo4553M0();
        this.f26174e = c6494nWMo4553M02;
        C6494nW c6494nWMo4553M03 = c9568h01.f28151d.mo4553M0();
        this.f26175f = c6494nWMo4553M03;
        abstractC6504ng.m23162e(c6494nWMo4553M0);
        abstractC6504ng.m23162e(c6494nWMo4553M02);
        abstractC6504ng.m23162e(c6494nWMo4553M03);
        c6494nWMo4553M0.m22527a(this);
        c6494nWMo4553M02.m22527a(this);
        c6494nWMo4553M03.m22527a(this);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f26171b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4194hg) arrayList.get(i)).mo1741a();
            i++;
        }
    }

    /* renamed from: c */
    public final void m17719c(InterfaceC4194hg interfaceC4194hg) {
        this.f26171b.add(interfaceC4194hg);
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
    }
}
