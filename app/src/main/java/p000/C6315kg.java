package p000;

import java.util.List;

/* renamed from: kg */
/* loaded from: classes.dex */
public final class C6315kg implements InterfaceC4257ig {

    /* renamed from: a */
    public final C10551og0 f36598a;

    /* renamed from: b */
    public float f36599b = -1.0f;

    public C6315kg(List list) {
        this.f36598a = (C10551og0) list.get(0);
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: b */
    public final boolean mo7743b(float f) {
        if (this.f36599b == f) {
            return true;
        }
        this.f36599b = f;
        return false;
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: e */
    public final C10551og0 mo7744e() {
        return this.f36598a;
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: f */
    public final boolean mo7745f(float f) {
        return !this.f36598a.m23519c();
    }

    @Override // p000.InterfaceC4257ig
    public final boolean isEmpty() {
        return false;
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: k */
    public final float mo7747k() {
        return this.f36598a.m23517a();
    }

    @Override // p000.InterfaceC4257ig
    /* renamed from: l */
    public final float mo7748l() {
        return this.f36598a.m23518b();
    }
}
