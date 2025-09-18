package p000;

import java.util.Collection;

/* renamed from: Ya0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8562Ya0 {

    /* renamed from: a */
    public final C7566Ew0 f14346a;

    /* renamed from: b */
    public final Collection f14347b;

    /* renamed from: c */
    public final boolean f14348c;

    public C8562Ya0(C7566Ew0 c7566Ew0, Collection collection, boolean z) {
        O90.m5968f(collection, "qualifierApplicabilityTypes");
        this.f14346a = c7566Ew0;
        this.f14347b = collection;
        this.f14348c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8562Ya0)) {
            return false;
        }
        C8562Ya0 c8562Ya0 = (C8562Ya0) obj;
        return O90.m5963a(this.f14346a, c8562Ya0.f14346a) && O90.m5963a(this.f14347b, c8562Ya0.f14347b) && this.f14348c == c8562Ya0.f14348c;
    }

    public final int hashCode() {
        return ((this.f14347b.hashCode() + (this.f14346a.hashCode() * 31)) * 31) + (this.f14348c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f14346a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f14347b);
        sb.append(", definitelyNotNull=");
        return F91.m2540w(sb, this.f14348c, ')');
    }

    public C8562Ya0(C7566Ew0 c7566Ew0, Collection collection) {
        this(c7566Ew0, collection, c7566Ew0.f2977a == EnumC7514Dw0.f2324c);
    }
}
