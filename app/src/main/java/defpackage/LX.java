package defpackage;

/* loaded from: classes2.dex */
public final class LX implements InterfaceC6099nZ {
    public final /* synthetic */ int a;

    public /* synthetic */ LX(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [Vg0, mZ] */
    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return C1559Tt0.d((String) obj);
            case 1:
                return ((C1532Tk0) obj).b.invoke();
            case 2:
                return (InterfaceC8042xl) obj;
            case 3:
                return (InterfaceC8042xl) obj;
            default:
                if (((KX) obj) != null) {
                    return Boolean.valueOf(!r2.equals(AbstractC6390p41.y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
