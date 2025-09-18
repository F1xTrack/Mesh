package p000;

import android.media.Image;

/* renamed from: fZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9385fZ0 implements InterfaceC10097l70 {

    /* renamed from: b */
    public final Image f27236b;

    /* renamed from: c */
    public final Object f27237c = new Object();

    /* renamed from: a */
    public int f27235a = 1;

    public C9385fZ0(Image image) {
        this.f27236b = image;
    }

    /* renamed from: a */
    public final boolean m18258a() {
        synchronized (this.f27237c) {
            try {
                int i = this.f27235a;
                if (i <= 0) {
                    return false;
                }
                int i2 = i - 1;
                this.f27235a = i2;
                if (i2 <= 0) {
                    this.f27236b.close();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final Image m18259b() {
        return this.f27236b;
    }
}
