package p000;

import java.util.Map;

/* renamed from: gD1 */
/* loaded from: classes.dex */
public final class C9470gD1 extends ZB1 {

    /* renamed from: a */
    public final Object f27615a;

    /* renamed from: b */
    public int f27616b;

    /* renamed from: c */
    public final /* synthetic */ C1752av f27617c;

    public C9470gD1(C1752av c1752av, int i) {
        this.f27617c = c1752av;
        Object obj = C1752av.f16662k;
        this.f27615a = c1752av.m10370o()[i];
        this.f27616b = i;
    }

    /* renamed from: a */
    public final void m18407a() {
        int i = this.f27616b;
        Object obj = this.f27615a;
        C1752av c1752av = this.f27617c;
        if (i != -1 && i < c1752av.size()) {
            if (O12.m5941b(obj, c1752av.m10370o()[this.f27616b])) {
                return;
            }
        }
        Object obj2 = C1752av.f16662k;
        this.f27616b = c1752av.m10376u(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f27615a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C1752av c1752av = this.f27617c;
        Map mapM10372q = c1752av.m10372q();
        if (mapM10372q != null) {
            return mapM10372q.get(this.f27615a);
        }
        m18407a();
        int i = this.f27616b;
        if (i == -1) {
            return null;
        }
        return c1752av.m10371p()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1752av c1752av = this.f27617c;
        Map mapM10372q = c1752av.m10372q();
        Object obj2 = this.f27615a;
        if (mapM10372q != null) {
            return mapM10372q.put(obj2, obj);
        }
        m18407a();
        int i = this.f27616b;
        if (i == -1) {
            c1752av.put(obj2, obj);
            return null;
        }
        Object obj3 = c1752av.m10371p()[i];
        c1752av.m10371p()[this.f27616b] = obj;
        return obj3;
    }
}
