package p000;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class VY0 {

    /* renamed from: a */
    public final C10689pl0 f12614a;

    /* renamed from: b */
    public final InterfaceC6434mZ f12615b;

    /* renamed from: c */
    public final String f12616c;

    /* renamed from: d */
    public int f12617d;

    /* renamed from: e */
    public NY0 f12618e;

    public VY0() {
        C10689pl0 c10689pl0 = C10689pl0.f40372i;
        UY0 uy0 = UY0.f11902a;
        this.f12614a = c10689pl0;
        this.f12615b = uy0;
        this.f12616c = m8506a();
        this.f12617d = -1;
    }

    /* renamed from: a */
    public final String m8506a() {
        String string = ((UUID) this.f12615b.invoke()).toString();
        O90.m5967e(string, "uuidGenerator().toString()");
        String lowerCase = D51.m1554m(string, "-", "").toLowerCase(Locale.ROOT);
        O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
