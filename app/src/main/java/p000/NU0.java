package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class NU0 extends AbstractC1571Yy implements InterfaceC6748rW {

    /* renamed from: a */
    public final InterfaceC6748rW f7807a;

    /* renamed from: b */
    public final InterfaceC0125Bz f7808b;

    /* renamed from: c */
    public final int f7809c;

    /* renamed from: d */
    public InterfaceC0125Bz f7810d;

    /* renamed from: e */
    public InterfaceC1382Vy f7811e;

    public NU0(InterfaceC6748rW interfaceC6748rW, InterfaceC0125Bz interfaceC0125Bz) {
        super(C6456mv.f37991c, C0591JN.f5499a);
        this.f7807a = interfaceC6748rW;
        this.f7808b = interfaceC0125Bz;
        this.f7809c = ((Number) interfaceC0125Bz.mo938j(0, new C0188Cz(3))).intValue();
    }

    @Override // p000.InterfaceC6748rW
    public final Object emit(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        try {
            Object objM5725f = m5725f(interfaceC1382Vy, obj);
            return objM5725f == EnumC0817Mz.f7418a ? objM5725f : C8313Tf1.f11463a;
        } catch (Throwable th) {
            this.f7810d = new C4047fL(interfaceC1382Vy.getContext(), th);
            throw th;
        }
    }

    /* renamed from: f */
    public final Object m5725f(InterfaceC1382Vy interfaceC1382Vy, Object obj) {
        InterfaceC0125Bz context = interfaceC1382Vy.getContext();
        M22.m5248b(context);
        InterfaceC0125Bz interfaceC0125Bz = this.f7810d;
        if (interfaceC0125Bz != context) {
            if (interfaceC0125Bz instanceof C4047fL) {
                throw new IllegalStateException(AbstractC11501w51.m25562c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C4047fL) interfaceC0125Bz).f27140b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.mo938j(0, new Function2() { // from class: QU0
                /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                    /*
                        r3 = this;
                        java.lang.Integer r4 = (java.lang.Integer) r4
                        int r4 = r4.intValue()
                        zz r5 = (p000.InterfaceC7298zz) r5
                        Az r0 = r5.getKey()
                        NU0 r1 = r3.f9644a
                        Bz r1 = r1.f7808b
                        zz r1 = r1.mo937g(r0)
                        Ev0 r2 = p000.C7564Ev0.f2962e
                        if (r0 == r2) goto L20
                        if (r5 == r1) goto L1d
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        goto L34
                    L1d:
                        int r4 = r4 + 1
                        goto L34
                    L20:
                        Ob0 r1 = (p000.InterfaceC8044Ob0) r1
                        Ob0 r5 = (p000.InterfaceC8044Ob0) r5
                    L24:
                        r0 = 0
                        if (r5 != 0) goto L29
                        r5 = r0
                        goto L30
                    L29:
                        if (r5 != r1) goto L2c
                        goto L30
                    L2c:
                        boolean r2 = r5 instanceof p000.JV0
                        if (r2 != 0) goto L5e
                    L30:
                        if (r5 != r1) goto L39
                        if (r1 != 0) goto L1d
                    L34:
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        return r4
                    L39:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                        r0.<init>(r2)
                        r0.append(r5)
                        java.lang.String r5 = ", expected child of "
                        r0.append(r5)
                        r0.append(r1)
                        java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                        r0.append(r5)
                        java.lang.String r5 = r0.toString()
                        java.lang.String r5 = r5.toString()
                        r4.<init>(r5)
                        throw r4
                    L5e:
                        JV0 r5 = (p000.JV0) r5
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.C9002cc0.f17648b
                        java.lang.Object r5 = r2.get(r5)
                        Fr r5 = (p000.InterfaceC0369Fr) r5
                        if (r5 == 0) goto L6f
                        Ob0 r5 = r5.getParent()
                        goto L24
                    L6f:
                        r5 = r0
                        goto L24
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.QU0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            })).intValue() != this.f7809c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f7808b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f7810d = context;
        }
        this.f7811e = interfaceC1382Vy;
        OU0 ou0 = PU0.f9085a;
        InterfaceC6748rW interfaceC6748rW = this.f7807a;
        O90.m5966d(interfaceC6748rW, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        ou0.getClass();
        Object objEmit = interfaceC6748rW.emit(obj, this);
        if (!O90.m5963a(objEmit, EnumC0817Mz.f7418a)) {
            this.f7811e = null;
        }
        return objEmit;
    }

    @Override // p000.AbstractC1300Uf, p000.InterfaceC0880Nz
    public final InterfaceC0880Nz getCallerFrame() {
        InterfaceC1382Vy interfaceC1382Vy = this.f7811e;
        if (interfaceC1382Vy instanceof InterfaceC0880Nz) {
            return (InterfaceC0880Nz) interfaceC1382Vy;
        }
        return null;
    }

    @Override // p000.AbstractC1571Yy, p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        InterfaceC0125Bz interfaceC0125Bz = this.f7810d;
        return interfaceC0125Bz == null ? C0591JN.f5499a : interfaceC0125Bz;
    }

    @Override // p000.AbstractC1300Uf
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Throwable thM6365a = PS0.m6365a(obj);
        if (thM6365a != null) {
            this.f7810d = new C4047fL(getContext(), thM6365a);
        }
        InterfaceC1382Vy interfaceC1382Vy = this.f7811e;
        if (interfaceC1382Vy != null) {
            interfaceC1382Vy.resumeWith(obj);
        }
        return EnumC0817Mz.f7418a;
    }
}
