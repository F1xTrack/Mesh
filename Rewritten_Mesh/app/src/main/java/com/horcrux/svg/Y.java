package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import defpackage.B91;
import defpackage.C8372zU0;
import defpackage.C91;
import defpackage.K10;
import defpackage.S91;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Y extends C2592g {
    public C8372zU0 f;
    public C8372zU0 g;
    public String h;
    public int i;
    public C91 j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public double p;

    public Y(S91 s91) {
        super(s91);
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 1;
        this.p = Double.NaN;
    }

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.p = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        r(canvas);
        clip(canvas, paint);
        s(canvas, paint);
        q();
        l(canvas, paint, f);
        p();
    }

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        r(canvas);
        return s(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath == null) {
            return;
        }
        super.invalidate();
        ViewParent parent = getParent();
        Y y = this;
        while (parent instanceof Y) {
            y = (Y) parent;
            parent = y.getParent();
        }
        y.clearChildCache();
    }

    @Override // com.horcrux.svg.C2592g
    public final Path n(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.C2592g
    public void q() {
        boolean z = ((this instanceof B91) || (this instanceof X)) ? false : true;
        K10 k10O = o();
        ReadableMap readableMap = this.a;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.l;
        ArrayList arrayList3 = this.n;
        ArrayList arrayList4 = this.o;
        ArrayList arrayList5 = this.m;
        if (z) {
            k10O.F = 0;
            k10O.E = 0;
            k10O.D = 0;
            k10O.C = 0;
            k10O.B = 0;
            k10O.K = -1;
            k10O.J = -1;
            k10O.I = -1;
            k10O.H = -1;
            k10O.G = -1;
            k10O.v = ConfigValue.DOUBLE_DEFAULT_VALUE;
            k10O.u = ConfigValue.DOUBLE_DEFAULT_VALUE;
            k10O.t = ConfigValue.DOUBLE_DEFAULT_VALUE;
            k10O.s = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        k10O.f(this, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            k10O.B++;
            k10O.G = -1;
            k10O.g.add(-1);
            C8372zU0[] c8372zU0ArrA = K10.a(arrayList);
            k10O.w = c8372zU0ArrA;
            k10O.b.add(c8372zU0ArrA);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            k10O.C++;
            k10O.H = -1;
            k10O.h.add(-1);
            C8372zU0[] c8372zU0ArrA2 = K10.a(arrayList2);
            k10O.x = c8372zU0ArrA2;
            k10O.c.add(c8372zU0ArrA2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            k10O.D++;
            k10O.I = -1;
            k10O.i.add(-1);
            C8372zU0[] c8372zU0ArrA3 = K10.a(arrayList3);
            k10O.y = c8372zU0ArrA3;
            k10O.d.add(c8372zU0ArrA3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            k10O.E++;
            k10O.J = -1;
            k10O.j.add(-1);
            C8372zU0[] c8372zU0ArrA4 = K10.a(arrayList4);
            k10O.z = c8372zU0ArrA4;
            k10O.e.add(c8372zU0ArrA4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            k10O.F++;
            k10O.K = -1;
            k10O.k.add(-1);
            int size = arrayList5.size();
            double[] dArr = new double[size];
            for (int i = 0; i < size; i++) {
                dArr[i] = ((C8372zU0) arrayList5.get(i)).a;
            }
            k10O.A = dArr;
            k10O.f.add(dArr);
        }
        k10O.e();
    }

    public final Path s(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        q();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        p();
        return ((VirtualView) this).mPath;
    }

    public double t(Paint paint) {
        if (!Double.isNaN(this.p)) {
            return this.p;
        }
        double dT = ConfigValue.DOUBLE_DEFAULT_VALUE;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Y) {
                dT = ((Y) childAt).t(paint) + dT;
            }
        }
        this.p = dT;
        return dT;
    }

    public void u(String str) {
        this.j = C91.a(str);
        invalidate();
    }
}
