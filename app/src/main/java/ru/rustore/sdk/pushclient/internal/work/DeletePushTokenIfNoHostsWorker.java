package ru.rustore.sdk.pushclient.internal.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import p000.AbstractC0705LB;
import p000.C1450X2;
import p000.F71;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m22267d2 = {"Lru/rustore/sdk/pushclient/internal/work/DeletePushTokenIfNoHostsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "client_release"}, m22268k = 1, m22269mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DeletePushTokenIfNoHostsWorker extends CoroutineWorker {

    /* renamed from: d */
    public final F71 f42141d;

    /* renamed from: e */
    public final F71 f42142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeletePushTokenIfNoHostsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        O90.m5968f(context, "appContext");
        O90.m5968f(workerParameters, "workerParams");
        this.f42141d = AbstractC0705LB.m4915b(C1450X2.f13515s);
        this.f42142e = AbstractC0705LB.m4915b(C1450X2.f13514r);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo10322a(p000.AbstractC1571Yy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p000.C0648KH
            if (r0 == 0) goto L13
            r0 = r7
            KH r0 = (p000.C0648KH) r0
            int r1 = r0.f5980c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5980c = r1
            goto L18
        L13:
            KH r0 = new KH
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5978a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f5980c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r7)
            goto L44
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            p000.RQ1.m7017d(r7)
            wG r7 = p000.C0399GK.f3695b
            LH r2 = new LH
            r4 = 0
            r5 = 0
            r2.<init>(r6, r4, r5)
            r0.f5980c = r3
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r7, r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            java.lang.String r0 = "override suspend fun doW…)\n            }\n        }"
            p000.O90.m5967e(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker.mo10322a(Yy):java.lang.Object");
    }
}
