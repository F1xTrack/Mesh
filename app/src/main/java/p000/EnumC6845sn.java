package p000;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sn */
/* loaded from: classes.dex */
public final class EnumC6845sn {

    /* renamed from: a */
    public static final EnumC6845sn f42594a;

    /* renamed from: b */
    public static final EnumC6845sn f42595b;

    /* renamed from: c */
    public static final EnumC6845sn f42596c;

    /* renamed from: d */
    public static final EnumC6845sn f42597d;

    /* renamed from: e */
    public static final EnumC6845sn f42598e;

    /* renamed from: f */
    public static final EnumC6845sn f42599f;

    /* renamed from: g */
    public static final EnumC6845sn f42600g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC6845sn[] f42601h;

    static {
        EnumC6845sn enumC6845sn = new EnumC6845sn(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f42594a = enumC6845sn;
        EnumC6845sn enumC6845sn2 = new EnumC6845sn("INACTIVE", 1);
        f42595b = enumC6845sn2;
        EnumC6845sn enumC6845sn3 = new EnumC6845sn("SCANNING", 2);
        f42596c = enumC6845sn3;
        EnumC6845sn enumC6845sn4 = new EnumC6845sn("PASSIVE_FOCUSED", 3);
        f42597d = enumC6845sn4;
        EnumC6845sn enumC6845sn5 = new EnumC6845sn("PASSIVE_NOT_FOCUSED", 4);
        f42598e = enumC6845sn5;
        EnumC6845sn enumC6845sn6 = new EnumC6845sn("LOCKED_FOCUSED", 5);
        f42599f = enumC6845sn6;
        EnumC6845sn enumC6845sn7 = new EnumC6845sn("LOCKED_NOT_FOCUSED", 6);
        f42600g = enumC6845sn7;
        f42601h = new EnumC6845sn[]{enumC6845sn, enumC6845sn2, enumC6845sn3, enumC6845sn4, enumC6845sn5, enumC6845sn6, enumC6845sn7};
    }

    public static EnumC6845sn valueOf(String str) {
        return (EnumC6845sn) Enum.valueOf(EnumC6845sn.class, str);
    }

    public static EnumC6845sn[] values() {
        return (EnumC6845sn[]) f42601h.clone();
    }
}
