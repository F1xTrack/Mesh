package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: XO */
/* loaded from: classes2.dex */
public final class EnumC1472XO {

    /* renamed from: a */
    public static final /* synthetic */ EnumC1472XO[] f13686a;

    static {
        EnumC1472XO[] enumC1472XOArr = {new EnumC1472XO("ERROR_CLASS", 0), new EnumC1472XO("ERROR_FUNCTION", 1), new EnumC1472XO("ERROR_SCOPE", 2), new EnumC1472XO("ERROR_MODULE", 3), new EnumC1472XO("ERROR_PROPERTY", 4), new EnumC1472XO("ERROR_TYPE", 5), new EnumC1472XO("PARENT_OF_ERROR_SCOPE", 6)};
        f13686a = enumC1472XOArr;
        F02.m2482c(enumC1472XOArr);
    }

    public static EnumC1472XO valueOf(String str) {
        return (EnumC1472XO) Enum.valueOf(EnumC1472XO.class, str);
    }

    public static EnumC1472XO[] values() {
        return (EnumC1472XO[]) f13686a.clone();
    }
}
