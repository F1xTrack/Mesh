package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lS0 */
/* loaded from: classes.dex */
public final class C5697lS0 implements MC, JC {
    public final OD a;
    public final ND b;
    public int c;
    public int d = -1;
    public InterfaceC0660If0 e;
    public List f;
    public int g;
    public volatile C7111ss0 h;
    public File i;
    public C5888mS0 j;

    public C5697lS0(ND nd, OD od) {
        this.b = nd;
        this.a = od;
    }

    @Override // defpackage.MC
    public final boolean b() {
        List list;
        ArrayList arrayListA = this.b.a();
        boolean z = false;
        if (arrayListA.isEmpty()) {
            return false;
        }
        ND nd = this.b;
        C3578eQ0 c3578eQ0A = nd.c.a();
        Class<?> cls = nd.d.getClass();
        Class cls2 = nd.g;
        Class cls3 = nd.k;
        N8 n8 = c3578eQ0A.h;
        C4047gt0 c4047gt0 = (C4047gt0) ((AtomicReference) n8.b).getAndSet(null);
        if (c4047gt0 == null) {
            c4047gt0 = new C4047gt0(cls, cls2, cls3);
        } else {
            c4047gt0.a = cls;
            c4047gt0.b = cls2;
            c4047gt0.c = cls3;
        }
        synchronized (((C7925x8) n8.c)) {
            list = (List) ((C7925x8) n8.c).getOrDefault(c4047gt0, null);
        }
        ((AtomicReference) n8.b).set(c4047gt0);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c3578eQ0A.a.U0(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = c3578eQ0A.c.d((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!c3578eQ0A.f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            c3578eQ0A.h.w(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.b.k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.b.d.getClass() + " to " + this.b.k);
        }
        while (true) {
            List list3 = this.f;
            if (list3 != null && this.g < list3.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list4 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    InterfaceC7302ts0 interfaceC7302ts0 = (InterfaceC7302ts0) list4.get(i);
                    File file = this.i;
                    ND nd2 = this.b;
                    this.h = interfaceC7302ts0.b(file, nd2.e, nd2.f, nd2.i);
                    if (this.h != null && this.b.c(this.h.c.a()) != null) {
                        this.h.c.c(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= list2.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= arrayListA.size()) {
                    return false;
                }
                this.d = 0;
            }
            InterfaceC0660If0 interfaceC0660If0 = (InterfaceC0660If0) arrayListA.get(this.c);
            Class cls5 = (Class) list2.get(this.d);
            InterfaceC7446uc1 interfaceC7446uc1E = this.b.e(cls5);
            ND nd3 = this.b;
            this.j = new C5888mS0(nd3.c.a, interfaceC0660If0, nd3.n, nd3.e, nd3.f, interfaceC7446uc1E, cls5, nd3.i);
            File fileF = nd3.h.b().f(this.j);
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
        this.a.a(this.j, exc, this.h.c, XC.d);
    }

    @Override // defpackage.JC
    public final void j(Object obj) {
        this.a.c(this.e, obj, this.h.c, XC.d, this.j);
    }
}
