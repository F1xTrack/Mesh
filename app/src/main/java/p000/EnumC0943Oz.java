package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Oz */
/* loaded from: classes2.dex */
public final class EnumC0943Oz {

    /* renamed from: a */
    public static final EnumC0943Oz f8765a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC0943Oz[] f8766b;

    static {
        EnumC0943Oz enumC0943Oz = new EnumC0943Oz("DEFAULT", 0);
        f8765a = enumC0943Oz;
        EnumC0943Oz[] enumC0943OzArr = {enumC0943Oz, new EnumC0943Oz("LAZY", 1), new EnumC0943Oz("ATOMIC", 2), new EnumC0943Oz("UNDISPATCHED", 3)};
        f8766b = enumC0943OzArr;
        F02.m2482c(enumC0943OzArr);
    }

    public static EnumC0943Oz valueOf(String str) {
        return (EnumC0943Oz) Enum.valueOf(EnumC0943Oz.class, str);
    }

    public static EnumC0943Oz[] values() {
        return (EnumC0943Oz[]) f8766b.clone();
    }
}
