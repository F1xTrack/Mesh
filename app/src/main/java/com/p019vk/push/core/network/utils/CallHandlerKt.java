package com.p019vk.push.core.network.utils;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.Metadata;
import p000.AbstractC10599p22;
import p000.C0619Jp;
import p000.C1508Xy;
import p000.EnumC0817Mz;
import p000.InterfaceC1382Vy;
import p000.InterfaceC6843sl;

@Metadata(m22266d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b*\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m22267d2 = {"T", "Lsl;", "Lkotlin/Function1;", "", "parseSuccess", "LPS0;", "handleCall", "(Lsl;LnZ;LVy;)Ljava/lang/Object;", "LHS0;", "await", "(Lsl;LVy;)Ljava/lang/Object;", "core-network_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CallHandlerKt {
    public static final Object await(InterfaceC6843sl interfaceC6843sl, InterfaceC1382Vy interfaceC1382Vy) {
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy));
        c0619Jp.m4439s();
        C1508Xy c1508Xy = new C1508Xy(interfaceC6843sl, c0619Jp);
        FirebasePerfOkHttpClient.enqueue(interfaceC6843sl, c1508Xy);
        c0619Jp.m4441u(c1508Xy);
        Object objM4438r = c0619Jp.m4438r();
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        return objM4438r;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:13:0x002a, B:29:0x0066, B:31:0x006e, B:32:0x0084, B:34:0x008a, B:35:0x008f, B:20:0x003a, B:26:0x004c, B:23:0x0041), top: B:39:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:13:0x002a, B:29:0x0066, B:31:0x006e, B:32:0x0084, B:34:0x008a, B:35:0x008f, B:20:0x003a, B:26:0x004c, B:23:0x0041), top: B:39:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object handleCall(p000.InterfaceC6843sl r5, p000.InterfaceC6497nZ r6, p000.InterfaceC1382Vy r7) {
        /*
            boolean r0 = r7 instanceof p000.C6906tl
            if (r0 == 0) goto L13
            r0 = r7
            tl r0 = (p000.C6906tl) r0
            int r1 = r0.f43238d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43238d = r1
            goto L18
        L13:
            tl r0 = new tl
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f43237c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f43238d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            HS0 r5 = r0.f43236b
            nZ r6 = r0.f43235a
            p000.RQ1.m7017d(r7)     // Catch: java.lang.Exception -> L2e
            goto L66
        L2e:
            r5 = move-exception
            goto L9d
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            nZ r6 = r0.f43235a
            p000.RQ1.m7017d(r7)     // Catch: java.lang.Exception -> L2e
            goto L4c
        L3e:
            p000.RQ1.m7017d(r7)
            r0.f43235a = r6     // Catch: java.lang.Exception -> L2e
            r0.f43238d = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Object r7 = await(r5, r0)     // Catch: java.lang.Exception -> L2e
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r7
            HS0 r5 = (p000.HS0) r5     // Catch: java.lang.Exception -> L2e
            GK r7 = p000.C0399GK.f3694a     // Catch: java.lang.Exception -> L2e
            QF r7 = p000.ExecutorC1023QF.f9548c     // Catch: java.lang.Exception -> L2e
            com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1 r2 = new com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1     // Catch: java.lang.Exception -> L2e
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Exception -> L2e
            r0.f43235a = r6     // Catch: java.lang.Exception -> L2e
            r0.f43236b = r5     // Catch: java.lang.Exception -> L2e
            r0.f43238d = r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r7, r2, r0)     // Catch: java.lang.Exception -> L2e
            if (r7 != r1) goto L66
            return r1
        L66:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2e
            boolean r0 = com.p019vk.push.core.network.utils.ResponseErrorKt.hasErrorBody(r7)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L84
            com.vk.push.core.network.model.ResponseError r5 = com.p019vk.push.core.network.utils.ResponseErrorKt.parseErrorResponse(r7)     // Catch: java.lang.Exception -> L2e
            com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException r6 = new com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException     // Catch: java.lang.Exception -> L2e
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Exception -> L2e
            int r5 = r5.getCode()     // Catch: java.lang.Exception -> L2e
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> L2e
            OS0 r5 = p000.RQ1.m7015b(r6)     // Catch: java.lang.Exception -> L2e
            goto La1
        L84:
            boolean r0 = r5.m3428n()     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L8f
            java.lang.Object r5 = r6.invoke(r7)     // Catch: java.lang.Exception -> L2e
            goto La1
        L8f:
            com.vk.push.core.network.exception.VkpnsRequestException r6 = new com.vk.push.core.network.exception.VkpnsRequestException     // Catch: java.lang.Exception -> L2e
            java.lang.String r7 = r5.f4297c     // Catch: java.lang.Exception -> L2e
            int r5 = r5.f4298d     // Catch: java.lang.Exception -> L2e
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> L2e
            OS0 r5 = p000.RQ1.m7015b(r6)     // Catch: java.lang.Exception -> L2e
            goto La1
        L9d:
            OS0 r5 = p000.RQ1.m7015b(r5)
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.network.utils.CallHandlerKt.handleCall(sl, nZ, Vy):java.lang.Object");
    }
}
