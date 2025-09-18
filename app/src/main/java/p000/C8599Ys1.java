package p000;

import com.p019vk.push.core.base.AsyncCallback;
import com.p019vk.push.core.domain.model.CallingAppIds;
import kotlin.jvm.functions.Function2;

/* renamed from: Ys1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8599Ys1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public C10962rt1 f14569a;

    /* renamed from: b */
    public String f14570b;

    /* renamed from: c */
    public int f14571c;

    /* renamed from: d */
    public final /* synthetic */ C10962rt1 f14572d;

    /* renamed from: e */
    public final /* synthetic */ CallingAppIds f14573e;

    /* renamed from: f */
    public final /* synthetic */ AsyncCallback f14574f;

    /* renamed from: g */
    public final /* synthetic */ String f14575g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8599Ys1(C10962rt1 c10962rt1, CallingAppIds callingAppIds, AsyncCallback asyncCallback, String str, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f14572d = c10962rt1;
        this.f14573e = callingAppIds;
        this.f14574f = asyncCallback;
        this.f14575g = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C8599Ys1(this.f14572d, this.f14573e, this.f14574f, this.f14575g, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8599Ys1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(1:(9:6|19|(1:24)(1:23)|25|26|33|27|31|32)(2:7|8))(1:9))(2:10|(1:12))|13|(2:15|(1:17)(3:18|19|(3:21|24|25)(0)))|26|33|27|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        r5.error("Is push token exist result by ipc has failed", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r7.f14571c
            rt1 r2 = r7.f14572d
            r3 = 1
            r4 = 0
            com.vk.push.common.Logger r5 = r2.f41949g
            r6 = 2
            if (r1 == 0) goto L29
            if (r1 == r3) goto L21
            if (r1 != r6) goto L19
            java.lang.String r0 = r7.f14570b
            rt1 r2 = r7.f14569a
            p000.RQ1.m7017d(r8)
            goto L57
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            p000.RQ1.m7017d(r8)
            PS0 r8 = (p000.PS0) r8
            java.lang.Object r8 = r8.f9075a
            goto L3e
        L29:
            p000.RQ1.m7017d(r8)
            java.lang.String r8 = "Validating host..."
            com.vk.push.common.Logger.DefaultImpls.info$default(r5, r8, r4, r6, r4)
            bs1 r8 = r2.f41943a
            r7.f14571c = r3
            com.vk.push.core.domain.model.CallingAppIds r1 = r7.f14573e
            java.lang.Object r8 = r8.m10534b(r1, r7)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            boolean r1 = r8 instanceof p000.OS0
            if (r1 != 0) goto L81
            Tf1 r8 = (p000.C8313Tf1) r8
            r7.f14569a = r2
            java.lang.String r8 = r7.f14575g
            r7.f14570b = r8
            r7.f14571c = r6
            Ir1 r1 = r2.f41946d
            java.lang.Object r1 = r1.m4050a(r7)
            if (r1 != r0) goto L55
            return r0
        L55:
            r0 = r8
            r8 = r1
        L57:
            java.lang.String r8 = (java.lang.String) r8
            boolean r1 = p000.AbstractC11374v51.m25328C(r0)
            if (r1 != 0) goto L68
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L68
            com.vk.push.core.push.IsPushTokenExistResult r8 = com.p019vk.push.core.push.IsPushTokenExistResult.EXISTS
            goto L6a
        L68:
            com.vk.push.core.push.IsPushTokenExistResult r8 = com.p019vk.push.core.push.IsPushTokenExistResult.DOES_NOT_EXIST
        L6a:
            com.vk.push.common.Logger r0 = r2.f41949g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Check result: "
            r1.<init>(r2)
            java.lang.String r2 = r8.name()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.vk.push.common.Logger.DefaultImpls.info$default(r0, r1, r4, r6, r4)
        L81:
            com.vk.push.core.base.AidlResult r8 = com.p019vk.push.core.utils.ResultExtensionsKt.toAidlResult(r8)
            com.vk.push.core.base.AsyncCallback r0 = r7.f14574f     // Catch: android.os.RemoteException -> L8b
            r0.onResult(r8)     // Catch: android.os.RemoteException -> L8b
            goto L91
        L8b:
            r8 = move-exception
            java.lang.String r0 = "Is push token exist result by ipc has failed"
            r5.error(r0, r8)
        L91:
            Tf1 r8 = p000.C8313Tf1.f11463a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8599Ys1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
