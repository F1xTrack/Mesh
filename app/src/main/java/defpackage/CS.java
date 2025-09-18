package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class CS extends WU0 {
    public final HashMap e = new HashMap();

    @Override // defpackage.WU0
    public final TU0 b(Object obj) {
        return (TU0) this.e.get(obj);
    }

    @Override // defpackage.WU0
    public final Object d(Object obj, Object obj2) {
        TU0 tu0B = b(obj);
        if (tu0B != null) {
            return tu0B.b;
        }
        HashMap map = this.e;
        TU0 tu0 = new TU0(obj, obj2);
        this.d++;
        TU0 tu02 = this.b;
        if (tu02 == null) {
            this.a = tu0;
            this.b = tu0;
        } else {
            tu02.c = tu0;
            tu0.d = tu02;
            this.b = tu0;
        }
        map.put(obj, tu0);
        return null;
    }

    @Override // defpackage.WU0
    public final Object h(Object obj) {
        Object objH = super.h(obj);
        this.e.remove(obj);
        return objH;
    }
}
