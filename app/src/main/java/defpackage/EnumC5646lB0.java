package defpackage;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5646lB0 implements InterfaceC0723Ja0 {
    public static final OJ1 b;
    public static final EnumC5646lB0 c;
    public static final EnumC5646lB0 d;
    public static final EnumC5646lB0 e;
    public static final /* synthetic */ EnumC5646lB0[] f;
    public final String a;

    static {
        EnumC5646lB0 enumC5646lB0 = new EnumC5646lB0("YUV", 0, "yuv");
        c = enumC5646lB0;
        EnumC5646lB0 enumC5646lB02 = new EnumC5646lB0("RGB", 1, "rgb");
        d = enumC5646lB02;
        EnumC5646lB0 enumC5646lB03 = new EnumC5646lB0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
        e = enumC5646lB03;
        EnumC5646lB0[] enumC5646lB0Arr = {enumC5646lB0, enumC5646lB02, enumC5646lB03};
        f = enumC5646lB0Arr;
        F02.c(enumC5646lB0Arr);
        b = new OJ1(18);
    }

    public EnumC5646lB0(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC5646lB0 valueOf(String str) {
        return (EnumC5646lB0) Enum.valueOf(EnumC5646lB0.class, str);
    }

    public static EnumC5646lB0[] values() {
        return (EnumC5646lB0[]) f.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
