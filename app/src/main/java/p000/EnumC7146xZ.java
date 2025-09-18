package p000;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xZ */
/* loaded from: classes2.dex */
public final class EnumC7146xZ {

    /* renamed from: a */
    public static final OL0 f45677a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC7146xZ[] f45678b;

    static {
        EnumC7146xZ[] enumC7146xZArr = {new EnumC7146xZ("Function", 0), new EnumC7146xZ("SuspendFunction", 1), new EnumC7146xZ("KFunction", 2), new EnumC7146xZ("KSuspendFunction", 3), new EnumC7146xZ(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4)};
        f45678b = enumC7146xZArr;
        F02.m2482c(enumC7146xZArr);
        f45677a = new OL0(14);
    }

    public static EnumC7146xZ valueOf(String str) {
        return (EnumC7146xZ) Enum.valueOf(EnumC7146xZ.class, str);
    }

    public static EnumC7146xZ[] values() {
        return (EnumC7146xZ[]) f45678b.clone();
    }
}
