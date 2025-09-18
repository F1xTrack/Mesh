package p000;

import java.util.List;

/* renamed from: Mc */
/* loaded from: classes.dex */
public final class C0794Mc extends AbstractC6995vA {

    /* renamed from: a */
    public final int f7256a;

    /* renamed from: b */
    public final String f7257b;

    /* renamed from: c */
    public final int f7258c;

    /* renamed from: d */
    public final int f7259d;

    /* renamed from: e */
    public final long f7260e;

    /* renamed from: f */
    public final long f7261f;

    /* renamed from: g */
    public final long f7262g;

    /* renamed from: h */
    public final String f7263h;

    /* renamed from: i */
    public final List f7264i;

    public C0794Mc(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.f7256a = i;
        this.f7257b = str;
        this.f7258c = i2;
        this.f7259d = i3;
        this.f7260e = j;
        this.f7261f = j2;
        this.f7262g = j3;
        this.f7263h = str2;
        this.f7264i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6995vA)) {
            return false;
        }
        AbstractC6995vA abstractC6995vA = (AbstractC6995vA) obj;
        if (this.f7256a == ((C0794Mc) abstractC6995vA).f7256a) {
            C0794Mc c0794Mc = (C0794Mc) abstractC6995vA;
            if (this.f7257b.equals(c0794Mc.f7257b) && this.f7258c == c0794Mc.f7258c && this.f7259d == c0794Mc.f7259d && this.f7260e == c0794Mc.f7260e && this.f7261f == c0794Mc.f7261f && this.f7262g == c0794Mc.f7262g) {
                String str = c0794Mc.f7263h;
                String str2 = this.f7263h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = c0794Mc.f7264i;
                    List list2 = this.f7264i;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f7256a ^ 1000003) * 1000003) ^ this.f7257b.hashCode()) * 1000003) ^ this.f7258c) * 1000003) ^ this.f7259d) * 1000003;
        long j = this.f7260e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f7261f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f7262g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f7263h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f7264i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f7256a + ", processName=" + this.f7257b + ", reasonCode=" + this.f7258c + ", importance=" + this.f7259d + ", pss=" + this.f7260e + ", rss=" + this.f7261f + ", timestamp=" + this.f7262g + ", traceFile=" + this.f7263h + ", buildIdMappingForArch=" + this.f7264i + "}";
    }
}
