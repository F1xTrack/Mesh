package defpackage;

import java.util.Collection;

/* renamed from: Ya0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1892Ya0 {
    public final C0399Ew0 a;
    public final Collection b;
    public final boolean c;

    public C1892Ya0(C0399Ew0 c0399Ew0, Collection collection, boolean z) {
        O90.f(collection, "qualifierApplicabilityTypes");
        this.a = c0399Ew0;
        this.b = collection;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1892Ya0)) {
            return false;
        }
        C1892Ya0 c1892Ya0 = (C1892Ya0) obj;
        return O90.a(this.a, c1892Ya0.a) && O90.a(this.b, c1892Ya0.b) && this.c == c1892Ya0.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        return F91.w(sb, this.c, ')');
    }

    public C1892Ya0(C0399Ew0 c0399Ew0, Collection collection) {
        this(c0399Ew0, collection, c0399Ew0.a == EnumC0321Dw0.c);
    }
}
