package defpackage;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: uu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7500uu1 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C8071xu1 b;
    public final /* synthetic */ CallingAppIds c;
    public final /* synthetic */ AsyncCallback d;
    public final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7500uu1(C8071xu1 c8071xu1, CallingAppIds callingAppIds, AsyncCallback asyncCallback, List list, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c8071xu1;
        this.c = callingAppIds;
        this.d = asyncCallback;
        this.e = list;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C7500uu1(this.b, this.c, this.d, this.e, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7500uu1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(1:(1:(11:6|18|19|(1:21)|22|(1:24)|25|32|26|30|31)(2:7|8))(1:9))(2:10|(1:12))|13|(3:15|(1:17)|18)|19|(0)|22|(0)|25|32|26|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        ((com.vk.push.common.Logger) r1.getValue()).error("Messages received result by ipc has failed", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r6.a
            xu1 r2 = r6.b
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r4) goto L12
            defpackage.RQ1.d(r7)
            goto L43
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            defpackage.RQ1.d(r7)
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r7 = r7.a
            goto L32
        L22:
            defpackage.RQ1.d(r7)
            bs1 r7 = r2.b
            r6.a = r3
            com.vk.push.core.domain.model.CallingAppIds r1 = r6.c
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            boolean r1 = r7 instanceof defpackage.OS0
            if (r1 != 0) goto L45
            Tf1 r7 = (defpackage.C1518Tf1) r7
            r6.a = r4
            java.util.List r7 = r6.e
            java.lang.Enum r7 = defpackage.C8071xu1.a(r2, r7, r6)
            if (r7 != r0) goto L43
            return r0
        L43:
            com.vk.push.core.push.SendPushesResult r7 = (com.vk.push.core.push.SendPushesResult) r7
        L45:
            boolean r0 = r7 instanceof defpackage.OS0
            F71 r1 = r2.j
            if (r0 != 0) goto L5a
            r0 = r7
            com.vk.push.core.push.SendPushesResult r0 = (com.vk.push.core.push.SendPushesResult) r0
            java.lang.Object r0 = r1.getValue()
            com.vk.push.common.Logger r0 = (com.vk.push.common.Logger) r0
            java.lang.String r3 = "Messages receiving is successful"
            r5 = 0
            com.vk.push.common.Logger.DefaultImpls.info$default(r0, r3, r5, r4, r5)
        L5a:
            java.lang.Throwable r0 = defpackage.PS0.a(r7)
            if (r0 == 0) goto L67
            com.vk.push.core.data.repository.CrashReporterRepository r2 = r2.g
            com.vk.push.core.data.repository.IssueKey r3 = com.vk.push.core.data.repository.IssueKey.MESSAGE_RECEIVED
            r2.nonFatalReport(r0, r3)
        L67:
            com.vk.push.core.base.AidlResult r7 = com.vk.push.core.utils.ResultExtensionsKt.toAidlResult(r7)
            com.vk.push.core.base.AsyncCallback r0 = r6.d     // Catch: android.os.RemoteException -> L71
            r0.onResult(r7)     // Catch: android.os.RemoteException -> L71
            goto L7d
        L71:
            r7 = move-exception
            java.lang.Object r0 = r1.getValue()
            com.vk.push.common.Logger r0 = (com.vk.push.common.Logger) r0
            java.lang.String r1 = "Messages received result by ipc has failed"
            r0.error(r1, r7)
        L7d:
            Tf1 r7 = defpackage.C1518Tf1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7500uu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
