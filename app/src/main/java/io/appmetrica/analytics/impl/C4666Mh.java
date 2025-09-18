package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Mh */
/* loaded from: classes2.dex */
public final class C4666Mh extends C5206im {

    /* renamed from: e */
    public final RunnableC4642Lh f30484e;

    /* renamed from: f */
    public final ICommonExecutor f30485f;

    public C4666Mh(C5139g5 c5139g5, InterfaceC4645Lk interfaceC4645Lk, ICommonExecutor iCommonExecutor) {
        super(c5139g5, interfaceC4645Lk);
        this.f30484e = new RunnableC4642Lh(this);
        this.f30485f = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C5206im
    /* renamed from: a */
    public final void mo19639a() {
        this.f30485f.remove(this.f30484e);
    }

    @Override // io.appmetrica.analytics.impl.C5206im
    /* renamed from: f */
    public final void mo19640f() {
        this.f31951d.mo19601a();
        C4473Eg c4473Eg = (C4473Eg) ((C5139g5) this.f31948a).f31733l.m21113a();
        if (c4473Eg.f30088l.mo19204a(c4473Eg.f30087k)) {
            String str = c4473Eg.f30090n;
            if (TextUtils.isEmpty(str) || ResultCode.ERROR.equals(str)) {
                return;
            }
            try {
                NetworkTask networkTaskM20956a = C5397qd.m20956a((C5139g5) this.f31948a);
                C5244ka.f32038C.getClass();
                NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskM20956a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public final void m19641g() {
        synchronized (this.f31949b) {
            try {
                if (!this.f31950c) {
                    this.f30485f.remove(this.f30484e);
                    m19642h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void m19642h() {
        if (((C4473Eg) ((C5139g5) this.f31948a).f31733l.m21113a()).f30084h > 0) {
            this.f30485f.executeDelayed(this.f30484e, TimeUnit.SECONDS.toMillis(((C4473Eg) ((C5139g5) this.f31948a).f31733l.m21113a()).f30084h));
        }
    }
}
