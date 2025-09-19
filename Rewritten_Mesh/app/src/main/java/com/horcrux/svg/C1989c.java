package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import p000.C10743qA0;
import p000.C11931zU0;
import p000.TB0;

/* renamed from: com.horcrux.svg.c */
/* loaded from: classes.dex */
public final class C1989c extends RenderableView {

    /* renamed from: a */
    public C11931zU0 f18586a;

    /* renamed from: b */
    public C11931zU0 f18587b;

    /* renamed from: c */
    public C11931zU0 f18588c;

    /* renamed from: d */
    public C11931zU0 f18589d;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f18586a);
        double dRelativeOnHeight = relativeOnHeight(this.f18587b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f18588c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f18589d);
        double d = dRelativeOnWidth - dRelativeOnWidth2;
        double d2 = dRelativeOnHeight - dRelativeOnHeight2;
        double d3 = dRelativeOnWidth2 + dRelativeOnWidth;
        double d4 = dRelativeOnHeight2 + dRelativeOnHeight;
        path.addOval(new RectF((float) d, (float) d2, (float) d3, (float) d4), Path.Direction.CW);
        ArrayList<C10743qA0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C10743qA0(3, new TB0[]{new TB0(dRelativeOnWidth, d2)}));
        this.elements.add(new C10743qA0(4, new TB0[]{new TB0(dRelativeOnWidth, d2), new TB0(d3, dRelativeOnHeight)}));
        this.elements.add(new C10743qA0(4, new TB0[]{new TB0(d3, dRelativeOnHeight), new TB0(dRelativeOnWidth, d4)}));
        this.elements.add(new C10743qA0(4, new TB0[]{new TB0(dRelativeOnWidth, d4), new TB0(d, dRelativeOnHeight)}));
        this.elements.add(new C10743qA0(4, new TB0[]{new TB0(d, dRelativeOnHeight), new TB0(dRelativeOnWidth, d2)}));
        return path;
    }
}
