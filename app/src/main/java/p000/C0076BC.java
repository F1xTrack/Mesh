package p000;

import java.io.File;
import java.util.List;

/* renamed from: BC */
/* loaded from: classes.dex */
public final class C0076BC implements InterfaceC0768MC, InterfaceC0580JC {

    /* renamed from: a */
    public final List f643a;

    /* renamed from: b */
    public final C0832ND f644b;

    /* renamed from: c */
    public final InterfaceC0706LC f645c;

    /* renamed from: d */
    public int f646d = -1;

    /* renamed from: e */
    public InterfaceC7740If0 f647e;

    /* renamed from: f */
    public List f648f;

    /* renamed from: g */
    public int f649g;

    /* renamed from: h */
    public volatile C11087ss0 f650h;

    /* renamed from: i */
    public File f651i;

    public C0076BC(List list, C0832ND c0832nd, InterfaceC0706LC interfaceC0706LC) {
        this.f643a = list;
        this.f644b = c0832nd;
        this.f645c = interfaceC0706LC;
    }

    @Override // p000.InterfaceC0768MC
    /* renamed from: b */
    public final boolean mo555b() {
        while (true) {
            List list = this.f648f;
            boolean z = false;
            if (list != null && this.f649g < list.size()) {
                this.f650h = null;
                while (!z && this.f649g < this.f648f.size()) {
                    List list2 = this.f648f;
                    int i = this.f649g;
                    this.f649g = i + 1;
                    InterfaceC11215ts0 interfaceC11215ts0 = (InterfaceC11215ts0) list2.get(i);
                    File file = this.f651i;
                    C0832ND c0832nd = this.f644b;
                    this.f650h = interfaceC11215ts0.mo8530b(file, c0832nd.f7555e, c0832nd.f7556f, c0832nd.f7559i);
                    if (this.f650h != null && this.f644b.m5585c(this.f650h.f42649c.mo3254a()) != null) {
                        this.f650h.f42649c.mo3256c(this.f644b.f7565o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f646d + 1;
            this.f646d = i2;
            if (i2 >= this.f643a.size()) {
                return false;
            }
            InterfaceC7740If0 interfaceC7740If0 = (InterfaceC7740If0) this.f643a.get(this.f646d);
            C0832ND c0832nd2 = this.f644b;
            File fileMo5746f = c0832nd2.f7558h.m1677b().mo5746f(new C0139CC(interfaceC7740If0, c0832nd2.f7564n));
            this.f651i = fileMo5746f;
            if (fileMo5746f != null) {
                this.f647e = interfaceC7740If0;
                this.f648f = this.f644b.f7553c.m25734a().m17933g(fileMo5746f);
                this.f649g = 0;
            }
        }
    }

    @Override // p000.InterfaceC0768MC
    public final void cancel() {
        C11087ss0 c11087ss0 = this.f650h;
        if (c11087ss0 != null) {
            c11087ss0.f42649c.cancel();
        }
    }

    @Override // p000.InterfaceC0580JC
    /* renamed from: e */
    public final void mo556e(Exception exc) {
        this.f645c.mo4921a(this.f647e, exc, this.f650h.f42649c, EnumC1460XC.f13616c);
    }

    @Override // p000.InterfaceC0580JC
    /* renamed from: j */
    public final void mo557j(Object obj) {
        this.f645c.mo4922c(this.f647e, obj, this.f650h.f42649c, EnumC1460XC.f13616c, this.f647e);
    }
}
