package p000;

/* renamed from: be */
/* loaded from: classes.dex */
public final class C1798be extends AbstractC8238Ru0 {

    /* renamed from: a */
    public final EnumC8186Qu0 f17106a;

    /* renamed from: b */
    public final EnumC8134Pu0 f17107b;

    public C1798be(EnumC8186Qu0 enumC8186Qu0, EnumC8134Pu0 enumC8134Pu0) {
        this.f17106a = enumC8186Qu0;
        this.f17107b = enumC8134Pu0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8238Ru0)) {
            return false;
        }
        AbstractC8238Ru0 abstractC8238Ru0 = (AbstractC8238Ru0) obj;
        EnumC8186Qu0 enumC8186Qu0 = this.f17106a;
        if (enumC8186Qu0 != null ? enumC8186Qu0.equals(((C1798be) abstractC8238Ru0).f17106a) : ((C1798be) abstractC8238Ru0).f17106a == null) {
            EnumC8134Pu0 enumC8134Pu0 = this.f17107b;
            if (enumC8134Pu0 == null) {
                if (((C1798be) abstractC8238Ru0).f17107b == null) {
                    return true;
                }
            } else if (enumC8134Pu0.equals(((C1798be) abstractC8238Ru0).f17107b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC8186Qu0 enumC8186Qu0 = this.f17106a;
        int iHashCode = ((enumC8186Qu0 == null ? 0 : enumC8186Qu0.hashCode()) ^ 1000003) * 1000003;
        EnumC8134Pu0 enumC8134Pu0 = this.f17107b;
        return (enumC8134Pu0 != null ? enumC8134Pu0.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f17106a + ", mobileSubtype=" + this.f17107b + "}";
    }
}
