package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* renamed from: h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4067h {
    public Context a;

    public C4067h(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context;
                break;
        }
    }

    public C6221oC a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C6221oC c6221oC = new C6221oC();
        c6221oC.a = YK.a(AbstractC1938Yp1.a);
        C0552Gv0 c0552Gv0 = new C0552Gv0(context);
        c6221oC.b = c0552Gv0;
        c6221oC.c = YK.a(new C0999Mo1(c0552Gv0, new QQ0(c0552Gv0)));
        C0552Gv0 c0552Gv02 = c6221oC.b;
        c6221oC.d = new C7409uQ0(c0552Gv02);
        Provider providerA = YK.a(new C3866fw1(14, c0552Gv02));
        c6221oC.e = providerA;
        Provider providerA2 = YK.a(new C3383dO1(c6221oC.d, providerA, false, 23));
        c6221oC.f = providerA2;
        C7532v32 c7532v32 = new C7532v32(20);
        C0552Gv0 c0552Gv03 = c6221oC.b;
        C1857Xo1 c1857Xo1 = new C1857Xo1(c0552Gv03, providerA2, c7532v32, 23, false);
        Provider provider = c6221oC.a;
        Provider provider2 = c6221oC.c;
        C6045nH c6045nH = new C6045nH();
        c6045nH.a = provider;
        c6045nH.b = provider2;
        c6045nH.c = c1857Xo1;
        c6045nH.d = providerA2;
        c6045nH.e = providerA2;
        c6221oC.g = YK.a(new C6846rT1(c6045nH, new C0593Hj(c0552Gv03, provider2, providerA2, c1857Xo1, provider, providerA2, providerA2, 3), new C6860rY0(provider, providerA2, c1857Xo1, providerA2, 17), 26));
        return c6221oC;
    }
}
