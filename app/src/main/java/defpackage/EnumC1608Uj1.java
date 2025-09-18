package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Uj1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1608Uj1 implements InterfaceC0723Ja0 {
    public static final C3759fN b;
    public static final EnumC1608Uj1 c;
    public static final EnumC1608Uj1 d;
    public static final EnumC1608Uj1 e;
    public static final EnumC1608Uj1 f;
    public static final /* synthetic */ EnumC1608Uj1[] g;
    public final String a;

    static {
        EnumC1608Uj1 enumC1608Uj1 = new EnumC1608Uj1("OFF", 0, "off");
        c = enumC1608Uj1;
        EnumC1608Uj1 enumC1608Uj12 = new EnumC1608Uj1("STANDARD", 1, "standard");
        d = enumC1608Uj12;
        EnumC1608Uj1 enumC1608Uj13 = new EnumC1608Uj1("CINEMATIC", 2, "cinematic");
        e = enumC1608Uj13;
        EnumC1608Uj1 enumC1608Uj14 = new EnumC1608Uj1("CINEMATIC_EXTENDED", 3, "cinematic-extended");
        f = enumC1608Uj14;
        EnumC1608Uj1[] enumC1608Uj1Arr = {enumC1608Uj1, enumC1608Uj12, enumC1608Uj13, enumC1608Uj14};
        g = enumC1608Uj1Arr;
        F02.c(enumC1608Uj1Arr);
        b = new C3759fN(23);
    }

    public EnumC1608Uj1(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC1608Uj1 valueOf(String str) {
        return (EnumC1608Uj1) Enum.valueOf(EnumC1608Uj1.class, str);
    }

    public static EnumC1608Uj1[] values() {
        return (EnumC1608Uj1[]) g.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
