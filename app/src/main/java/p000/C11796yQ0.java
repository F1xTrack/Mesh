package p000;

/* renamed from: yQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11796yQ0 extends CQ0 {

    /* renamed from: a */
    public final String f46254a;

    /* renamed from: b */
    public final Throwable f46255b;

    public C11796yQ0() {
        super("RemoteConfigClient instance already exist", null);
        this.f46254a = "RemoteConfigClient instance already exist";
        this.f46255b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11796yQ0)) {
            return false;
        }
        C11796yQ0 c11796yQ0 = (C11796yQ0) obj;
        return O90.m5963a(this.f46254a, c11796yQ0.f46254a) && O90.m5963a(this.f46255b, c11796yQ0.f46255b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f46255b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f46254a;
    }

    public final int hashCode() {
        int iHashCode = this.f46254a.hashCode() * 31;
        Throwable th = this.f46255b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RemoteConfigClientAlreadyExist(message=" + this.f46254a + ", cause=" + this.f46255b + ')';
    }
}
