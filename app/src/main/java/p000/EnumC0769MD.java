package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: MD */
/* loaded from: classes.dex */
public final class EnumC0769MD {

    /* renamed from: a */
    public static final EnumC0769MD f7034a;

    /* renamed from: b */
    public static final EnumC0769MD f7035b;

    /* renamed from: c */
    public static final EnumC0769MD f7036c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC0769MD[] f7037d;

    static {
        EnumC0769MD enumC0769MD = new EnumC0769MD("PREFER_ARGB_8888", 0);
        f7034a = enumC0769MD;
        EnumC0769MD enumC0769MD2 = new EnumC0769MD("PREFER_RGB_565", 1);
        f7035b = enumC0769MD2;
        f7037d = new EnumC0769MD[]{enumC0769MD, enumC0769MD2};
        f7036c = enumC0769MD;
    }

    public static EnumC0769MD valueOf(String str) {
        return (EnumC0769MD) Enum.valueOf(EnumC0769MD.class, str);
    }

    public static EnumC0769MD[] values() {
        return (EnumC0769MD[]) f7037d.clone();
    }
}
