package p000;

/* renamed from: Lf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC7896Lf0 {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVE_KEY("deriveKey"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVE_BITS("deriveBits");


    /* renamed from: a */
    public final String f6790a;

    EnumC7896Lf0(String str) {
        this.f6790a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6790a;
    }
}
