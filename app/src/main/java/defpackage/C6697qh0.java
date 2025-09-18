package defpackage;

/* renamed from: qh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6697qh0 implements InterfaceC3739fG0 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile InterfaceC3739fG0 b;

    public C6697qh0(InterfaceC3739fG0 interfaceC3739fG0) {
        this.b = interfaceC3739fG0;
    }

    @Override // defpackage.InterfaceC3739fG0
    public final Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
