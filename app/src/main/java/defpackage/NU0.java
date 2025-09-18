package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class NU0 extends AbstractC1963Yy implements InterfaceC6853rW {
    public final InterfaceC6853rW a;
    public final InterfaceC0173Bz b;
    public final int c;
    public InterfaceC0173Bz d;
    public InterfaceC1729Vy e;

    public NU0(InterfaceC6853rW interfaceC6853rW, InterfaceC0173Bz interfaceC0173Bz) {
        super(C5974mv.c, JN.a);
        this.a = interfaceC6853rW;
        this.b = interfaceC0173Bz;
        this.c = ((Number) interfaceC0173Bz.j(0, new C0251Cz(3))).intValue();
    }

    @Override // defpackage.InterfaceC6853rW
    public final Object emit(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        try {
            Object objF = f(interfaceC1729Vy, obj);
            return objF == EnumC1030Mz.a ? objF : C1518Tf1.a;
        } catch (Throwable th) {
            this.d = new C3753fL(interfaceC1729Vy.getContext(), th);
            throw th;
        }
    }

    public final Object f(InterfaceC1729Vy interfaceC1729Vy, Object obj) {
        InterfaceC0173Bz context = interfaceC1729Vy.getContext();
        M22.b(context);
        InterfaceC0173Bz interfaceC0173Bz = this.d;
        if (interfaceC0173Bz != context) {
            if (interfaceC0173Bz instanceof C3753fL) {
                throw new IllegalStateException(AbstractC7728w51.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C3753fL) interfaceC0173Bz).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.j(0, new Function2() { // from class: QU0
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
                        zz r5 = (defpackage.InterfaceC8464zz) r5
                        Az r0 = r5.getKey()
                        NU0 r1 = r3.a
                        Bz r1 = r1.b
                        zz r1 = r1.g(r0)
                        Ev0 r2 = defpackage.C0396Ev0.e
                        if (r0 == r2) goto L20
                        if (r5 == r1) goto L1d
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        goto L34
                    L1d:
                        int r4 = r4 + 1
                        goto L34
                    L20:
                        Ob0 r1 = (defpackage.InterfaceC1115Ob0) r1
                        Ob0 r5 = (defpackage.InterfaceC1115Ob0) r5
                    L24:
                        r0 = 0
                        if (r5 != 0) goto L29
                        r5 = r0
                        goto L30
                    L29:
                        if (r5 != r1) goto L2c
                        goto L30
                    L2c:
                        boolean r2 = r5 instanceof defpackage.JV0
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
                        JV0 r5 = (defpackage.JV0) r5
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.C2548cc0.b
                        java.lang.Object r5 = r2.get(r5)
                        Fr r5 = (defpackage.InterfaceC0461Fr) r5
                        if (r5 == 0) goto L6f
                        Ob0 r5 = r5.getParent()
                        goto L24
                    L6f:
                        r5 = r0
                        goto L24
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.QU0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = interfaceC1729Vy;
        OU0 ou0 = PU0.a;
        InterfaceC6853rW interfaceC6853rW = this.a;
        O90.d(interfaceC6853rW, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        ou0.getClass();
        Object objEmit = interfaceC6853rW.emit(obj, this);
        if (!O90.a(objEmit, EnumC1030Mz.a)) {
            this.e = null;
        }
        return objEmit;
    }

    @Override // defpackage.AbstractC1594Uf, defpackage.InterfaceC1108Nz
    public final InterfaceC1108Nz getCallerFrame() {
        InterfaceC1729Vy interfaceC1729Vy = this.e;
        if (interfaceC1729Vy instanceof InterfaceC1108Nz) {
            return (InterfaceC1108Nz) interfaceC1729Vy;
        }
        return null;
    }

    @Override // defpackage.AbstractC1963Yy, defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        InterfaceC0173Bz interfaceC0173Bz = this.d;
        return interfaceC0173Bz == null ? JN.a : interfaceC0173Bz;
    }

    @Override // defpackage.AbstractC1594Uf
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Throwable thA = PS0.a(obj);
        if (thA != null) {
            this.d = new C3753fL(getContext(), thA);
        }
        InterfaceC1729Vy interfaceC1729Vy = this.e;
        if (interfaceC1729Vy != null) {
            interfaceC1729Vy.resumeWith(obj);
        }
        return EnumC1030Mz.a;
    }
}
