package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: qI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6621qI implements InterfaceC6239oI {
    public static final /* synthetic */ InterfaceC5927mf0[] X;
    public final C6430pI A;
    public final C6430pI B;
    public final C6430pI C;
    public final C6430pI D;
    public final C6430pI E;
    public final C6430pI F;
    public final C6430pI G;
    public final C6430pI H;
    public final C6430pI I;
    public final C6430pI J;
    public final C6430pI K;
    public final C6430pI L;
    public final C6430pI M;
    public final C6430pI N;
    public final C6430pI O;
    public final C6430pI P;
    public final C6430pI Q;
    public final C6430pI R;
    public final C6430pI S;
    public final C6430pI T;
    public final C6430pI U;
    public final C6430pI V;
    public final C6430pI W;
    public boolean a;
    public final C6430pI b = new C6430pI(C1243Ps.d, this);
    public final C6430pI c;
    public final C6430pI d;
    public final C6430pI e;
    public final C6430pI f;
    public final C6430pI g;
    public final C6430pI h;
    public final C6430pI i;
    public final C6430pI j;
    public final C6430pI k;
    public final C6430pI l;
    public final C6430pI m;
    public final C6430pI n;
    public final C6430pI o;
    public final C6430pI p;
    public final C6430pI q;
    public final C6430pI r;
    public final C6430pI s;
    public final C6430pI t;
    public final C6430pI u;
    public final C6430pI v;
    public final C6430pI w;
    public final C6430pI x;
    public final C6430pI y;
    public final C6430pI z;

    static {
        IP0 ip0 = BP0.a;
        X = new InterfaceC5927mf0[]{ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "withDefinedIn", "getWithDefinedIn()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "modifiers", "getModifiers()Ljava/util/Set;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "startFromName", "getStartFromName()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "debugMode", "getDebugMode()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "verbose", "getVerbose()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "unitReturnType", "getUnitReturnType()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "withoutReturnType", "getWithoutReturnType()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "enhancedTypes", "getEnhancedTypes()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderDefaultModality", "getRenderDefaultModality()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "receiverAfterName", "getReceiverAfterName()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), ip0.d(new C0624Ht0(ip0.b(C6621qI.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public C6621qI() {
        Boolean bool = Boolean.TRUE;
        this.c = new C6430pI(bool, this);
        this.d = new C6430pI(bool, this);
        this.e = new C6430pI(EnumC6048nI.b, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new C6430pI(bool2, this);
        this.g = new C6430pI(bool2, this);
        this.h = new C6430pI(bool2, this);
        this.i = new C6430pI(bool2, this);
        this.j = new C6430pI(bool2, this);
        this.k = new C6430pI(bool, this);
        this.l = new C6430pI(bool2, this);
        this.m = new C6430pI(bool2, this);
        this.n = new C6430pI(bool2, this);
        this.o = new C6430pI(bool, this);
        this.p = new C6430pI(bool, this);
        this.q = new C6430pI(bool2, this);
        this.r = new C6430pI(bool2, this);
        this.s = new C6430pI(bool2, this);
        this.t = new C6430pI(bool2, this);
        this.u = new C6430pI(bool2, this);
        this.v = new C6430pI(null, this);
        this.w = new C6430pI(bool2, this);
        this.x = new C6430pI(bool2, this);
        this.y = new C6430pI(C5284jI.m, this);
        this.z = new C6430pI(C5284jI.l, this);
        this.A = new C6430pI(bool, this);
        this.B = new C6430pI(EnumC6941rz0.b, this);
        this.C = new C6430pI(C5475kI.a, this);
        this.D = new C6430pI(EnumC2515cR0.a, this);
        this.E = new C6430pI(EnumC3340dA0.a, this);
        this.F = new C6430pI(bool2, this);
        this.G = new C6430pI(bool2, this);
        this.H = new C6430pI(BE0.a, this);
        this.I = new C6430pI(bool2, this);
        this.J = new C6430pI(bool2, this);
        this.K = new C6430pI(SN.a, this);
        this.L = new C6430pI(ZP.a, this);
        this.M = new C6430pI(null, this);
        this.N = new C6430pI(EnumC6772r5.c, this);
        this.O = new C6430pI(bool2, this);
        this.P = new C6430pI(bool, this);
        this.Q = new C6430pI(bool, this);
        this.R = new C6430pI(bool2, this);
        this.S = new C6430pI(bool, this);
        this.T = new C6430pI(bool, this);
        this.U = new C6430pI(bool2, this);
        this.V = new C6430pI(bool2, this);
        this.W = new C6430pI(bool, this);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void a() {
        InterfaceC5927mf0 interfaceC5927mf0 = X[30];
        this.F.a(Boolean.TRUE, interfaceC5927mf0);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void b() {
        InterfaceC5927mf0 interfaceC5927mf0 = X[6];
        this.h.a(Boolean.TRUE, interfaceC5927mf0);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void c() {
        InterfaceC5927mf0 interfaceC5927mf0 = X[31];
        this.G.a(Boolean.TRUE, interfaceC5927mf0);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void d(Set set) {
        O90.f(set, "<set-?>");
        this.e.a(set, X[3]);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void e(LinkedHashSet linkedHashSet) {
        this.L.a(linkedHashSet, X[36]);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void f() {
        InterfaceC5927mf0 interfaceC5927mf0 = X[21];
        this.w.a(Boolean.TRUE, interfaceC5927mf0);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void g(InterfaceC1321Qs interfaceC1321Qs) {
        this.b.a(interfaceC1321Qs, X[0]);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void h(EnumC3340dA0 enumC3340dA0) {
        this.E.a(enumC3340dA0, X[29]);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void i() {
        InterfaceC5927mf0 interfaceC5927mf0 = X[4];
        this.f.a(Boolean.TRUE, interfaceC5927mf0);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void j() {
        this.c.a(Boolean.FALSE, X[1]);
    }

    @Override // defpackage.InterfaceC6239oI
    public final Set k() {
        return (Set) this.L.getValue(this, X[36]);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void l() {
        this.D.a(EnumC2515cR0.b, X[28]);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void m() {
        InterfaceC5927mf0 interfaceC5927mf0 = X[22];
        this.x.a(Boolean.TRUE, interfaceC5927mf0);
    }

    public final boolean n() {
        return ((Boolean) this.h.getValue(this, X[6])).booleanValue();
    }
}
