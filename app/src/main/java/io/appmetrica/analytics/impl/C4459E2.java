package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.E2 */
/* loaded from: classes2.dex */
public final class C4459E2 {

    /* renamed from: a */
    public final EnumC4434D2 f30048a;

    /* renamed from: b */
    public final Boolean f30049b;

    public C4459E2(EnumC4434D2 enumC4434D2, Boolean bool) {
        this.f30048a = enumC4434D2;
        this.f30049b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4459E2.class != obj.getClass()) {
            return false;
        }
        C4459E2 c4459e2 = (C4459E2) obj;
        if (this.f30048a != c4459e2.f30048a) {
            return false;
        }
        Boolean bool = this.f30049b;
        return bool != null ? bool.equals(c4459e2.f30049b) : c4459e2.f30049b == null;
    }

    public final int hashCode() {
        EnumC4434D2 enumC4434D2 = this.f30048a;
        int iHashCode = (enumC4434D2 != null ? enumC4434D2.hashCode() : 0) * 31;
        Boolean bool = this.f30049b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
