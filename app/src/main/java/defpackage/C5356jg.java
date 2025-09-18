package defpackage;

import java.util.List;

/* renamed from: jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5356jg implements InterfaceC4388ig {
    public final List a;
    public C6312og0 c = null;
    public float d = -1.0f;
    public C6312og0 b = a(0.0f);

    public C5356jg(List list) {
        this.a = list;
    }

    public final C6312og0 a(float f) {
        List list = this.a;
        C6312og0 c6312og0 = (C6312og0) list.get(list.size() - 1);
        if (f >= c6312og0.b()) {
            return c6312og0;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C6312og0 c6312og02 = (C6312og0) list.get(size);
            if (this.b != c6312og02 && f >= c6312og02.b() && f < c6312og02.a()) {
                return c6312og02;
            }
        }
        return (C6312og0) list.get(0);
    }

    @Override // defpackage.InterfaceC4388ig
    public final boolean b(float f) {
        C6312og0 c6312og0 = this.c;
        C6312og0 c6312og02 = this.b;
        if (c6312og0 == c6312og02 && this.d == f) {
            return true;
        }
        this.c = c6312og02;
        this.d = f;
        return false;
    }

    @Override // defpackage.InterfaceC4388ig
    public final C6312og0 e() {
        return this.b;
    }

    @Override // defpackage.InterfaceC4388ig
    public final boolean f(float f) {
        C6312og0 c6312og0 = this.b;
        if (f >= c6312og0.b() && f < c6312og0.a()) {
            return !this.b.c();
        }
        this.b = a(f);
        return true;
    }

    @Override // defpackage.InterfaceC4388ig
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC4388ig
    public final float k() {
        return ((C6312og0) this.a.get(r0.size() - 1)).a();
    }

    @Override // defpackage.InterfaceC4388ig
    public final float l() {
        return ((C6312og0) this.a.get(0)).b();
    }
}
