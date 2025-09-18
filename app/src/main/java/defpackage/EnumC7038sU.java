package defpackage;

import java.util.HashMap;

/* renamed from: sU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC7038sU {
    /* JADX INFO: Fake field, exist only in values array */
    MATRIX("matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    SATURATE("saturate"),
    /* JADX INFO: Fake field, exist only in values array */
    HUE_ROTATE("hueRotate"),
    /* JADX INFO: Fake field, exist only in values array */
    LUMINANCE_TO_ALPHA("luminanceToAlpha");

    public static final HashMap b = new HashMap();
    public final String a;

    static {
        for (EnumC7038sU enumC7038sU : values()) {
            b.put(enumC7038sU.a, enumC7038sU);
        }
    }

    EnumC7038sU(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
