package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C2599n;
import com.horcrux.svg.SVGLength$UnitType;

/* renamed from: gj */
/* loaded from: classes.dex */
public final class C4016gj {
    public final int a;
    public final C8372zU0[] b;
    public ReadableArray c;
    public final boolean d;
    public boolean e;
    public Matrix f;
    public Rect g;
    public C2599n h;

    public C4016gj(int i, C8372zU0[] c8372zU0Arr, int i2) {
        this.a = i;
        this.b = c8372zU0Arr;
        this.d = i2 == 1;
    }

    public final double a(C8372zU0 c8372zU0, double d, float f, float f2) {
        return GM1.b(c8372zU0, d, (this.d && c8372zU0.b == SVGLength$UnitType.NUMBER) ? d : f, f2);
    }
}
