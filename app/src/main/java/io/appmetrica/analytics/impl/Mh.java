package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.huawei.hms.rn.push.constants.ResultCode;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Mh extends C4631im {
    public final Lh e;
    public final ICommonExecutor f;

    public Mh(C4567g5 c4567g5, Lk lk, ICommonExecutor iCommonExecutor) {
        super(c4567g5, lk);
        this.e = new Lh(this);
        this.f = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C4631im
    public final void a() {
        this.f.remove(this.e);
    }

    @Override // io.appmetrica.analytics.impl.C4631im
    public final void f() {
        this.d.a();
        Eg eg = (Eg) ((C4567g5) this.a).l.a();
        if (eg.l.a(eg.k)) {
            String str = eg.n;
            if (TextUtils.isEmpty(str) || ResultCode.ERROR.equals(str)) {
                return;
            }
            try {
                NetworkTask networkTaskA = C4814qd.a((C4567g5) this.a);
                C4667ka.C.getClass();
                NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskA);
            } catch (Throwable unused) {
            }
        }
    }

    public final void g() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    this.f.remove(this.e);
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        if (((Eg) ((C4567g5) this.a).l.a()).h > 0) {
            this.f.executeDelayed(this.e, TimeUnit.SECONDS.toMillis(((Eg) ((C4567g5) this.a).l.a()).h));
        }
    }
}
