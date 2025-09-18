package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC11139tG0 implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final OL0 f42982b;

    /* renamed from: c */
    public static final EnumC11139tG0 f42983c;

    /* renamed from: d */
    public static final EnumC11139tG0 f42984d;

    /* renamed from: e */
    public static final EnumC11139tG0 f42985e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC11139tG0[] f42986f;

    /* renamed from: a */
    public final String f42987a;

    static {
        EnumC11139tG0 enumC11139tG0 = new EnumC11139tG0("SPEED", 0, "speed");
        f42983c = enumC11139tG0;
        EnumC11139tG0 enumC11139tG02 = new EnumC11139tG0("BALANCED", 1, "balanced");
        f42984d = enumC11139tG02;
        EnumC11139tG0 enumC11139tG03 = new EnumC11139tG0("QUALITY", 2, "quality");
        f42985e = enumC11139tG03;
        EnumC11139tG0[] enumC11139tG0Arr = {enumC11139tG0, enumC11139tG02, enumC11139tG03};
        f42986f = enumC11139tG0Arr;
        F02.m2482c(enumC11139tG0Arr);
        f42982b = new OL0(19);
    }

    public EnumC11139tG0(String str, int i, String str2) {
        this.f42987a = str2;
    }

    public static EnumC11139tG0 valueOf(String str) {
        return (EnumC11139tG0) Enum.valueOf(EnumC11139tG0.class, str);
    }

    public static EnumC11139tG0[] values() {
        return (EnumC11139tG0[]) f42986f.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f42987a;
    }
}
