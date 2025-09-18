package p000;

/* renamed from: Hs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7714Hs0 {

    /* renamed from: a */
    public final EnumC0844NP f4561a;

    /* renamed from: b */
    public final Object f4562b;

    /* renamed from: c */
    public final Object f4563c;

    public C7714Hs0(EnumC0844NP enumC0844NP, Object obj, Object obj2) {
        this.f4561a = enumC0844NP;
        this.f4562b = obj;
        this.f4563c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7714Hs0)) {
            return false;
        }
        C7714Hs0 c7714Hs0 = (C7714Hs0) obj;
        return this.f4561a == c7714Hs0.f4561a && O90.m5963a(this.f4562b, c7714Hs0.f4562b) && O90.m5963a(this.f4563c, c7714Hs0.f4563c);
    }

    public final int hashCode() {
        int iHashCode = this.f4561a.hashCode() * 31;
        Object obj = this.f4562b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f4563c;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "PostponedEvent(eventName=" + this.f4561a + ", sender=" + this.f4562b + ", payload=" + this.f4563c + ")";
    }
}
