package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: xI */
/* loaded from: classes2.dex */
public final class C7955xI {
    public final Z41 a;
    public final InterfaceC0153Bs0 b;
    public final NV1 c;
    public final InterfaceC7110ss d;
    public final InterfaceC6582q5 e;
    public final InterfaceC0330Dz0 f;
    public final C7532v32 g;
    public final InterfaceC2508cP h;
    public final C3759fN i;
    public final InterfaceC3595eW j;
    public final Iterable k;
    public final T71 l;
    public final S20 m;
    public final InterfaceC6384p3 n;
    public final InterfaceC7364uB0 o;
    public final DR p;
    public final InterfaceC7693vv0 q;
    public final List r;
    public final NO s;
    public final C8443zs t;

    public C7955xI(Z41 z41, InterfaceC0153Bs0 interfaceC0153Bs0, InterfaceC7110ss interfaceC7110ss, InterfaceC6582q5 interfaceC6582q5, InterfaceC0330Dz0 interfaceC0330Dz0, InterfaceC2508cP interfaceC2508cP, InterfaceC3595eW interfaceC3595eW, Iterable iterable, T71 t71, InterfaceC6384p3 interfaceC6384p3, InterfaceC7364uB0 interfaceC7364uB0, DR dr, InterfaceC7693vv0 interfaceC7693vv0, OL0 ol0, List list, NO no) {
        NV1 nv1 = NV1.c;
        C7532v32 c7532v32 = C7532v32.e;
        C3759fN c3759fN = C3759fN.e;
        S20 s20 = C2425bz.a;
        O90.f(z41, "storageManager");
        O90.f(interfaceC0153Bs0, "moduleDescriptor");
        O90.f(iterable, "fictitiousClassDescriptorFactories");
        O90.f(interfaceC6384p3, "additionalClassPartsProvider");
        O90.f(interfaceC7364uB0, "platformDependentDeclarationFilter");
        O90.f(dr, "extensionRegistryLite");
        O90.f(interfaceC7693vv0, "kotlinTypeChecker");
        O90.f(list, "typeAttributeTranslators");
        O90.f(no, "enumEntriesDeserializationSupport");
        this.a = z41;
        this.b = interfaceC0153Bs0;
        this.c = nv1;
        this.d = interfaceC7110ss;
        this.e = interfaceC6582q5;
        this.f = interfaceC0330Dz0;
        this.g = c7532v32;
        this.h = interfaceC2508cP;
        this.i = c3759fN;
        this.j = interfaceC3595eW;
        this.k = iterable;
        this.l = t71;
        this.m = s20;
        this.n = interfaceC6384p3;
        this.o = interfaceC7364uB0;
        this.p = dr;
        this.q = interfaceC7693vv0;
        this.r = list;
        this.s = no;
        this.t = new C8443zs(this);
    }

    public final C1666Vd a(InterfaceC8465zz0 interfaceC8465zz0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, C0124Bi1 c0124Bi1, AbstractC7268th abstractC7268th, C6494pd0 c6494pd0) {
        O90.f(interfaceC8465zz0, "descriptor");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(abstractC7268th, "metadataVersion");
        return new C1666Vd(this, interfaceC1637Ut0, interfaceC8465zz0, c5826m71, c0124Bi1, abstractC7268th, c6494pd0, null, MN.a);
    }

    public final InterfaceC7492us b(C0074As c0074As) {
        O90.f(c0074As, "classId");
        Set set = C8443zs.c;
        return this.t.a(c0074As, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7955xI(Z41 z41, InterfaceC0153Bs0 interfaceC0153Bs0, G10 g10, ES1 es1, InterfaceC0330Dz0 interfaceC0330Dz0, Iterable iterable, T71 t71, InterfaceC6384p3 interfaceC6384p3, InterfaceC7364uB0 interfaceC7364uB0, DR dr, C7883wv0 c7883wv0, OL0 ol0, OL0 ol02, int i) {
        C7883wv0 c7883wv02;
        C0318Dv0 c0318Dv0 = InterfaceC2508cP.t0;
        OL0 ol03 = OL0.c;
        if ((i & 65536) != 0) {
            InterfaceC7693vv0.b.getClass();
            c7883wv02 = C7502uv0.b;
        } else {
            c7883wv02 = c7883wv0;
        }
        this(z41, interfaceC0153Bs0, g10, es1, interfaceC0330Dz0, c0318Dv0, ol03, iterable, t71, interfaceC6384p3, interfaceC7364uB0, dr, c7883wv02, ol0, AbstractC8259yu.e(C3360dH.a), (i & 524288) != 0 ? TE.d : ol02);
    }
}
