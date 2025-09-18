package p000;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hu */
/* loaded from: classes2.dex */
public final class EnumC4208hu implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final NV1 f28652b;

    /* renamed from: c */
    public static final EnumC4208hu f28653c;

    /* renamed from: d */
    public static final EnumC4208hu f28654d;

    /* renamed from: e */
    public static final EnumC4208hu f28655e;

    /* renamed from: f */
    public static final EnumC4208hu f28656f;

    /* renamed from: g */
    public static final EnumC4208hu f28657g;

    /* renamed from: h */
    public static final EnumC4208hu f28658h;

    /* renamed from: i */
    public static final EnumC4208hu f28659i;

    /* renamed from: j */
    public static final EnumC4208hu f28660j;

    /* renamed from: k */
    public static final EnumC4208hu f28661k;

    /* renamed from: l */
    public static final EnumC4208hu f28662l;

    /* renamed from: m */
    public static final EnumC4208hu f28663m;

    /* renamed from: n */
    public static final EnumC4208hu f28664n;

    /* renamed from: o */
    public static final EnumC4208hu f28665o;

    /* renamed from: p */
    public static final EnumC4208hu f28666p;

    /* renamed from: q */
    public static final /* synthetic */ EnumC4208hu[] f28667q;

    /* renamed from: a */
    public final String f28668a;

    static {
        EnumC4208hu enumC4208hu = new EnumC4208hu("CODE_128", 0, "code-128");
        f28653c = enumC4208hu;
        EnumC4208hu enumC4208hu2 = new EnumC4208hu("CODE_39", 1, "code-39");
        f28654d = enumC4208hu2;
        EnumC4208hu enumC4208hu3 = new EnumC4208hu("CODE_93", 2, "code-93");
        f28655e = enumC4208hu3;
        EnumC4208hu enumC4208hu4 = new EnumC4208hu("CODABAR", 3, "codabar");
        f28656f = enumC4208hu4;
        EnumC4208hu enumC4208hu5 = new EnumC4208hu("EAN_13", 4, "ean-13");
        f28657g = enumC4208hu5;
        EnumC4208hu enumC4208hu6 = new EnumC4208hu("EAN_8", 5, "ean-8");
        f28658h = enumC4208hu6;
        EnumC4208hu enumC4208hu7 = new EnumC4208hu("ITF", 6, "itf");
        f28659i = enumC4208hu7;
        EnumC4208hu enumC4208hu8 = new EnumC4208hu("UPC_E", 7, "upc-e");
        f28660j = enumC4208hu8;
        EnumC4208hu enumC4208hu9 = new EnumC4208hu("UPC_A", 8, "upc-a");
        f28661k = enumC4208hu9;
        EnumC4208hu enumC4208hu10 = new EnumC4208hu("QR", 9, "qr");
        f28662l = enumC4208hu10;
        EnumC4208hu enumC4208hu11 = new EnumC4208hu("PDF_417", 10, "pdf-417");
        f28663m = enumC4208hu11;
        EnumC4208hu enumC4208hu12 = new EnumC4208hu("AZTEC", 11, "aztec");
        f28664n = enumC4208hu12;
        EnumC4208hu enumC4208hu13 = new EnumC4208hu("DATA_MATRIX", 12, "data-matrix");
        f28665o = enumC4208hu13;
        EnumC4208hu enumC4208hu14 = new EnumC4208hu(GrsBaseInfo.CountryCodeSource.UNKNOWN, 13, "unknown");
        f28666p = enumC4208hu14;
        EnumC4208hu[] enumC4208huArr = {enumC4208hu, enumC4208hu2, enumC4208hu3, enumC4208hu4, enumC4208hu5, enumC4208hu6, enumC4208hu7, enumC4208hu8, enumC4208hu9, enumC4208hu10, enumC4208hu11, enumC4208hu12, enumC4208hu13, enumC4208hu14};
        f28667q = enumC4208huArr;
        F02.m2482c(enumC4208huArr);
        f28652b = new NV1(9);
    }

    public EnumC4208hu(String str, int i, String str2) {
        this.f28668a = str2;
    }

    public static EnumC4208hu valueOf(String str) {
        return (EnumC4208hu) Enum.valueOf(EnumC4208hu.class, str);
    }

    public static EnumC4208hu[] values() {
        return (EnumC4208hu[]) f28667q.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f28668a;
    }
}
