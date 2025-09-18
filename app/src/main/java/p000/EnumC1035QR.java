package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: QR */
/* loaded from: classes2.dex */
public final class EnumC1035QR {

    /* renamed from: a */
    public static final EnumC1035QR f9621a;

    /* renamed from: b */
    public static final EnumC1035QR f9622b;

    /* renamed from: c */
    public static final EnumC1035QR f9623c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC1035QR[] f9624d;

    static {
        EnumC1035QR enumC1035QR = new EnumC1035QR("CONFLICTS_ONLY", 0);
        f9621a = enumC1035QR;
        EnumC1035QR enumC1035QR2 = new EnumC1035QR("SUCCESS_ONLY", 1);
        f9622b = enumC1035QR2;
        EnumC1035QR enumC1035QR3 = new EnumC1035QR("BOTH", 2);
        f9623c = enumC1035QR3;
        f9624d = new EnumC1035QR[]{enumC1035QR, enumC1035QR2, enumC1035QR3};
    }

    public static EnumC1035QR valueOf(String str) {
        return (EnumC1035QR) Enum.valueOf(EnumC1035QR.class, str);
    }

    public static EnumC1035QR[] values() {
        return (EnumC1035QR[]) f9624d.clone();
    }
}
