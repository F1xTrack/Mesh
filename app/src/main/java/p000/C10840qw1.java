package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: qw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10840qw1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public HS0 f41253a;

    /* renamed from: b */
    public int f41254b;

    /* renamed from: c */
    public final /* synthetic */ String f41255c;

    /* renamed from: d */
    public final /* synthetic */ String f41256d;

    /* renamed from: e */
    public final /* synthetic */ C7397Bp1 f41257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10840qw1(String str, String str2, C7397Bp1 c7397Bp1, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f41255c = str;
        this.f41256d = str2;
        this.f41257e = c7397Bp1;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C10840qw1(this.f41255c, this.f41256d, this.f41257e, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10840qw1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:7:0x000f, B:22:0x009f, B:24:0x00a7, B:25:0x00bd, B:27:0x00c3, B:28:0x00c6, B:13:0x001f, B:19:0x0087, B:16:0x007e), top: B:33:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:7:0x000f, B:22:0x009f, B:24:0x00a7, B:25:0x00bd, B:27:0x00c3, B:28:0x00c6, B:13:0x001f, B:19:0x0087, B:16:0x007e), top: B:33:0x0007 }] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 2
            Mz r3 = p000.EnumC0817Mz.f7418a
            int r4 = r8.f41254b
            if (r4 == 0) goto L23
            if (r4 == r1) goto L1f
            if (r4 != r2) goto L17
            HS0 r0 = r8.f41253a
            p000.RQ1.m7017d(r9)     // Catch: java.lang.Exception -> L14
            goto L9f
        L14:
            r9 = move-exception
            goto Ld4
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            p000.RQ1.m7017d(r9)     // Catch: java.lang.Exception -> L14
            goto L87
        L23:
            p000.RQ1.m7017d(r9)
            java.lang.String r9 = r8.f41255c
            java.lang.String r4 = "token"
            p000.O90.m5968f(r9, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "push_token"
            org.json.JSONObject r9 = r4.put(r5, r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r4 = "JSONObject()\n           …)\n            .toString()"
            p000.O90.m5967e(r9, r4)
            tR0 r9 = com.p019vk.push.core.network.utils.RequestBodyKt.toJsonRequestBody(r9)
            java.lang.String r4 = r8.f41256d
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r0] = r4
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r5 = "v1/topics/%s/subscribe"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            Bp1 r5 = r8.f41257e
            java.lang.Object r6 = r5.f1051a
            com.vk.push.common.HostInfoProvider r6 = (com.p019vk.push.common.HostInfoProvider) r6
            C40 r6 = com.p019vk.push.core.network.utils.ExtensionsKt.getHostInfoHttpBuilder(r6)
            r6.m969b(r4)
            D40 r4 = r6.m970c()
            uF r6 = new uF
            r7 = 9
            r6.<init>(r7, r0)
            r6.f43616a = r4
            r6.m25132C(r9)
            qR0 r9 = r6.m25141o()
            java.lang.Object r0 = r5.f1052b
            ox0 r0 = (p000.C10585ox0) r0
            DN0 r9 = r0.m23580b(r9)
            r8.f41254b = r1     // Catch: java.lang.Exception -> L14
            java.lang.Object r9 = com.p019vk.push.core.network.utils.CallHandlerKt.await(r9, r8)     // Catch: java.lang.Exception -> L14
            if (r9 != r3) goto L87
            return r3
        L87:
            r0 = r9
            HS0 r0 = (p000.HS0) r0     // Catch: java.lang.Exception -> L14
            GK r9 = p000.C0399GK.f3694a     // Catch: java.lang.Exception -> L14
            QF r9 = p000.ExecutorC1023QF.f9548c     // Catch: java.lang.Exception -> L14
            ru1 r1 = new ru1     // Catch: java.lang.Exception -> L14
            r4 = 0
            r1.<init>(r0, r4, r2)     // Catch: java.lang.Exception -> L14
            r8.f41253a = r0     // Catch: java.lang.Exception -> L14
            r8.f41254b = r2     // Catch: java.lang.Exception -> L14
            java.lang.Object r9 = p000.AbstractC9366fP1.m18233e(r9, r1, r8)     // Catch: java.lang.Exception -> L14
            if (r9 != r3) goto L9f
            return r3
        L9f:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L14
            boolean r1 = com.p019vk.push.core.network.utils.ResponseErrorKt.hasErrorBody(r9)     // Catch: java.lang.Exception -> L14
            if (r1 == 0) goto Lbd
            com.vk.push.core.network.model.ResponseError r9 = com.p019vk.push.core.network.utils.ResponseErrorKt.parseErrorResponse(r9)     // Catch: java.lang.Exception -> L14
            com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException r0 = new com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Exception -> L14
            int r9 = r9.getCode()     // Catch: java.lang.Exception -> L14
            r0.<init>(r1, r9)     // Catch: java.lang.Exception -> L14
            OS0 r9 = p000.RQ1.m7015b(r0)     // Catch: java.lang.Exception -> L14
            goto Ld8
        Lbd:
            boolean r9 = r0.m3428n()     // Catch: java.lang.Exception -> L14
            if (r9 == 0) goto Lc6
            Tf1 r9 = p000.C8313Tf1.f11463a     // Catch: java.lang.Exception -> L14
            goto Ld8
        Lc6:
            com.vk.push.core.network.exception.VkpnsRequestException r9 = new com.vk.push.core.network.exception.VkpnsRequestException     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = r0.f4297c     // Catch: java.lang.Exception -> L14
            int r0 = r0.f4298d     // Catch: java.lang.Exception -> L14
            r9.<init>(r1, r0)     // Catch: java.lang.Exception -> L14
            OS0 r9 = p000.RQ1.m7015b(r9)     // Catch: java.lang.Exception -> L14
            goto Ld8
        Ld4:
            OS0 r9 = p000.RQ1.m7015b(r9)
        Ld8:
            PS0 r0 = new PS0
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10840qw1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
