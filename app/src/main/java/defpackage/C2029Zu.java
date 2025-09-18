package defpackage;

import java.util.Map;

/* renamed from: Zu */
/* loaded from: classes.dex */
public final class C2029Zu extends H0 {
    public final Object a;
    public int b;
    public final /* synthetic */ C2223av c;

    public C2029Zu(C2223av c2223av, int i) {
        this.c = c2223av;
        Object obj = C2223av.k;
        this.a = c2223av.k()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        C2223av c2223av = this.c;
        if (i != -1 && i < c2223av.size()) {
            if (AbstractC5465kE1.a(obj, c2223av.k()[this.b])) {
                return;
            }
        }
        Object obj2 = C2223av.k;
        this.b = c2223av.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C2223av c2223av = this.c;
        Map mapC = c2223av.c();
        if (mapC != null) {
            return mapC.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return c2223av.l()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2223av c2223av = this.c;
        Map mapC = c2223av.c();
        Object obj2 = this.a;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            c2223av.put(obj2, obj);
            return null;
        }
        Object obj3 = c2223av.l()[i];
        c2223av.l()[this.b] = obj;
        return obj3;
    }
}
