package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.test.TestPushProvider;
import com.vk.push.core.utils.PackageExtenstionsKt;
import java.util.List;

/* renamed from: lu1 */
/* loaded from: classes2.dex */
public final class C5782lu1 extends BaseIPCClient {
    public static final /* synthetic */ int p = 0;
    public final String m;
    public final S51 n;
    public final String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5782lu1(String str, Context context, List list, Logger logger, S51 s51) {
        super(context, list, 0L, null, s51, logger, 12, null);
        O90.f(logger, "logger");
        this.m = str;
        this.n = s51;
        this.o = "TestPushIPCClient";
    }

    public static final ComponentName j(String str, C5782lu1 c5782lu1) {
        ComponentName componentNameFindServiceByAction = PackageExtenstionsKt.findServiceByAction(c5782lu1.getContext(), str, ComponentActions.TEST_PUSH_SERVICE_ACTION);
        if (componentNameFindServiceByAction == null) {
            StringBuilder sbQ = AbstractC8235ym.q("Unable to resolve service in ", str, " by action ");
            sbQ.append(ComponentActions.INSTANCE);
            sbQ.append(".TEST_PUSH_SERVICE_ACTIO");
            Logger.DefaultImpls.error$default(c5782lu1.getLogger(), sbQ.toString(), null, 2, null);
        }
        return componentNameFindServiceByAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.AbstractC1963Yy r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.C1092Nt1
            if (r1 == 0) goto L18
            r1 = r0
            Nt1 r1 = (defpackage.C1092Nt1) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.c = r2
            r13 = r17
        L16:
            r10 = r1
            goto L20
        L18:
            Nt1 r1 = new Nt1
            r13 = r17
            r1.<init>(r13, r0)
            goto L16
        L20:
            java.lang.Object r0 = r10.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r10.c
            r11 = 1
            if (r2 == 0) goto L37
            if (r2 != r11) goto L2f
            defpackage.RQ1.d(r0)
            goto L6a
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            defpackage.RQ1.d(r0)
            y r0 = defpackage.C8087y.E
            y r12 = defpackage.C8087y.F
            Ce1 r14 = defpackage.C0190Ce1.z
            Sb0 r15 = new Sb0
            java.lang.Class<lu1> r5 = defpackage.C5782lu1.class
            java.lang.String r6 = "findService"
            r3 = 1
            java.lang.String r7 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r8 = 0
            r9 = 3
            r2 = r15
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.c = r11
            java.lang.String r4 = "getIntermediateToken"
            r8 = 0
            r11 = 32
            r16 = 0
            r2 = r17
            r3 = r0
            r5 = r12
            r6 = r14
            r7 = r15
            r12 = r16
            java.lang.Object r0 = com.vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            PS0 r0 = (defpackage.PS0) r0
            java.lang.Object r0 = r0.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5782lu1.a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r18, defpackage.AbstractC1963Yy r19) {
        /*
            r17 = this;
            r11 = r17
            r0 = r19
            boolean r1 = r0 instanceof defpackage.C1248Pt1
            if (r1 == 0) goto L18
            r1 = r0
            Pt1 r1 = (defpackage.C1248Pt1) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.c = r2
        L16:
            r8 = r1
            goto L1e
        L18:
            Pt1 r1 = new Pt1
            r1.<init>(r11, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r8.a
            Mz r12 = defpackage.EnumC1030Mz.a
            int r1 = r8.c
            r9 = 1
            if (r1 == 0) goto L35
            if (r1 != r9) goto L2d
            defpackage.RQ1.d(r0)
            goto L6e
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            defpackage.RQ1.d(r0)
            cI r10 = new cI
            r0 = 2
            r1 = r18
            r10.<init>(r1, r0, r11)
            y r13 = defpackage.C8087y.G
            Ce1 r14 = defpackage.C0190Ce1.F
            Sb0 r15 = new Sb0
            java.lang.Class<lu1> r3 = defpackage.C5782lu1.class
            java.lang.String r4 = "findService"
            r1 = 1
            java.lang.String r5 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r6 = 0
            r7 = 4
            r0 = r15
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.c = r9
            java.lang.String r2 = "registerForPushes"
            r6 = 0
            r9 = 32
            r16 = 0
            r0 = r17
            r1 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r10 = r16
            java.lang.Object r0 = com.vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r0, r1, r2, r3, r4, r5, r6, r8, r9, r10)
            if (r0 != r12) goto L6e
            return r12
        L6e:
            PS0 r0 = (defpackage.PS0) r0
            java.lang.Object r0 = r0.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5782lu1.b(java.lang.String, Yy):java.lang.Object");
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        O90.f(iBinder, "service");
        TestPushProvider testPushProviderAsInterface = TestPushProvider.Stub.asInterface(iBinder);
        O90.e(testPushProviderAsInterface, "asInterface(service)");
        return testPushProviderAsInterface;
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r18, com.vk.push.core.test.TestPushPayload r19, defpackage.AbstractC1963Yy r20) {
        /*
            r17 = this;
            r0 = r20
            boolean r1 = r0 instanceof defpackage.C1326Qt1
            if (r1 == 0) goto L18
            r1 = r0
            Qt1 r1 = (defpackage.C1326Qt1) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.c = r2
            r13 = r17
        L16:
            r10 = r1
            goto L20
        L18:
            Qt1 r1 = new Qt1
            r13 = r17
            r1.<init>(r13, r0)
            goto L16
        L20:
            java.lang.Object r0 = r10.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r10.c
            r11 = 1
            if (r2 == 0) goto L37
            if (r2 != r11) goto L2f
            defpackage.RQ1.d(r0)
            goto L72
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            defpackage.RQ1.d(r0)
            cI r0 = new cI
            r2 = 3
            r3 = r18
            r4 = r19
            r0.<init>(r3, r2, r4)
            y r12 = defpackage.C8087y.H
            Rt1 r14 = defpackage.C1404Rt1.f
            Sb0 r15 = new Sb0
            java.lang.Class<lu1> r5 = defpackage.C5782lu1.class
            java.lang.String r6 = "findService"
            r3 = 1
            java.lang.String r7 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r8 = 0
            r9 = 5
            r2 = r15
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.c = r11
            java.lang.String r4 = "sendTestPush"
            r8 = 0
            r11 = 32
            r16 = 0
            r2 = r17
            r3 = r0
            r5 = r12
            r6 = r14
            r7 = r15
            r12 = r16
            java.lang.Object r0 = com.vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            if (r0 != r1) goto L72
            return r1
        L72:
            PS0 r0 = (defpackage.PS0) r0
            java.lang.Object r0 = r0.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5782lu1.k(java.lang.String, com.vk.push.core.test.TestPushPayload, Yy):java.lang.Object");
    }
}
