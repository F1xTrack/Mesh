package p000;

import java.util.Iterator;

/* renamed from: j51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9838j51 implements InterfaceC11558wY0 {

    /* renamed from: a */
    public final /* synthetic */ C9966k51 f34911a;

    /* renamed from: b */
    public final /* synthetic */ String f34912b;

    /* renamed from: c */
    public final /* synthetic */ String f34913c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9914jh1 f34914d;

    /* renamed from: e */
    public final /* synthetic */ C0419Ge f34915e;

    /* renamed from: f */
    public final /* synthetic */ C0419Ge f34916f;

    public /* synthetic */ C9838j51(C9966k51 c9966k51, String str, String str2, InterfaceC9914jh1 interfaceC9914jh1, C0419Ge c0419Ge, C0419Ge c0419Ge2) {
        this.f34911a = c9966k51;
        this.f34912b = str;
        this.f34913c = str2;
        this.f34914d = interfaceC9914jh1;
        this.f34915e = c0419Ge;
        this.f34916f = c0419Ge2;
    }

    @Override // p000.InterfaceC11558wY0
    /* renamed from: a */
    public final void mo10586a(C11812yY0 c11812yY0) {
        C9966k51 c9966k51 = this.f34911a;
        if (c9966k51.m18274d() == null) {
            return;
        }
        c9966k51.m22154F();
        c9966k51.m18270E(c9966k51.m22155G(this.f34912b, this.f34913c, this.f34914d, this.f34915e, this.f34916f));
        c9966k51.m18284q();
        C7909Ll1 c7909Ll1 = c9966k51.f36293p;
        c7909Ll1.getClass();
        DV1.m1716a();
        Iterator it = c7909Ll1.f6835a.iterator();
        while (it.hasNext()) {
            c7909Ll1.mo1330d((AbstractC9402fh1) it.next());
        }
    }
}
