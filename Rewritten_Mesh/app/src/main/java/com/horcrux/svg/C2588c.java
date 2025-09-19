package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.C6598qA0;
import defpackage.C8372zU0;
import defpackage.TB0;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2588c extends RenderableView {
    public C8372zU0 a;
    public C8372zU0 b;
    public C8372zU0 c;
    public C8372zU0 d;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.a);
        double dRelativeOnHeight = relativeOnHeight(this.b);
        double dRelativeOnWidth2 = relativeOnWidth(this.c);
        double dRelativeOnHeight2 = relativeOnHeight(this.d);
        double d = dRelativeOnWidth - dRelativeOnWidth2;
        double d2 = dRelativeOnHeight - dRelativeOnHeight2;
        double d3 = dRelativeOnWidth2 + dRelativeOnWidth;
        double d4 = dRelativeOnHeight2 + dRelativeOnHeight;
        path.addOval(new RectF((float) d, (float) d2, (float) d3, (float) d4), Path.Direction.CW);
        ArrayList<C6598qA0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C6598qA0(3, new TB0[]{new TB0(dRelativeOnWidth, d2)}));
        this.elements.add(new C6598qA0(4, new TB0[]{new TB0(dRelativeOnWidth, d2), new TB0(d3, dRelativeOnHeight)}));
        this.elements.add(new C6598qA0(4, new TB0[]{new TB0(d3, dRelativeOnHeight), new TB0(dRelativeOnWidth, d4)}));
        this.elements.add(new C6598qA0(4, new TB0[]{new TB0(dRelativeOnWidth, d4), new TB0(d, dRelativeOnHeight)}));
        this.elements.add(new C6598qA0(4, new TB0[]{new TB0(d, dRelativeOnHeight), new TB0(dRelativeOnWidth, d2)}));
        return path;
    }
}
