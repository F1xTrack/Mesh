package defpackage;

/* renamed from: y81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8117y81 {
    public final C4065gz0 a;
    public final int b;

    public C8117y81(C4065gz0 c4065gz0, int i) {
        this.a = c4065gz0;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8117y81)) {
            return false;
        }
        C8117y81 c8117y81 = (C8117y81) obj;
        return O90.a(this.a, c8117y81.a) && this.b == c8117y81.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "TakeSnapshotOptions(file=" + this.a + ", quality=" + this.b + ")";
    }
}
