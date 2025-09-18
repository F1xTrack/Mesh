package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.huawei.hms.rn.push.constants.ResultCode;
import com.yandex.metrica.impl.ob.C2744f4;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2916m2<C extends C2744f4> extends Q2<C> {
    private Runnable e;
    private final InterfaceExecutorC3086sn f;

    /* renamed from: com.yandex.metrica.impl.ob.m2$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2916m2.this.d();
        }
    }

    public C2916m2(C c, Zi zi, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        super(c, zi);
        this.e = new a();
        this.f = interfaceExecutorC3086sn;
    }

    @Override // com.yandex.metrica.impl.ob.Q2
    public void c() {
        ((C3061rn) this.f).a(this.e);
    }

    @Override // com.yandex.metrica.impl.ob.Q2
    public void f() {
        super.f();
        C2856jh c2856jhM = e().m();
        if (c2856jhM.G()) {
            String strC = c2856jhM.C();
            if (TextUtils.isEmpty(strC) || ResultCode.ERROR.equals(strC)) {
                return;
            }
            try {
                C2841j2 c2841j2 = new C2841j2(e());
                R1 r1L = P0.i().l();
                if (r1L != null) {
                    r1L.b(c2841j2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void g() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    c();
                    if (e().m().H() > 0) {
                        ((C3061rn) this.f).a(this.e, TimeUnit.SECONDS.toMillis(e().m().H()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
