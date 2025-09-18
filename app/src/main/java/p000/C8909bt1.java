package p000;

import com.p019vk.push.core.base.AsyncCallback;
import com.p019vk.push.core.domain.model.CallingAppIds;
import kotlin.jvm.functions.Function2;

/* renamed from: bt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8909bt1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f17210a;

    /* renamed from: b */
    public final /* synthetic */ C10962rt1 f17211b;

    /* renamed from: c */
    public final /* synthetic */ CallingAppIds f17212c;

    /* renamed from: d */
    public final /* synthetic */ AsyncCallback f17213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8909bt1(C10962rt1 c10962rt1, CallingAppIds callingAppIds, AsyncCallback asyncCallback, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f17211b = c10962rt1;
        this.f17212c = callingAppIds;
        this.f17213d = asyncCallback;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C8909bt1(this.f17211b, this.f17212c, this.f17213d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8909bt1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(8:6|18|19|(1:21)(1:22)|29|23|27|28)(2:7|8))(1:9))(2:10|(1:12))|13|(3:15|(1:17)|18)|19|(0)(0)|29|23|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r6.error("On delete messages result by ipc has failed", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r7.f17210a
            rt1 r2 = r7.f17211b
            r3 = 1
            r4 = 2
            r5 = 0
            com.vk.push.common.Logger r6 = r2.f41949g
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r4) goto L15
            p000.RQ1.m7017d(r8)
            goto L4e
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            p000.RQ1.m7017d(r8)
            PS0 r8 = (p000.PS0) r8
            java.lang.Object r8 = r8.f9075a
            goto L3a
        L25:
            p000.RQ1.m7017d(r8)
            java.lang.String r8 = "Validating host..."
            com.vk.push.common.Logger.DefaultImpls.info$default(r6, r8, r5, r4, r5)
            bs1 r8 = r2.f41943a
            r7.f17210a = r3
            com.vk.push.core.domain.model.CallingAppIds r1 = r7.f17212c
            java.lang.Object r8 = r8.m10534b(r1, r7)
            if (r8 != r0) goto L3a
            return r0
        L3a:
            boolean r1 = r8 instanceof p000.OS0
            if (r1 != 0) goto L50
            Tf1 r8 = (p000.C8313Tf1) r8
            java.lang.String r8 = "Calling onDeleteMessages..."
            com.vk.push.common.Logger.DefaultImpls.info$default(r6, r8, r5, r4, r5)
            r7.f17210a = r4
            java.lang.Enum r8 = p000.C10962rt1.m24491a(r2, r7)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            com.vk.push.core.push.OnDeleteMessagesResult r8 = (com.p019vk.push.core.push.OnDeleteMessagesResult) r8
        L50:
            com.vk.push.core.base.AidlResult r8 = com.p019vk.push.core.utils.ResultExtensionsKt.toAidlResult(r8)
            boolean r0 = r8.isSuccess()
            if (r0 == 0) goto L60
            java.lang.String r0 = "On delete messages has successfully finished"
            com.vk.push.common.Logger.DefaultImpls.info$default(r6, r0, r5, r4, r5)
            goto L69
        L60:
            java.lang.Exception r0 = r8.exceptionOrNull()
            java.lang.String r1 = "On delete messages has failed"
            r6.error(r1, r0)
        L69:
            com.vk.push.core.base.AsyncCallback r0 = r7.f17213d     // Catch: android.os.RemoteException -> L6f
            r0.onResult(r8)     // Catch: android.os.RemoteException -> L6f
            goto L75
        L6f:
            r8 = move-exception
            java.lang.String r0 = "On delete messages result by ipc has failed"
            r6.error(r0, r8)
        L75:
            Tf1 r8 = p000.C8313Tf1.f11463a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8909bt1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
