package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Wc;

/* renamed from: com.yandex.metrica.impl.ob.zd */
/* loaded from: classes2.dex */
class C3256zd extends AbstractC2690d0 {
    private B8 b;
    private Cc c;
    private Nm d;
    private final M e;
    private final E f;

    public C3256zd(AbstractC2690d0 abstractC2690d0, B8 b8, Cc cc, Nm nm, M m, E e) {
        super(abstractC2690d0);
        this.b = b8;
        this.c = cc;
        this.d = nm;
        this.e = m;
        this.f = e;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2690d0
    public void b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            Wc.a aVarA = Wc.a.a(this.f.c());
            this.d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.d.getClass();
            C3002pd c3002pd = new C3002pd(aVarA, jCurrentTimeMillis, SystemClock.elapsedRealtime(), location, this.e.b(), null);
            String strA = this.c.a(c3002pd);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.b.a(c3002pd.e(), strA);
        }
    }
}
