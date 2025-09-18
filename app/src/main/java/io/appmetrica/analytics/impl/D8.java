package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class D8 {
    public final C4765oc a;
    public final C4765oc b;

    public D8() {
        this(new T7(), new I9(), new C4438b());
    }

    public D8(T7 t7, I9 i9, C4438b c4438b) {
        C4765oc c4765oc = new C4765oc(t7);
        this.a = c4765oc;
        c4765oc.a(E8.NONE, t7);
        c4765oc.a(E8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, i9);
        c4765oc.a(E8.AES_VALUE_ENCRYPTION, c4438b);
        this.b = new C4765oc(t7);
    }
}
