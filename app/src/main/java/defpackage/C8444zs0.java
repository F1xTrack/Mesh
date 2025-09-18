package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: zs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8444zs0 {
    public String a;
    public Object c;
    public Object j;
    public Serializable b = TT.B;
    public Serializable d = new LinkedHashMap();
    public Serializable e = new LinkedHashMap();
    public Serializable f = new LinkedHashMap();
    public Serializable g = new LinkedHashMap();
    public Serializable h = new LinkedHashMap();
    public Serializable i = new LinkedHashMap();
    public Serializable k = new ArrayList();

    public C8444zs0(AbstractC7874ws0 abstractC7874ws0) {
        this.j = abstractC7874ws0;
    }

    public void a() {
        this.a = "ExponentFileSystem";
    }

    public C0075As0 b() {
        String simpleName = this.a;
        if (simpleName == null) {
            AbstractC7874ws0 abstractC7874ws0 = (AbstractC7874ws0) this.j;
            simpleName = abstractC7874ws0 != null ? abstractC7874ws0.getClass().getSimpleName() : null;
        }
        if (simpleName == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AbstractC1676Vg0 abstractC1676Vg0 = (AbstractC1676Vg0) this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.e;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC7287tn0.b(linkedHashMap2.size()));
        Iterator it = linkedHashMap2.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMapJ = AbstractC7096sn0.j(linkedHashMap, linkedHashMap3);
        LinkedHashMap linkedHashMap4 = (LinkedHashMap) this.f;
        LinkedHashMap linkedHashMap5 = (LinkedHashMap) this.g;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(AbstractC7287tn0.b(linkedHashMap5.size()));
        for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
            Object key = entry2.getKey();
            C3713f71 c3713f71 = ((C6212o9) entry2.getValue()).a;
            if (c3713f71 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            linkedHashMap6.put(key, c3713f71);
        }
        LinkedHashMap linkedHashMapJ2 = AbstractC7096sn0.j(linkedHashMap4, linkedHashMap6);
        C0481Fx1 c0481Fx1 = (C0481Fx1) this.c;
        LinkedHashMap linkedHashMap7 = (LinkedHashMap) this.h;
        LinkedHashMap linkedHashMap8 = new LinkedHashMap(AbstractC7287tn0.b(linkedHashMap7.size()));
        Iterator it2 = linkedHashMap7.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it2.next();
            entry3.getKey();
            entry3.getValue().getClass();
            throw new ClassCastException();
        }
        C6045nH c6045nH = new C6045nH();
        c6045nH.a = abstractC1676Vg0;
        c6045nH.b = linkedHashMapJ;
        c6045nH.c = linkedHashMapJ2;
        c6045nH.d = c0481Fx1;
        c6045nH.e = linkedHashMap8;
        return new C0075As0(simpleName, c6045nH, (LinkedHashMap) this.i, (ArrayList) this.k);
    }

    public LinkedHashMap c() {
        return (LinkedHashMap) this.f;
    }
}
