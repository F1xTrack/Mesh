package defpackage;

/* renamed from: eR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3582eR1 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String a;

    EnumC3582eR1(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
