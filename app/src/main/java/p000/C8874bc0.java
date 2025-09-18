package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: bc0 */
/* loaded from: classes2.dex */
public final class C8874bc0 extends NS0 implements Function2 {

    /* renamed from: b */
    public C7824Jv0 f17083b;

    /* renamed from: c */
    public C8764al0 f17084c;

    /* renamed from: d */
    public int f17085d;

    /* renamed from: e */
    public /* synthetic */ Object f17086e;

    /* renamed from: f */
    public final /* synthetic */ C9002cc0 f17087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8874bc0(InterfaceC1382Vy interfaceC1382Vy, C9002cc0 c9002cc0) {
        super(interfaceC1382Vy);
        this.f17087f = c9002cc0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C8874bc0 c8874bc0 = new C8874bc0(interfaceC1382Vy, this.f17087f);
        c8874bc0.f17086e = obj;
        return c8874bc0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8874bc0) create((C9255eY0) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x006a -> B:53:0x0082). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r7.f17085d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            al0 r1 = r7.f17084c
            Jv0 r4 = r7.f17083b
            java.lang.Object r5 = r7.f17086e
            eY0 r5 = (p000.C9255eY0) r5
            p000.RQ1.m7017d(r8)
            goto L82
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            p000.RQ1.m7017d(r8)
            goto L87
        L25:
            p000.RQ1.m7017d(r8)
            java.lang.Object r8 = r7.f17086e
            eY0 r8 = (p000.C9255eY0) r8
            cc0 r1 = r7.f17087f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.C9002cc0.f17647a
            java.lang.Object r1 = r5.get(r1)
            boolean r5 = r1 instanceof p000.C0432Gr
            if (r5 == 0) goto L45
            Gr r1 = (p000.C0432Gr) r1
            cc0 r1 = r1.f3927e
            r7.f17085d = r4
            r8.f26745b = r1
            r8.f26744a = r2
            r8.f26747d = r7
            return r0
        L45:
            boolean r4 = r1 instanceof p000.InterfaceC8814b80
            if (r4 == 0) goto L87
            b80 r1 = (p000.InterfaceC8814b80) r1
            Jv0 r1 = r1.mo2199c()
            if (r1 == 0) goto L87
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p000.C8764al0.f15682a
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            p000.O90.m5966d(r4, r5)
            al0 r4 = (p000.C8764al0) r4
            r5 = r8
            r6 = r4
            r4 = r1
            r1 = r6
        L62:
            boolean r8 = r1.equals(r4)
            if (r8 != 0) goto L87
            boolean r8 = r1 instanceof p000.C0432Gr
            if (r8 == 0) goto L82
            r8 = r1
            Gr r8 = (p000.C0432Gr) r8
            r7.f17086e = r5
            r7.f17083b = r4
            r7.f17084c = r1
            r7.f17085d = r3
            cc0 r8 = r8.f3927e
            r5.f26745b = r8
            r5.f26744a = r2
            r5.f26747d = r7
            Mz r8 = p000.EnumC0817Mz.f7418a
            return r0
        L82:
            al0 r1 = r1.m9809g()
            goto L62
        L87:
            Tf1 r8 = p000.C8313Tf1.f11463a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8874bc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
