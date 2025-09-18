package defpackage;

/* renamed from: Ys, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1945Ys implements InterfaceC5458kC0 {
    public int b = 0;
    public final Object[] a = new Object[1024];

    public final synchronized void a() {
        for (int i = 0; i < this.b; i++) {
            try {
                this.a[i] = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = 0;
    }

    @Override // defpackage.InterfaceC5458kC0
    public final synchronized boolean d(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.b = i + 1;
        return true;
    }

    @Override // defpackage.InterfaceC5458kC0
    public final synchronized Object i() {
        int i = this.b;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.b = i2;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }
}
