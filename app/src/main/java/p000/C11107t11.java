package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: t11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11107t11 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f42766a;

    /* renamed from: b */
    public /* synthetic */ Object f42767b;

    /* renamed from: c */
    public final /* synthetic */ I11 f42768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11107t11(I11 i11, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f42768c = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C11107t11 c11107t11 = new C11107t11(this.f42768c, interfaceC1382Vy);
        c11107t11.f42767b = obj;
        return c11107t11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11107t11) create((AbstractC10979s11) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[RETURN] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r6.f42766a
            Tf1 r2 = p000.C8313Tf1.f11463a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            p000.RQ1.m7017d(r7)
            goto L78
        L1b:
            p000.RQ1.m7017d(r7)
            java.lang.Object r7 = r6.f42767b
            s11 r7 = (p000.AbstractC10979s11) r7
            boolean r1 = r7 instanceof p000.C10723q11
            I11 r5 = r6.f42768c
            if (r1 == 0) goto L69
            q11 r7 = (p000.C10723q11) r7
            r6.f42766a = r4
            B41 r1 = r5.f4656f
            java.lang.Object r1 = r1.m489e()
            z41 r1 = (p000.AbstractC11880z41) r1
            boolean r3 = r1 instanceof p000.C0013AC
            if (r3 == 0) goto L39
            goto L5d
        L39:
            boolean r3 = r1 instanceof p000.C10385nN0
            if (r3 == 0) goto L4a
            z41 r7 = r7.f40500a
            if (r1 != r7) goto L48
            java.lang.Object r7 = r5.m3726f(r6)
            if (r7 != r0) goto L48
            goto L5e
        L48:
            r7 = r2
            goto L5e
        L4a:
            Mf1 r7 = p000.C7949Mf1.f7295a
            boolean r7 = p000.O90.m5963a(r1, r7)
            if (r7 == 0) goto L59
            java.lang.Object r7 = r5.m3726f(r6)
            if (r7 != r0) goto L48
            goto L5e
        L59:
            boolean r7 = r1 instanceof p000.C7204yU
            if (r7 != 0) goto L61
        L5d:
            goto L48
        L5e:
            if (r7 != r0) goto L78
            return r0
        L61:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            r7.<init>(r0)
            throw r7
        L69:
            boolean r1 = r7 instanceof p000.C10851r11
            if (r1 == 0) goto L78
            r11 r7 = (p000.C10851r11) r7
            r6.f42766a = r3
            java.lang.Object r7 = p000.I11.m3722b(r5, r7, r6)
            if (r7 != r0) goto L78
            return r0
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11107t11.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
