package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class BC implements MC, JC {
    public final List a;
    public final ND b;
    public final LC c;
    public int d = -1;
    public InterfaceC0660If0 e;
    public List f;
    public int g;
    public volatile C7111ss0 h;
    public File i;

    public BC(List list, ND nd, LC lc) {
        this.a = list;
        this.b = nd;
        this.c = lc;
    }

    @Override // defpackage.MC
    public final boolean b() {
        while (true) {
            List list = this.f;
            boolean z = false;
            if (list != null && this.g < list.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    InterfaceC7302ts0 interfaceC7302ts0 = (InterfaceC7302ts0) list2.get(i);
                    File file = this.i;
                    ND nd = this.b;
                    this.h = interfaceC7302ts0.b(file, nd.e, nd.f, nd.i);
                    if (this.h != null && this.b.c(this.h.c.a()) != null) {
                        this.h.c.c(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            InterfaceC0660If0 interfaceC0660If0 = (InterfaceC0660If0) this.a.get(this.d);
            ND nd2 = this.b;
            File fileF = nd2.h.b().f(new CC(interfaceC0660If0, nd2.n));
            this.i = fileF;
            if (fileF != null) {
                this.e = interfaceC0660If0;
                this.f = this.b.c.a().g(fileF);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.MC
    public final void cancel() {
        C7111ss0 c7111ss0 = this.h;
        if (c7111ss0 != null) {
            c7111ss0.c.cancel();
        }
    }

    @Override // defpackage.JC
    public final void e(Exception exc) {
        this.c.a(this.e, exc, this.h.c, XC.c);
    }

    @Override // defpackage.JC
    public final void j(Object obj) {
        this.c.c(this.e, obj, this.h.c, XC.c, this.e);
    }
}
