package p000;

/* renamed from: zY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11939zY0 {

    /* renamed from: a */
    public final Boolean f46865a;

    /* renamed from: b */
    public final Double f46866b;

    /* renamed from: c */
    public final Integer f46867c;

    /* renamed from: d */
    public final Integer f46868d;

    /* renamed from: e */
    public final Long f46869e;

    public C11939zY0(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f46865a = bool;
        this.f46866b = d;
        this.f46867c = num;
        this.f46868d = num2;
        this.f46869e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11939zY0)) {
            return false;
        }
        C11939zY0 c11939zY0 = (C11939zY0) obj;
        return O90.m5963a(this.f46865a, c11939zY0.f46865a) && O90.m5963a(this.f46866b, c11939zY0.f46866b) && O90.m5963a(this.f46867c, c11939zY0.f46867c) && O90.m5963a(this.f46868d, c11939zY0.f46868d) && O90.m5963a(this.f46869e, c11939zY0.f46869e);
    }

    public final int hashCode() {
        Boolean bool = this.f46865a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f46866b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f46867c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f46868d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f46869e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f46865a + ", sessionSamplingRate=" + this.f46866b + ", sessionRestartTimeout=" + this.f46867c + ", cacheDuration=" + this.f46868d + ", cacheUpdatedTime=" + this.f46869e + ')';
    }
}
