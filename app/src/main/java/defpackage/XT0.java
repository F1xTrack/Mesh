package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.push.common.Logger;
import com.vk.push.core.base.DelayedAction;

/* loaded from: classes2.dex */
public abstract class XT0 extends Service {
    public static final /* synthetic */ int j = 0;
    public final F71 a = LB.b(TT.F);
    public final F71 b = LB.b(TT.E);
    public final F71 c = LB.b(TT.I);
    public final C1339Qy d;
    public final F71 e;
    public final F71 f;
    public volatile int g;
    public final F71 h;
    public final F71 i;

    public XT0() {
        GK gk = GK.a;
        this.d = AbstractC7625vY1.a(QF.c);
        this.e = LB.b(new VT0(this, 0));
        this.f = LB.b(TT.H);
        this.h = LB.b(TT.G);
        this.i = LB.b(new VT0(this, 2));
    }

    public final Logger a() {
        return (Logger) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.C6930rv1 r8, defpackage.AbstractC1963Yy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.UT0
            if (r0 == 0) goto L13
            r0 = r9
            UT0 r0 = (defpackage.UT0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            UT0 r0 = new UT0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            XT0 r8 = r0.a
            defpackage.RQ1.d(r9)
            goto L97
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            rv1 r8 = r0.b
            XT0 r2 = r0.a
            defpackage.RQ1.d(r9)
            goto L5f
        L3d:
            defpackage.RQ1.d(r9)
            com.vk.push.common.Logger r9 = r7.a()
            java.lang.String r2 = "Sending token to client via onNewToken method"
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r2, r5, r4, r5)
            F71 r9 = r7.c
            java.lang.Object r9 = r9.getValue()
            Ir1 r9 = (defpackage.C0697Ir1) r9
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r1) goto L5e
            return r1
        L5e:
            r2 = r7
        L5f:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r3 = r8.a
            boolean r9 = defpackage.O90.a(r9, r3)
            if (r9 != 0) goto La1
            r9 = r2
            com.rustorepush.RustorePushService r9 = (com.rustorepush.RustorePushService) r9
            r9.getClass()
            java.lang.String r8 = r8.a
            java.lang.String r3 = "token"
            defpackage.O90.f(r8, r3)
            android.os.Handler r9 = r9.k
            qU0 r3 = new qU0
            r6 = 0
            r3.<init>(r8, r6)
            r9.post(r3)
            F71 r9 = r2.c
            java.lang.Object r9 = r9.getValue()
            Ir1 r9 = (defpackage.C0697Ir1) r9
            r0.a = r2
            r0.b = r5
            r0.e = r4
            java.lang.Object r8 = r9.c(r8, r0)
            if (r8 != r1) goto L96
            return r1
        L96:
            r8 = r2
        L97:
            com.vk.push.common.Logger r8 = r8.a()
            java.lang.String r9 = "Sending token successful"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r9, r5, r4, r5)
            goto Laa
        La1:
            com.vk.push.common.Logger r8 = r2.a()
            java.lang.String r9 = "This token has already been sent to client earlier"
            com.vk.push.common.Logger.DefaultImpls.warn$default(r8, r9, r5, r4, r5)
        Laa:
            Tf1 r8 = defpackage.C1518Tf1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XT0.b(rv1, Yy):java.lang.Object");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        O90.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return new BinderC3863fv1(this.f, this.e, this.h);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (C3759fN.f) {
            AbstractC3767fP1.b(this.d, null, new WT0(this, null), 3);
        }
        ((DelayedAction) this.i.getValue()).runWithDelay(20000L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (C3759fN.f) {
            Logger.DefaultImpls.info$default(a(), "Service is destroying", null, 2, null);
            AbstractC7625vY1.b(this.d, null);
            ((C6924rt1) this.e.getValue()).onDestroy();
            ((C8071xu1) this.f.getValue()).onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.g = i2;
        return 3;
    }
}
