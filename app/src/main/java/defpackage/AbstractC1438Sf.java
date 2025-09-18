package defpackage;

import android.graphics.Bitmap;

/* renamed from: Sf */
/* loaded from: classes.dex */
public abstract class AbstractC1438Sf extends AbstractC1828Xf {
    @Override // defpackage.AbstractC1828Xf
    public void onNewResultImpl(YC yc) {
        I i = (I) yc;
        if (i.g()) {
            AbstractC8446zt abstractC8446zt = (AbstractC8446zt) i.getResult();
            try {
                onNewResultImpl((abstractC8446zt == null || !(abstractC8446zt.w() instanceof InterfaceC0077At)) ? null : ((VE) ((InterfaceC0077At) abstractC8446zt.w())).d);
            } finally {
                AbstractC8446zt.p(abstractC8446zt);
            }
        }
    }

    public abstract void onNewResultImpl(Bitmap bitmap);
}
