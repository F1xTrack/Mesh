package com.horcrux.svg;

import defpackage.AbstractC6808rH;
import defpackage.EnumC7229tU;
import defpackage.S91;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2590e extends AbstractC6808rH {
    public final HashMap a;
    public EnumC7229tU b;
    public EnumC7229tU c;
    public final FilterRegion d;

    public C2590e(S91 s91) {
        super(s91);
        this.a = new HashMap();
        this.d = new FilterRegion();
    }

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }
}
