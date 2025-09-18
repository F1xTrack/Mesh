package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.hostinfo.MasterElections;
import com.p019vk.push.core.ipc.BaseIPCClient;
import java.util.List;

/* renamed from: Lq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7919Lq1 extends BaseIPCClient {

    /* renamed from: m */
    public final String f6897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7919Lq1(Context context, List list, Logger logger) {
        super(context, list, 0L, null, null, logger, 12, null);
        O90.m5968f(logger, "logger");
        this.f6897m = "ArbiterIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5117a(p000.AbstractC1571Yy r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p000.C9292eq1
            if (r0 == 0) goto L14
            r0 = r13
            eq1 r0 = (p000.C9292eq1) r0
            int r1 = r0.f26916c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26916c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            eq1 r0 = new eq1
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.f26914a
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r9.f26916c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            p000.RQ1.m7017d(r13)
            goto L53
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L31:
            p000.RQ1.m7017d(r13)
            y r13 = p000.C7173y.f45991u
            y r4 = p000.C7173y.f45992v
            Ce1 r5 = p000.C7427Ce1.f1554n
            lG0 r6 = new lG0
            r1 = 18
            r6.<init>(r1, r12)
            r9.f26916c = r2
            java.lang.String r3 = "getMaster"
            r7 = 0
            r10 = 32
            r11 = 0
            r1 = r12
            r2 = r13
            java.lang.Object r13 = com.p019vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            if (r13 != r0) goto L53
            return r0
        L53:
            PS0 r13 = (p000.PS0) r13
            java.lang.Object r13 = r13.f9075a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7919Lq1.m5117a(Yy):java.lang.Object");
    }

    @Override // com.p019vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        O90.m5968f(iBinder, "service");
        MasterElections masterElectionsAsInterface = MasterElections.Stub.asInterface(iBinder);
        O90.m5967e(masterElectionsAsInterface, "asInterface(service)");
        return masterElectionsAsInterface;
    }

    @Override // com.p019vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.f6897m;
    }
}
