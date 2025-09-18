package p000;

import android.graphics.Bitmap;

/* renamed from: Sf */
/* loaded from: classes.dex */
public abstract class AbstractC1174Sf extends AbstractC1489Xf {
    @Override // p000.AbstractC1489Xf
    public void onNewResultImpl(InterfaceC1523YC interfaceC1523YC) {
        AbstractC0504I abstractC0504I = (AbstractC0504I) interfaceC1523YC;
        if (abstractC0504I.m3668g()) {
            AbstractC7292zt abstractC7292zt = (AbstractC7292zt) abstractC0504I.getResult();
            try {
                onNewResultImpl((abstractC7292zt == null || !(abstractC7292zt.m26572w() instanceof InterfaceC0056At)) ? null : ((C1336VE) ((InterfaceC0056At) abstractC7292zt.m26572w())).f12446d);
            } finally {
                AbstractC7292zt.m26569p(abstractC7292zt);
            }
        }
    }

    public abstract void onNewResultImpl(Bitmap bitmap);
}
