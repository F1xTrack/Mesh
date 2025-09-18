package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: qI */
/* loaded from: classes2.dex */
public final class C6671qI implements InterfaceC6543oI {

    /* renamed from: X */
    public static final /* synthetic */ InterfaceC10293mf0[] f40719X;

    /* renamed from: A */
    public final C6608pI f40720A;

    /* renamed from: B */
    public final C6608pI f40721B;

    /* renamed from: C */
    public final C6608pI f40722C;

    /* renamed from: D */
    public final C6608pI f40723D;

    /* renamed from: E */
    public final C6608pI f40724E;

    /* renamed from: F */
    public final C6608pI f40725F;

    /* renamed from: G */
    public final C6608pI f40726G;

    /* renamed from: H */
    public final C6608pI f40727H;

    /* renamed from: I */
    public final C6608pI f40728I;

    /* renamed from: J */
    public final C6608pI f40729J;

    /* renamed from: K */
    public final C6608pI f40730K;

    /* renamed from: L */
    public final C6608pI f40731L;

    /* renamed from: M */
    public final C6608pI f40732M;

    /* renamed from: N */
    public final C6608pI f40733N;

    /* renamed from: O */
    public final C6608pI f40734O;

    /* renamed from: P */
    public final C6608pI f40735P;

    /* renamed from: Q */
    public final C6608pI f40736Q;

    /* renamed from: R */
    public final C6608pI f40737R;

    /* renamed from: S */
    public final C6608pI f40738S;

    /* renamed from: T */
    public final C6608pI f40739T;

    /* renamed from: U */
    public final C6608pI f40740U;

    /* renamed from: V */
    public final C6608pI f40741V;

    /* renamed from: W */
    public final C6608pI f40742W;

    /* renamed from: a */
    public boolean f40743a;

    /* renamed from: b */
    public final C6608pI f40744b = new C6608pI(C0999Ps.f9320d, this);

    /* renamed from: c */
    public final C6608pI f40745c;

    /* renamed from: d */
    public final C6608pI f40746d;

    /* renamed from: e */
    public final C6608pI f40747e;

    /* renamed from: f */
    public final C6608pI f40748f;

    /* renamed from: g */
    public final C6608pI f40749g;

    /* renamed from: h */
    public final C6608pI f40750h;

    /* renamed from: i */
    public final C6608pI f40751i;

    /* renamed from: j */
    public final C6608pI f40752j;

    /* renamed from: k */
    public final C6608pI f40753k;

    /* renamed from: l */
    public final C6608pI f40754l;

    /* renamed from: m */
    public final C6608pI f40755m;

    /* renamed from: n */
    public final C6608pI f40756n;

    /* renamed from: o */
    public final C6608pI f40757o;

    /* renamed from: p */
    public final C6608pI f40758p;

    /* renamed from: q */
    public final C6608pI f40759q;

    /* renamed from: r */
    public final C6608pI f40760r;

    /* renamed from: s */
    public final C6608pI f40761s;

    /* renamed from: t */
    public final C6608pI f40762t;

    /* renamed from: u */
    public final C6608pI f40763u;

    /* renamed from: v */
    public final C6608pI f40764v;

    /* renamed from: w */
    public final C6608pI f40765w;

    /* renamed from: x */
    public final C6608pI f40766x;

    /* renamed from: y */
    public final C6608pI f40767y;

    /* renamed from: z */
    public final C6608pI f40768z;

