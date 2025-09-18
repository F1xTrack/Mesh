package p000;

import java.util.Map;

/* renamed from: Zu */
/* loaded from: classes.dex */
public final class C1630Zu extends AbstractC0442H0 {

    /* renamed from: a */
    public final Object f15205a;

    /* renamed from: b */
    public int f15206b;

    /* renamed from: c */
    public final /* synthetic */ C1752av f15207c;

    public C1630Zu(C1752av c1752av, int i) {
        this.f15207c = c1752av;
        Object obj = C1752av.f16662k;
        this.f15205a = c1752av.m10366k()[i];
        this.f15206b = i;
    }

    /* renamed from: a */
    public final void m9625a() {
        int i = this.f15206b;
        Object obj = this.f15205a;
        C1752av c1752av = this.f15207c;
        if (i != -1 && i < c1752av.size()) {
            if (AbstractC9984kE1.m22173a(obj, c1752av.m10366k()[this.f15206b])) {
                return;
            }
        }
        Object obj2 = C1752av.f16662k;
        this.f15206b = c1752av.m10361e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15205a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C1752av c1752av = this.f15207c;
        Map mapM10359c = c1752av.m10359c();
        if (mapM10359c != null) {
            return mapM10359c.get(this.f15205a);
        }
        m9625a();
        int i = this.f15206b;
        if (i == -1) {
            return null;
        }
        return c1752av.m10367l()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1752av c1752av = this.f15207c;
        Map mapM10359c = c1752av.m10359c();
        Object obj2 = this.f15205a;
        if (mapM10359c != null) {
            return mapM10359c.put(obj2, obj);
        }
        m9625a();
        int i = this.f15206b;
        if (i == -1) {
            c1752av.put(obj2, obj);
            return null;
        }
        Object obj3 = c1752av.m10367l()[i];
        c1752av.m10367l()[this.f15206b] = obj;
        return obj3;
    }
}
