package defpackage;

/* renamed from: fe0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3811fe0 extends AbstractC4002ge0 {
    public final C0230Cs a;

    public C3811fe0(C0230Cs c0230Cs) {
        this.a = c0230Cs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3811fe0) && O90.a(this.a, ((C3811fe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.a + ')';
    }
}
