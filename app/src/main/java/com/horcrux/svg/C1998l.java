package com.horcrux.svg;

import android.graphics.Matrix;
import android.view.View;
import p000.C11931zU0;

/* renamed from: com.horcrux.svg.l */
/* loaded from: classes.dex */
public final class C1998l extends C1993g {

    /* renamed from: f */
    public C11931zU0 f18630f;

    /* renamed from: g */
    public C11931zU0 f18631g;

    /* renamed from: h */
    public C11931zU0 f18632h;

    /* renamed from: i */
    public C11931zU0 f18633i;

    /* renamed from: j */
    public String f18634j;

    /* renamed from: k */
    public String f18635k;

    /* renamed from: l */
    public float f18636l;

    /* renamed from: m */
    public float f18637m;

    /* renamed from: n */
    public float f18638n;

    /* renamed from: o */
    public float f18639o;

    /* renamed from: p */
    public String f18640p;

    /* renamed from: q */
    public int f18641q;

    /* renamed from: r */
    public Matrix f18642r;

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }
}
