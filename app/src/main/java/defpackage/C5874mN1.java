package defpackage;

import android.content.Context;

/* renamed from: mN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5874mN1 {
    public final Context a;
    public final InterfaceC6587q61 b;

    public C5874mN1(Context context, InterfaceC6587q61 interfaceC6587q61) {
        this.a = context;
        this.b = interfaceC6587q61;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5874mN1) {
            C5874mN1 c5874mN1 = (C5874mN1) obj;
            if (this.a.equals(c5874mN1.a)) {
                InterfaceC6587q61 interfaceC6587q61 = c5874mN1.b;
                InterfaceC6587q61 interfaceC6587q612 = this.b;
                if (interfaceC6587q612 != null ? interfaceC6587q612.equals(interfaceC6587q61) : interfaceC6587q61 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        InterfaceC6587q61 interfaceC6587q61 = this.b;
        return iHashCode ^ (interfaceC6587q61 == null ? 0 : interfaceC6587q61.hashCode());
    }

    public final String toString() {
        return AbstractC7209tN0.x("FlagsContext{context=", String.valueOf(this.a), ", hermeticFileOverrides=", String.valueOf(this.b), "}");
    }
}
