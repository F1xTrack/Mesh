package p000;

/* renamed from: eG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC9219eG0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: a */
    public final String f26631a;

    EnumC9219eG0(String str) {
        this.f26631a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26631a;
    }
}
