package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: yd */
/* loaded from: classes.dex */
public final class C7213yd implements InterfaceC6946uO {

    /* renamed from: a */
    public final int f46356a;

    /* renamed from: b */
    public final int f46357b;

    /* renamed from: c */
    public final List f46358c;

    /* renamed from: d */
    public final List f46359d;

    public C7213yd(int i, int i2, List list, List list2) {
        this.f46356a = i;
        this.f46357b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f46358c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f46359d = list2;
    }

    /* renamed from: e */
    public static C7213yd m26204e(int i, int i2, List list, List list2) {
        return new C7213yd(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    @Override // p000.InterfaceC6946uO
    /* renamed from: a */
    public final int mo9561a() {
        return this.f46356a;
    }

    @Override // p000.InterfaceC6946uO
    /* renamed from: b */
    public final int mo9562b() {
        return this.f46357b;
    }

    @Override // p000.InterfaceC6946uO
    /* renamed from: c */
    public final List mo9563c() {
        return this.f46358c;
    }

    @Override // p000.InterfaceC6946uO
    /* renamed from: d */
    public final List mo9564d() {
        return this.f46359d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7213yd)) {
            return false;
        }
        C7213yd c7213yd = (C7213yd) obj;
        return this.f46356a == c7213yd.f46356a && this.f46357b == c7213yd.f46357b && this.f46358c.equals(c7213yd.f46358c) && this.f46359d.equals(c7213yd.f46359d);
    }

    public final int hashCode() {
        return ((((((this.f46356a ^ 1000003) * 1000003) ^ this.f46357b) * 1000003) ^ this.f46358c.hashCode()) * 1000003) ^ this.f46359d.hashCode();
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f46356a + ", recommendedFileFormat=" + this.f46357b + ", audioProfiles=" + this.f46358c + ", videoProfiles=" + this.f46359d + "}";
    }
}
