package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Gx */
/* loaded from: classes2.dex */
public final class EnumC0438Gx {

    /* renamed from: a */
    public static final /* synthetic */ EnumC0438Gx[] f3970a;

    static {
        EnumC0438Gx[] enumC0438GxArr = {new EnumC0438Gx("BARE", 0), new EnumC0438Gx("STANDALONE", 1), new EnumC0438Gx("STORE_CLIENT", 2)};
        f3970a = enumC0438GxArr;
        F02.m2482c(enumC0438GxArr);
    }

    public static EnumC0438Gx valueOf(String str) {
        return (EnumC0438Gx) Enum.valueOf(EnumC0438Gx.class, str);
    }

    public static EnumC0438Gx[] values() {
        return (EnumC0438Gx[]) f3970a.clone();
    }
}
