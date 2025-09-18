package defpackage;

import java.nio.charset.Charset;

/* renamed from: vr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7680vr {
    public static final Charset a;
    public static final Charset b;
    public static volatile Charset c;
    public static volatile Charset d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        O90.e(charsetForName, "forName(...)");
        a = charsetForName;
        O90.e(Charset.forName("UTF-16"), "forName(...)");
        O90.e(Charset.forName("UTF-16BE"), "forName(...)");
        O90.e(Charset.forName("UTF-16LE"), "forName(...)");
        O90.e(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        O90.e(charsetForName2, "forName(...)");
        b = charsetForName2;
    }
}
