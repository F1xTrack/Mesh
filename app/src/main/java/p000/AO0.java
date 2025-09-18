package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class AO0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public OO0 f182a;

    /* renamed from: b */
    public final Rect f183b;

    /* renamed from: c */
    public boolean f184c;

    /* renamed from: d */
    public boolean f185d;

    public AO0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f183b = new Rect();
        this.f184c = true;
        this.f185d = false;
    }

    public AO0(int i, int i2) {
        super(i, i2);
        this.f183b = new Rect();
        this.f184c = true;
        this.f185d = false;
    }

    public AO0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f183b = new Rect();
        this.f184c = true;
        this.f185d = false;
    }

    public AO0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f183b = new Rect();
        this.f184c = true;
        this.f185d = false;
    }

    public AO0(AO0 ao0) {
        super((ViewGroup.LayoutParams) ao0);
        this.f183b = new Rect();
        this.f184c = true;
        this.f185d = false;
    }
}
