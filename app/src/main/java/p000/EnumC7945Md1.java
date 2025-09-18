package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Md1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7945Md1 {

    /* renamed from: a */
    public static final /* synthetic */ EnumC7945Md1[] f7277a;

    static {
        EnumC7945Md1[] enumC7945Md1Arr = {new EnumC7945Md1("CHECK_ONLY_LOWER", 0), new EnumC7945Md1("CHECK_SUBTYPE_AND_LOWER", 1), new EnumC7945Md1("SKIP_LOWER", 2)};
        f7277a = enumC7945Md1Arr;
        F02.m2482c(enumC7945Md1Arr);
    }

    public static EnumC7945Md1 valueOf(String str) {
        return (EnumC7945Md1) Enum.valueOf(EnumC7945Md1.class, str);
    }

    public static EnumC7945Md1[] values() {
        return (EnumC7945Md1[]) f7277a.clone();
    }
}
