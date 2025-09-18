package com.horcrux.svg;

import android.graphics.Bitmap;
import com.horcrux.svg.events.SvgLoadEvent;
import defpackage.AbstractC1438Sf;
import defpackage.AbstractC3393dS;
import defpackage.OZ1;
import defpackage.YC;

/* renamed from: com.horcrux.svg.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2593h extends AbstractC1438Sf {
    public final /* synthetic */ C2594i a;

    public C2593h(C2594i c2594i) {
        this.a = c2594i;
    }

    @Override // defpackage.AbstractC1828Xf
    public final void onFailureImpl(YC yc) {
        this.a.j.set(false);
        ((defpackage.I) yc).c();
        AbstractC3393dS.r("RNSVG: fetchDecodedImage failed!", new Object[0]);
    }

    @Override // defpackage.AbstractC1438Sf
    public final void onNewResultImpl(Bitmap bitmap) {
        C2594i c2594i = this.a;
        OZ1.b(c2594i.mContext, c2594i.getId()).g(new SvgLoadEvent(OZ1.e(c2594i), c2594i.getId(), c2594i.mContext, c2594i.e, bitmap.getWidth(), bitmap.getHeight()));
        c2594i.j.set(false);
        SvgView svgView = c2594i.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }
}
