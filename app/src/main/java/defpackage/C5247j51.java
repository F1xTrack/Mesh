package defpackage;

import java.util.Iterator;

/* renamed from: j51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5247j51 implements InterfaceC7814wY0 {
    public final /* synthetic */ C5438k51 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ InterfaceC5361jh1 d;
    public final /* synthetic */ C0500Ge e;
    public final /* synthetic */ C0500Ge f;

    public /* synthetic */ C5247j51(C5438k51 c5438k51, String str, String str2, InterfaceC5361jh1 interfaceC5361jh1, C0500Ge c0500Ge, C0500Ge c0500Ge2) {
        this.a = c5438k51;
        this.b = str;
        this.c = str2;
        this.d = interfaceC5361jh1;
        this.e = c0500Ge;
        this.f = c0500Ge2;
    }

    @Override // defpackage.InterfaceC7814wY0
    public final void a(C8194yY0 c8194yY0) {
        C5438k51 c5438k51 = this.a;
        if (c5438k51.d() == null) {
            return;
        }
        c5438k51.F();
        c5438k51.E(c5438k51.G(this.b, this.c, this.d, this.e, this.f));
        c5438k51.q();
        C0913Ll1 c0913Ll1 = c5438k51.p;
        c0913Ll1.getClass();
        DV1.a();
        Iterator it = c0913Ll1.a.iterator();
        while (it.hasNext()) {
            c0913Ll1.d((AbstractC3821fh1) it.next());
        }
    }
}
