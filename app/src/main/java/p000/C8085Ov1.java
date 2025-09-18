package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: Ov1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8085Ov1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public C8028Nt0 f8682a;

    /* renamed from: b */
    public C8083Ou1 f8683b;

    /* renamed from: c */
    public boolean f8684c;

    /* renamed from: d */
    public int f8685d;

    /* renamed from: e */
    public /* synthetic */ Object f8686e;

    /* renamed from: f */
    public final /* synthetic */ C8083Ou1 f8687f;

    /* renamed from: g */
    public final /* synthetic */ boolean f8688g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8085Ov1(C8083Ou1 c8083Ou1, boolean z, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f8687f = c8083Ou1;
        this.f8688g = z;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C8085Ov1 c8085Ov1 = new C8085Ov1(this.f8687f, this.f8688g, interfaceC1382Vy);
        c8085Ov1.f8686e = obj;
        return c8085Ov1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8085Ov1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[PHI: r9
  0x0092: PHI (r9v18 java.lang.Object) = (r9v10 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x008f, B:6:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r8.f8685d
            java.lang.String r2 = "Something went wrong, deferred is null"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            p000.RQ1.m7017d(r9)
            goto L92
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            boolean r1 = r8.f8684c
            Ou1 r4 = r8.f8683b
            Nt0 r6 = r8.f8682a
            java.lang.Object r7 = r8.f8686e
            Lz r7 = (p000.InterfaceC0754Lz) r7
            p000.RQ1.m7017d(r9)
            goto L61
        L2a:
            p000.RQ1.m7017d(r9)
            java.lang.Object r9 = r8.f8686e
            r7 = r9
            Lz r7 = (p000.InterfaceC0754Lz) r7
            Ou1 r9 = r8.f8687f
            lH r9 = r9.f8674f
            if (r9 == 0) goto L49
            boolean r9 = r8.f8688g
            if (r9 != 0) goto L49
            Ou1 r9 = r8.f8687f
            lH r9 = r9.f8674f
            if (r9 == 0) goto L43
            goto L83
        L43:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L49:
            Ou1 r9 = r8.f8687f
            Nt0 r6 = r9.f8675g
            boolean r1 = r8.f8688g
            r8.f8686e = r7
            r8.f8682a = r6
            r8.f8683b = r9
            r8.f8684c = r1
            r8.f8685d = r4
            java.lang.Object r4 = r6.m5899d(r8)
            if (r4 != r0) goto L60
            return r0
        L60:
            r4 = r9
        L61:
            lH r9 = r4.f8674f     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L74
            if (r1 != 0) goto L74
            lH r9 = r4.f8674f     // Catch: java.lang.Throwable -> L72
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
            lH r9 = p000.AbstractC9366fP1.m18229a(r7, r9)     // Catch: java.lang.Throwable -> L72
            r4.f8674f = r9     // Catch: java.lang.Throwable -> L72
        L80:
            r6.m5900e(r5)
        L83:
            r8.f8686e = r5
            r8.f8682a = r5
            r8.f8683b = r5
            r8.f8685d = r3
            java.lang.Object r9 = r9.m10809k(r8)
            if (r9 != r0) goto L92
            return r0
        L92:
            return r9
        L93:
            r6.m5900e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8085Ov1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
