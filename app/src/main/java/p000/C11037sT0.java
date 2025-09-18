package p000;

import android.graphics.Canvas;

/* renamed from: sT0 */
/* loaded from: classes.dex */
public final class C11037sT0 extends C7081wX implements InterfaceC9412fm1 {

    /* renamed from: d */
    public C6998vD f42445d;

    /* renamed from: e */
    public C6596p6 f42446e;

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            C6596p6 c6596p6 = this.f42446e;
            if (c6596p6 != null && !c6596p6.f39835d) {
                AbstractC3929dS.m17682o(C6943uL.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(c6596p6)), Integer.valueOf(System.identityHashCode((InterfaceC6817sL) c6596p6.f39833b)), c6596p6.toString());
                c6596p6.f39836e = true;
                c6596p6.f39837f = true;
                c6596p6.m23614d();
            }
            super.draw(canvas);
            C6998vD c6998vD = this.f42445d;
            if (c6998vD != null) {
                c6998vD.setBounds(getBounds());
                this.f42445d.draw(canvas);
            }
        }
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        C6596p6 c6596p6 = this.f42446e;
        if (c6596p6 != null) {
            c6596p6.m23619i(z);
        }
        return super.setVisible(z, z2);
    }
}
