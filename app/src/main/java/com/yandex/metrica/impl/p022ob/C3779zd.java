package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3028Wc;

/* renamed from: com.yandex.metrica.impl.ob.zd */
/* loaded from: classes2.dex */
class C3779zd extends AbstractC3194d0 {

    /* renamed from: b */
    private C2500B8 f25418b;

    /* renamed from: c */
    private C2529Cc f25419c;

    /* renamed from: d */
    private C2814Nm f25420d;

    /* renamed from: e */
    private final C2766M f25421e;

    /* renamed from: f */
    private final C2566E f25422f;

    public C3779zd(AbstractC3194d0 abstractC3194d0, C2500B8 c2500b8, C2529Cc c2529Cc, C2814Nm c2814Nm, C2766M c2766m, C2566E c2566e) {
        super(abstractC3194d0);
        this.f25418b = c2500b8;
        this.f25419c = c2529Cc;
        this.f25420d = c2814Nm;
        this.f25421e = c2766m;
        this.f25422f = c2566e;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3194d0
    /* renamed from: b */
    public void mo14130b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            C3028Wc.a aVarM15386a = C3028Wc.a.m15386a(this.f25422f.m14023c());
            this.f25420d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f25420d.getClass();
            C3519pd c3519pd = new C3519pd(aVarM15386a, jCurrentTimeMillis, SystemClock.elapsedRealtime(), location, this.f25421e.m14566b(), null);
            String strM13964a = this.f25419c.m13964a(c3519pd);
            if (TextUtils.isEmpty(strM13964a)) {
                return;
            }
            this.f25418b.m16677a(c3519pd.m16579e(), strM13964a);
        }
    }
}
