package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC9717i90 {

    /* renamed from: a */
    public static final /* synthetic */ EnumC9717i90[] f28840a;

    static {
        EnumC9717i90[] enumC9717i90Arr = {new EnumC9717i90("COMMON_SUPER_TYPE", 0), new EnumC9717i90("INTERSECTION_TYPE", 1)};
        f28840a = enumC9717i90Arr;
        F02.m2482c(enumC9717i90Arr);
    }

    public static EnumC9717i90 valueOf(String str) {
        return (EnumC9717i90) Enum.valueOf(EnumC9717i90.class, str);
    }

    public static EnumC9717i90[] values() {
        return (EnumC9717i90[]) f28840a.clone();
    }
}
