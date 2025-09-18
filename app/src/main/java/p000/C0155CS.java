package p000;

import java.util.HashMap;

/* renamed from: CS */
/* loaded from: classes.dex */
public final class C0155CS extends WU0 {

    /* renamed from: e */
    public final HashMap f1375e = new HashMap();

    @Override // p000.WU0
    /* renamed from: b */
    public final TU0 mo1187b(Object obj) {
        return (TU0) this.f1375e.get(obj);
    }

    @Override // p000.WU0
    /* renamed from: d */
    public final Object mo1188d(Object obj, Object obj2) {
        TU0 tu0Mo1187b = mo1187b(obj);
        if (tu0Mo1187b != null) {
            return tu0Mo1187b.f11397b;
        }
        HashMap map = this.f1375e;
        TU0 tu0 = new TU0(obj, obj2);
        this.f13217d++;
        TU0 tu02 = this.f13215b;
        if (tu02 == null) {
            this.f13214a = tu0;
            this.f13215b = tu0;
        } else {
            tu02.f11398c = tu0;
            tu0.f11399d = tu02;
            this.f13215b = tu0;
        }
        map.put(obj, tu0);
        return null;
    }

    @Override // p000.WU0
    /* renamed from: h */
    public final Object mo1189h(Object obj) {
        Object objMo1189h = super.mo1189h(obj);
        this.f1375e.remove(obj);
        return objMo1189h;
    }
}
