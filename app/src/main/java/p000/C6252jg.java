package p000;

import java.util.List;

/* renamed from: jg */
/* loaded from: classes.dex */
public final class C6252jg implements InterfaceC4257ig {

    /* renamed from: a */
    public final List f35316a;

    /* renamed from: c */
    public C10551og0 f35318c = null;

    /* renamed from: d */
    public float f35319d = -1.0f;

    /* renamed from: b */
    public C10551og0 f35317b = m22086a(0.0f);

    public C6252jg(List list) {
        this.f35316a = list;
    }

    /* renamed from: a */
    public final C10551og0 m22086a(float f) {
        List list = this.f35316a;
        C10551og0 c10551og0 = (C10551og0) list.get(list.size() - 1);
        if (f >= c10551og0.m23518b()) {
            return c10551og0;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C10551og0 c10551og02 = (C10551og0) list.get(size);
            if (this.f35317b != c10551og02 && f >= c10551og02.m23518b() && f < c10551og02.m23517a()) {
                return c10551og02;
            }
        }
        return (C10551og0) list.get(0);
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: b */
    public final boolean mo7743b(float f) {
        C10551og0 c10551og0 = this.f35318c;
        C10551og0 c10551og02 = this.f35317b;
        if (c10551og0 == c10551og02 && this.f35319d == f) {
            return true;
        }
        this.f35318c = c10551og02;
        this.f35319d = f;
        return false;
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: e */
    public final C10551og0 mo7744e() {
        return this.f35317b;
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: f */
    public final boolean mo7745f(float f) {
        C10551og0 c10551og0 = this.f35317b;
        if (f >= c10551og0.m23518b() && f < c10551og0.m23517a()) {
            return !this.f35317b.m23519c();
        }
        this.f35317b = m22086a(f);
        return true;
    }

    @Override // p000.InterfaceC4257ig
    public final boolean isEmpty() {
        return false;
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: k */
    public final float mo7747k() {
        return ((C10551og0) this.f35316a.get(r0.size() - 1)).m23517a();
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: l */
    public final float mo7748l() {
        return ((C10551og0) this.f35316a.get(0)).m23518b();
    }
}
