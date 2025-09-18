package defpackage;

/* renamed from: jG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5278jG implements InterfaceC6587q61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C5278jG(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC6587q61
    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return (InterfaceC0378Ep0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (C6628qK0) this.b;
            case 2:
                return (InterfaceC0191Cf) this.b;
            case 3:
                return (AbstractC6715qn0) this.b;
            case 4:
                return (C5851mG) this.b;
            case 5:
                return (X11) this.b;
            default:
                return Boolean.valueOf(((C3390dR) this.b).z);
        }
    }
}
