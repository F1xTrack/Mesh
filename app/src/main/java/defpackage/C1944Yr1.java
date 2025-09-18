package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.push.PushProvider;
import java.util.List;

/* renamed from: Yr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1944Yr1 extends BaseIPCClient implements InterfaceC1863Xq1 {
    public final String m;
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1944Yr1(String str, Context context, List list, Logger logger, C1554Tr1 c1554Tr1) {
        super(context, list, 0L, null, c1554Tr1, logger, 12, null);
        O90.f(logger, "logger");
        this.m = str;
        this.n = "PushIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.InterfaceC1863Xq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r13, defpackage.AbstractC1963Yy r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.C7109sr1
            if (r0 == 0) goto L14
            r0 = r14
            sr1 r0 = (defpackage.C7109sr1) r0
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
            sr1 r0 = new sr1
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r9.a
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.RQ1.d(r14)
            goto L52
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            defpackage.RQ1.d(r14)
            cI r14 = new cI
            r1 = 1
            r14.<init>(r13, r1, r12)
            y r4 = defpackage.C8087y.A
            Ce1 r5 = defpackage.C0190Ce1.q
            Ce1 r6 = defpackage.C0190Ce1.s
            r9.c = r2
            java.lang.String r3 = "registerForPushes"
            r7 = 0
            r10 = 32
            r11 = 0
            r1 = r12
            r2 = r14
            java.lang.Object r14 = com.vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            if (r14 != r0) goto L52
            return r0
        L52:
            PS0 r14 = (defpackage.PS0) r14
            java.lang.Object r13 = r14.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1944Yr1.b(java.lang.String, Yy):java.lang.Object");
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        O90.f(iBinder, "service");
        PushProvider pushProviderAsInterface = PushProvider.Stub.asInterface(iBinder);
        O90.e(pushProviderAsInterface, "asInterface(service)");
        return pushProviderAsInterface;
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.n;
    }
}
