package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Uj1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8373Uj1 implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C4049fN f12007b;

    /* renamed from: c */
    public static final EnumC8373Uj1 f12008c;

    /* renamed from: d */
    public static final EnumC8373Uj1 f12009d;

    /* renamed from: e */
    public static final EnumC8373Uj1 f12010e;

    /* renamed from: f */
    public static final EnumC8373Uj1 f12011f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC8373Uj1[] f12012g;

    /* renamed from: a */
    public final String f12013a;

    static {
        EnumC8373Uj1 enumC8373Uj1 = new EnumC8373Uj1("OFF", 0, "off");
        f12008c = enumC8373Uj1;
        EnumC8373Uj1 enumC8373Uj12 = new EnumC8373Uj1("STANDARD", 1, "standard");
        f12009d = enumC8373Uj12;
        EnumC8373Uj1 enumC8373Uj13 = new EnumC8373Uj1("CINEMATIC", 2, "cinematic");
        f12010e = enumC8373Uj13;
        EnumC8373Uj1 enumC8373Uj14 = new EnumC8373Uj1("CINEMATIC_EXTENDED", 3, "cinematic-extended");
        f12011f = enumC8373Uj14;
        EnumC8373Uj1[] enumC8373Uj1Arr = {enumC8373Uj1, enumC8373Uj12, enumC8373Uj13, enumC8373Uj14};
        f12012g = enumC8373Uj1Arr;
        F02.m2482c(enumC8373Uj1Arr);
        f12007b = new C4049fN(23);
    }

    public EnumC8373Uj1(String str, int i, String str2) {
        this.f12013a = str2;
    }

    public static EnumC8373Uj1 valueOf(String str) {
        return (EnumC8373Uj1) Enum.valueOf(EnumC8373Uj1.class, str);
    }

    public static EnumC8373Uj1[] values() {
        return (EnumC8373Uj1[]) f12012g.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f12013a;
    }
}
