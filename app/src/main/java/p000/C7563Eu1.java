package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: Eu1 */
/* loaded from: classes2.dex */
public final class C7563Eu1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f2954a;

    /* renamed from: b */
    public final /* synthetic */ K81 f2955b;

    /* renamed from: c */
    public final /* synthetic */ C8187Qu1 f2956c;

    /* renamed from: d */
    public final /* synthetic */ T71 f2957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7563Eu1(K81 k81, InterfaceC1382Vy interfaceC1382Vy, C8187Qu1 c8187Qu1, T71 t71) {
        super(2, interfaceC1382Vy);
        this.f2955b = k81;
        this.f2956c = c8187Qu1;
        this.f2957d = t71;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7563Eu1(this.f2955b, interfaceC1382Vy, this.f2956c, this.f2957d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7563Eu1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0059  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r5.f2954a
            Qu1 r2 = r5.f2956c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            p000.RQ1.m7017d(r6)
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r6 = r6.f9075a
            goto L41
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            p000.RQ1.m7017d(r6)
            goto L30
        L22:
            p000.RQ1.m7017d(r6)
            Iu1 r6 = r2.f9860b
            r5.f2954a = r4
            java.lang.Object r6 = r6.invoke(r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r6 = r6.f9075a
            Mo1 r1 = r2.f9861c
            r5.f2954a = r3
            T71 r2 = r5.f2957d
            java.lang.Object r6 = r1.m5447m(r6, r2, r5)
            if (r6 != r0) goto L41
            return r0
        L41:
            boolean r0 = r6 instanceof p000.OS0
            Tf1 r1 = p000.C8313Tf1.f11463a
            if (r0 != 0) goto L4a
            com.vk.push.core.test.SendTestPushResult r6 = (com.p019vk.push.core.test.SendTestPushResult) r6
            r6 = r1
        L4a:
            boolean r0 = r6 instanceof p000.OS0
            K81 r2 = r5.f2955b
            if (r0 != 0) goto L53
            r2.m4569b(r6)
        L53:
            java.lang.Throwable r6 = p000.PS0.m6365a(r6)
            if (r6 == 0) goto L5c
            r2.m4568a(r6)
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7563Eu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
