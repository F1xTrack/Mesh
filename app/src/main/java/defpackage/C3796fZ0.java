package defpackage;

import android.media.Image;

/* renamed from: fZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3796fZ0 implements InterfaceC5634l70 {
    public final Image b;
    public final Object c = new Object();
    public int a = 1;

    public C3796fZ0(Image image) {
        this.b = image;
    }

    public final boolean a() {
        synchronized (this.c) {
            try {
                int i = this.a;
                if (i <= 0) {
                    return false;
                }
                int i2 = i - 1;
                this.a = i2;
                if (i2 <= 0) {
                    this.b.close();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Image b() {
        return this.b;
    }
}
