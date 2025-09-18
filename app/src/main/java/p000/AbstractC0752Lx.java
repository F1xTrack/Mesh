package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* renamed from: Lx */
/* loaded from: classes.dex */
public abstract class AbstractC0752Lx {

    /* renamed from: a */
    public final AbstractC1633Zx f6937a;

    /* renamed from: b */
    public final ArrayList f6938b;

    /* renamed from: c */
    public final ArrayList f6939c;

    /* renamed from: d */
    public Object f6940d;

    /* renamed from: e */
    public C10189lr0 f6941e;

    public AbstractC0752Lx(AbstractC1633Zx abstractC1633Zx) {
        O90.m5968f(abstractC1633Zx, "tracker");
        this.f6937a = abstractC1633Zx;
        this.f6938b = new ArrayList();
        this.f6939c = new ArrayList();
    }

    /* renamed from: a */
    public abstract boolean mo5157a(C8383Uo1 c8383Uo1);

    /* renamed from: b */
    public abstract boolean mo5158b(Object obj);

    /* renamed from: c */
    public final void m5159c(Iterable iterable) {
        O90.m5968f(iterable, "workSpecs");
        this.f6938b.clear();
        this.f6939c.clear();
        ArrayList arrayList = this.f6938b;
        for (Object obj : iterable) {
            if (mo5157a((C8383Uo1) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f6938b;
        ArrayList arrayList3 = this.f6939c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C8383Uo1) it.next()).f12134a);
        }
        if (this.f6938b.isEmpty()) {
            this.f6937a.m9648h(this);
        } else {
            AbstractC1633Zx abstractC1633Zx = this.f6937a;
            abstractC1633Zx.getClass();
            synchronized (abstractC1633Zx.f15237c) {
                try {
                    if (((LinkedHashSet) abstractC1633Zx.f15239e).add(this)) {
                        if (((LinkedHashSet) abstractC1633Zx.f15239e).size() == 1) {
                            abstractC1633Zx.f15238d = abstractC1633Zx.mo9099c();
                            C1210TE c1210teM7634G = C1210TE.m7634G();
                            int i = AbstractC1755ay.f16693a;
                            Objects.toString(abstractC1633Zx.f15238d);
                            c1210teM7634G.getClass();
                            abstractC1633Zx.mo9650j();
                        }
                        Object obj2 = abstractC1633Zx.f15238d;
                        this.f6940d = obj2;
                        m5160d(this.f6941e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m5160d(this.f6941e, this.f6940d);
    }

    /* renamed from: d */
    public final void m5160d(C10189lr0 c10189lr0, Object obj) {
        if (this.f6938b.isEmpty() || c10189lr0 == null) {
            return;
        }
        if (obj == null || mo5158b(obj)) {
            c10189lr0.m22565X(this.f6938b);
            return;
        }
        ArrayList arrayList = this.f6938b;
        O90.m5968f(arrayList, "workSpecs");
        synchronized (c10189lr0.f37325d) {
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (c10189lr0.m22545B(((C8383Uo1) next).f12134a)) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C8383Uo1 c8383Uo1 = (C8383Uo1) it2.next();
                    C1210TE c1210teM7634G = C1210TE.m7634G();
                    int i = AbstractC11718xo1.f45799a;
                    Objects.toString(c8383Uo1);
                    c1210teM7634G.getClass();
                }
                InterfaceC11591wo1 interfaceC11591wo1 = (InterfaceC11591wo1) c10189lr0.f37323b;
                if (interfaceC11591wo1 != null) {
                    interfaceC11591wo1.mo5552f(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
