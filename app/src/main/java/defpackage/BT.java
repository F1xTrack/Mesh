package defpackage;

/* loaded from: classes.dex */
public final class BT {
    public final C0653Id a;
    public final C0653Id b;

    public BT(C0653Id c0653Id) {
        this.a = c0653Id;
        this.b = c0653Id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BT)) {
            return false;
        }
        return this.b.equals(((BT) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
