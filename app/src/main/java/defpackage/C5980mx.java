package defpackage;

/* renamed from: mx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5980mx extends C0125Bj {
    public final EnumC7274tj m;

    public C5980mx(int i, EnumC7274tj enumC7274tj, InterfaceC6099nZ interfaceC6099nZ) {
        super(i, interfaceC6099nZ);
        this.m = enumC7274tj;
        if (enumC7274tj != EnumC7274tj.a) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC8235ym.g(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + BP0.a.b(C0125Bj.class).f() + " instead").toString());
        }
    }

    public final Object C(Object obj, boolean z) {
        C6344or c6344or;
        InterfaceC6099nZ interfaceC6099nZ;
        C7074sg c7074sgB;
        EnumC7274tj enumC7274tj = EnumC7274tj.c;
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        if (this.m == enumC7274tj) {
            Object objB = super.b(obj);
            if (!(objB instanceof C6153nr) || (objB instanceof C5962mr)) {
                return objB;
            }
            if (!z || (interfaceC6099nZ = this.c) == null || (c7074sgB = QI1.b(interfaceC6099nZ, obj, null)) == null) {
                return c1518Tf1;
            }
            throw c7074sgB;
        }
        Object obj2 = AbstractC0281Dj.d;
        C6344or c6344or2 = (C6344or) C0125Bj.h.get(this);
        while (true) {
            long andIncrement = C0125Bj.d.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zR = r(andIncrement, false);
            int i = AbstractC0281Dj.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c6344or2.c != j3) {
                C6344or c6344orC = C0125Bj.c(this, j3, c6344or2);
                if (c6344orC != null) {
                    c6344or = c6344orC;
                } else if (zR) {
                    return new C5962mr(o());
                }
            } else {
                c6344or = c6344or2;
            }
            int iE = C0125Bj.e(this, c6344or, i2, obj, j, obj2, zR);
            if (iE == 0) {
                c6344or.b();
                return c1518Tf1;
            }
            if (iE == 1) {
                return c1518Tf1;
            }
            if (iE == 2) {
                if (zR) {
                    c6344or.i();
                    return new C5962mr(o());
                }
                InterfaceC6331om1 interfaceC6331om1 = obj2 instanceof InterfaceC6331om1 ? (InterfaceC6331om1) obj2 : null;
                if (interfaceC6331om1 != null) {
                    interfaceC6331om1.b(c6344or, i2 + i);
                }
                j((c6344or.c * j2) + i2);
                return c1518Tf1;
            }
            if (iE == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iE == 4) {
                if (j < C0125Bj.e.get(this)) {
                    c6344or.b();
                }
                return new C5962mr(o());
            }
            if (iE == 5) {
                c6344or.b();
            }
            c6344or2 = c6344or;
        }
    }

    @Override // defpackage.C0125Bj, defpackage.InterfaceC2155aY0
    public final Object a(AbstractC8454zv1 abstractC8454zv1, AbstractC1963Yy abstractC1963Yy) throws Throwable {
        C7074sg c7074sgB;
        if (!(C(abstractC8454zv1, true) instanceof C5962mr)) {
            return C1518Tf1.a;
        }
        InterfaceC6099nZ interfaceC6099nZ = this.c;
        if (interfaceC6099nZ == null || (c7074sgB = QI1.b(interfaceC6099nZ, abstractC8454zv1, null)) == null) {
            throw o();
        }
        I02.a(c7074sgB, o());
        throw c7074sgB;
    }

    @Override // defpackage.C0125Bj, defpackage.InterfaceC2155aY0
    public final Object b(Object obj) {
        return C(obj, false);
    }

    @Override // defpackage.C0125Bj
    public final boolean s() {
        return this.m == EnumC7274tj.b;
    }
}
