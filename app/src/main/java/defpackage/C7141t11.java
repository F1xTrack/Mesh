package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: t11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7141t11 extends AbstractC4286i71 implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ I11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7141t11(I11 i11, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = i11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C7141t11 c7141t11 = new C7141t11(this.c, interfaceC1729Vy);
        c7141t11.b = obj;
        return c7141t11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7141t11) create((AbstractC6950s11) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[RETURN] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r6.a
            Tf1 r2 = defpackage.C1518Tf1.a
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
            defpackage.RQ1.d(r7)
            goto L78
        L1b:
            defpackage.RQ1.d(r7)
            java.lang.Object r7 = r6.b
            s11 r7 = (defpackage.AbstractC6950s11) r7
            boolean r1 = r7 instanceof defpackage.C6569q11
            I11 r5 = r6.c
            if (r1 == 0) goto L69
            q11 r7 = (defpackage.C6569q11) r7
            r6.a = r4
            B41 r1 = r5.f
            java.lang.Object r1 = r1.e()
            z41 r1 = (defpackage.AbstractC8295z41) r1
            boolean r3 = r1 instanceof defpackage.AC
            if (r3 == 0) goto L39
            goto L5d
        L39:
            boolean r3 = r1 instanceof defpackage.C6064nN0
            if (r3 == 0) goto L4a
            z41 r7 = r7.a
            if (r1 != r7) goto L48
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L48
            goto L5e
        L48:
            r7 = r2
            goto L5e
        L4a:
            Mf1 r7 = defpackage.C0972Mf1.a
            boolean r7 = defpackage.O90.a(r1, r7)
            if (r7 == 0) goto L59
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L48
            goto L5e
        L59:
            boolean r7 = r1 instanceof defpackage.C8181yU
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
            boolean r1 = r7 instanceof defpackage.C6759r11
            if (r1 == 0) goto L78
            r11 r7 = (defpackage.C6759r11) r7
            r6.a = r3
            java.lang.Object r7 = defpackage.I11.b(r5, r7, r6)
            if (r7 != r0) goto L78
            return r0
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7141t11.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
