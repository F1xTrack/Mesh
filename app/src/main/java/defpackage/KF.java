package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class KF {
    public static final D60 a;
    public static final D60 b;
    public static final D60 c;
    public static final D60 d;
    public static final D60 e;
    public static final D60 f;
    public static final D60 g;
    public static final D60 h;
    public static final D60 i;
    public static final D60 j;
    public static final D60 k;
    public static final D60 l;
    public static final List m;

    static {
        D60 d60 = new D60("JPEG", "jpeg");
        a = d60;
        D60 d602 = new D60("PNG", "png");
        b = d602;
        D60 d603 = new D60("GIF", "gif");
        c = d603;
        D60 d604 = new D60("BMP", "bmp");
        d = d604;
        D60 d605 = new D60("ICO", "ico");
        e = d605;
        D60 d606 = new D60("WEBP_SIMPLE", "webp");
        f = d606;
        D60 d607 = new D60("WEBP_LOSSLESS", "webp");
        g = d607;
        D60 d608 = new D60("WEBP_EXTENDED", "webp");
        h = d608;
        D60 d609 = new D60("WEBP_EXTENDED_WITH_ALPHA", "webp");
        i = d609;
        D60 d6010 = new D60("WEBP_ANIMATED", "webp");
        j = d6010;
        D60 d6011 = new D60("HEIF", "heif");
        k = d6011;
        l = new D60("DNG", "dng");
        m = AbstractC8259yu.f(d60, d602, d603, d604, d605, d606, d607, d608, d609, d6010, d6011);
    }
}
