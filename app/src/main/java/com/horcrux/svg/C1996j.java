package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import p000.C10743qA0;
import p000.C11931zU0;
import p000.TB0;

/* renamed from: com.horcrux.svg.j */
/* loaded from: classes.dex */
public final class C1996j extends RenderableView {

    /* renamed from: a */
    public C11931zU0 f18618a;

    /* renamed from: b */
    public C11931zU0 f18619b;

    /* renamed from: c */
    public C11931zU0 f18620c;

    /* renamed from: d */
    public C11931zU0 f18621d;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f18618a);
        double dRelativeOnHeight = relativeOnHeight(this.f18619b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f18620c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f18621d);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<C10743qA0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C10743qA0(3, new TB0[]{new TB0(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new C10743qA0(4, new TB0[]{new TB0(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
