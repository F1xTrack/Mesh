package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: kS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5507kS1 {
    public static final C3905g8 a(AbstractC0663Ig0 abstractC0663Ig0) {
        C0577Hd1 c0577Hd1;
        O90.f(abstractC0663Ig0, "type");
        if (AbstractC4075h12.d(abstractC0663Ig0)) {
            C3905g8 c3905g8A = a(AbstractC4075h12.e(abstractC0663Ig0));
            C3905g8 c3905g8A2 = a(AbstractC4075h12.j(abstractC0663Ig0));
            return new C3905g8(EZ1.l(NV1.t(AbstractC4075h12.e((AbstractC0663Ig0) c3905g8A.a), AbstractC4075h12.j((AbstractC0663Ig0) c3905g8A2.a)), abstractC0663Ig0), EZ1.l(NV1.t(AbstractC4075h12.e((AbstractC0663Ig0) c3905g8A.b), AbstractC4075h12.j((AbstractC0663Ig0) c3905g8A2.b)), abstractC0663Ig0));
        }
        InterfaceC1200Pd1 interfaceC1200Pd1E = abstractC0663Ig0.E();
        boolean z = true;
        if (abstractC0663Ig0.E() instanceof InterfaceC5959mq) {
            O90.d(interfaceC1200Pd1E, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            AbstractC6689qe1 abstractC6689qe1D = ((InterfaceC5959mq) interfaceC1200Pd1E).d();
            AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1D.b();
            O90.e(abstractC0663Ig0B, "getType(...)");
            AbstractC0663Ig0 abstractC0663Ig0H = AbstractC0112Be1.h(abstractC0663Ig0B, abstractC0663Ig0.G());
            int iOrdinal = abstractC6689qe1D.a().ordinal();
            if (iOrdinal == 1) {
                X01 x01O = CZ1.f(abstractC0663Ig0).o();
                O90.e(x01O, "getNullableAnyType(...)");
                return new C3905g8(abstractC0663Ig0H, x01O);
            }
            if (iOrdinal == 2) {
                return new C3905g8(AbstractC0112Be1.h(CZ1.f(abstractC0663Ig0).n(), abstractC0663Ig0.G()), abstractC0663Ig0H);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + abstractC6689qe1D);
        }
        if (abstractC0663Ig0.u().isEmpty() || abstractC0663Ig0.u().size() != interfaceC1200Pd1E.getParameters().size()) {
            return new C3905g8(abstractC0663Ig0, abstractC0663Ig0);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listU = abstractC0663Ig0.u();
        List parameters = interfaceC1200Pd1E.getParameters();
        O90.e(parameters, "getParameters(...)");
        Iterator it = AbstractC8069xu.i0(listU, parameters).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            AbstractC6689qe1 abstractC6689qe1 = (AbstractC6689qe1) pair.a;
            InterfaceC5925me1 interfaceC5925me1 = (InterfaceC5925me1) pair.b;
            O90.c(interfaceC5925me1);
            EnumC4015gi1 enumC4015gi1O = interfaceC5925me1.O();
            if (enumC4015gi1O == null) {
                C7833we1.a(35);
                throw null;
            }
            if (abstractC6689qe1 == null) {
                C7833we1.a(36);
                throw null;
            }
            C7833we1 c7833we1 = C7833we1.b;
            int iOrdinal2 = (abstractC6689qe1.c() ? EnumC4015gi1.e : C7833we1.b(enumC4015gi1O, abstractC6689qe1.a())).ordinal();
            if (iOrdinal2 == 0) {
                AbstractC0663Ig0 abstractC0663Ig0B2 = abstractC6689qe1.b();
                O90.e(abstractC0663Ig0B2, "getType(...)");
                AbstractC0663Ig0 abstractC0663Ig0B3 = abstractC6689qe1.b();
                O90.e(abstractC0663Ig0B3, "getType(...)");
                c0577Hd1 = new C0577Hd1(interfaceC5925me1, abstractC0663Ig0B2, abstractC0663Ig0B3);
            } else if (iOrdinal2 == 1) {
                AbstractC0663Ig0 abstractC0663Ig0B4 = abstractC6689qe1.b();
                O90.e(abstractC0663Ig0B4, "getType(...)");
                X01 x01O2 = AbstractC7384uI.e(interfaceC5925me1).o();
                O90.e(x01O2, "getNullableAnyType(...)");
                c0577Hd1 = new C0577Hd1(interfaceC5925me1, abstractC0663Ig0B4, x01O2);
            } else {
                if (iOrdinal2 != 2) {
                    throw new C7074sg();
                }
                X01 x01N = AbstractC7384uI.e(interfaceC5925me1).n();
                AbstractC0663Ig0 abstractC0663Ig0B5 = abstractC6689qe1.b();
                O90.e(abstractC0663Ig0B5, "getType(...)");
                c0577Hd1 = new C0577Hd1(interfaceC5925me1, x01N, abstractC0663Ig0B5);
            }
            if (abstractC6689qe1.c()) {
                arrayList.add(c0577Hd1);
                arrayList2.add(c0577Hd1);
            } else {
                C3905g8 c3905g8A3 = a(c0577Hd1.b);
                AbstractC0663Ig0 abstractC0663Ig02 = (AbstractC0663Ig0) c3905g8A3.a;
                AbstractC0663Ig0 abstractC0663Ig03 = (AbstractC0663Ig0) c3905g8A3.b;
                C3905g8 c3905g8A4 = a(c0577Hd1.c);
                AbstractC0663Ig0 abstractC0663Ig04 = (AbstractC0663Ig0) c3905g8A4.a;
                AbstractC0663Ig0 abstractC0663Ig05 = (AbstractC0663Ig0) c3905g8A4.b;
                InterfaceC5925me1 interfaceC5925me12 = c0577Hd1.a;
                C0577Hd1 c0577Hd12 = new C0577Hd1(interfaceC5925me12, abstractC0663Ig03, abstractC0663Ig04);
                C0577Hd1 c0577Hd13 = new C0577Hd1(interfaceC5925me12, abstractC0663Ig02, abstractC0663Ig05);
                arrayList.add(c0577Hd12);
                arrayList2.add(c0577Hd13);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0577Hd1 c0577Hd14 = (C0577Hd1) it2.next();
                c0577Hd14.getClass();
                if (!InterfaceC0819Kg0.a.b(c0577Hd14.b, c0577Hd14.c)) {
                    break;
                }
            }
            z = false;
        }
        return new C3905g8(z ? CZ1.f(abstractC0663Ig0).n() : d(abstractC0663Ig0, arrayList), d(abstractC0663Ig0, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.AbstractC0663Ig0 d(defpackage.AbstractC0663Ig0 r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.u()
            r0.size()
            r8.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.AbstractC8449zu.k(r8)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L17:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L99
            java.lang.Object r1 = r8.next()
            Hd1 r1 = (defpackage.C0577Hd1) r1
            r1.getClass()
            wv0 r3 = defpackage.InterfaceC0819Kg0.a
            Ig0 r4 = r1.b
            Ig0 r5 = r1.c
            r3.b(r4, r5)
            boolean r3 = defpackage.O90.a(r4, r5)
            if (r3 != 0) goto L8f
            me1 r1 = r1.a
            gi1 r3 = r1.O()
            gi1 r6 = defpackage.EnumC4015gi1.d
            if (r3 != r6) goto L41
            goto L8f
        L41:
            boolean r3 = defpackage.AbstractC8408zg0.E(r4)
            if (r3 == 0) goto L5d
            gi1 r3 = r1.O()
            if (r3 == r6) goto L5d
            s41 r2 = new s41
            gi1 r3 = defpackage.EnumC4015gi1.e
            gi1 r1 = r1.O()
            if (r3 != r1) goto L59
            gi1 r3 = defpackage.EnumC4015gi1.c
        L59:
            r2.<init>(r5, r3)
            goto L94
        L5d:
            if (r5 == 0) goto L89
            boolean r2 = defpackage.AbstractC8408zg0.x(r5)
            if (r2 == 0) goto L79
            boolean r2 = r5.G()
            if (r2 == 0) goto L79
            s41 r2 = new s41
            gi1 r1 = r1.O()
            if (r6 != r1) goto L75
            gi1 r6 = defpackage.EnumC4015gi1.c
        L75:
            r2.<init>(r4, r6)
            goto L94
        L79:
            s41 r2 = new s41
            gi1 r3 = defpackage.EnumC4015gi1.e
            gi1 r1 = r1.O()
            if (r3 != r1) goto L85
            gi1 r3 = defpackage.EnumC4015gi1.c
        L85:
            r2.<init>(r5, r3)
            goto L94
        L89:
            r7 = 141(0x8d, float:1.98E-43)
            defpackage.AbstractC8408zg0.a(r7)
            throw r2
        L8f:
            s41 r2 = new s41
            r2.<init>(r4)
        L94:
            r0.add(r2)
            goto L17
        L99:
            r8 = 6
            Ig0 r7 = defpackage.AbstractC8198yZ1.c(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5507kS1.d(Ig0, java.util.ArrayList):Ig0");
    }

    public C0540Gr0 b(C0774Jr0 c0774Jr0) {
        ByteBuffer byteBuffer = c0774Jr0.e;
        byteBuffer.getClass();
        YN1.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return c(c0774Jr0, byteBuffer);
    }

    public abstract C0540Gr0 c(C0774Jr0 c0774Jr0, ByteBuffer byteBuffer);
}
