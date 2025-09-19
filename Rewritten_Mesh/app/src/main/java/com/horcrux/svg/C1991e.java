package com.horcrux.svg;

import java.util.HashMap;
import p000.AbstractC6733rH;
import p000.EnumC6889tU;
import p000.S91;

/* renamed from: com.horcrux.svg.e */
/* loaded from: classes.dex */
public final class C1991e extends AbstractC6733rH {

    /* renamed from: a */
    public final HashMap f18593a;

    /* renamed from: b */
    public EnumC6889tU f18594b;

    /* renamed from: c */
    public EnumC6889tU f18595c;

    /* renamed from: d */
    public final FilterRegion f18596d;

    public C1991e(S91 s91) {
        super(s91);
        this.f18593a = new HashMap();
        this.f18596d = new FilterRegion();
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
