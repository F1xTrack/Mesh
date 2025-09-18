package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cS0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8982cS0 implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C7356Av0 f17519b;

    /* renamed from: c */
    public static final EnumC8982cS0 f17520c;

    /* renamed from: d */
    public static final EnumC8982cS0 f17521d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC8982cS0[] f17522e;

    /* renamed from: a */
    public final String f17523a;

    static {
        EnumC8982cS0 enumC8982cS0 = new EnumC8982cS0("COVER", 0, "cover");
        f17520c = enumC8982cS0;
        EnumC8982cS0 enumC8982cS02 = new EnumC8982cS0("CONTAIN", 1, "contain");
        f17521d = enumC8982cS02;
        EnumC8982cS0[] enumC8982cS0Arr = {enumC8982cS0, enumC8982cS02};
        f17522e = enumC8982cS0Arr;
        F02.m2482c(enumC8982cS0Arr);
        f17519b = new C7356Av0(20);
    }

    public EnumC8982cS0(String str, int i, String str2) {
        this.f17523a = str2;
    }

    public static EnumC8982cS0 valueOf(String str) {
        return (EnumC8982cS0) Enum.valueOf(EnumC8982cS0.class, str);
    }

    public static EnumC8982cS0[] values() {
        return (EnumC8982cS0[]) f17522e.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f17523a;
    }
}
