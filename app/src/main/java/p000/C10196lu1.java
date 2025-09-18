package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.domain.ComponentActions;
import com.p019vk.push.core.ipc.BaseIPCClient;
import com.p019vk.push.core.test.TestPushProvider;
import com.p019vk.push.core.utils.PackageExtenstionsKt;
import java.util.List;

/* renamed from: lu1 */
/* loaded from: classes2.dex */
public final class C10196lu1 extends BaseIPCClient {

    /* renamed from: p */
    public static final /* synthetic */ int f37353p = 0;

    /* renamed from: m */
    public final String f37354m;

    /* renamed from: n */
    public final S51 f37355n;

    /* renamed from: o */
    public final String f37356o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10196lu1(String str, Context context, List list, Logger logger, S51 s51) {
        super(context, list, 0L, null, s51, logger, 12, null);
        O90.m5968f(logger, "logger");
        this.f37354m = str;
        this.f37355n = s51;
        this.f37356o = "TestPushIPCClient";
    }

    /* renamed from: j */
    public static final ComponentName m22594j(String str, C10196lu1 c10196lu1) {
        ComponentName componentNameFindServiceByAction = PackageExtenstionsKt.findServiceByAction(c10196lu1.getContext(), str, ComponentActions.TEST_PUSH_SERVICE_ACTION);
        if (componentNameFindServiceByAction == null) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("Unable to resolve service in ", str, " by action ");
            sbM26240q.append(ComponentActions.INSTANCE);
            sbM26240q.append(".TEST_PUSH_SERVICE_ACTIO");
            Logger.DefaultImpls.error$default(c10196lu1.getLogger(), sbM26240q.toString(), null, 2, null);
        }
        return componentNameFindServiceByAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0018  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22595a(p000.AbstractC1571Yy r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r0 instanceof p000.C8029Nt1
            if (r1 == 0) goto L18
            r1 = r0
            Nt1 r1 = (p000.C8029Nt1) r1
            int r2 = r1.f8118c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f8118c = r2
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
            java.lang.Object r0 = r10.f8116a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r10.f8118c
            r11 = 1
            if (r2 == 0) goto L37
            if (r2 != r11) goto L2f
            p000.RQ1.m7017d(r0)
            goto L6a
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            p000.RQ1.m7017d(r0)
            y r0 = p000.C7173y.f45972E
            y r12 = p000.C7173y.f45973F
            Ce1 r14 = p000.C7427Ce1.f1566z
            Sb0 r15 = new Sb0
            java.lang.Class<lu1> r5 = p000.C10196lu1.class
            java.lang.String r6 = "findService"
            r3 = 1
            java.lang.String r7 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r8 = 0
            r9 = 3
            r2 = r15
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.f8118c = r11
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
            java.lang.Object r0 = com.p019vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            PS0 r0 = (p000.PS0) r0
            java.lang.Object r0 = r0.f9075a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10196lu1.m22595a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0018  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22596b(java.lang.String r18, p000.AbstractC1571Yy r19) {
        /*
            r17 = this;
            r11 = r17
            r0 = r19
            boolean r1 = r0 instanceof p000.C8133Pt1
            if (r1 == 0) goto L18
            r1 = r0
            Pt1 r1 = (p000.C8133Pt1) r1
            int r2 = r1.f9339c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f9339c = r2
        L16:
            r8 = r1
            goto L1e
        L18:
            Pt1 r1 = new Pt1
            r1.<init>(r11, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r8.f9337a
            Mz r12 = p000.EnumC0817Mz.f7418a
            int r1 = r8.f9339c
            r9 = 1
            if (r1 == 0) goto L35
            if (r1 != r9) goto L2d
            p000.RQ1.m7017d(r0)
            goto L6e
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            p000.RQ1.m7017d(r0)
            cI r10 = new cI
            r0 = 2
            r1 = r18
            r10.<init>(r1, r0, r11)
            y r13 = p000.C7173y.f45974G
            Ce1 r14 = p000.C7427Ce1.f1542F
            Sb0 r15 = new Sb0
            java.lang.Class<lu1> r3 = p000.C10196lu1.class
            java.lang.String r4 = "findService"
            r1 = 1
            java.lang.String r5 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r6 = 0
            r7 = 4
            r0 = r15
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f9339c = r9
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
            java.lang.Object r0 = com.p019vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r0, r1, r2, r3, r4, r5, r6, r8, r9, r10)
            if (r0 != r12) goto L6e
            return r12
        L6e:
            PS0 r0 = (p000.PS0) r0
            java.lang.Object r0 = r0.f9075a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10196lu1.m22596b(java.lang.String, Yy):java.lang.Object");
    }

    @Override // com.p019vk.push.core.ipc.BaseIPCClient
    public final IInterface createInterface(IBinder iBinder) {
        O90.m5968f(iBinder, "service");
        TestPushProvider testPushProviderAsInterface = TestPushProvider.Stub.asInterface(iBinder);
        O90.m5967e(testPushProviderAsInterface, "asInterface(service)");
        return testPushProviderAsInterface;
    }

    @Override // com.p019vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.f37356o;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0018  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22597k(java.lang.String r18, com.p019vk.push.core.test.TestPushPayload r19, p000.AbstractC1571Yy r20) {
        /*
            r17 = this;
            r0 = r20
            boolean r1 = r0 instanceof p000.C8185Qt1
            if (r1 == 0) goto L18
            r1 = r0
            Qt1 r1 = (p000.C8185Qt1) r1
            int r2 = r1.f9856c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f9856c = r2
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
            java.lang.Object r0 = r10.f9854a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r10.f9856c
            r11 = 1
            if (r2 == 0) goto L37
            if (r2 != r11) goto L2f
            p000.RQ1.m7017d(r0)
            goto L72
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            p000.RQ1.m7017d(r0)
            cI r0 = new cI
            r2 = 3
            r3 = r18
            r4 = r19
            r0.<init>(r3, r2, r4)
            y r12 = p000.C7173y.f45975H
            Rt1 r14 = p000.C8237Rt1.f10470f
            Sb0 r15 = new Sb0
            java.lang.Class<lu1> r5 = p000.C10196lu1.class
            java.lang.String r6 = "findService"
            r3 = 1
            java.lang.String r7 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r8 = 0
            r9 = 5
            r2 = r15
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.f9856c = r11
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
            java.lang.Object r0 = com.p019vk.push.core.ipc.BaseIPCClient.makeAsyncRequest$default(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            if (r0 != r1) goto L72
            return r1
        L72:
            PS0 r0 = (p000.PS0) r0
            java.lang.Object r0 = r0.f9075a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10196lu1.m22597k(java.lang.String, com.vk.push.core.test.TestPushPayload, Yy):java.lang.Object");
    }
}
