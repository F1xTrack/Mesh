package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4240hu implements InterfaceC0723Ja0 {
    public static final NV1 b;
    public static final EnumC4240hu c;
    public static final EnumC4240hu d;
    public static final EnumC4240hu e;
    public static final EnumC4240hu f;
    public static final EnumC4240hu g;
    public static final EnumC4240hu h;
    public static final EnumC4240hu i;
    public static final EnumC4240hu j;
    public static final EnumC4240hu k;
    public static final EnumC4240hu l;
    public static final EnumC4240hu m;
    public static final EnumC4240hu n;
    public static final EnumC4240hu o;
    public static final EnumC4240hu p;
    public static final /* synthetic */ EnumC4240hu[] q;
    public final String a;

    static {
        EnumC4240hu enumC4240hu = new EnumC4240hu("CODE_128", 0, "code-128");
        c = enumC4240hu;
        EnumC4240hu enumC4240hu2 = new EnumC4240hu("CODE_39", 1, "code-39");
        d = enumC4240hu2;
        EnumC4240hu enumC4240hu3 = new EnumC4240hu("CODE_93", 2, "code-93");
        e = enumC4240hu3;
        EnumC4240hu enumC4240hu4 = new EnumC4240hu("CODABAR", 3, "codabar");
        f = enumC4240hu4;
        EnumC4240hu enumC4240hu5 = new EnumC4240hu("EAN_13", 4, "ean-13");
        g = enumC4240hu5;
        EnumC4240hu enumC4240hu6 = new EnumC4240hu("EAN_8", 5, "ean-8");
        h = enumC4240hu6;
        EnumC4240hu enumC4240hu7 = new EnumC4240hu("ITF", 6, "itf");
        i = enumC4240hu7;
        EnumC4240hu enumC4240hu8 = new EnumC4240hu("UPC_E", 7, "upc-e");
        j = enumC4240hu8;
        EnumC4240hu enumC4240hu9 = new EnumC4240hu("UPC_A", 8, "upc-a");
        k = enumC4240hu9;
        EnumC4240hu enumC4240hu10 = new EnumC4240hu("QR", 9, "qr");
        l = enumC4240hu10;
        EnumC4240hu enumC4240hu11 = new EnumC4240hu("PDF_417", 10, "pdf-417");
        m = enumC4240hu11;
        EnumC4240hu enumC4240hu12 = new EnumC4240hu("AZTEC", 11, "aztec");
        n = enumC4240hu12;
        EnumC4240hu enumC4240hu13 = new EnumC4240hu("DATA_MATRIX", 12, "data-matrix");
        o = enumC4240hu13;
        EnumC4240hu enumC4240hu14 = new EnumC4240hu(GrsBaseInfo.CountryCodeSource.UNKNOWN, 13, "unknown");
        p = enumC4240hu14;
        EnumC4240hu[] enumC4240huArr = {enumC4240hu, enumC4240hu2, enumC4240hu3, enumC4240hu4, enumC4240hu5, enumC4240hu6, enumC4240hu7, enumC4240hu8, enumC4240hu9, enumC4240hu10, enumC4240hu11, enumC4240hu12, enumC4240hu13, enumC4240hu14};
        q = enumC4240huArr;
        F02.c(enumC4240huArr);
        b = new NV1(9);
    }

    public EnumC4240hu(String str, int i2, String str2) {
        this.a = str2;
    }

    public static EnumC4240hu valueOf(String str) {
        return (EnumC4240hu) Enum.valueOf(EnumC4240hu.class, str);
    }

    public static EnumC4240hu[] values() {
        return (EnumC4240hu[]) q.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
