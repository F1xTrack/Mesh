package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Md1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0966Md1 {
    public static final /* synthetic */ EnumC0966Md1[] a;

    static {
        EnumC0966Md1[] enumC0966Md1Arr = {new EnumC0966Md1("CHECK_ONLY_LOWER", 0), new EnumC0966Md1("CHECK_SUBTYPE_AND_LOWER", 1), new EnumC0966Md1("SKIP_LOWER", 2)};
        a = enumC0966Md1Arr;
        F02.c(enumC0966Md1Arr);
    }

    public static EnumC0966Md1 valueOf(String str) {
        return (EnumC0966Md1) Enum.valueOf(EnumC0966Md1.class, str);
    }

    public static EnumC0966Md1[] values() {
        return (EnumC0966Md1[]) a.clone();
    }
}
