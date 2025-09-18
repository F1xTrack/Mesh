package p000;

import java.util.List;
import java.util.Set;

/* renamed from: xI */
/* loaded from: classes2.dex */
public final class C7129xI {

    /* renamed from: a */
    public final Z41 f45518a;

    /* renamed from: b */
    public final InterfaceC7402Bs0 f45519b;

    /* renamed from: c */
    public final NV1 f45520c;

    /* renamed from: d */
    public final InterfaceC6850ss f45521d;

    /* renamed from: e */
    public final InterfaceC6658q5 f45522e;

    /* renamed from: f */
    public final InterfaceC7520Dz0 f45523f;

    /* renamed from: g */
    public final C11370v32 f45524g;

    /* renamed from: h */
    public final InterfaceC1845cP f45525h;

    /* renamed from: i */
    public final C4049fN f45526i;

    /* renamed from: j */
    public final InterfaceC3995eW f45527j;

    /* renamed from: k */
    public final Iterable f45528k;

    /* renamed from: l */
    public final T71 f45529l;

    /* renamed from: m */
    public final S20 f45530m;

    /* renamed from: n */
    public final InterfaceC6593p3 f45531n;

    /* renamed from: o */
    public final InterfaceC11257uB0 f45532o;

    /* renamed from: p */
    public final C0217DR f45533p;

    /* renamed from: q */
    public final InterfaceC11477vv0 f45534q;

    /* renamed from: r */
    public final List f45535r;

    /* renamed from: s */
    public final InterfaceC0843NO f45536s;

    /* renamed from: t */
    public final C7291zs f45537t;

    public C7129xI(Z41 z41, InterfaceC7402Bs0 interfaceC7402Bs0, InterfaceC6850ss interfaceC6850ss, InterfaceC6658q5 interfaceC6658q5, InterfaceC7520Dz0 interfaceC7520Dz0, InterfaceC1845cP interfaceC1845cP, InterfaceC3995eW interfaceC3995eW, Iterable iterable, T71 t71, InterfaceC6593p3 interfaceC6593p3, InterfaceC11257uB0 interfaceC11257uB0, C0217DR c0217dr, InterfaceC11477vv0 interfaceC11477vv0, OL0 ol0, List list, InterfaceC0843NO interfaceC0843NO) {
        NV1 nv1 = NV1.f7837c;
        C11370v32 c11370v32 = C11370v32.f44126e;
        C4049fN c4049fN = C4049fN.f27160e;
        S20 s20 = C1818bz.f17248a;
        O90.m5968f(z41, "storageManager");
        O90.m5968f(interfaceC7402Bs0, "moduleDescriptor");
        O90.m5968f(iterable, "fictitiousClassDescriptorFactories");
        O90.m5968f(interfaceC6593p3, "additionalClassPartsProvider");
        O90.m5968f(interfaceC11257uB0, "platformDependentDeclarationFilter");
        O90.m5968f(c0217dr, "extensionRegistryLite");
        O90.m5968f(interfaceC11477vv0, "kotlinTypeChecker");
        O90.m5968f(list, "typeAttributeTranslators");
        O90.m5968f(interfaceC0843NO, "enumEntriesDeserializationSupport");
        this.f45518a = z41;
        this.f45519b = interfaceC7402Bs0;
        this.f45520c = nv1;
        this.f45521d = interfaceC6850ss;
        this.f45522e = interfaceC6658q5;
        this.f45523f = interfaceC7520Dz0;
        this.f45524g = c11370v32;
        this.f45525h = interfaceC1845cP;
        this.f45526i = c4049fN;
        this.f45527j = interfaceC3995eW;
        this.f45528k = iterable;
        this.f45529l = t71;
        this.f45530m = s20;
        this.f45531n = interfaceC6593p3;
        this.f45532o = interfaceC11257uB0;
        this.f45533p = c0217dr;
        this.f45534q = interfaceC11477vv0;
        this.f45535r = list;
        this.f45536s = interfaceC0843NO;
        this.f45537t = new C7291zs(this);
    }

    /* renamed from: a */
    public final C1361Vd m25825a(InterfaceC11993zz0 interfaceC11993zz0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, C7383Bi1 c7383Bi1, AbstractC6902th abstractC6902th, C10673pd0 c10673pd0) {
        O90.m5968f(interfaceC11993zz0, "descriptor");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(abstractC6902th, "metadataVersion");
        return new C1361Vd(this, interfaceC8392Ut0, interfaceC11993zz0, c10226m71, c7383Bi1, abstractC6902th, c10673pd0, null, C0779MN.f7117a);
    }

    /* renamed from: b */
    public final InterfaceC6976us m25826b(C0055As c0055As) {
        O90.m5968f(c0055As, "classId");
        Set set = C7291zs.f47052c;
        return this.f45537t.m26559a(c0055As, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7129xI(Z41 z41, InterfaceC7402Bs0 interfaceC7402Bs0, G10 g10, ES1 es1, InterfaceC7520Dz0 interfaceC7520Dz0, Iterable iterable, T71 t71, InterfaceC6593p3 interfaceC6593p3, InterfaceC11257uB0 interfaceC11257uB0, C0217DR c0217dr, C11604wv0 c11604wv0, OL0 ol0, OL0 ol02, int i) {
        C11604wv0 c11604wv02;
        C7512Dv0 c7512Dv0 = InterfaceC1845cP.f17466t0;
        OL0 ol03 = OL0.f8368c;
        if ((i & 65536) != 0) {
            InterfaceC11477vv0.f44603b.getClass();
            c11604wv02 = C11349uv0.f44021b;
        } else {
            c11604wv02 = c11604wv0;
        }
        this(z41, interfaceC7402Bs0, g10, es1, interfaceC7520Dz0, c7512Dv0, ol03, iterable, t71, interfaceC6593p3, interfaceC11257uB0, c0217dr, c11604wv02, ol0, AbstractC7230yu.m26274e(C3918dH.f25929a), (i & 524288) != 0 ? C1210TE.f11209d : ol02);
    }
}
