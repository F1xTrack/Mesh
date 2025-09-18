package defpackage;

import java.util.List;

/* renamed from: Ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1981Ze implements InterfaceC7402uO {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final C8018xd e;
    public final C8398zd f;

    public C1981Ze(int i, int i2, List list, List list2, C8018xd c8018xd, C8398zd c8398zd) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.d = list2;
        this.e = c8018xd;
        if (c8398zd == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f = c8398zd;
    }

    @Override // defpackage.InterfaceC7402uO
    public final int a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC7402uO
    public final int b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC7402uO
    public final List c() {
        return this.c;
    }

    @Override // defpackage.InterfaceC7402uO
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1981Ze)) {
            return false;
        }
        C1981Ze c1981Ze = (C1981Ze) obj;
        if (this.a == c1981Ze.a && this.b == c1981Ze.b && this.c.equals(c1981Ze.c) && this.d.equals(c1981Ze.d)) {
            C8018xd c8018xd = c1981Ze.e;
            C8018xd c8018xd2 = this.e;
            if (c8018xd2 != null ? c8018xd2.equals(c8018xd) : c8018xd == null) {
                if (this.f.equals(c1981Ze.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        C8018xd c8018xd = this.e;
        return ((iHashCode ^ (c8018xd == null ? 0 : c8018xd.hashCode())) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
