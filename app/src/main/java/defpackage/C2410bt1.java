package defpackage;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;
import kotlin.jvm.functions.Function2;

/* renamed from: bt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2410bt1 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C6924rt1 b;
    public final /* synthetic */ CallingAppIds c;
    public final /* synthetic */ AsyncCallback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2410bt1(C6924rt1 c6924rt1, CallingAppIds callingAppIds, AsyncCallback asyncCallback, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c6924rt1;
        this.c = callingAppIds;
        this.d = asyncCallback;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C2410bt1(this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2410bt1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
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
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r7.a
            rt1 r2 = r7.b
            r3 = 1
            r4 = 2
            r5 = 0
            com.vk.push.common.Logger r6 = r2.g
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r4) goto L15
            defpackage.RQ1.d(r8)
            goto L4e
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            defpackage.RQ1.d(r8)
            PS0 r8 = (defpackage.PS0) r8
            java.lang.Object r8 = r8.a
            goto L3a
        L25:
            defpackage.RQ1.d(r8)
            java.lang.String r8 = "Validating host..."
            com.vk.push.common.Logger.DefaultImpls.info$default(r6, r8, r5, r4, r5)
            bs1 r8 = r2.a
            r7.a = r3
            com.vk.push.core.domain.model.CallingAppIds r1 = r7.c
            java.lang.Object r8 = r8.b(r1, r7)
            if (r8 != r0) goto L3a
            return r0
        L3a:
            boolean r1 = r8 instanceof defpackage.OS0
            if (r1 != 0) goto L50
            Tf1 r8 = (defpackage.C1518Tf1) r8
            java.lang.String r8 = "Calling onDeleteMessages..."
            com.vk.push.common.Logger.DefaultImpls.info$default(r6, r8, r5, r4, r5)
            r7.a = r4
            java.lang.Enum r8 = defpackage.C6924rt1.a(r2, r7)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            com.vk.push.core.push.OnDeleteMessagesResult r8 = (com.vk.push.core.push.OnDeleteMessagesResult) r8
        L50:
            com.vk.push.core.base.AidlResult r8 = com.vk.push.core.utils.ResultExtensionsKt.toAidlResult(r8)
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
            com.vk.push.core.base.AsyncCallback r0 = r7.d     // Catch: android.os.RemoteException -> L6f
            r0.onResult(r8)     // Catch: android.os.RemoteException -> L6f
            goto L75
        L6f:
            r8 = move-exception
            java.lang.String r0 = "On delete messages result by ipc has failed"
            r6.error(r0, r8)
        L75:
            Tf1 r8 = defpackage.C1518Tf1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2410bt1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
