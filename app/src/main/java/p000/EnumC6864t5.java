package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t5 */
/* loaded from: classes2.dex */
public final class EnumC6864t5 {

    /* renamed from: a */
    public static final EnumC6864t5 f42825a;

    /* renamed from: b */
    public static final EnumC6864t5 f42826b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC6864t5[] f42827c;

    static {
        EnumC6864t5 enumC6864t5 = new EnumC6864t5("JAVA", 0);
        f42825a = enumC6864t5;
        EnumC6864t5 enumC6864t52 = new EnumC6864t5("KOTLIN", 1);
        f42826b = enumC6864t52;
        EnumC6864t5[] enumC6864t5Arr = {enumC6864t5, enumC6864t52};
        f42827c = enumC6864t5Arr;
        F02.m2482c(enumC6864t5Arr);
    }

    public static EnumC6864t5 valueOf(String str) {
        return (EnumC6864t5) Enum.valueOf(EnumC6864t5.class, str);
    }

    public static EnumC6864t5[] values() {
        return (EnumC6864t5[]) f42827c.clone();
    }
}
