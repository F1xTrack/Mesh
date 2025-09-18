package p000;

/* renamed from: oN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10513oN0 extends AbstractC1259U0 {

    /* renamed from: c */
    public final /* synthetic */ int f38968c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC7430Cg0 f38969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10513oN0(InterfaceC7430Cg0 interfaceC7430Cg0, int i) {
        super(9);
        this.f38968c = i;
        this.f38969d = interfaceC7430Cg0;
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: s1 */
    public final void mo7850s1(String[] strArr) {
        switch (this.f38968c) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((C10897rN0) ((C9432fw1) this.f38969d).f27505b).f41628d = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((C10897rN0) ((C9432fw1) this.f38969d).f27505b).f41629e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((C10897rN0) ((C10641pN0) this.f38969d).f40042b).f41632h = strArr;
                return;
        }
    }
}
