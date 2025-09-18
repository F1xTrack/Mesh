package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kU */
/* loaded from: classes2.dex */
public final class EnumC6303kU {

    /* renamed from: a */
    public static final EnumC6303kU f36507a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC6303kU[] f36508b;

    static {
        EnumC6303kU enumC6303kU = new EnumC6303kU("TOP_DOWN", 0);
        EnumC6303kU enumC6303kU2 = new EnumC6303kU("BOTTOM_UP", 1);
        f36507a = enumC6303kU2;
        EnumC6303kU[] enumC6303kUArr = {enumC6303kU, enumC6303kU2};
        f36508b = enumC6303kUArr;
        F02.m2482c(enumC6303kUArr);
    }

    public static EnumC6303kU valueOf(String str) {
        return (EnumC6303kU) Enum.valueOf(EnumC6303kU.class, str);
    }

    public static EnumC6303kU[] values() {
        return (EnumC6303kU[]) f36508b.clone();
    }
}
