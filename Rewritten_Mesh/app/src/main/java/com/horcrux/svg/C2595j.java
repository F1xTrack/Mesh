package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import defpackage.C6598qA0;
import defpackage.C8372zU0;
import defpackage.TB0;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2595j extends RenderableView {
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
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<C6598qA0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C6598qA0(3, new TB0[]{new TB0(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new C6598qA0(4, new TB0[]{new TB0(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
