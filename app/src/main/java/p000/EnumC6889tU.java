package p000;

import java.util.HashMap;

/* renamed from: tU */
/* loaded from: classes.dex */
public enum EnumC6889tU {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* renamed from: d */
    public static final HashMap f43091d = new HashMap();

    /* renamed from: a */
    public final String f43093a;

    static {
        for (EnumC6889tU enumC6889tU : values()) {
            f43091d.put(enumC6889tU.f43093a, enumC6889tU);
        }
    }

    EnumC6889tU(String str) {
        this.f43093a = str;
    }

    /* renamed from: a */
    public static EnumC6889tU m24936a(String str) {
        HashMap map = f43091d;
        if (map.containsKey(str)) {
            return (EnumC6889tU) map.get(str);
        }
        throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unknown 'Unit' Value: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f43093a;
    }
}
