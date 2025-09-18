package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3428dd1 implements InterfaceC6937ry, InterfaceC4198hg {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final C6090nW d;
    public final C6090nW e;
    public final C6090nW f;

    public C3428dd1(AbstractC6120ng abstractC6120ng, C4070h01 c4070h01) {
        c4070h01.getClass();
        this.a = c4070h01.e;
        this.c = c4070h01.a;
        C6090nW c6090nWM0 = c4070h01.b.M0();
        this.d = c6090nWM0;
        C6090nW c6090nWM02 = c4070h01.c.M0();
        this.e = c6090nWM02;
        C6090nW c6090nWM03 = c4070h01.d.M0();
        this.f = c6090nWM03;
        abstractC6120ng.e(c6090nWM0);
        abstractC6120ng.e(c6090nWM02);
        abstractC6120ng.e(c6090nWM03);
        c6090nWM0.a(this);
        c6090nWM02.a(this);
        c6090nWM03.a(this);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4198hg) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(InterfaceC4198hg interfaceC4198hg) {
        this.b.add(interfaceC4198hg);
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
    }
}
