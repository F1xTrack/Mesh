package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* renamed from: Lx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0946Lx {
    public final AbstractC2038Zx a;
    public final ArrayList b;
    public final ArrayList c;
    public Object d;
    public C5772lr0 e;

    public AbstractC0946Lx(AbstractC2038Zx abstractC2038Zx) {
        O90.f(abstractC2038Zx, "tracker");
        this.a = abstractC2038Zx;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public abstract boolean a(C1623Uo1 c1623Uo1);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        O90.f(iterable, "workSpecs");
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (Object obj : iterable) {
            if (a((C1623Uo1) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C1623Uo1) it.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.h(this);
        } else {
            AbstractC2038Zx abstractC2038Zx = this.a;
            abstractC2038Zx.getClass();
            synchronized (abstractC2038Zx.c) {
                try {
                    if (((LinkedHashSet) abstractC2038Zx.e).add(this)) {
                        if (((LinkedHashSet) abstractC2038Zx.e).size() == 1) {
                            abstractC2038Zx.d = abstractC2038Zx.c();
                            TE teG = TE.G();
                            int i = AbstractC2232ay.a;
                            Objects.toString(abstractC2038Zx.d);
                            teG.getClass();
                            abstractC2038Zx.j();
                        }
                        Object obj2 = abstractC2038Zx.d;
                        this.d = obj2;
                        d(this.e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.e, this.d);
    }

    public final void d(C5772lr0 c5772lr0, Object obj) {
        if (this.b.isEmpty() || c5772lr0 == null) {
            return;
        }
        if (obj == null || b(obj)) {
            c5772lr0.X(this.b);
            return;
        }
        ArrayList arrayList = this.b;
        O90.f(arrayList, "workSpecs");
        synchronized (c5772lr0.d) {
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (c5772lr0.B(((C1623Uo1) next).a)) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C1623Uo1 c1623Uo1 = (C1623Uo1) it2.next();
                    TE teG = TE.G();
                    int i = AbstractC8053xo1.a;
                    Objects.toString(c1623Uo1);
                    teG.getClass();
                }
                InterfaceC7863wo1 interfaceC7863wo1 = (InterfaceC7863wo1) c5772lr0.b;
                if (interfaceC7863wo1 != null) {
                    interfaceC7863wo1.f(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
