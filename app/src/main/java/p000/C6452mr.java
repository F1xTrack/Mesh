package p000;

/* renamed from: mr */
/* loaded from: classes2.dex */
public final class C6452mr extends C6515nr {

    /* renamed from: a */
    public final Throwable f37965a;

    public C6452mr(Throwable th) {
        this.f37965a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6452mr) {
            if (O90.m5963a(this.f37965a, ((C6452mr) obj).f37965a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f37965a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p000.C6515nr
    public final String toString() {
        return "Closed(" + this.f37965a + ')';
    }
}
