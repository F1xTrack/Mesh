package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: eQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3578eQ0 {
    public final CC0 a;
    public final C7783wO b;
    public final C5983my c;
    public final GQ0 d;
    public final UC e;
    public final C7783wO f;
    public final I60 g;
    public final N8 h = new N8(16);
    public final C4401ik0 i = new C4401ik0();
    public final C1857Xo1 j;

    public C3578eQ0() {
        C1857Xo1 c1857Xo1 = new C1857Xo1(new C5649lC0(20), new C7532v32(13), new C7304tt(14), 12);
        this.j = c1857Xo1;
        this.a = new CC0(c1857Xo1);
        this.b = new C7783wO(0);
        this.c = new C5983my();
        this.d = new GQ0();
        this.e = new UC(0);
        this.f = new C7783wO(1);
        this.g = new I60(0);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C5983my c5983my = this.c;
        synchronized (c5983my) {
            try {
                ArrayList arrayList2 = new ArrayList(c5983my.b);
                c5983my.b.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c5983my.b.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        c5983my.b.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, InterfaceC2315bO interfaceC2315bO) {
        C7783wO c7783wO = this.b;
        synchronized (c7783wO) {
            c7783wO.a.add(new C7593vO(cls, interfaceC2315bO));
        }
    }

    public final void b(Class cls, InterfaceC6842rS0 interfaceC6842rS0) {
        GQ0 gq0 = this.d;
        synchronized (gq0) {
            ((ArrayList) gq0.b).add(new C7033sS0(cls, interfaceC6842rS0));
        }
    }

    public final void c(Class cls, Class cls2, InterfaceC7493us0 interfaceC7493us0) {
        CC0 cc0 = this.a;
        synchronized (cc0) {
            ((T71) cc0.b).w(cls, cls2, interfaceC7493us0);
            ((OB) cc0.c).a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, InterfaceC6079nS0 interfaceC6079nS0) {
        C5983my c5983my = this.c;
        synchronized (c5983my) {
            c5983my.c(str).add(new C6270oS0(cls, cls2, interfaceC6079nS0));
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.c.d(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f.b(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                C5983my c5983my = this.c;
                synchronized (c5983my) {
                    arrayList = new ArrayList();
                    Iterator it3 = c5983my.b.iterator();
                    while (it3.hasNext()) {
                        List<C6270oS0> list = (List) c5983my.c.get((String) it3.next());
                        if (list != null) {
                            for (C6270oS0 c6270oS0 : list) {
                                if (c6270oS0.a.isAssignableFrom(cls) && cls4.isAssignableFrom(c6270oS0.b)) {
                                    arrayList.add(c6270oS0.c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new PD(cls, cls4, cls5, arrayList, this.f.a(cls4, cls5), this.j));
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        I60 i60 = this.g;
        synchronized (i60) {
            arrayList = i60.a;
        }
        if (arrayList.isEmpty()) {
            throw new C3388dQ0("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List g(Object obj) {
        List listUnmodifiableList;
        CC0 cc0 = this.a;
        cc0.getClass();
        Class<?> cls = obj.getClass();
        synchronized (cc0) {
            C7684vs0 c7684vs0 = (C7684vs0) ((OB) cc0.c).a.get(cls);
            listUnmodifiableList = c7684vs0 == null ? null : c7684vs0.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((T71) cc0.b).A(cls));
                if (((C7684vs0) ((OB) cc0.c).a.put(cls, new C7684vs0(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C3388dQ0("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC7302ts0 interfaceC7302ts0 = (InterfaceC7302ts0) listUnmodifiableList.get(i);
            if (interfaceC7302ts0.a(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                    z = false;
                }
                listEmptyList.add(interfaceC7302ts0);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new C3388dQ0("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final TC h(Object obj) {
        TC tcB;
        UC uc = this.e;
        synchronized (uc) {
            try {
                IL1.c(obj);
                SC sc = (SC) uc.a.get(obj.getClass());
                if (sc == null) {
                    Iterator it = uc.a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SC sc2 = (SC) it.next();
                        if (sc2.a().isAssignableFrom(obj.getClass())) {
                            sc = sc2;
                            break;
                        }
                    }
                }
                if (sc == null) {
                    sc = UC.b;
                }
                tcB = sc.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return tcB;
    }

    public final void i(C0084Av0 c0084Av0) {
        GQ0 gq0 = this.d;
        synchronized (gq0) {
            ((ArrayList) gq0.b).add(0, new C7033sS0(C1773Wm1.class, c0084Av0));
        }
    }

    public final void j(String str, Class cls, Class cls2, InterfaceC6079nS0 interfaceC6079nS0) {
        C5983my c5983my = this.c;
        synchronized (c5983my) {
            c5983my.c(str).add(0, new C6270oS0(cls, cls2, interfaceC6079nS0));
        }
    }

    public final void k(SC sc) {
        UC uc = this.e;
        synchronized (uc) {
            uc.a.put(sc.a(), sc);
        }
    }

    public final void l(H60 h60) {
        I60 i60 = this.g;
        synchronized (i60) {
            i60.a.add(h60);
        }
    }

    public final void m(Class cls, Class cls2, InterfaceC8176yS0 interfaceC8176yS0) {
        C7783wO c7783wO = this.f;
        synchronized (c7783wO) {
            c7783wO.a.add(new C3997gc1(cls, cls2, interfaceC8176yS0));
        }
    }

    public final void n(C7699vx0 c7699vx0) {
        CC0 cc0 = this.a;
        synchronized (cc0) {
            Iterator it = ((T71) cc0.b).R(c7699vx0).iterator();
            while (it.hasNext()) {
                ((InterfaceC7493us0) it.next()).getClass();
            }
            ((OB) cc0.c).a.clear();
        }
    }
}
