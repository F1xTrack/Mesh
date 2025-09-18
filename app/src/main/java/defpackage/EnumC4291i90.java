package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4291i90 {
    public static final /* synthetic */ EnumC4291i90[] a;

    static {
        EnumC4291i90[] enumC4291i90Arr = {new EnumC4291i90("COMMON_SUPER_TYPE", 0), new EnumC4291i90("INTERSECTION_TYPE", 1)};
        a = enumC4291i90Arr;
        F02.c(enumC4291i90Arr);
    }

    public static EnumC4291i90 valueOf(String str) {
        return (EnumC4291i90) Enum.valueOf(EnumC4291i90.class, str);
    }

    public static EnumC4291i90[] values() {
        return (EnumC4291i90[]) a.clone();
    }
}
