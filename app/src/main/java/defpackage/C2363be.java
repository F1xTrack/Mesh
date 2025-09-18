package defpackage;

/* renamed from: be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2363be extends AbstractC1406Ru0 {
    public final EnumC1328Qu0 a;
    public final EnumC1250Pu0 b;

    public C2363be(EnumC1328Qu0 enumC1328Qu0, EnumC1250Pu0 enumC1250Pu0) {
        this.a = enumC1328Qu0;
        this.b = enumC1250Pu0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1406Ru0)) {
            return false;
        }
        AbstractC1406Ru0 abstractC1406Ru0 = (AbstractC1406Ru0) obj;
        EnumC1328Qu0 enumC1328Qu0 = this.a;
        if (enumC1328Qu0 != null ? enumC1328Qu0.equals(((C2363be) abstractC1406Ru0).a) : ((C2363be) abstractC1406Ru0).a == null) {
            EnumC1250Pu0 enumC1250Pu0 = this.b;
            if (enumC1250Pu0 == null) {
                if (((C2363be) abstractC1406Ru0).b == null) {
                    return true;
                }
            } else if (enumC1250Pu0.equals(((C2363be) abstractC1406Ru0).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC1328Qu0 enumC1328Qu0 = this.a;
        int iHashCode = ((enumC1328Qu0 == null ? 0 : enumC1328Qu0.hashCode()) ^ 1000003) * 1000003;
        EnumC1250Pu0 enumC1250Pu0 = this.b;
        return (enumC1250Pu0 != null ? enumC1250Pu0.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
