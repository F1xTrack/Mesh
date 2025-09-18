package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cS0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2518cS0 implements InterfaceC0723Ja0 {
    public static final C0084Av0 b;
    public static final EnumC2518cS0 c;
    public static final EnumC2518cS0 d;
    public static final /* synthetic */ EnumC2518cS0[] e;
    public final String a;

    static {
        EnumC2518cS0 enumC2518cS0 = new EnumC2518cS0("COVER", 0, "cover");
        c = enumC2518cS0;
        EnumC2518cS0 enumC2518cS02 = new EnumC2518cS0("CONTAIN", 1, "contain");
        d = enumC2518cS02;
        EnumC2518cS0[] enumC2518cS0Arr = {enumC2518cS0, enumC2518cS02};
        e = enumC2518cS0Arr;
        F02.c(enumC2518cS0Arr);
        b = new C0084Av0(20);
    }

    public EnumC2518cS0(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC2518cS0 valueOf(String str) {
        return (EnumC2518cS0) Enum.valueOf(EnumC2518cS0.class, str);
    }

    public static EnumC2518cS0[] values() {
        return (EnumC2518cS0[]) e.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
