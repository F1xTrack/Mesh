package defpackage;

/* renamed from: aD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2092aD0 extends AbstractC0093Ay0 {
    public final Object a;

    public C2092aD0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.AbstractC0093Ay0
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.AbstractC0093Ay0
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2092aD0) {
            return this.a.equals(((C2092aD0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
