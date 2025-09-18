package defpackage;

import android.graphics.Canvas;

/* renamed from: sT0 */
/* loaded from: classes.dex */
public final class C7036sT0 extends C7810wX implements InterfaceC3836fm1 {
    public C7560vD d;
    public C6394p6 e;

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            C6394p6 c6394p6 = this.e;
            if (c6394p6 != null && !c6394p6.d) {
                AbstractC3393dS.o(C7393uL.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(c6394p6)), Integer.valueOf(System.identityHashCode((InterfaceC7011sL) c6394p6.b)), c6394p6.toString());
                c6394p6.e = true;
                c6394p6.f = true;
                c6394p6.d();
            }
            super.draw(canvas);
            C7560vD c7560vD = this.d;
            if (c7560vD != null) {
                c7560vD.setBounds(getBounds());
                this.d.draw(canvas);
            }
        }
    }

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        C6394p6 c6394p6 = this.e;
        if (c6394p6 != null) {
            c6394p6.i(z);
        }
        return super.setVisible(z, z2);
    }
}
