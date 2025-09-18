package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: aW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2148aW implements InterfaceC0723Ja0 {
    public static final C0240Cv0 b;
    public static final EnumC2148aW c;
    public static final EnumC2148aW d;
    public static final EnumC2148aW e;
    public static final /* synthetic */ EnumC2148aW[] f;
    public final String a;

    static {
        EnumC2148aW enumC2148aW = new EnumC2148aW("OFF", 0, "off");
        c = enumC2148aW;
        EnumC2148aW enumC2148aW2 = new EnumC2148aW("ON", 1, "on");
        d = enumC2148aW2;
        EnumC2148aW enumC2148aW3 = new EnumC2148aW("AUTO", 2, "auto");
        e = enumC2148aW3;
        EnumC2148aW[] enumC2148aWArr = {enumC2148aW, enumC2148aW2, enumC2148aW3};
        f = enumC2148aWArr;
        F02.c(enumC2148aWArr);
        b = new C0240Cv0(14);
    }

    public EnumC2148aW(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC2148aW valueOf(String str) {
        return (EnumC2148aW) Enum.valueOf(EnumC2148aW.class, str);
    }

    public static EnumC2148aW[] values() {
        return (EnumC2148aW[]) f.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
