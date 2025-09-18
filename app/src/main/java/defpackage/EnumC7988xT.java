package defpackage;

/* renamed from: xT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC7988xT {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String a;

    EnumC7988xT(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
