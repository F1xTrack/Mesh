package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.base.DelayedAction;

/* loaded from: classes2.dex */
public abstract class XT0 extends Service {

    /* renamed from: j */
    public static final /* synthetic */ int f13801j = 0;

    /* renamed from: a */
    public final F71 f13802a = AbstractC0705LB.m4915b(C1225TT.f11366F);

    /* renamed from: b */
    public final F71 f13803b = AbstractC0705LB.m4915b(C1225TT.f11365E);

    /* renamed from: c */
    public final F71 f13804c = AbstractC0705LB.m4915b(C1225TT.f11369I);

    /* renamed from: d */
    public final C1068Qy f13805d;

    /* renamed from: e */
    public final F71 f13806e;

    /* renamed from: f */
    public final F71 f13807f;

    /* renamed from: g */
    public volatile int f13808g;

    /* renamed from: h */
    public final F71 f13809h;

    /* renamed from: i */
    public final F71 f13810i;

    public XT0() {
        C0399GK c0399gk = C0399GK.f3694a;
        this.f13805d = AbstractC11432vY1.m25444a(ExecutorC1023QF.f9548c);
        this.f13806e = AbstractC0705LB.m4915b(new VT0(this, 0));
        this.f13807f = AbstractC0705LB.m4915b(C1225TT.f11368H);
        this.f13809h = AbstractC0705LB.m4915b(C1225TT.f11367G);
        this.f13810i = AbstractC0705LB.m4915b(new VT0(this, 2));
    }

    /* renamed from: a */
    public final Logger m9054a() {
        return (Logger) this.f13809h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m9055b(p000.C10966rv1 r8, p000.AbstractC1571Yy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p000.UT0
            if (r0 == 0) goto L13
            r0 = r9
            UT0 r0 = (p000.UT0) r0
            int r1 = r0.f11803e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11803e = r1
            goto L18
        L13:
            UT0 r0 = new UT0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f11801c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f11803e
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            XT0 r8 = r0.f11799a
            p000.RQ1.m7017d(r9)
            goto L97
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            rv1 r8 = r0.f11800b
            XT0 r2 = r0.f11799a
            p000.RQ1.m7017d(r9)
            goto L5f
        L3d:
            p000.RQ1.m7017d(r9)
            com.vk.push.common.Logger r9 = r7.m9054a()
            java.lang.String r2 = "Sending token to client via onNewToken method"
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r2, r5, r4, r5)
            F71 r9 = r7.f13804c
            java.lang.Object r9 = r9.getValue()
            Ir1 r9 = (p000.C7765Ir1) r9
            r0.f11799a = r7
            r0.f11800b = r8
            r0.f11803e = r3
            java.lang.Object r9 = r9.m4053d(r0)
            if (r9 != r1) goto L5e
            return r1
        L5e:
            r2 = r7
        L5f:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r3 = r8.f42158a
            boolean r9 = p000.O90.m5963a(r9, r3)
            if (r9 != 0) goto La1
            r9 = r2
            com.rustorepush.RustorePushService r9 = (com.rustorepush.RustorePushService) r9
            r9.getClass()
            java.lang.String r8 = r8.f42158a
            java.lang.String r3 = "token"
            p000.O90.m5968f(r8, r3)
            android.os.Handler r9 = r9.f20247k
            qU0 r3 = new qU0
            r6 = 0
            r3.<init>(r8, r6)
            r9.post(r3)
            F71 r9 = r2.f13804c
            java.lang.Object r9 = r9.getValue()
            Ir1 r9 = (p000.C7765Ir1) r9
            r0.f11799a = r2
            r0.f11800b = r5
            r0.f11803e = r4
            java.lang.Object r8 = r9.m4052c(r8, r0)
            if (r8 != r1) goto L96
            return r1
        L96:
            r8 = r2
        L97:
            com.vk.push.common.Logger r8 = r8.m9054a()
            java.lang.String r9 = "Sending token successful"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r9, r5, r4, r5)
            goto Laa
        La1:
            com.vk.push.common.Logger r8 = r2.m9054a()
            java.lang.String r9 = "This token has already been sent to client earlier"
            com.vk.push.common.Logger.DefaultImpls.warn$default(r8, r9, r5, r4, r5)
        Laa:
            Tf1 r8 = p000.C8313Tf1.f11463a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.XT0.m9055b(rv1, Yy):java.lang.Object");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return new BinderC9430fv1(this.f13807f, this.f13806e, this.f13809h);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (C4049fN.f27161f) {
            AbstractC9366fP1.m18230b(this.f13805d, null, new WT0(this, null), 3);
        }
        ((DelayedAction) this.f13810i.getValue()).runWithDelay(20000L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (C4049fN.f27161f) {
            Logger.DefaultImpls.info$default(m9054a(), "Service is destroying", null, 2, null);
            AbstractC11432vY1.m25445b(this.f13805d, null);
            ((C10962rt1) this.f13806e.getValue()).onDestroy();
            ((C11730xu1) this.f13807f.getValue()).onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f13808g = i2;
        return 3;
    }
}
