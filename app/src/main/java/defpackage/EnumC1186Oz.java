package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Oz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1186Oz {
    public static final EnumC1186Oz a;
    public static final /* synthetic */ EnumC1186Oz[] b;

    static {
        EnumC1186Oz enumC1186Oz = new EnumC1186Oz("DEFAULT", 0);
        a = enumC1186Oz;
        EnumC1186Oz[] enumC1186OzArr = {enumC1186Oz, new EnumC1186Oz("LAZY", 1), new EnumC1186Oz("ATOMIC", 2), new EnumC1186Oz("UNDISPATCHED", 3)};
        b = enumC1186OzArr;
        F02.c(enumC1186OzArr);
    }

    public static EnumC1186Oz valueOf(String str) {
        return (EnumC1186Oz) Enum.valueOf(EnumC1186Oz.class, str);
    }

    public static EnumC1186Oz[] values() {
        return (EnumC1186Oz[]) b.clone();
    }
}
