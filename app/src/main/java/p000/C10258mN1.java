package p000;

import android.content.Context;

/* renamed from: mN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10258mN1 {

    /* renamed from: a */
    public final Context f37658a;

    /* renamed from: b */
    public final InterfaceC10736q61 f37659b;

    public C10258mN1(Context context, InterfaceC10736q61 interfaceC10736q61) {
        this.f37658a = context;
        this.f37659b = interfaceC10736q61;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10258mN1) {
            C10258mN1 c10258mN1 = (C10258mN1) obj;
            if (this.f37658a.equals(c10258mN1.f37658a)) {
                InterfaceC10736q61 interfaceC10736q61 = c10258mN1.f37659b;
                InterfaceC10736q61 interfaceC10736q612 = this.f37659b;
                if (interfaceC10736q612 != null ? interfaceC10736q612.equals(interfaceC10736q61) : interfaceC10736q61 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f37658a.hashCode() ^ 1000003) * 1000003;
        InterfaceC10736q61 interfaceC10736q61 = this.f37659b;
        return iHashCode ^ (interfaceC10736q61 == null ? 0 : interfaceC10736q61.hashCode());
    }

    public final String toString() {
        return AbstractC11153tN0.m24912x("FlagsContext{context=", String.valueOf(this.f37658a), ", hermeticFileOverrides=", String.valueOf(this.f37659b), "}");
    }
}
