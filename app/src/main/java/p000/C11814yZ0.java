package p000;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: yZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11814yZ0 extends AbstractC7207yX {

    /* renamed from: d */
    public final Object f46307d;

    /* renamed from: e */
    public final K60 f46308e;

    /* renamed from: f */
    public final int f46309f;

    /* renamed from: g */
    public final int f46310g;

    public C11814yZ0(InterfaceC9457g70 interfaceC9457g70, Size size, K60 k60) {
        super(interfaceC9457g70);
        this.f46307d = new Object();
        if (size == null) {
            this.f46309f = this.f46285b.getWidth();
            this.f46310g = this.f46285b.getHeight();
        } else {
            this.f46309f = size.getWidth();
            this.f46310g = size.getHeight();
        }
        this.f46308e = k60;
    }

    @Override // p000.AbstractC7207yX, p000.InterfaceC9457g70
    /* renamed from: P */
    public final K60 mo18403P() {
        return this.f46308e;
    }

    /* renamed from: c */
    public final void m26169c(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f46309f, this.f46310g)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f46307d) {
        }
    }

    @Override // p000.AbstractC7207yX, p000.InterfaceC9457g70
    public final int getHeight() {
        return this.f46310g;
    }

    @Override // p000.AbstractC7207yX, p000.InterfaceC9457g70
    public final int getWidth() {
        return this.f46309f;
    }
}
