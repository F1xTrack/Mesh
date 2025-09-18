package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: kS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10012kS1 {
    /* renamed from: a */
    public static final C4097g8 m22213a(AbstractC7742Ig0 abstractC7742Ig0) {
        C7685Hd1 c7685Hd1;
        O90.m5968f(abstractC7742Ig0, "type");
        if (AbstractC9572h12.m18696d(abstractC7742Ig0)) {
            C4097g8 c4097g8M22213a = m22213a(AbstractC9572h12.m18697e(abstractC7742Ig0));
            C4097g8 c4097g8M22213a2 = m22213a(AbstractC9572h12.m18698j(abstractC7742Ig0));
            return new C4097g8(EZ1.m2352l(NV1.m5738t(AbstractC9572h12.m18697e((AbstractC7742Ig0) c4097g8M22213a.f27577a), AbstractC9572h12.m18698j((AbstractC7742Ig0) c4097g8M22213a2.f27577a)), abstractC7742Ig0), EZ1.m2352l(NV1.m5738t(AbstractC9572h12.m18697e((AbstractC7742Ig0) c4097g8M22213a.f27578b), AbstractC9572h12.m18698j((AbstractC7742Ig0) c4097g8M22213a2.f27578b)), abstractC7742Ig0));
        }
        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = abstractC7742Ig0.mo3797E();
        boolean z = true;
        if (abstractC7742Ig0.mo3797E() instanceof InterfaceC6451mq) {
            O90.m5966d(interfaceC8101Pd1Mo3797E, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            AbstractC10804qe1 abstractC10804qe1Mo22969d = ((InterfaceC6451mq) interfaceC8101Pd1Mo3797E).mo22969d();
            AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1Mo22969d.mo24038b();
            O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
            AbstractC7742Ig0 abstractC7742Ig0M790h = AbstractC7375Be1.m790h(abstractC7742Ig0Mo24038b, abstractC7742Ig0.mo3798G());
            int iOrdinal = abstractC10804qe1Mo22969d.mo24037a().ordinal();
            if (iOrdinal == 1) {
                X01 x01M26507o = CZ1.m1230f(abstractC7742Ig0).m26507o();
                O90.m5967e(x01M26507o, "getNullableAnyType(...)");
                return new C4097g8(abstractC7742Ig0M790h, x01M26507o);
            }
            if (iOrdinal == 2) {
                return new C4097g8(AbstractC7375Be1.m790h(CZ1.m1230f(abstractC7742Ig0).m26506n(), abstractC7742Ig0.mo3798G()), abstractC7742Ig0M790h);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + abstractC10804qe1Mo22969d);
        }
        if (abstractC7742Ig0.mo3800u().isEmpty() || abstractC7742Ig0.mo3800u().size() != interfaceC8101Pd1Mo3797E.getParameters().size()) {
            return new C4097g8(abstractC7742Ig0, abstractC7742Ig0);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listMo3800u = abstractC7742Ig0.mo3800u();
        List parameters = interfaceC8101Pd1Mo3797E.getParameters();
        O90.m5967e(parameters, "getParameters(...)");
        Iterator it = AbstractC7167xu.m25989i0(listMo3800u, parameters).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            AbstractC10804qe1 abstractC10804qe1 = (AbstractC10804qe1) pair.f36702a;
            InterfaceC10292me1 interfaceC10292me1 = (InterfaceC10292me1) pair.f36703b;
            O90.m5965c(interfaceC10292me1);
            EnumC9532gi1 enumC9532gi1Mo22918O = interfaceC10292me1.mo22918O();
            if (enumC9532gi1Mo22918O == null) {
                C11571we1.m25659a(35);
                throw null;
            }
            if (abstractC10804qe1 == null) {
                C11571we1.m25659a(36);
                throw null;
            }
            C11571we1 c11571we1 = C11571we1.f45010b;
            int iOrdinal2 = (abstractC10804qe1.mo24039c() ? EnumC9532gi1.f27949e : C11571we1.m25660b(enumC9532gi1Mo22918O, abstractC10804qe1.mo24037a())).ordinal();
            if (iOrdinal2 == 0) {
                AbstractC7742Ig0 abstractC7742Ig0Mo24038b2 = abstractC10804qe1.mo24038b();
                O90.m5967e(abstractC7742Ig0Mo24038b2, "getType(...)");
                AbstractC7742Ig0 abstractC7742Ig0Mo24038b3 = abstractC10804qe1.mo24038b();
                O90.m5967e(abstractC7742Ig0Mo24038b3, "getType(...)");
                c7685Hd1 = new C7685Hd1(interfaceC10292me1, abstractC7742Ig0Mo24038b2, abstractC7742Ig0Mo24038b3);
            } else if (iOrdinal2 == 1) {
                AbstractC7742Ig0 abstractC7742Ig0Mo24038b4 = abstractC10804qe1.mo24038b();
                O90.m5967e(abstractC7742Ig0Mo24038b4, "getType(...)");
                X01 x01M26507o2 = AbstractC6940uI.m25152e(interfaceC10292me1).m26507o();
                O90.m5967e(x01M26507o2, "getNullableAnyType(...)");
                c7685Hd1 = new C7685Hd1(interfaceC10292me1, abstractC7742Ig0Mo24038b4, x01M26507o2);
            } else {
                if (iOrdinal2 != 2) {
                    throw new C6838sg();
                }
                X01 x01M26506n = AbstractC6940uI.m25152e(interfaceC10292me1).m26506n();
                AbstractC7742Ig0 abstractC7742Ig0Mo24038b5 = abstractC10804qe1.mo24038b();
                O90.m5967e(abstractC7742Ig0Mo24038b5, "getType(...)");
                c7685Hd1 = new C7685Hd1(interfaceC10292me1, x01M26506n, abstractC7742Ig0Mo24038b5);
            }
            if (abstractC10804qe1.mo24039c()) {
                arrayList.add(c7685Hd1);
                arrayList2.add(c7685Hd1);
            } else {
                C4097g8 c4097g8M22213a3 = m22213a(c7685Hd1.f4388b);
                AbstractC7742Ig0 abstractC7742Ig02 = (AbstractC7742Ig0) c4097g8M22213a3.f27577a;
                AbstractC7742Ig0 abstractC7742Ig03 = (AbstractC7742Ig0) c4097g8M22213a3.f27578b;
                C4097g8 c4097g8M22213a4 = m22213a(c7685Hd1.f4389c);
                AbstractC7742Ig0 abstractC7742Ig04 = (AbstractC7742Ig0) c4097g8M22213a4.f27577a;
                AbstractC7742Ig0 abstractC7742Ig05 = (AbstractC7742Ig0) c4097g8M22213a4.f27578b;
                InterfaceC10292me1 interfaceC10292me12 = c7685Hd1.f4387a;
                C7685Hd1 c7685Hd12 = new C7685Hd1(interfaceC10292me12, abstractC7742Ig03, abstractC7742Ig04);
                C7685Hd1 c7685Hd13 = new C7685Hd1(interfaceC10292me12, abstractC7742Ig02, abstractC7742Ig05);
                arrayList.add(c7685Hd12);
                arrayList2.add(c7685Hd13);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C7685Hd1 c7685Hd14 = (C7685Hd1) it2.next();
                c7685Hd14.getClass();
                if (!InterfaceC7846Kg0.f6251a.m25726b(c7685Hd14.f4388b, c7685Hd14.f4389c)) {
                    break;
                }
            }
            z = false;
        }
        return new C4097g8(z ? CZ1.m1230f(abstractC7742Ig0).m26506n() : m22214d(abstractC7742Ig0, arrayList), m22214d(abstractC7742Ig0, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.AbstractC7742Ig0 m22214d(p000.AbstractC7742Ig0 r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.mo3800u()
            r0.size()
            r8.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = p000.AbstractC7293zu.m26586k(r8)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L17:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L99
            java.lang.Object r1 = r8.next()
            Hd1 r1 = (p000.C7685Hd1) r1
            r1.getClass()
            wv0 r3 = p000.InterfaceC7846Kg0.f6251a
            Ig0 r4 = r1.f4388b
            Ig0 r5 = r1.f4389c
            r3.m25726b(r4, r5)
            boolean r3 = p000.O90.m5963a(r4, r5)
            if (r3 != 0) goto L8f
            me1 r1 = r1.f4387a
            gi1 r3 = r1.mo22918O()
            gi1 r6 = p000.EnumC9532gi1.f27948d
            if (r3 != r6) goto L41
            goto L8f
        L41:
            boolean r3 = p000.AbstractC11955zg0.m26486E(r4)
            if (r3 == 0) goto L5d
            gi1 r3 = r1.mo22918O()
            if (r3 == r6) goto L5d
            s41 r2 = new s41
            gi1 r3 = p000.EnumC9532gi1.f27949e
            gi1 r1 = r1.mo22918O()
            if (r3 != r1) goto L59
            gi1 r3 = p000.EnumC9532gi1.f27947c
        L59:
            r2.<init>(r5, r3)
            goto L94
        L5d:
            if (r5 == 0) goto L89
            boolean r2 = p000.AbstractC11955zg0.m26494x(r5)
            if (r2 == 0) goto L79
            boolean r2 = r5.mo3798G()
            if (r2 == 0) goto L79
            s41 r2 = new s41
            gi1 r1 = r1.mo22918O()
            if (r6 != r1) goto L75
            gi1 r6 = p000.EnumC9532gi1.f27947c
        L75:
            r2.<init>(r4, r6)
            goto L94
        L79:
            s41 r2 = new s41
            gi1 r3 = p000.EnumC9532gi1.f27949e
            gi1 r1 = r1.mo22918O()
            if (r3 != r1) goto L85
            gi1 r3 = p000.EnumC9532gi1.f27947c
        L85:
            r2.<init>(r5, r3)
            goto L94
        L89:
            r7 = 141(0x8d, float:1.98E-43)
            p000.AbstractC11955zg0.m26490a(r7)
            throw r2
        L8f:
            s41 r2 = new s41
            r2.<init>(r4)
        L94:
            r0.add(r2)
            goto L17
        L99:
            r8 = 6
            Ig0 r7 = p000.AbstractC11815yZ1.m26172c(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10012kS1.m22214d(Ig0, java.util.ArrayList):Ig0");
    }

    /* renamed from: b */
    public C7660Gr0 m22215b(C7816Jr0 c7816Jr0) {
        ByteBuffer byteBuffer = c7816Jr0.f14798e;
        byteBuffer.getClass();
        YN1.m9278c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo3312c(c7816Jr0, byteBuffer);
    }

    /* renamed from: c */
    public abstract C7660Gr0 mo3312c(C7816Jr0 c7816Jr0, ByteBuffer byteBuffer);
}
