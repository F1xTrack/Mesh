package p000;

/* renamed from: qN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10769qN0 extends AbstractC1259U0 {

    /* renamed from: c */
    public final /* synthetic */ int f40841c;

    /* renamed from: d */
    public final /* synthetic */ G10 f40842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10769qN0(G10 g10, int i) {
        super(9);
        this.f40841c = i;
        this.f40842d = g10;
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: s1 */
    public final void mo7850s1(String[] strArr) {
        switch (this.f40841c) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((C10897rN0) this.f40842d.f3531b).f41628d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((C10897rN0) this.f40842d.f3531b).f41629e = strArr;
                return;
        }
    }
}
