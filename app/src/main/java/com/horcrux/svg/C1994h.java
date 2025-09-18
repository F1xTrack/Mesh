package com.horcrux.svg;

import android.graphics.Bitmap;
import com.horcrux.svg.events.SvgLoadEvent;
import p000.AbstractC0504I;
import p000.AbstractC1174Sf;
import p000.AbstractC3929dS;
import p000.InterfaceC1523YC;
import p000.OZ1;

/* renamed from: com.horcrux.svg.h */
/* loaded from: classes.dex */
public final class C1994h extends AbstractC1174Sf {

    /* renamed from: a */
    public final /* synthetic */ C1995i f18607a;

    public C1994h(C1995i c1995i) {
        this.f18607a = c1995i;
    }

    @Override // p000.AbstractC1489Xf
    public final void onFailureImpl(InterfaceC1523YC interfaceC1523YC) {
        this.f18607a.f18617j.set(false);
        ((AbstractC0504I) interfaceC1523YC).m3664c();
        AbstractC3929dS.m17685r("RNSVG: fetchDecodedImage failed!", new Object[0]);
    }

    @Override // p000.AbstractC1174Sf
    public final void onNewResultImpl(Bitmap bitmap) {
        C1995i c1995i = this.f18607a;
        OZ1.m6091b(c1995i.mContext, c1995i.getId()).mo11046g(new SvgLoadEvent(OZ1.m6094e(c1995i), c1995i.getId(), c1995i.mContext, c1995i.f18612e, bitmap.getWidth(), bitmap.getHeight()));
        c1995i.f18617j.set(false);
        SvgView svgView = c1995i.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }
}
