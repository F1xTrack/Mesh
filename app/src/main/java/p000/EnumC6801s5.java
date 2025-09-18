package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s5 */
/* loaded from: classes2.dex */
public final class EnumC6801s5 {

    /* renamed from: a */
    public static final EnumC6801s5 f42249a;

    /* renamed from: b */
    public static final EnumC6801s5 f42250b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC6801s5[] f42251c;

    static {
        EnumC6801s5 enumC6801s5 = new EnumC6801s5("CALL_BY_NAME", 0);
        f42249a = enumC6801s5;
        EnumC6801s5 enumC6801s52 = new EnumC6801s5("POSITIONAL_CALL", 1);
        f42250b = enumC6801s52;
        EnumC6801s5[] enumC6801s5Arr = {enumC6801s5, enumC6801s52};
        f42251c = enumC6801s5Arr;
        F02.m2482c(enumC6801s5Arr);
    }

    public static EnumC6801s5 valueOf(String str) {
        return (EnumC6801s5) Enum.valueOf(EnumC6801s5.class, str);
    }

    public static EnumC6801s5[] values() {
        return (EnumC6801s5[]) f42251c.clone();
    }
}
