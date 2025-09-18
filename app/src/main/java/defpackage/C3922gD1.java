package defpackage;

import java.util.Map;

/* renamed from: gD1 */
/* loaded from: classes.dex */
public final class C3922gD1 extends ZB1 {
    public final Object a;
    public int b;
    public final /* synthetic */ C2223av c;

    public C3922gD1(C2223av c2223av, int i) {
        this.c = c2223av;
        Object obj = C2223av.k;
        this.a = c2223av.o()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        C2223av c2223av = this.c;
        if (i != -1 && i < c2223av.size()) {
            if (O12.b(obj, c2223av.o()[this.b])) {
                return;
            }
        }
        Object obj2 = C2223av.k;
        this.b = c2223av.u(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C2223av c2223av = this.c;
        Map mapQ = c2223av.q();
        if (mapQ != null) {
            return mapQ.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return c2223av.p()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2223av c2223av = this.c;
        Map mapQ = c2223av.q();
        Object obj2 = this.a;
        if (mapQ != null) {
            return mapQ.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            c2223av.put(obj2, obj);
            return null;
        }
        Object obj3 = c2223av.p()[i];
        c2223av.p()[this.b] = obj;
        return obj3;
    }
}
