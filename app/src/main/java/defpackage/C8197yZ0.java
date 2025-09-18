package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: yZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8197yZ0 extends AbstractC8190yX {
    public final Object d;
    public final K60 e;
    public final int f;
    public final int g;

    public C8197yZ0(InterfaceC3903g70 interfaceC3903g70, Size size, K60 k60) {
        super(interfaceC3903g70);
        this.d = new Object();
        if (size == null) {
            this.f = this.b.getWidth();
            this.g = this.b.getHeight();
        } else {
            this.f = size.getWidth();
            this.g = size.getHeight();
        }
        this.e = k60;
    }

    @Override // defpackage.AbstractC8190yX, defpackage.InterfaceC3903g70
    public final K60 P() {
        return this.e;
    }

    public final void c(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f, this.g)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.d) {
        }
    }

    @Override // defpackage.AbstractC8190yX, defpackage.InterfaceC3903g70
    public final int getHeight() {
        return this.g;
    }

    @Override // defpackage.AbstractC8190yX, defpackage.InterfaceC3903g70
    public final int getWidth() {
        return this.f;
    }
}
