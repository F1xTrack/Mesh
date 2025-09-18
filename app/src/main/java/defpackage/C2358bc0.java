package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: bc0 */
/* loaded from: classes2.dex */
public final class C2358bc0 extends NS0 implements Function2 {
    public C0786Jv0 b;
    public C2194al0 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2548cc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2358bc0(InterfaceC1729Vy interfaceC1729Vy, C2548cc0 c2548cc0) {
        super(interfaceC1729Vy);
        this.f = c2548cc0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C2358bc0 c2358bc0 = new C2358bc0(interfaceC1729Vy, this.f);
        c2358bc0.e = obj;
        return c2358bc0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2358bc0) create((C3602eY0) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x006a -> B:53:0x0082). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r7.d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            al0 r1 = r7.c
            Jv0 r4 = r7.b
            java.lang.Object r5 = r7.e
            eY0 r5 = (defpackage.C3602eY0) r5
            defpackage.RQ1.d(r8)
            goto L82
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            defpackage.RQ1.d(r8)
            goto L87
        L25:
            defpackage.RQ1.d(r8)
            java.lang.Object r8 = r7.e
            eY0 r8 = (defpackage.C3602eY0) r8
            cc0 r1 = r7.f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.C2548cc0.a
            java.lang.Object r1 = r5.get(r1)
            boolean r5 = r1 instanceof defpackage.C0539Gr
            if (r5 == 0) goto L45
            Gr r1 = (defpackage.C0539Gr) r1
            cc0 r1 = r1.e
            r7.d = r4
            r8.b = r1
            r8.a = r2
            r8.d = r7
            return r0
        L45:
            boolean r4 = r1 instanceof defpackage.InterfaceC2268b80
            if (r4 == 0) goto L87
            b80 r1 = (defpackage.InterfaceC2268b80) r1
            Jv0 r1 = r1.c()
            if (r1 == 0) goto L87
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.C2194al0.a
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            defpackage.O90.d(r4, r5)
            al0 r4 = (defpackage.C2194al0) r4
            r5 = r8
            r6 = r4
            r4 = r1
            r1 = r6
        L62:
            boolean r8 = r1.equals(r4)
            if (r8 != 0) goto L87
            boolean r8 = r1 instanceof defpackage.C0539Gr
            if (r8 == 0) goto L82
            r8 = r1
            Gr r8 = (defpackage.C0539Gr) r8
            r7.e = r5
            r7.b = r4
            r7.c = r1
            r7.d = r3
            cc0 r8 = r8.e
            r5.b = r8
            r5.a = r2
            r5.d = r7
            Mz r8 = defpackage.EnumC1030Mz.a
            return r0
        L82:
            al0 r1 = r1.g()
            goto L62
        L87:
            Tf1 r8 = defpackage.C1518Tf1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2358bc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
