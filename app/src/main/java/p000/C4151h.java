package p000;

import android.content.Context;
import javax.inject.Provider;

/* renamed from: h */
/* loaded from: classes2.dex */
public final class C4151h {

    /* renamed from: a */
    public Context f28143a;

    public C4151h(Context context, int i) {
        switch (i) {
            case 1:
                this.f28143a = context.getApplicationContext();
                break;
            default:
                this.f28143a = context;
                break;
        }
    }

    /* renamed from: a */
    public C6537oC m18679a() {
        Context context = this.f28143a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C6537oC c6537oC = new C6537oC();
        c6537oC.f38869a = C1531YK.m9257a(AbstractC8593Yp1.f14552a);
        C7668Gv0 c7668Gv0 = new C7668Gv0(context);
        c6537oC.f38870b = c7668Gv0;
        c6537oC.f38871c = C1531YK.m9257a(new C7967Mo1(c7668Gv0, new QQ0(c7668Gv0)));
        C7668Gv0 c7668Gv02 = c6537oC.f38870b;
        c6537oC.f38872d = new C11287uQ0(c7668Gv02);
        Provider providerM9257a = C1531YK.m9257a(new C9432fw1(14, c7668Gv02));
        c6537oC.f38873e = providerM9257a;
        Provider providerM9257a2 = C1531YK.m9257a(new C9108dO1(c6537oC.f38872d, providerM9257a, false, 23));
        c6537oC.f38874f = providerM9257a2;
        C11370v32 c11370v32 = new C11370v32(20);
        C7668Gv0 c7668Gv03 = c6537oC.f38870b;
        C8539Xo1 c8539Xo1 = new C8539Xo1(c7668Gv03, providerM9257a2, c11370v32, 23, false);
        Provider provider = c6537oC.f38869a;
        Provider provider2 = c6537oC.f38871c;
        C6479nH c6479nH = new C6479nH();
        c6479nH.f38227a = provider;
        c6479nH.f38228b = provider2;
        c6479nH.f38229c = c8539Xo1;
        c6479nH.f38230d = providerM9257a2;
        c6479nH.f38231e = providerM9257a2;
        c6537oC.f38875g = C1531YK.m9257a(new C10910rT1(c6479nH, new C0487Hj(c7668Gv03, provider2, providerM9257a2, c8539Xo1, provider, providerM9257a2, providerM9257a2, 3), new C10919rY0(provider, providerM9257a2, c8539Xo1, providerM9257a2, 17), 26));
        return c6537oC;
    }
}
