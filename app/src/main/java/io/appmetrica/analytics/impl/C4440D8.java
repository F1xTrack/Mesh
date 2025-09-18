package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.D8 */
/* loaded from: classes2.dex */
public final class C4440D8 {

    /* renamed from: a */
    public final C5346oc f30009a;

    /* renamed from: b */
    public final C5346oc f30010b;

    public C4440D8() {
        this(new C4823T7(), new C4562I9(), new C5008b());
    }

    public C4440D8(C4823T7 c4823t7, C4562I9 c4562i9, C5008b c5008b) {
        C5346oc c5346oc = new C5346oc(c4823t7);
        this.f30009a = c5346oc;
        c5346oc.m20863a(EnumC4465E8.NONE, c4823t7);
        c5346oc.m20863a(EnumC4465E8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c4562i9);
        c5346oc.m20863a(EnumC4465E8.AES_VALUE_ENCRYPTION, c5008b);
        this.f30010b = new C5346oc(c4823t7);
    }
}
