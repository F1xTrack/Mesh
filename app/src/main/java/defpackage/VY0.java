package defpackage;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class VY0 {
    public final C6518pl0 a;
    public final InterfaceC5908mZ b;
    public final String c;
    public int d;
    public NY0 e;

    public VY0() {
        C6518pl0 c6518pl0 = C6518pl0.i;
        UY0 uy0 = UY0.a;
        this.a = c6518pl0;
        this.b = uy0;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        String string = ((UUID) this.b.invoke()).toString();
        O90.e(string, "uuidGenerator().toString()");
        String lowerCase = D51.m(string, "-", "").toLowerCase(Locale.ROOT);
        O90.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
