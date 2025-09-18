package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C2000n;
import com.horcrux.svg.SVGLength$UnitType;

/* renamed from: gj */
/* loaded from: classes.dex */
public final class C4134gj {

    /* renamed from: a */
    public final int f27953a;

    /* renamed from: b */
    public final C11931zU0[] f27954b;

    /* renamed from: c */
    public ReadableArray f27955c;

    /* renamed from: d */
    public final boolean f27956d;

    /* renamed from: e */
    public boolean f27957e;

    /* renamed from: f */
    public Matrix f27958f;

    /* renamed from: g */
    public Rect f27959g;

    /* renamed from: h */
    public C2000n f27960h;

    public C4134gj(int i, C11931zU0[] c11931zU0Arr, int i2) {
        this.f27953a = i;
        this.f27954b = c11931zU0Arr;
        this.f27956d = i2 == 1;
    }

    /* renamed from: a */
    public final double m18604a(C11931zU0 c11931zU0, double d, float f, float f2) {
        return GM1.m3049b(c11931zU0, d, (this.f27956d && c11931zU0.f46848b == SVGLength$UnitType.NUMBER) ? d : f, f2);
    }
}
