package defpackage;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;
import kotlin.jvm.functions.Function2;

/* renamed from: Ys1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1947Ys1 extends AbstractC4286i71 implements Function2 {
    public C6924rt1 a;
    public String b;
    public int c;
    public final /* synthetic */ C6924rt1 d;
    public final /* synthetic */ CallingAppIds e;
    public final /* synthetic */ AsyncCallback f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1947Ys1(C6924rt1 c6924rt1, CallingAppIds callingAppIds, AsyncCallback asyncCallback, String str, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.d = c6924rt1;
        this.e = callingAppIds;
        this.f = asyncCallback;
        this.g = str;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C1947Ys1(this.d, this.e, this.f, this.g, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1947Ys1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(1:(9:6|19|(1:24)(1:23)|25|26|33|27|31|32)(2:7|8))(1:9))(2:10|(1:12))|13|(2:15|(1:17)(3:18|19|(3:21|24|25)(0)))|26|33|27|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        r5.error("Is push token exist result by ipc has failed", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r7.c
            rt1 r2 = r7.d
            r3 = 1
            r4 = 0
            com.vk.push.common.Logger r5 = r2.g
            r6 = 2
            if (r1 == 0) goto L29
            if (r1 == r3) goto L21
            if (r1 != r6) goto L19
            java.lang.String r0 = r7.b
            rt1 r2 = r7.a
            defpackage.RQ1.d(r8)
            goto L57
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            defpackage.RQ1.d(r8)
            PS0 r8 = (defpackage.PS0) r8
            java.lang.Object r8 = r8.a
            goto L3e
        L29:
            defpackage.RQ1.d(r8)
            java.lang.String r8 = "Validating host..."
            com.vk.push.common.Logger.DefaultImpls.info$default(r5, r8, r4, r6, r4)
            bs1 r8 = r2.a
            r7.c = r3
            com.vk.push.core.domain.model.CallingAppIds r1 = r7.e
            java.lang.Object r8 = r8.b(r1, r7)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            boolean r1 = r8 instanceof defpackage.OS0
            if (r1 != 0) goto L81
            Tf1 r8 = (defpackage.C1518Tf1) r8
            r7.a = r2
            java.lang.String r8 = r7.g
            r7.b = r8
            r7.c = r6
            Ir1 r1 = r2.d
            java.lang.Object r1 = r1.a(r7)
            if (r1 != r0) goto L55
            return r0
        L55:
            r0 = r8
            r8 = r1
        L57:
            java.lang.String r8 = (java.lang.String) r8
            boolean r1 = defpackage.AbstractC7538v51.C(r0)
            if (r1 != 0) goto L68
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L68
            com.vk.push.core.push.IsPushTokenExistResult r8 = com.vk.push.core.push.IsPushTokenExistResult.EXISTS
            goto L6a
        L68:
            com.vk.push.core.push.IsPushTokenExistResult r8 = com.vk.push.core.push.IsPushTokenExistResult.DOES_NOT_EXIST
        L6a:
            com.vk.push.common.Logger r0 = r2.g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Check result: "
            r1.<init>(r2)
            java.lang.String r2 = r8.name()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.vk.push.common.Logger.DefaultImpls.info$default(r0, r1, r4, r6, r4)
        L81:
            com.vk.push.core.base.AidlResult r8 = com.vk.push.core.utils.ResultExtensionsKt.toAidlResult(r8)
            com.vk.push.core.base.AsyncCallback r0 = r7.f     // Catch: android.os.RemoteException -> L8b
            r0.onResult(r8)     // Catch: android.os.RemoteException -> L8b
            goto L91
        L8b:
            r8 = move-exception
            java.lang.String r0 = "Is push token exist result by ipc has failed"
            r5.error(r0, r8)
        L91:
            Tf1 r8 = defpackage.C1518Tf1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1947Ys1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
