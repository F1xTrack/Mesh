package defpackage;

/* renamed from: oN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6255oN0 extends U0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ InterfaceC0195Cg0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6255oN0(InterfaceC0195Cg0 interfaceC0195Cg0, int i) {
        super(9);
        this.c = i;
        this.d = interfaceC0195Cg0;
    }

    @Override // defpackage.U0
    public final void s1(String[] strArr) {
        switch (this.c) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((C6827rN0) ((C3866fw1) this.d).b).d = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((C6827rN0) ((C3866fw1) this.d).b).e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((C6827rN0) ((C6446pN0) this.d).b).h = strArr;
                return;
        }
    }
}
