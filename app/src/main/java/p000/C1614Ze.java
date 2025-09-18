package p000;

import java.util.List;

/* renamed from: Ze */
/* loaded from: classes.dex */
public final class C1614Ze implements InterfaceC6946uO {

    /* renamed from: a */
    public final int f15063a;

    /* renamed from: b */
    public final int f15064b;

    /* renamed from: c */
    public final List f15065c;

    /* renamed from: d */
    public final List f15066d;

    /* renamed from: e */
    public final C7150xd f15067e;

    /* renamed from: f */
    public final C7276zd f15068f;

    public C1614Ze(int i, int i2, List list, List list2, C7150xd c7150xd, C7276zd c7276zd) {
        this.f15063a = i;
        this.f15064b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f15065c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f15066d = list2;
        this.f15067e = c7150xd;
        if (c7276zd == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f15068f = c7276zd;
    }

    @Override // p000.InterfaceC6946uO
    /* renamed from: a */
    public final int mo9561a() {
        return this.f15063a;
    }

    @Override // p000.InterfaceC6946uO
    /* renamed from: b */
    public final int mo9562b() {
        return this.f15064b;
    }

    @Override // p000.InterfaceC6946uO
    /* renamed from: c */
    public final List mo9563c() {
        return this.f15065c;
    }

    @Override // p000.InterfaceC6946uO
    /* renamed from: d */
    public final List mo9564d() {
        return this.f15066d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1614Ze)) {
            return false;
        }
        C1614Ze c1614Ze = (C1614Ze) obj;
        if (this.f15063a == c1614Ze.f15063a && this.f15064b == c1614Ze.f15064b && this.f15065c.equals(c1614Ze.f15065c) && this.f15066d.equals(c1614Ze.f15066d)) {
            C7150xd c7150xd = c1614Ze.f15067e;
            C7150xd c7150xd2 = this.f15067e;
            if (c7150xd2 != null ? c7150xd2.equals(c7150xd) : c7150xd == null) {
                if (this.f15068f.equals(c1614Ze.f15068f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f15063a ^ 1000003) * 1000003) ^ this.f15064b) * 1000003) ^ this.f15065c.hashCode()) * 1000003) ^ this.f15066d.hashCode()) * 1000003;
        C7150xd c7150xd = this.f15067e;
        return ((iHashCode ^ (c7150xd == null ? 0 : c7150xd.hashCode())) * 1000003) ^ this.f15068f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f15063a + ", recommendedFileFormat=" + this.f15064b + ", audioProfiles=" + this.f15065c + ", videoProfiles=" + this.f15066d + ", defaultAudioProfile=" + this.f15067e + ", defaultVideoProfile=" + this.f15068f + "}";
    }
}
