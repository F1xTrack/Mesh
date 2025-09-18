package defpackage;

/* renamed from: ys, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8253ys {
    public final C0074As a;
    public final C6919rs b;

    public C8253ys(C0074As c0074As, C6919rs c6919rs) {
        O90.f(c0074As, "classId");
        this.a = c0074As;
        this.b = c6919rs;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8253ys) {
            if (O90.a(this.a, ((C8253ys) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
