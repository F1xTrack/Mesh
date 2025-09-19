package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import p000.B91;
import p000.C11931zU0;
import p000.C91;
import p000.K10;
import p000.S91;

/* renamed from: com.horcrux.svg.Y */
/* loaded from: classes.dex */
public class C1983Y extends C1993g {

    /* renamed from: f */
    public C11931zU0 f18565f;

    /* renamed from: g */
    public C11931zU0 f18566g;

    /* renamed from: h */
    public String f18567h;

    /* renamed from: i */
    public int f18568i;

    /* renamed from: j */
    public C91 f18569j;

    /* renamed from: k */
    public ArrayList f18570k;

    /* renamed from: l */
    public ArrayList f18571l;

    /* renamed from: m */
    public ArrayList f18572m;

    /* renamed from: n */
    public ArrayList f18573n;

    /* renamed from: o */
    public ArrayList f18574o;

    /* renamed from: p */
    public double f18575p;

    public C1983Y(S91 s91) {
        super(s91);
        this.f18565f = null;
        this.f18566g = null;
        this.f18567h = null;
        this.f18568i = 1;
        this.f18575p = Double.NaN;
    }

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f18575p = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        m11368r(canvas);
        clip(canvas, paint);
        m11363s(canvas, paint);
        mo532q();
        mo11365l(canvas, paint, f);
        mo531p();
    }

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        m11368r(canvas);
        return m11363s(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath == null) {
            return;
        }
        super.invalidate();
        ViewParent parent = getParent();
        C1983Y c1983y = this;
        while (parent instanceof C1983Y) {
            c1983y = (C1983Y) parent;
            parent = c1983y.getParent();
        }
        c1983y.clearChildCache();
    }

    @Override // com.horcrux.svg.C1993g
    /* renamed from: n */
    public final Path mo11362n(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.C1993g
    /* renamed from: q */
    public void mo532q() {
        boolean z = ((this instanceof B91) || (this instanceof C1982X)) ? false : true;
        K10 k10M11367o = m11367o();
        ReadableMap readableMap = this.f18602a;
        ArrayList arrayList = this.f18570k;
        ArrayList arrayList2 = this.f18571l;
        ArrayList arrayList3 = this.f18573n;
        ArrayList arrayList4 = this.f18574o;
        ArrayList arrayList5 = this.f18572m;
        if (z) {
            k10M11367o.f5841F = 0;
            k10M11367o.f5840E = 0;
            k10M11367o.f5839D = 0;
            k10M11367o.f5838C = 0;
            k10M11367o.f5837B = 0;
            k10M11367o.f5846K = -1;
            k10M11367o.f5845J = -1;
            k10M11367o.f5844I = -1;
            k10M11367o.f5843H = -1;
            k10M11367o.f5842G = -1;
            k10M11367o.f5872v = ConfigValue.DOUBLE_DEFAULT_VALUE;
            k10M11367o.f5871u = ConfigValue.DOUBLE_DEFAULT_VALUE;
            k10M11367o.f5870t = ConfigValue.DOUBLE_DEFAULT_VALUE;
            k10M11367o.f5869s = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        k10M11367o.m4519f(this, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            k10M11367o.f5837B++;
            k10M11367o.f5842G = -1;
            k10M11367o.f5857g.add(-1);
            C11931zU0[] c11931zU0ArrM4514a = K10.m4514a(arrayList);
            k10M11367o.f5873w = c11931zU0ArrM4514a;
            k10M11367o.f5852b.add(c11931zU0ArrM4514a);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            k10M11367o.f5838C++;
            k10M11367o.f5843H = -1;
            k10M11367o.f5858h.add(-1);
            C11931zU0[] c11931zU0ArrM4514a2 = K10.m4514a(arrayList2);
            k10M11367o.f5874x = c11931zU0ArrM4514a2;
            k10M11367o.f5853c.add(c11931zU0ArrM4514a2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            k10M11367o.f5839D++;
            k10M11367o.f5844I = -1;
            k10M11367o.f5859i.add(-1);
            C11931zU0[] c11931zU0ArrM4514a3 = K10.m4514a(arrayList3);
            k10M11367o.f5875y = c11931zU0ArrM4514a3;
            k10M11367o.f5854d.add(c11931zU0ArrM4514a3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            k10M11367o.f5840E++;
            k10M11367o.f5845J = -1;
            k10M11367o.f5860j.add(-1);
            C11931zU0[] c11931zU0ArrM4514a4 = K10.m4514a(arrayList4);
            k10M11367o.f5876z = c11931zU0ArrM4514a4;
            k10M11367o.f5855e.add(c11931zU0ArrM4514a4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            k10M11367o.f5841F++;
            k10M11367o.f5846K = -1;
            k10M11367o.f5861k.add(-1);
            int size = arrayList5.size();
            double[] dArr = new double[size];
            for (int i = 0; i < size; i++) {
                dArr[i] = ((C11931zU0) arrayList5.get(i)).f46847a;
            }
            k10M11367o.f5836A = dArr;
            k10M11367o.f5856f.add(dArr);
        }
        k10M11367o.m4518e();
    }

    /* renamed from: s */
    public final Path m11363s(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        mo532q();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        mo531p();
        return ((VirtualView) this).mPath;
    }

    /* renamed from: t */
    public double mo11358t(Paint paint) {
        if (!Double.isNaN(this.f18575p)) {
            return this.f18575p;
        }
        double dMo11358t = ConfigValue.DOUBLE_DEFAULT_VALUE;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C1983Y) {
                dMo11358t = ((C1983Y) childAt).mo11358t(paint) + dMo11358t;
            }
        }
        this.f18575p = dMo11358t;
        return dMo11358t;
    }

    /* renamed from: u */
    public void mo533u(String str) {
        this.f18569j = C91.m999a(str);
        invalidate();
    }
}
