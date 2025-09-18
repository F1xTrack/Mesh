package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.ipc.BaseIPCClient;
import com.p019vk.push.core.push.PushProvider;
import java.util.List;

/* renamed from: Yr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8597Yr1 extends BaseIPCClient implements InterfaceC8543Xq1 {

    /* renamed from: m */
    public final String f14560m;

    /* renamed from: n */
    public final String f14561n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8597Yr1(String str, Context context, List list, Logger logger, C8337Tr1 c8337Tr1) {
        super(context, list, 0L, null, c8337Tr1, logger, 12, null);
        O90.m5968f(logger, "logger");
        this.f14560m = str;
        this.f14561n = "PushIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // p000.InterfaceC8543Xq1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo9157b(java.lang.String r13, p000.AbstractC1571Yy r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof p000.C11086sr1
            if (r0 == 0) goto L14
            r0 = r14
            sr1 r0 = (p000.C11086sr1) r0
            int r1 = r0.f42646c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f42646c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            sr1 r0 = new sr1
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r9.f42644a
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r9.f42646c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            p000.RQ1.m7017d(r14)
            goto L52
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            p000.RQ1.m7017d(r14)
            cI r14 = new cI
            r1 = 1
            r14.<init>(r13, r1, r12)
            y r4 = p000.C7173y.f45968A
            Ce1 r5 = p000.C7427Ce1.f1557q
            Ce1 r6 = p000.C7427Ce1.f1559s
            r9.f42646c = r2
            java.lang.String r3 = "registerForPushes"
            r7 = 0
            r10 = 32
            r11 = 0
            r1 = r12
            r2 = r14
            java.lang.Object r14 = com.p019vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            if (r14 != r0) goto L52
            return r0
        L52:
            PS0 r14 = (p000.PS0) r14
            java.lang.Object r13 = r14.f9075a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8597Yr1.mo9157b(java.lang.String, Yy):java.lang.Object");
    }

    @Override // com.p019vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        O90.m5968f(iBinder, "service");
        PushProvider pushProviderAsInterface = PushProvider.Stub.asInterface(iBinder);
        O90.m5967e(pushProviderAsInterface, "asInterface(service)");
        return pushProviderAsInterface;
    }

    @Override // com.p019vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.f14561n;
    }
}
