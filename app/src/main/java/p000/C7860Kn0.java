package p000;

import com.p019vk.push.core.network.data.source.MasterHostApi;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: Kn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7860Kn0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public HS0 f6286a;

    /* renamed from: b */
    public int f6287b;

    /* renamed from: c */
    public final /* synthetic */ List f6288c;

    /* renamed from: d */
    public final /* synthetic */ MasterHostApi f6289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7860Kn0(List list, MasterHostApi masterHostApi, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f6288c = list;
        this.f6289d = masterHostApi;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7860Kn0(this.f6288c, this.f6289d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7860Kn0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:23:0x0094, B:25:0x009c, B:26:0x00b2, B:28:0x00b8, B:29:0x00c3, B:13:0x001e, B:19:0x007b, B:16:0x0072), top: B:34:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:23:0x0094, B:25:0x009c, B:26:0x00b2, B:28:0x00b8, B:29:0x00c3, B:13:0x001e, B:19:0x007b, B:16:0x0072), top: B:34:0x0006 }] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r8.f6287b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            HS0 r0 = r8.f6286a
            p000.RQ1.m7017d(r9)     // Catch: java.lang.Exception -> L13
            goto L94
        L13:
            r9 = move-exception
            goto Ld1
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            p000.RQ1.m7017d(r9)     // Catch: java.lang.Exception -> L13
            goto L7b
        L22:
            p000.RQ1.m7017d(r9)
            org.json.JSONArray r9 = new org.json.JSONArray
            java.util.List r1 = r8.f6288c
            java.util.Collection r1 = (java.util.Collection) r1
            r9.<init>(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r4 = "packages"
            org.json.JSONObject r9 = r1.put(r4, r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "JSONObject()\n           …              .toString()"
            p000.O90.m5967e(r9, r1)
            tR0 r9 = com.p019vk.push.core.network.utils.RequestBodyKt.toJsonRequestBody(r9)
            com.vk.push.core.network.data.source.MasterHostApi r1 = r8.f6289d
            com.vk.push.common.HostInfoProvider r4 = com.p019vk.push.core.network.data.source.MasterHostApi.access$getHostInfoProvider$p(r1)
            C40 r4 = com.p019vk.push.core.network.utils.ExtensionsKt.getHostInfoHttpBuilder(r4)
            java.lang.String r5 = "v1/multihost/list"
            r4.m969b(r5)
            D40 r4 = r4.m970c()
            uF r5 = new uF
            r6 = 9
            r7 = 0
            r5.<init>(r6, r7)
            r5.f43616a = r4
            r5.m25132C(r9)
            qR0 r9 = r5.m25141o()
            ox0 r1 = com.p019vk.push.core.network.data.source.MasterHostApi.access$getOkHttpClient$p(r1)
            DN0 r9 = r1.m23580b(r9)
            r8.f6287b = r3     // Catch: java.lang.Exception -> L13
            java.lang.Object r9 = com.p019vk.push.core.network.utils.CallHandlerKt.await(r9, r8)     // Catch: java.lang.Exception -> L13
            if (r9 != r0) goto L7b
            return r0
        L7b:
            HS0 r9 = (p000.HS0) r9     // Catch: java.lang.Exception -> L13
            GK r1 = p000.C0399GK.f3694a     // Catch: java.lang.Exception -> L13
            QF r1 = p000.ExecutorC1023QF.f9548c     // Catch: java.lang.Exception -> L13
            com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1 r3 = new com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1     // Catch: java.lang.Exception -> L13
            r4 = 0
            r3.<init>(r9, r4)     // Catch: java.lang.Exception -> L13
            r8.f6286a = r9     // Catch: java.lang.Exception -> L13
            r8.f6287b = r2     // Catch: java.lang.Exception -> L13
            java.lang.Object r1 = p000.AbstractC9366fP1.m18233e(r1, r3, r8)     // Catch: java.lang.Exception -> L13
            if (r1 != r0) goto L92
            return r0
        L92:
            r0 = r9
            r9 = r1
        L94:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L13
            boolean r1 = com.p019vk.push.core.network.utils.ResponseErrorKt.hasErrorBody(r9)     // Catch: java.lang.Exception -> L13
            if (r1 == 0) goto Lb2
            com.vk.push.core.network.model.ResponseError r9 = com.p019vk.push.core.network.utils.ResponseErrorKt.parseErrorResponse(r9)     // Catch: java.lang.Exception -> L13
            com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException r0 = new com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Exception -> L13
            int r9 = r9.getCode()     // Catch: java.lang.Exception -> L13
            r0.<init>(r1, r9)     // Catch: java.lang.Exception -> L13
            OS0 r9 = p000.RQ1.m7015b(r0)     // Catch: java.lang.Exception -> L13
            goto Ld5
        Lb2:
            boolean r1 = r0.m3428n()     // Catch: java.lang.Exception -> L13
            if (r1 == 0) goto Lc3
            com.vk.push.core.network.utils.AppInfoJsonParser r0 = com.p019vk.push.core.network.utils.AppInfoJsonParser.INSTANCE     // Catch: java.lang.Exception -> L13
            java.util.List r9 = r0.parseAppInfoList(r9)     // Catch: java.lang.Exception -> L13
            java.util.List r9 = com.p019vk.push.core.network.utils.MapperKt.getSortedAppInfoListByArbiter(r9)     // Catch: java.lang.Exception -> L13
            goto Ld5
        Lc3:
            com.vk.push.core.network.exception.VkpnsRequestException r9 = new com.vk.push.core.network.exception.VkpnsRequestException     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = r0.f4297c     // Catch: java.lang.Exception -> L13
            int r0 = r0.f4298d     // Catch: java.lang.Exception -> L13
            r9.<init>(r1, r0)     // Catch: java.lang.Exception -> L13
            OS0 r9 = p000.RQ1.m7015b(r9)     // Catch: java.lang.Exception -> L13
            goto Ld5
        Ld1:
            OS0 r9 = p000.RQ1.m7015b(r9)
        Ld5:
            PS0 r0 = new PS0
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7860Kn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