    static {
        IP0 ip0 = BP0.f799a;
        f40719X = new InterfaceC10293mf0[]{ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "withDefinedIn", "getWithDefinedIn()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "modifiers", "getModifiers()Ljava/util/Set;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "startFromName", "getStartFromName()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "debugMode", "getDebugMode()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "verbose", "getVerbose()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "unitReturnType", "getUnitReturnType()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "withoutReturnType", "getWithoutReturnType()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "enhancedTypes", "getEnhancedTypes()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderDefaultModality", "getRenderDefaultModality()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "receiverAfterName", "getReceiverAfterName()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), ip0.mo3848d(new C7716Ht0(ip0.mo3846b(C6671qI.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public C6671qI() {
        Boolean bool = Boolean.TRUE;
        this.f40745c = new C6608pI(bool, this);
        this.f40746d = new C6608pI(bool, this);
        this.f40747e = new C6608pI(EnumC6480nI.f38240b, this);
        Boolean bool2 = Boolean.FALSE;
        this.f40748f = new C6608pI(bool2, this);
        this.f40749g = new C6608pI(bool2, this);
        this.f40750h = new C6608pI(bool2, this);
        this.f40751i = new C6608pI(bool2, this);
        this.f40752j = new C6608pI(bool2, this);
        this.f40753k = new C6608pI(bool, this);
        this.f40754l = new C6608pI(bool2, this);
        this.f40755m = new C6608pI(bool2, this);
        this.f40756n = new C6608pI(bool2, this);
        this.f40757o = new C6608pI(bool, this);
        this.f40758p = new C6608pI(bool, this);
        this.f40759q = new C6608pI(bool2, this);
        this.f40760r = new C6608pI(bool2, this);
        this.f40761s = new C6608pI(bool2, this);
        this.f40762t = new C6608pI(bool2, this);
        this.f40763u = new C6608pI(bool2, this);
        this.f40764v = new C6608pI(null, this);
        this.f40765w = new C6608pI(bool2, this);
        this.f40766x = new C6608pI(bool2, this);
        this.f40767y = new C6608pI(C6228jI.f35035m, this);
        this.f40768z = new C6608pI(C6228jI.f35034l, this);
        this.f40720A = new C6608pI(bool, this);
        this.f40721B = new C6608pI(EnumC10973rz0.f42184b, this);
        this.f40722C = new C6608pI(C6291kI.f36416a, this);
        this.f40723D = new C6608pI(EnumC8980cR0.f17475a, this);
        this.f40724E = new C6608pI(EnumC9079dA0.f25849a, this);
        this.f40725F = new C6608pI(bool2, this);
        this.f40726G = new C6608pI(bool2, this);
        this.f40727H = new C6608pI(BE0.f665a, this);
        this.f40728I = new C6608pI(bool2, this);
        this.f40729J = new C6608pI(bool2, this);
        this.f40730K = new C6608pI(C1156SN.f10705a, this);
        this.f40731L = new C6608pI(AbstractC1599ZP.f14879a, this);
        this.f40732M = new C6608pI(null, this);
        this.f40733N = new C6608pI(EnumC6721r5.f41329c, this);
        this.f40734O = new C6608pI(bool2, this);
        this.f40735P = new C6608pI(bool, this);
        this.f40736Q = new C6608pI(bool, this);
        this.f40737R = new C6608pI(bool2, this);
        this.f40738S = new C6608pI(bool, this);
        this.f40739T = new C6608pI(bool, this);
        this.f40740U = new C6608pI(bool2, this);
        this.f40741V = new C6608pI(bool2, this);
        this.f40742W = new C6608pI(bool, this);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: a */
    public final void mo22739a() {
        InterfaceC10293mf0 interfaceC10293mf0 = f40719X[30];
        this.f40725F.m23721a(Boolean.TRUE, interfaceC10293mf0);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: b */
    public final void mo22741b() {
        InterfaceC10293mf0 interfaceC10293mf0 = f40719X[6];
        this.f40750h.m23721a(Boolean.TRUE, interfaceC10293mf0);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: c */
    public final void mo22743c() {
        InterfaceC10293mf0 interfaceC10293mf0 = f40719X[31];
        this.f40726G.m23721a(Boolean.TRUE, interfaceC10293mf0);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: d */
    public final void mo22745d(Set set) {
        O90.m5968f(set, "<set-?>");
        this.f40747e.m23721a(set, f40719X[3]);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: e */
    public final void mo22747e(LinkedHashSet linkedHashSet) {
        this.f40731L.m23721a(linkedHashSet, f40719X[36]);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: f */
    public final void mo22749f() {
        InterfaceC10293mf0 interfaceC10293mf0 = f40719X[21];
        this.f40765w.m23721a(Boolean.TRUE, interfaceC10293mf0);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: g */
    public final void mo22751g(InterfaceC1062Qs interfaceC1062Qs) {
        this.f40744b.m23721a(interfaceC1062Qs, f40719X[0]);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: h */
    public final void mo22753h(EnumC9079dA0 enumC9079dA0) {
        this.f40724E.m23721a(enumC9079dA0, f40719X[29]);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: i */
    public final void mo22755i() {
        InterfaceC10293mf0 interfaceC10293mf0 = f40719X[4];
        this.f40748f.m23721a(Boolean.TRUE, interfaceC10293mf0);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: j */
    public final void mo22756j() {
        this.f40745c.m23721a(Boolean.FALSE, f40719X[1]);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: k */
    public final Set mo22757k() {
        return (Set) this.f40731L.getValue(this, f40719X[36]);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: l */
    public final void mo22758l() {
        this.f40723D.m23721a(EnumC8980cR0.f17476b, f40719X[28]);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: m */
    public final void mo22759m() {
        InterfaceC10293mf0 interfaceC10293mf0 = f40719X[22];
        this.f40766x.m23721a(Boolean.TRUE, interfaceC10293mf0);
    }

    /* renamed from: n */
    public final boolean m23964n() {
        return ((Boolean) this.f40750h.getValue(this, f40719X[6])).booleanValue();
    }
}
