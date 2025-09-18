package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: II */
/* loaded from: classes2.dex */
public final class EnumC0523II {

    /* renamed from: a */
    public static final EnumC0523II f4880a;

    /* renamed from: b */
    public static final EnumC0523II f4881b;

    /* renamed from: c */
    public static final EnumC0523II f4882c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC0523II[] f4883d;

    static {
        EnumC0523II enumC0523II = new EnumC0523II("STABLE", 0);
        f4880a = enumC0523II;
        EnumC0523II enumC0523II2 = new EnumC0523II("FIR_UNSTABLE", 1);
        f4881b = enumC0523II2;
        EnumC0523II enumC0523II3 = new EnumC0523II("IR_UNSTABLE", 2);
        f4882c = enumC0523II3;
        EnumC0523II[] enumC0523IIArr = {enumC0523II, enumC0523II2, enumC0523II3};
        f4883d = enumC0523IIArr;
        F02.m2482c(enumC0523IIArr);
    }

    public static EnumC0523II valueOf(String str) {
        return (EnumC0523II) Enum.valueOf(EnumC0523II.class, str);
    }

    public static EnumC0523II[] values() {
        return (EnumC0523II[]) f4883d.clone();
    }
}
