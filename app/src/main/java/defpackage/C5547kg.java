package defpackage;

import java.util.List;

/* renamed from: kg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5547kg implements InterfaceC4388ig {
    public final C6312og0 a;
    public float b = -1.0f;

    public C5547kg(List list) {
        this.a = (C6312og0) list.get(0);
    }

    @Override // defpackage.InterfaceC4388ig
    public final boolean b(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.InterfaceC4388ig
    public final C6312og0 e() {
        return this.a;
    }

    @Override // defpackage.InterfaceC4388ig
    public final boolean f(float f) {
        return !this.a.c();
    }

    @Override // defpackage.InterfaceC4388ig
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC4388ig
    public final float k() {
        return this.a.a();
    }

    @Override // defpackage.InterfaceC4388ig
    public final float l() {
        return this.a.b();
    }
}
