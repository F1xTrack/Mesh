package defpackage;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8006xZ {
    public static final OL0 a;
    public static final /* synthetic */ EnumC8006xZ[] b;

    static {
        EnumC8006xZ[] enumC8006xZArr = {new EnumC8006xZ("Function", 0), new EnumC8006xZ("SuspendFunction", 1), new EnumC8006xZ("KFunction", 2), new EnumC8006xZ("KSuspendFunction", 3), new EnumC8006xZ(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4)};
        b = enumC8006xZArr;
        F02.c(enumC8006xZArr);
        a = new OL0(14);
    }

    public static EnumC8006xZ valueOf(String str) {
        return (EnumC8006xZ) Enum.valueOf(EnumC8006xZ.class, str);
    }

    public static EnumC8006xZ[] values() {
        return (EnumC8006xZ[]) b.clone();
    }
}
