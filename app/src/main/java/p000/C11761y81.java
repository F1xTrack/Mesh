package p000;

/* renamed from: y81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11761y81 {

    /* renamed from: a */
    public final C9565gz0 f46101a;

    /* renamed from: b */
    public final int f46102b;

    public C11761y81(C9565gz0 c9565gz0, int i) {
        this.f46101a = c9565gz0;
        this.f46102b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11761y81)) {
            return false;
        }
        C11761y81 c11761y81 = (C11761y81) obj;
        return O90.m5963a(this.f46101a, c11761y81.f46101a) && this.f46102b == c11761y81.f46102b;
    }

    public final int hashCode() {
        return (this.f46101a.hashCode() * 31) + this.f46102b;
    }

    public final String toString() {
        return "TakeSnapshotOptions(file=" + this.f46101a + ", quality=" + this.f46102b + ")";
    }
}
