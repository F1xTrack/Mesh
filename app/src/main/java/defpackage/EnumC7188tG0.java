package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7188tG0 implements InterfaceC0723Ja0 {
    public static final OL0 b;
    public static final EnumC7188tG0 c;
    public static final EnumC7188tG0 d;
    public static final EnumC7188tG0 e;
    public static final /* synthetic */ EnumC7188tG0[] f;
    public final String a;

    static {
        EnumC7188tG0 enumC7188tG0 = new EnumC7188tG0("SPEED", 0, "speed");
        c = enumC7188tG0;
        EnumC7188tG0 enumC7188tG02 = new EnumC7188tG0("BALANCED", 1, "balanced");
        d = enumC7188tG02;
        EnumC7188tG0 enumC7188tG03 = new EnumC7188tG0("QUALITY", 2, "quality");
        e = enumC7188tG03;
        EnumC7188tG0[] enumC7188tG0Arr = {enumC7188tG0, enumC7188tG02, enumC7188tG03};
        f = enumC7188tG0Arr;
        F02.c(enumC7188tG0Arr);
        b = new OL0(19);
    }

    public EnumC7188tG0(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC7188tG0 valueOf(String str) {
        return (EnumC7188tG0) Enum.valueOf(EnumC7188tG0.class, str);
    }

    public static EnumC7188tG0[] values() {
        return (EnumC7188tG0[]) f.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
