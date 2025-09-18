package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: Ov1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1176Ov1 extends AbstractC4286i71 implements Function2 {
    public C1091Nt0 a;
    public C1173Ou1 b;
    public boolean c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1173Ou1 f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176Ov1(C1173Ou1 c1173Ou1, boolean z, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.f = c1173Ou1;
        this.g = z;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C1176Ov1 c1176Ov1 = new C1176Ov1(this.f, this.g, interfaceC1729Vy);
        c1176Ov1.e = obj;
        return c1176Ov1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1176Ov1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[PHI: r9
  0x0092: PHI (r9v18 java.lang.Object) = (r9v10 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x008f, B:6:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r8.d
            java.lang.String r2 = "Something went wrong, deferred is null"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            defpackage.RQ1.d(r9)
            goto L92
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            boolean r1 = r8.c
            Ou1 r4 = r8.b
            Nt0 r6 = r8.a
            java.lang.Object r7 = r8.e
            Lz r7 = (defpackage.InterfaceC0952Lz) r7
            defpackage.RQ1.d(r9)
            goto L61
        L2a:
            defpackage.RQ1.d(r9)
            java.lang.Object r9 = r8.e
            r7 = r9
            Lz r7 = (defpackage.InterfaceC0952Lz) r7
            Ou1 r9 = r8.f
            lH r9 = r9.f
            if (r9 == 0) goto L49
            boolean r9 = r8.g
            if (r9 != 0) goto L49
            Ou1 r9 = r8.f
            lH r9 = r9.f
            if (r9 == 0) goto L43
            goto L83
        L43:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L49:
            Ou1 r9 = r8.f
            Nt0 r6 = r9.g
            boolean r1 = r8.g
            r8.e = r7
            r8.a = r6
            r8.b = r9
            r8.c = r1
            r8.d = r4
            java.lang.Object r4 = r6.d(r8)
            if (r4 != r0) goto L60
            return r0
        L60:
            r4 = r9
        L61:
            lH r9 = r4.f     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L74
            if (r1 != 0) goto L74
            lH r9 = r4.f     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L6c
            goto L80
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L72
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L72
            throw r9     // Catch: java.lang.Throwable -> L72
        L72:
            r9 = move-exception
            goto L93
        L74:
            lv1 r9 = new lv1     // Catch: java.lang.Throwable -> L72
            r1 = 1
            r9.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L72
            lH r9 = defpackage.AbstractC3767fP1.a(r7, r9)     // Catch: java.lang.Throwable -> L72
            r4.f = r9     // Catch: java.lang.Throwable -> L72
        L80:
            r6.e(r5)
        L83:
            r8.e = r5
            r8.a = r5
            r8.b = r5
            r8.d = r3
            java.lang.Object r9 = r9.k(r8)
            if (r9 != r0) goto L92
            return r0
        L92:
            return r9
        L93:
            r6.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1176Ov1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
