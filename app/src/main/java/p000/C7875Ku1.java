package p000;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.functions.Function2;

/* renamed from: Ku1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7875Ku1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public Bundle f6383a;

    /* renamed from: b */
    public String f6384b;

    /* renamed from: c */
    public int f6385c;

    /* renamed from: d */
    public final /* synthetic */ Activity f6386d;

    /* renamed from: e */
    public final /* synthetic */ C10454nv1 f6387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7875Ku1(Activity activity, C10454nv1 c10454nv1, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f6386d = activity;
        this.f6387e = c10454nv1;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7875Ku1(this.f6386d, this.f6387e, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C7875Ku1(this.f6386d, this.f6387e, (InterfaceC1382Vy) obj2).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            Mz r2 = p000.EnumC0817Mz.f7418a
            int r3 = r11.f6385c
            Tf1 r4 = p000.C8313Tf1.f11463a
            r5 = 4
            r6 = 3
            nv1 r7 = r11.f6387e
            r8 = 0
            if (r3 == 0) goto L3d
            if (r3 == r1) goto L35
            if (r3 == r0) goto L2d
            if (r3 == r6) goto L24
            if (r3 != r5) goto L1c
            p000.RQ1.m7017d(r12)
            goto Lc5
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            java.lang.String r1 = r11.f6384b
            android.os.Bundle r3 = r11.f6383a
            p000.RQ1.m7017d(r12)
            goto La9
        L2d:
            java.lang.String r1 = r11.f6384b
            android.os.Bundle r3 = r11.f6383a
            p000.RQ1.m7017d(r12)
            goto L90
        L35:
            java.lang.String r3 = r11.f6384b
            android.os.Bundle r9 = r11.f6383a
            p000.RQ1.m7017d(r12)
            goto L6f
        L3d:
            p000.RQ1.m7017d(r12)
            android.app.Activity r12 = r11.f6386d
            android.content.Intent r12 = r12.getIntent()
            if (r12 != 0) goto L49
            return r4
        L49:
            android.os.Bundle r9 = r12.getExtras()
            if (r9 != 0) goto L50
            return r4
        L50:
            java.lang.String r12 = r12.getAction()
            if (r12 != 0) goto L58
            java.lang.String r12 = ""
        L58:
            r3 = r12
            r11.f6383a = r9
            r11.f6384b = r3
            r11.f6385c = r1
            GK r12 = p000.C0399GK.f3694a
            y20 r12 = p000.AbstractC7702Hm0.f4486a
            Iq1 r10 = new Iq1
            r10.<init>(r9, r8, r0)
            java.lang.Object r12 = p000.AbstractC9366fP1.m18233e(r12, r10, r11)
            if (r12 != r2) goto L6f
            return r2
        L6f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L78
            return r4
        L78:
            r11.f6383a = r9
            r11.f6384b = r3
            r11.f6385c = r0
            GK r12 = p000.C0399GK.f3694a
            y20 r12 = p000.AbstractC7702Hm0.f4486a
            Iq1 r10 = new Iq1
            r10.<init>(r9, r8, r1)
            java.lang.Object r12 = p000.AbstractC9366fP1.m18233e(r12, r10, r11)
            if (r12 != r2) goto L8e
            return r2
        L8e:
            r1 = r3
            r3 = r9
        L90:
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto Lbe
            Cu1 r9 = r7.f38608b
            int r12 = r12.intValue()
            r11.f6383a = r3
            r11.f6384b = r1
            r11.f6385c = r6
            Uv1 r6 = r9.f1751a
            java.lang.Object r12 = r6.m8201a(r12, r11)
            if (r12 != r2) goto La9
            return r2
        La9:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lbe
            r11.f6383a = r8
            r11.f6384b = r8
            r11.f6385c = r5
            java.lang.Object r12 = p000.C10454nv1.m23280a(r7, r3, r1, r11)
            if (r12 != r2) goto Lc5
            return r2
        Lbe:
            com.vk.push.common.Logger r12 = r7.f38612f
            java.lang.String r1 = "clickSDKNotificationEvent skipped"
            com.vk.push.common.Logger.DefaultImpls.info$default(r12, r1, r8, r0, r8)
        Lc5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7875Ku1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
