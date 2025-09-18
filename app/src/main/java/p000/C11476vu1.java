package p000;

import java.util.Map;

/* renamed from: vu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11476vu1 {

    /* renamed from: a */
    public final long f44597a;

    /* renamed from: b */
    public final Map f44598b;

    /* renamed from: c */
    public final C11224tw1 f44599c;

    /* renamed from: d */
    public final String f44600d;

    public C11476vu1(long j, Map map, C11224tw1 c11224tw1, String str) {
        this.f44597a = j;
        this.f44598b = map;
        this.f44599c = c11224tw1;
        this.f44600d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11476vu1)) {
            return false;
        }
        C11476vu1 c11476vu1 = (C11476vu1) obj;
        return this.f44597a == c11476vu1.f44597a && O90.m5963a(this.f44598b, c11476vu1.f44598b) && O90.m5963a(this.f44599c, c11476vu1.f44599c) && O90.m5963a(this.f44600d, c11476vu1.f44600d);
    }

    public final int hashCode() {
        long j = this.f44597a;
        return this.f44600d.hashCode() + ((this.f44599c.hashCode() + ((this.f44598b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PersistableConfigDto(updateTimeStamp=" + this.f44597a + ", data=" + this.f44598b + ", configMetadata=" + this.f44599c + ", shortSegments=" + ((Object) G12.m2910a(this.f44600d)) + ')';
    }
}
