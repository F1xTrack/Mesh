package p000;

/* renamed from: BT */
/* loaded from: classes.dex */
public final class C0093BT {

    /* renamed from: a */
    public final C0544Id f828a;

    /* renamed from: b */
    public final C0544Id f829b;

    public C0093BT(C0544Id c0544Id) {
        this.f828a = c0544Id;
        this.f829b = c0544Id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0093BT)) {
            return false;
        }
        return this.f829b.equals(((C0093BT) obj).f829b);
    }

    public final int hashCode() {
        return this.f829b.hashCode();
    }

    public final String toString() {
        return this.f829b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
