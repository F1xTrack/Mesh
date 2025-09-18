package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.auth.Auth;
import com.p019vk.push.core.ipc.BaseIPCClient;
import java.util.List;

/* renamed from: Nr1 */
/* loaded from: classes2.dex */
public final class C8025Nr1 extends BaseIPCClient implements InterfaceC7815Jq1 {

    /* renamed from: m */
    public final String f8095m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8025Nr1(Context context, List list, Logger logger, InterfaceC6434mZ interfaceC6434mZ) {
        super(context, list, 0L, null, interfaceC6434mZ, logger, 12, null);
        O90.m5968f(logger, "logger");
        O90.m5968f(interfaceC6434mZ, "onNoHostToBind");
        this.f8095m = "AuthIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0014  */
    @Override // p000.InterfaceC7815Jq1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4455a(p000.AbstractC1571Yy r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p000.C7401Br1
            if (r0 == 0) goto L14
            r0 = r13
            Br1 r0 = (p000.C7401Br1) r0
            int r1 = r0.f1059c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f1059c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            Br1 r0 = new Br1
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.f1057a
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r9.f1059c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            p000.RQ1.m7017d(r13)
            goto L4e
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L31:
            p000.RQ1.m7017d(r13)
            y r13 = p000.C7173y.f45969B
            y r4 = p000.C7173y.f45970C
            Ce1 r5 = p000.C7427Ce1.f1560t
            Ce1 r6 = p000.C7427Ce1.f1561u
            r9.f1059c = r2
            java.lang.String r3 = "isUserAuthorized"
            r7 = 0
            r10 = 32
            r11 = 0
            r1 = r12
            r2 = r13
            java.lang.Object r13 = com.p019vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            if (r13 != r0) goto L4e
            return r0
        L4e:
            PS0 r13 = (p000.PS0) r13
            java.lang.Object r13 = r13.f9075a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8025Nr1.mo4455a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0014  */
    @Override // p000.InterfaceC7815Jq1
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4457c(p000.AbstractC1571Yy r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p000.C10574or1
            if (r0 == 0) goto L14
            r0 = r13
            or1 r0 = (p000.C10574or1) r0
            int r1 = r0.f39310c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f39310c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            or1 r0 = new or1
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.f39308a
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r9.f39310c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            p000.RQ1.m7017d(r13)
            goto L4e
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L31:
            p000.RQ1.m7017d(r13)
            y r13 = p000.C7173y.f45995y
            y r4 = p000.C7173y.f45996z
            Ce1 r5 = p000.C7427Ce1.f1556p
            Ce1 r6 = p000.C7427Ce1.f1558r
            r9.f39310c = r2
            java.lang.String r3 = "getIntermediateToken"
            r7 = 0
            r10 = 32
            r11 = 0
            r1 = r12
            r2 = r13
            java.lang.Object r13 = com.p019vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            if (r13 != r0) goto L4e
            return r0
        L4e:
            PS0 r13 = (p000.PS0) r13
            java.lang.Object r13 = r13.f9075a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8025Nr1.mo4457c(Yy):java.lang.Object");
    }

    @Override // com.p019vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        O90.m5968f(iBinder, "service");
        Auth authAsInterface = Auth.Stub.asInterface(iBinder);
        O90.m5967e(authAsInterface, "asInterface(service)");
        return authAsInterface;
    }

    @Override // com.p019vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.f8095m;
    }
}
