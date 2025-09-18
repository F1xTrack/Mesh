package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.common.Logger;
import com.vk.push.core.auth.Auth;
import com.vk.push.core.ipc.BaseIPCClient;
import java.util.List;

/* renamed from: Nr1 */
/* loaded from: classes2.dex */
public final class C1086Nr1 extends BaseIPCClient implements InterfaceC0772Jq1 {
    public final String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1086Nr1(Context context, List list, Logger logger, InterfaceC5908mZ interfaceC5908mZ) {
        super(context, list, 0L, null, interfaceC5908mZ, logger, 12, null);
        O90.f(logger, "logger");
        O90.f(interfaceC5908mZ, "onNoHostToBind");
        this.m = "AuthIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0014  */
    @Override // defpackage.InterfaceC0772Jq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.AbstractC1963Yy r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.C0151Br1
            if (r0 == 0) goto L14
            r0 = r13
            Br1 r0 = (defpackage.C0151Br1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            Br1 r0 = new Br1
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.a
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.RQ1.d(r13)
            goto L4e
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L31:
            defpackage.RQ1.d(r13)
            y r13 = defpackage.C8087y.B
            y r4 = defpackage.C8087y.C
            Ce1 r5 = defpackage.C0190Ce1.t
            Ce1 r6 = defpackage.C0190Ce1.u
            r9.c = r2
            java.lang.String r3 = "isUserAuthorized"
            r7 = 0
            r10 = 32
            r11 = 0
            r1 = r12
            r2 = r13
            java.lang.Object r13 = com.vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            if (r13 != r0) goto L4e
            return r0
        L4e:
            PS0 r13 = (defpackage.PS0) r13
            java.lang.Object r13 = r13.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1086Nr1.a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0014  */
    @Override // defpackage.InterfaceC0772Jq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.AbstractC1963Yy r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.C6346or1
            if (r0 == 0) goto L14
            r0 = r13
            or1 r0 = (defpackage.C6346or1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            or1 r0 = new or1
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.a
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.RQ1.d(r13)
            goto L4e
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L31:
            defpackage.RQ1.d(r13)
            y r13 = defpackage.C8087y.y
            y r4 = defpackage.C8087y.z
            Ce1 r5 = defpackage.C0190Ce1.p
            Ce1 r6 = defpackage.C0190Ce1.r
            r9.c = r2
            java.lang.String r3 = "getIntermediateToken"
            r7 = 0
            r10 = 32
            r11 = 0
            r1 = r12
            r2 = r13
            java.lang.Object r13 = com.vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            if (r13 != r0) goto L4e
            return r0
        L4e:
            PS0 r13 = (defpackage.PS0) r13
            java.lang.Object r13 = r13.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1086Nr1.c(Yy):java.lang.Object");
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        O90.f(iBinder, "service");
        Auth authAsInterface = Auth.Stub.asInterface(iBinder);
        O90.e(authAsInterface, "asInterface(service)");
        return authAsInterface;
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.m;
    }
}
