package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import defpackage.C6598qA0;
import defpackage.C8372zU0;
import defpackage.TB0;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2586a extends RenderableView {
    public C8372zU0 a;
    public C8372zU0 b;
    public C8372zU0 c;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.a);
        double dRelativeOnHeight = relativeOnHeight(this.b);
        double dRelativeOnOther = relativeOnOther(this.c);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<C6598qA0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new C6598qA0(3, new TB0[]{new TB0(dRelativeOnWidth, d)}));
        ArrayList<C6598qA0> arrayList2 = this.elements;
        TB0 tb0 = new TB0(dRelativeOnWidth, d);
        double d2 = dRelativeOnWidth + dRelativeOnOther;
        arrayList2.add(new C6598qA0(4, new TB0[]{tb0, new TB0(d2, dRelativeOnHeight)}));
        double d3 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new C6598qA0(4, new TB0[]{new TB0(d2, dRelativeOnHeight), new TB0(dRelativeOnWidth, d3)}));
        double d4 = dRelativeOnWidth - dRelativeOnOther;
        this.elements.add(new C6598qA0(4, new TB0[]{new TB0(dRelativeOnWidth, d3), new TB0(d4, dRelativeOnHeight)}));
        this.elements.add(new C6598qA0(4, new TB0[]{new TB0(d4, dRelativeOnHeight), new TB0(dRelativeOnWidth, d)}));
        return path;
    }
}
