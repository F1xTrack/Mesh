package p000;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC10105lB0 implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final OJ1 f36939b;

    /* renamed from: c */
    public static final EnumC10105lB0 f36940c;

    /* renamed from: d */
    public static final EnumC10105lB0 f36941d;

    /* renamed from: e */
    public static final EnumC10105lB0 f36942e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC10105lB0[] f36943f;

    /* renamed from: a */
    public final String f36944a;

    static {
        EnumC10105lB0 enumC10105lB0 = new EnumC10105lB0("YUV", 0, "yuv");
        f36940c = enumC10105lB0;
        EnumC10105lB0 enumC10105lB02 = new EnumC10105lB0("RGB", 1, "rgb");
        f36941d = enumC10105lB02;
        EnumC10105lB0 enumC10105lB03 = new EnumC10105lB0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
        f36942e = enumC10105lB03;
        EnumC10105lB0[] enumC10105lB0Arr = {enumC10105lB0, enumC10105lB02, enumC10105lB03};
        f36943f = enumC10105lB0Arr;
        F02.m2482c(enumC10105lB0Arr);
        f36939b = new OJ1(18);
    }

    public EnumC10105lB0(String str, int i, String str2) {
        this.f36944a = str2;
    }

    public static EnumC10105lB0 valueOf(String str) {
        return (EnumC10105lB0) Enum.valueOf(EnumC10105lB0.class, str);
    }

    public static EnumC10105lB0[] values() {
        return (EnumC10105lB0[]) f36943f.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f36944a;
    }
}
