package p000;

/* renamed from: jG */
/* loaded from: classes.dex */
public final /* synthetic */ class C6226jG implements InterfaceC10736q61 {

    /* renamed from: a */
    public final /* synthetic */ int f35012a;

    /* renamed from: b */
    public final /* synthetic */ Object f35013b;

    public /* synthetic */ C6226jG(int i, Object obj) {
        this.f35012a = i;
        this.f35013b = obj;
    }

    @Override // p000.InterfaceC10736q61
    public final Object get() {
        switch (this.f35012a) {
            case 0:
                try {
                    return (InterfaceC7552Ep0) ((Class) this.f35013b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (C10763qK0) this.f35013b;
            case 2:
                return (InterfaceC0168Cf) this.f35013b;
            case 3:
                return (AbstractC10821qn0) this.f35013b;
            case 4:
                return (C6415mG) this.f35013b;
            case 5:
                return (X11) this.f35013b;
            default:
                return Boolean.valueOf(((C3928dR) this.f35013b).f26106z);
        }
    }
}
