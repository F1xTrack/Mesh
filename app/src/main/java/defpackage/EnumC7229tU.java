package defpackage;

import java.util.HashMap;

/* renamed from: tU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC7229tU {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");

    public static final HashMap d = new HashMap();
    public final String a;

    static {
        for (EnumC7229tU enumC7229tU : values()) {
            d.put(enumC7229tU.a, enumC7229tU);
        }
    }

    EnumC7229tU(String str) {
        this.a = str;
    }

    public static EnumC7229tU a(String str) {
        HashMap map = d;
        if (map.containsKey(str)) {
            return (EnumC7229tU) map.get(str);
        }
        throw new IllegalArgumentException(AbstractC8235ym.v("Unknown 'Unit' Value: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
