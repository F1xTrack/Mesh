package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.huawei.hms.p015rn.push.constants.ResultCode;
import com.yandex.metrica.impl.p022ob.C3250f4;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.m2 */
/* loaded from: classes2.dex */
public class C3430m2<C extends C3250f4> extends C2869Q2<C> {

    /* renamed from: e */
    private Runnable f24238e;

    /* renamed from: f */
    private final InterfaceExecutorC3607sn f24239f;

    /* renamed from: com.yandex.metrica.impl.ob.m2$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3430m2.this.m14809d();
        }
    }

    public C3430m2(C c, InterfaceC3109Zi interfaceC3109Zi, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        super(c, interfaceC3109Zi);
        this.f24238e = new a();
        this.f24239f = interfaceExecutorC3607sn;
    }

    @Override // com.yandex.metrica.impl.p022ob.C2869Q2
    /* renamed from: c */
    public void mo14808c() {
        ((C3581rn) this.f24239f).m16703a(this.f24238e);
    }

    @Override // com.yandex.metrica.impl.p022ob.C2869Q2
    /* renamed from: f */
    public void mo14811f() {
        super.mo14811f();
        C3367jh c3367jhM15914m = m14810e().m15914m();
        if (c3367jhM15914m.m16133G()) {
            String strM16129C = c3367jhM15914m.m16129C();
            if (TextUtils.isEmpty(strM16129C) || ResultCode.ERROR.equals(strM16129C)) {
                return;
            }
            try {
                C3352j2 c3352j2 = new C3352j2(m14810e());
                C2892R1 c2892r1M14741l = C2842P0.m14728i().m14741l();
                if (c2892r1M14741l != null) {
                    c2892r1M14741l.m14967b(c3352j2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public void m16423g() {
        synchronized (this.f21967b) {
            try {
                if (!this.f21968c) {
                    mo14808c();
                    if (m14810e().m15914m().m16134H() > 0) {
                        ((C3581rn) this.f24239f).m16704a(this.f24238e, TimeUnit.SECONDS.toMillis(m14810e().m15914m().m16134H()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
