package defpackage;

/* renamed from: mr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5962mr extends C6153nr {
    public final Throwable a;

    public C5962mr(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5962mr) {
            if (O90.a(this.a, ((C5962mr) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.C6153nr
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
