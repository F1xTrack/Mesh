package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: eQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9239eQ0 {

    /* renamed from: a */
    public final CC0 f26697a;

    /* renamed from: b */
    public final C7072wO f26698b;

    /* renamed from: c */
    public final C6459my f26699c;

    /* renamed from: d */
    public final GQ0 f26700d;

    /* renamed from: e */
    public final C1271UC f26701e;

    /* renamed from: f */
    public final C7072wO f26702f;

    /* renamed from: g */
    public final I60 f26703g;

    /* renamed from: h */
    public final C0827N8 f26704h = new C0827N8(16);

    /* renamed from: i */
    public final C9791ik0 f26705i = new C9791ik0();

    /* renamed from: j */
    public final C8539Xo1 f26706j;

    public C9239eQ0() {
        C8539Xo1 c8539Xo1 = new C8539Xo1(new C10107lC0(20), new C11370v32(13), new C6914tt(14), 12);
        this.f26706j = c8539Xo1;
        this.f26697a = new CC0(c8539Xo1);
        this.f26698b = new C7072wO(0);
        this.f26699c = new C6459my();
        this.f26700d = new GQ0();
        this.f26701e = new C1271UC(0);
        this.f26702f = new C7072wO(1);
        this.f26703g = new I60(0);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C6459my c6459my = this.f26699c;
        synchronized (c6459my) {
            try {
                ArrayList arrayList2 = new ArrayList(c6459my.f38005b);
                c6459my.f38005b.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c6459my.f38005b.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        c6459my.f38005b.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m17927a(Class cls, InterfaceC1782bO interfaceC1782bO) {
        C7072wO c7072wO = this.f26698b;
        synchronized (c7072wO) {
            c7072wO.f44846a.add(new C7009vO(cls, interfaceC1782bO));
        }
    }

    /* renamed from: b */
    public final void m17928b(Class cls, InterfaceC10907rS0 interfaceC10907rS0) {
        GQ0 gq0 = this.f26700d;
        synchronized (gq0) {
            ((ArrayList) gq0.f3735b).add(new C11035sS0(cls, interfaceC10907rS0));
        }
    }

    /* renamed from: c */
    public final void m17929c(Class cls, Class cls2, InterfaceC11343us0 interfaceC11343us0) {
        CC0 cc0 = this.f26697a;
        synchronized (cc0) {
            ((T71) cc0.f1250b).m7572w(cls, cls2, interfaceC11343us0);
            ((C0893OB) cc0.f1251c).f8267a.clear();
        }
    }

    /* renamed from: d */
    public final void m17930d(String str, Class cls, Class cls2, InterfaceC10395nS0 interfaceC10395nS0) {
        C6459my c6459my = this.f26699c;
        synchronized (c6459my) {
            c6459my.m23028c(str).add(new C10523oS0(cls, cls2, interfaceC10395nS0));
        }
    }

    /* renamed from: e */
    public final ArrayList m17931e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f26699c.m23029d(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f26702f.m25612b(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                C6459my c6459my = this.f26699c;
                synchronized (c6459my) {
                    arrayList = new ArrayList();
                    Iterator it3 = c6459my.f38005b.iterator();
                    while (it3.hasNext()) {
                        List<C10523oS0> list = (List) c6459my.f38006c.get((String) it3.next());
                        if (list != null) {
                            for (C10523oS0 c10523oS0 : list) {
                                if (c10523oS0.f39020a.isAssignableFrom(cls) && cls4.isAssignableFrom(c10523oS0.f39021b)) {
                                    arrayList.add(c10523oS0.f39022c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new C0958PD(cls, cls4, cls5, arrayList, this.f26702f.m25611a(cls4, cls5), this.f26706j));
            }
        }
        return arrayList2;
    }

    /* renamed from: f */
    public final ArrayList m17932f() {
        ArrayList arrayList;
        I60 i60 = this.f26703g;
        synchronized (i60) {
            arrayList = i60.f4698a;
        }
        if (arrayList.isEmpty()) {
            throw new C9111dQ0("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List m17933g(Object obj) {
        List listUnmodifiableList;
        CC0 cc0 = this.f26697a;
        cc0.getClass();
        Class<?> cls = obj.getClass();
        synchronized (cc0) {
            C11471vs0 c11471vs0 = (C11471vs0) ((C0893OB) cc0.f1251c).f8267a.get(cls);
            listUnmodifiableList = c11471vs0 == null ? null : c11471vs0.f44574a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((T71) cc0.f1250b).m7555A(cls));
                if (((C11471vs0) ((C0893OB) cc0.f1251c).f8267a.put(cls, new C11471vs0(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C9111dQ0("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC11215ts0 interfaceC11215ts0 = (InterfaceC11215ts0) listUnmodifiableList.get(i);
            if (interfaceC11215ts0.mo8529a(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                    z = false;
                }
                listEmptyList.add(interfaceC11215ts0);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new C9111dQ0("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* renamed from: h */
    public final InterfaceC1208TC m17934h(Object obj) {
        InterfaceC1208TC interfaceC1208TCMo2928b;
        C1271UC c1271uc = this.f26701e;
        synchronized (c1271uc) {
            try {
                IL1.m3829c(obj);
                InterfaceC1145SC interfaceC1145SC = (InterfaceC1145SC) c1271uc.f11684a.get(obj.getClass());
                if (interfaceC1145SC == null) {
                    Iterator it = c1271uc.f11684a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC1145SC interfaceC1145SC2 = (InterfaceC1145SC) it.next();
                        if (interfaceC1145SC2.mo2927a().isAssignableFrom(obj.getClass())) {
                            interfaceC1145SC = interfaceC1145SC2;
                            break;
                        }
                    }
                }
                if (interfaceC1145SC == null) {
                    interfaceC1145SC = C1271UC.f11683b;
                }
                interfaceC1208TCMo2928b = interfaceC1145SC.mo2928b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1208TCMo2928b;
    }

    /* renamed from: i */
    public final void m17935i(C7356Av0 c7356Av0) {
        GQ0 gq0 = this.f26700d;
        synchronized (gq0) {
            ((ArrayList) gq0.f3735b).add(0, new C11035sS0(C8483Wm1.class, c7356Av0));
        }
    }

    /* renamed from: j */
    public final void m17936j(String str, Class cls, Class cls2, InterfaceC10395nS0 interfaceC10395nS0) {
        C6459my c6459my = this.f26699c;
        synchronized (c6459my) {
            c6459my.m23028c(str).add(0, new C10523oS0(cls, cls2, interfaceC10395nS0));
        }
    }

    /* renamed from: k */
    public final void m17937k(InterfaceC1145SC interfaceC1145SC) {
        C1271UC c1271uc = this.f26701e;
        synchronized (c1271uc) {
            c1271uc.f11684a.put(interfaceC1145SC.mo2927a(), interfaceC1145SC);
        }
    }

    /* renamed from: l */
    public final void m17938l(H60 h60) {
        I60 i60 = this.f26703g;
        synchronized (i60) {
            i60.f4698a.add(h60);
        }
    }

    /* renamed from: m */
    public final void m17939m(Class cls, Class cls2, InterfaceC11800yS0 interfaceC11800yS0) {
        C7072wO c7072wO = this.f26702f;
        synchronized (c7072wO) {
            c7072wO.f44846a.add(new C9520gc1(cls, cls2, interfaceC11800yS0));
        }
    }

    /* renamed from: n */
    public final void m17940n(C11481vx0 c11481vx0) {
        CC0 cc0 = this.f26697a;
        synchronized (cc0) {
            Iterator it = ((T71) cc0.f1250b).m7566R(c11481vx0).iterator();
            while (it.hasNext()) {
                ((InterfaceC11343us0) it.next()).getClass();
            }
            ((C0893OB) cc0.f1251c).f8267a.clear();
        }
    }
}
