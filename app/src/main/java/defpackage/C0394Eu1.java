package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: Eu1 */
/* loaded from: classes2.dex */
public final class C0394Eu1 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ K81 b;
    public final /* synthetic */ C1329Qu1 c;
    public final /* synthetic */ T71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0394Eu1(K81 k81, InterfaceC1729Vy interfaceC1729Vy, C1329Qu1 c1329Qu1, T71 t71) {
        super(2, interfaceC1729Vy);
        this.b = k81;
        this.c = c1329Qu1;
        this.d = t71;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0394Eu1(this.b, interfaceC1729Vy, this.c, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0394Eu1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0059  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r5.a
            Qu1 r2 = r5.c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            defpackage.RQ1.d(r6)
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r6 = r6.a
            goto L41
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            defpackage.RQ1.d(r6)
            goto L30
        L22:
            defpackage.RQ1.d(r6)
            Iu1 r6 = r2.b
            r5.a = r4
            java.lang.Object r6 = r6.invoke(r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r6 = r6.a
            Mo1 r1 = r2.c
            r5.a = r3
            T71 r2 = r5.d
            java.lang.Object r6 = r1.m(r6, r2, r5)
            if (r6 != r0) goto L41
            return r0
        L41:
            boolean r0 = r6 instanceof defpackage.OS0
            Tf1 r1 = defpackage.C1518Tf1.a
            if (r0 != 0) goto L4a
            com.vk.push.core.test.SendTestPushResult r6 = (com.vk.push.core.test.SendTestPushResult) r6
            r6 = r1
        L4a:
            boolean r0 = r6 instanceof defpackage.OS0
            K81 r2 = r5.b
            if (r0 != 0) goto L53
            r2.b(r6)
        L53:
            java.lang.Throwable r6 = defpackage.PS0.a(r6)
            if (r6 == 0) goto L5c
            r2.a(r6)
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0394Eu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
