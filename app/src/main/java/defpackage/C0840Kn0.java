package defpackage;

import com.vk.push.core.network.data.source.MasterHostApi;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: Kn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0840Kn0 extends AbstractC4286i71 implements Function2 {
    public HS0 a;
    public int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ MasterHostApi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840Kn0(List list, MasterHostApi masterHostApi, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = list;
        this.d = masterHostApi;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0840Kn0(this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0840Kn0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:23:0x0094, B:25:0x009c, B:26:0x00b2, B:28:0x00b8, B:29:0x00c3, B:13:0x001e, B:19:0x007b, B:16:0x0072), top: B:34:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:23:0x0094, B:25:0x009c, B:26:0x00b2, B:28:0x00b8, B:29:0x00c3, B:13:0x001e, B:19:0x007b, B:16:0x0072), top: B:34:0x0006 }] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            HS0 r0 = r8.a
            defpackage.RQ1.d(r9)     // Catch: java.lang.Exception -> L13
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
            defpackage.RQ1.d(r9)     // Catch: java.lang.Exception -> L13
            goto L7b
        L22:
            defpackage.RQ1.d(r9)
            org.json.JSONArray r9 = new org.json.JSONArray
            java.util.List r1 = r8.c
            java.util.Collection r1 = (java.util.Collection) r1
            r9.<init>(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r4 = "packages"
            org.json.JSONObject r9 = r1.put(r4, r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "JSONObject()\n           …              .toString()"
            defpackage.O90.e(r9, r1)
            tR0 r9 = com.vk.push.core.network.utils.RequestBodyKt.toJsonRequestBody(r9)
            com.vk.push.core.network.data.source.MasterHostApi r1 = r8.d
            com.vk.push.common.HostInfoProvider r4 = com.vk.push.core.network.data.source.MasterHostApi.access$getHostInfoProvider$p(r1)
            C40 r4 = com.vk.push.core.network.utils.ExtensionsKt.getHostInfoHttpBuilder(r4)
            java.lang.String r5 = "v1/multihost/list"
            r4.b(r5)
            D40 r4 = r4.c()
            uF r5 = new uF
            r6 = 9
            r7 = 0
            r5.<init>(r6, r7)
            r5.a = r4
            r5.C(r9)
            qR0 r9 = r5.o()
            ox0 r1 = com.vk.push.core.network.data.source.MasterHostApi.access$getOkHttpClient$p(r1)
            DN0 r9 = r1.b(r9)
            r8.b = r3     // Catch: java.lang.Exception -> L13
            java.lang.Object r9 = com.vk.push.core.network.utils.CallHandlerKt.await(r9, r8)     // Catch: java.lang.Exception -> L13
            if (r9 != r0) goto L7b
            return r0
        L7b:
            HS0 r9 = (defpackage.HS0) r9     // Catch: java.lang.Exception -> L13
            GK r1 = defpackage.GK.a     // Catch: java.lang.Exception -> L13
            QF r1 = defpackage.QF.c     // Catch: java.lang.Exception -> L13
            com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1 r3 = new com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1     // Catch: java.lang.Exception -> L13
            r4 = 0
            r3.<init>(r9, r4)     // Catch: java.lang.Exception -> L13
            r8.a = r9     // Catch: java.lang.Exception -> L13
            r8.b = r2     // Catch: java.lang.Exception -> L13
            java.lang.Object r1 = defpackage.AbstractC3767fP1.e(r1, r3, r8)     // Catch: java.lang.Exception -> L13
            if (r1 != r0) goto L92
            return r0
        L92:
            r0 = r9
            r9 = r1
        L94:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L13
            boolean r1 = com.vk.push.core.network.utils.ResponseErrorKt.hasErrorBody(r9)     // Catch: java.lang.Exception -> L13
            if (r1 == 0) goto Lb2
            com.vk.push.core.network.model.ResponseError r9 = com.vk.push.core.network.utils.ResponseErrorKt.parseErrorResponse(r9)     // Catch: java.lang.Exception -> L13
            com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException r0 = new com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Exception -> L13
            int r9 = r9.getCode()     // Catch: java.lang.Exception -> L13
            r0.<init>(r1, r9)     // Catch: java.lang.Exception -> L13
            OS0 r9 = defpackage.RQ1.b(r0)     // Catch: java.lang.Exception -> L13
            goto Ld5
        Lb2:
            boolean r1 = r0.n()     // Catch: java.lang.Exception -> L13
            if (r1 == 0) goto Lc3
            com.vk.push.core.network.utils.AppInfoJsonParser r0 = com.vk.push.core.network.utils.AppInfoJsonParser.INSTANCE     // Catch: java.lang.Exception -> L13
            java.util.List r9 = r0.parseAppInfoList(r9)     // Catch: java.lang.Exception -> L13
            java.util.List r9 = com.vk.push.core.network.utils.MapperKt.getSortedAppInfoListByArbiter(r9)     // Catch: java.lang.Exception -> L13
            goto Ld5
        Lc3:
            com.vk.push.core.network.exception.VkpnsRequestException r9 = new com.vk.push.core.network.exception.VkpnsRequestException     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = r0.c     // Catch: java.lang.Exception -> L13
            int r0 = r0.d     // Catch: java.lang.Exception -> L13
            r9.<init>(r1, r0)     // Catch: java.lang.Exception -> L13
            OS0 r9 = defpackage.RQ1.b(r9)     // Catch: java.lang.Exception -> L13
            goto Ld5
        Ld1:
            OS0 r9 = defpackage.RQ1.b(r9)
        Ld5:
            PS0 r0 = new PS0
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0840Kn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
