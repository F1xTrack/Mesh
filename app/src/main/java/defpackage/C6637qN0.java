package defpackage;

/* renamed from: qN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6637qN0 extends U0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ G10 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6637qN0(G10 g10, int i) {
        super(9);
        this.c = i;
        this.d = g10;
    }

    @Override // defpackage.U0
    public final void s1(String[] strArr) {
        switch (this.c) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((C6827rN0) this.d.b).d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((C6827rN0) this.d.b).e = strArr;
                return;
        }
    }
}
