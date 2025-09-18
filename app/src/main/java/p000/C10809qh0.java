package p000;

/* renamed from: qh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10809qh0 implements InterfaceC9347fG0 {

    /* renamed from: c */
    public static final Object f41104c = new Object();

    /* renamed from: a */
    public volatile Object f41105a = f41104c;

    /* renamed from: b */
    public volatile InterfaceC9347fG0 f41106b;

    public C10809qh0(InterfaceC9347fG0 interfaceC9347fG0) {
        this.f41106b = interfaceC9347fG0;
    }

    @Override // p000.InterfaceC9347fG0
    public final Object get() {
        Object obj = this.f41105a;
        Object obj2 = f41104c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f41105a;
                    if (obj == obj2) {
                        obj = this.f41106b.get();
                        this.f41105a = obj;
                        this.f41106b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
