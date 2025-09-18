package p000;

/* renamed from: LX */
/* loaded from: classes2.dex */
public final class C0726LX implements InterfaceC6497nZ {

    /* renamed from: a */
    public final /* synthetic */ int f6694a;

    public /* synthetic */ C0726LX(int i) {
        this.f6694a = i;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [Vg0, mZ] */
    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f6694a) {
            case 0:
                return C8340Tt0.m7797d((String) obj);
            case 1:
                return ((C8322Tk0) obj).f11492b.invoke();
            case 2:
                return (InterfaceC7158xl) obj;
            case 3:
                return (InterfaceC7158xl) obj;
            default:
                if (((C0664KX) obj) != null) {
                    return Boolean.valueOf(!r2.equals(AbstractC10604p41.f39827y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
