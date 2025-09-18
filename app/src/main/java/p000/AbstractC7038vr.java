package p000;

import java.nio.charset.Charset;

/* renamed from: vr */
/* loaded from: classes2.dex */
public abstract class AbstractC7038vr {

    /* renamed from: a */
    public static final Charset f44561a;

    /* renamed from: b */
    public static final Charset f44562b;

    /* renamed from: c */
    public static volatile Charset f44563c;

    /* renamed from: d */
    public static volatile Charset f44564d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        O90.m5967e(charsetForName, "forName(...)");
        f44561a = charsetForName;
        O90.m5967e(Charset.forName("UTF-16"), "forName(...)");
        O90.m5967e(Charset.forName("UTF-16BE"), "forName(...)");
        O90.m5967e(Charset.forName("UTF-16LE"), "forName(...)");
        O90.m5967e(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        O90.m5967e(charsetForName2, "forName(...)");
        f44562b = charsetForName2;
    }
}
