package p000;

/* renamed from: CM */
/* loaded from: classes.dex */
public final class C0149CM {

    /* renamed from: c */
    public static final C0149CM f1328c = new C0149CM(0, 0);

    /* renamed from: d */
    public static final C0149CM f1329d = new C0149CM(1, 8);

    /* renamed from: e */
    public static final C0149CM f1330e = new C0149CM(2, 10);

    /* renamed from: f */
    public static final C0149CM f1331f = new C0149CM(3, 10);

    /* renamed from: g */
    public static final C0149CM f1332g = new C0149CM(4, 10);

    /* renamed from: h */
    public static final C0149CM f1333h = new C0149CM(5, 10);

    /* renamed from: i */
    public static final C0149CM f1334i = new C0149CM(6, 10);

    /* renamed from: j */
    public static final C0149CM f1335j = new C0149CM(6, 8);

    /* renamed from: a */
    public final int f1336a;

    /* renamed from: b */
    public final int f1337b;

    public C0149CM(int i, int i2) {
        this.f1336a = i;
        this.f1337b = i2;
    }

    /* renamed from: a */
    public final boolean m1146a() {
        return m1147b() && this.f1336a != 1 && this.f1337b == 10;
    }

    /* renamed from: b */
    public final boolean m1147b() {
        int i = this.f1336a;
        return (i == 0 || i == 2 || this.f1337b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0149CM)) {
            return false;
        }
        C0149CM c0149cm = (C0149CM) obj;
        return this.f1336a == c0149cm.f1336a && this.f1337b == c0149cm.f1337b;
    }

    public final int hashCode() {
        return ((this.f1336a ^ 1000003) * 1000003) ^ this.f1337b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f1336a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return AbstractC1374Vq.m8591j(sb, this.f1337b, "}");
    }
}
