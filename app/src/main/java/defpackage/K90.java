package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class K90 extends AbstractC4286i71 implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C7726w5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K90(C7726w5 c7726w5, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c7726w5;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        K90 k90 = new K90(this.b, interfaceC1729Vy);
        k90.a = obj;
        return k90;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K90) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        r1.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        throw r5;
     */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            defpackage.RQ1.d(r5)
            java.lang.Object r5 = r4.a
            Lz r5 = (defpackage.InterfaceC0952Lz) r5
            Bz r5 = r5.b()
            w5 r0 = r4.b
            aa1 r1 = new aa1     // Catch: java.lang.InterruptedException -> L48
            r1.<init>()     // Catch: java.lang.InterruptedException -> L48
            Ev0 r2 = defpackage.C0396Ev0.e     // Catch: java.lang.InterruptedException -> L48
            zz r2 = r5.g(r2)     // Catch: java.lang.InterruptedException -> L48
            Ob0 r2 = (defpackage.InterfaceC1115Ob0) r2     // Catch: java.lang.InterruptedException -> L48
            if (r2 == 0) goto L4f
            r5 = 1
            MK r5 = defpackage.M22.c(r2, r5, r1)     // Catch: java.lang.InterruptedException -> L48
            r1.f = r5     // Catch: java.lang.InterruptedException -> L48
        L25:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.C2162aa1.g     // Catch: java.lang.InterruptedException -> L48
            int r2 = r5.get(r1)     // Catch: java.lang.InterruptedException -> L48
            if (r2 == 0) goto L39
            r5 = 2
            if (r2 == r5) goto L40
            r5 = 3
            if (r2 != r5) goto L34
            goto L40
        L34:
            defpackage.C2162aa1.m(r2)     // Catch: java.lang.InterruptedException -> L48
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L48
        L39:
            r3 = 0
            boolean r5 = r5.compareAndSet(r1, r2, r3)     // Catch: java.lang.InterruptedException -> L48
            if (r5 == 0) goto L25
        L40:
            java.lang.Object r5 = r0.invoke()     // Catch: java.lang.Throwable -> L4a
            r1.l()     // Catch: java.lang.InterruptedException -> L48
            return r5
        L48:
            r5 = move-exception
            goto L67
        L4a:
            r5 = move-exception
            r1.l()     // Catch: java.lang.InterruptedException -> L48
            throw r5     // Catch: java.lang.InterruptedException -> L48
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.InterruptedException -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L48
            java.lang.String r2 = "Current context doesn't contain Job in it: "
            r1.<init>(r2)     // Catch: java.lang.InterruptedException -> L48
            r1.append(r5)     // Catch: java.lang.InterruptedException -> L48
            java.lang.String r5 = r1.toString()     // Catch: java.lang.InterruptedException -> L48
            java.lang.String r5 = r5.toString()     // Catch: java.lang.InterruptedException -> L48
            r0.<init>(r5)     // Catch: java.lang.InterruptedException -> L48
            throw r0     // Catch: java.lang.InterruptedException -> L48
        L67:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
