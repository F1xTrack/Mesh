package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import p000.C10743qA0;
import p000.C11931zU0;
import p000.TB0;

/* renamed from: com.horcrux.svg.a */
/* loaded from: classes.dex */
public final class C1985a extends RenderableView {

    /* renamed from: a */
    public C11931zU0 f18581a;

    /* renamed from: b */
    public C11931zU0 f18582b;

    /* renamed from: c */
    public C11931zU0 f18583c;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f18581a);
        double dRelativeOnHeight = relativeOnHeight(this.f18582b);
        double dRelativeOnOther = relativeOnOther(this.f18583c);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<C10743qA0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new C10743qA0(3, new TB0[]{new TB0(dRelativeOnWidth, d)}));
        ArrayList<C10743qA0> arrayList2 = this.elements;
        TB0 tb0 = new TB0(dRelativeOnWidth, d);
        double d2 = dRelativeOnWidth + dRelativeOnOther;
        arrayList2.add(new C10743qA0(4, new TB0[]{tb0, new TB0(d2, dRelativeOnHeight)}));
        double d3 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new C10743qA0(4, new TB0[]{new TB0(d2, dRelativeOnHeight), new TB0(dRelativeOnWidth, d3)}));
        double d4 = dRelativeOnWidth - dRelativeOnOther;
        this.elements.add(new C10743qA0(4, new TB0[]{new TB0(dRelativeOnWidth, d3), new TB0(d4, dRelativeOnHeight)}));
        this.elements.add(new C10743qA0(4, new TB0[]{new TB0(d4, dRelativeOnHeight), new TB0(dRelativeOnWidth, d)}));
        return path;
    }
}
