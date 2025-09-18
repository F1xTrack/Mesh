package p000;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Tu */
/* loaded from: classes.dex */
public final class EnumC1252Tu {

    /* renamed from: a */
    public static final EnumC1252Tu f11585a;

    /* renamed from: b */
    public static final HashMap f11586b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC1252Tu[] f11587c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1252Tu EF10;

    static {
        EnumC1252Tu enumC1252Tu = new EnumC1252Tu("X86_32", 0);
        EnumC1252Tu enumC1252Tu2 = new EnumC1252Tu("X86_64", 1);
        EnumC1252Tu enumC1252Tu3 = new EnumC1252Tu("ARM_UNKNOWN", 2);
        EnumC1252Tu enumC1252Tu4 = new EnumC1252Tu("PPC", 3);
        EnumC1252Tu enumC1252Tu5 = new EnumC1252Tu("PPC64", 4);
        EnumC1252Tu enumC1252Tu6 = new EnumC1252Tu("ARMV6", 5);
        EnumC1252Tu enumC1252Tu7 = new EnumC1252Tu("ARMV7", 6);
        EnumC1252Tu enumC1252Tu8 = new EnumC1252Tu(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        f11585a = enumC1252Tu8;
        EnumC1252Tu enumC1252Tu9 = new EnumC1252Tu("ARMV7S", 8);
        EnumC1252Tu enumC1252Tu10 = new EnumC1252Tu("ARM64", 9);
        f11587c = new EnumC1252Tu[]{enumC1252Tu, enumC1252Tu2, enumC1252Tu3, enumC1252Tu4, enumC1252Tu5, enumC1252Tu6, enumC1252Tu7, enumC1252Tu8, enumC1252Tu9, enumC1252Tu10};
        HashMap map = new HashMap(4);
        f11586b = map;
        map.put("armeabi-v7a", enumC1252Tu7);
        map.put("armeabi", enumC1252Tu6);
        map.put("arm64-v8a", enumC1252Tu10);
        map.put("x86", enumC1252Tu);
    }

    public static EnumC1252Tu valueOf(String str) {
        return (EnumC1252Tu) Enum.valueOf(EnumC1252Tu.class, str);
    }

    public static EnumC1252Tu[] values() {
        return (EnumC1252Tu[]) f11587c.clone();
    }
}
