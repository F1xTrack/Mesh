package p000;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tn */
/* loaded from: classes.dex */
public final class EnumC6908tn {

    /* renamed from: a */
    public static final EnumC6908tn f43251a;

    /* renamed from: b */
    public static final EnumC6908tn f43252b;

    /* renamed from: c */
    public static final EnumC6908tn f43253c;

    /* renamed from: d */
    public static final EnumC6908tn f43254d;

    /* renamed from: e */
    public static final EnumC6908tn f43255e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC6908tn[] f43256f;

    static {
        EnumC6908tn enumC6908tn = new EnumC6908tn(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f43251a = enumC6908tn;
        EnumC6908tn enumC6908tn2 = new EnumC6908tn("INACTIVE", 1);
        f43252b = enumC6908tn2;
        EnumC6908tn enumC6908tn3 = new EnumC6908tn("METERING", 2);
        f43253c = enumC6908tn3;
        EnumC6908tn enumC6908tn4 = new EnumC6908tn("CONVERGED", 3);
        f43254d = enumC6908tn4;
        EnumC6908tn enumC6908tn5 = new EnumC6908tn("LOCKED", 4);
        f43255e = enumC6908tn5;
        f43256f = new EnumC6908tn[]{enumC6908tn, enumC6908tn2, enumC6908tn3, enumC6908tn4, enumC6908tn5};
    }

    public static EnumC6908tn valueOf(String str) {
        return (EnumC6908tn) Enum.valueOf(EnumC6908tn.class, str);
    }

    public static EnumC6908tn[] values() {
        return (EnumC6908tn[]) f43256f.clone();
    }
}
