package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: zs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11979zs0 {

    /* renamed from: a */
    public String f47055a;

    /* renamed from: c */
    public Object f47057c;

    /* renamed from: j */
    public Object f47064j;

    /* renamed from: b */
    public Serializable f47056b = C1225TT.f11362B;

    /* renamed from: d */
    public Serializable f47058d = new LinkedHashMap();

    /* renamed from: e */
    public Serializable f47059e = new LinkedHashMap();

    /* renamed from: f */
    public Serializable f47060f = new LinkedHashMap();

    /* renamed from: g */
    public Serializable f47061g = new LinkedHashMap();

    /* renamed from: h */
    public Serializable f47062h = new LinkedHashMap();

    /* renamed from: i */
    public Serializable f47063i = new LinkedHashMap();

    /* renamed from: k */
    public Serializable f47065k = new ArrayList();

    public C11979zs0(AbstractC11598ws0 abstractC11598ws0) {
        this.f47064j = abstractC11598ws0;
    }

    /* renamed from: a */
    public void m26560a() {
        this.f47055a = "ExponentFileSystem";
    }

    /* renamed from: b */
    public C7350As0 m26561b() {
        String simpleName = this.f47055a;
        if (simpleName == null) {
            AbstractC11598ws0 abstractC11598ws0 = (AbstractC11598ws0) this.f47064j;
            simpleName = abstractC11598ws0 != null ? abstractC11598ws0.getClass().getSimpleName() : null;
        }
        if (simpleName == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AbstractC8418Vg0 abstractC8418Vg0 = (AbstractC8418Vg0) this.f47056b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f47058d;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f47059e;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC11205tn0.m24983b(linkedHashMap2.size()));
        Iterator it = linkedHashMap2.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMapM24782j = AbstractC11077sn0.m24782j(linkedHashMap, linkedHashMap3);
        LinkedHashMap linkedHashMap4 = (LinkedHashMap) this.f47060f;
        LinkedHashMap linkedHashMap5 = (LinkedHashMap) this.f47061g;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(AbstractC11205tn0.m24983b(linkedHashMap5.size()));
        for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
            Object key = entry2.getKey();
            C9330f71 c9330f71 = ((C6534o9) entry2.getValue()).f38832a;
            if (c9330f71 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            linkedHashMap6.put(key, c9330f71);
        }
        LinkedHashMap linkedHashMapM24782j2 = AbstractC11077sn0.m24782j(linkedHashMap4, linkedHashMap6);
        C7621Fx1 c7621Fx1 = (C7621Fx1) this.f47057c;
        LinkedHashMap linkedHashMap7 = (LinkedHashMap) this.f47062h;
        LinkedHashMap linkedHashMap8 = new LinkedHashMap(AbstractC11205tn0.m24983b(linkedHashMap7.size()));
        Iterator it2 = linkedHashMap7.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it2.next();
            entry3.getKey();
            entry3.getValue().getClass();
            throw new ClassCastException();
        }
        C6479nH c6479nH = new C6479nH();
        c6479nH.f38227a = abstractC8418Vg0;
        c6479nH.f38228b = linkedHashMapM24782j;
        c6479nH.f38229c = linkedHashMapM24782j2;
        c6479nH.f38230d = c7621Fx1;
        c6479nH.f38231e = linkedHashMap8;
        return new C7350As0(simpleName, c6479nH, (LinkedHashMap) this.f47063i, (ArrayList) this.f47065k);
    }

    /* renamed from: c */
    public LinkedHashMap m26562c() {
        return (LinkedHashMap) this.f47060f;
    }
}
