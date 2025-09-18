package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* renamed from: mo0 */
/* loaded from: classes.dex */
public class C10311mo0 extends Drawable.ConstantState {

    /* renamed from: a */
    public LZ0 f37931a;

    /* renamed from: b */
    public C6613pN f37932b;

    /* renamed from: c */
    public ColorStateList f37933c;

    /* renamed from: d */
    public ColorStateList f37934d;

    /* renamed from: e */
    public ColorStateList f37935e;

    /* renamed from: f */
    public PorterDuff.Mode f37936f;

    /* renamed from: g */
    public Rect f37937g;

    /* renamed from: h */
    public final float f37938h;

    /* renamed from: i */
    public float f37939i;

    /* renamed from: j */
    public float f37940j;

    /* renamed from: k */
    public int f37941k;

    /* renamed from: l */
    public float f37942l;

    /* renamed from: m */
    public float f37943m;

    /* renamed from: n */
    public int f37944n;

    /* renamed from: o */
    public int f37945o;

    /* renamed from: p */
    public final Paint.Style f37946p;

    public C10311mo0(LZ0 lz0) {
        this.f37933c = null;
        this.f37934d = null;
        this.f37935e = null;
        this.f37936f = PorterDuff.Mode.SRC_IN;
        this.f37937g = null;
        this.f37938h = 1.0f;
        this.f37939i = 1.0f;
        this.f37941k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f37942l = 0.0f;
        this.f37943m = 0.0f;
        this.f37944n = 0;
        this.f37945o = 0;
        this.f37946p = Paint.Style.FILL_AND_STROKE;
        this.f37931a = lz0;
        this.f37932b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C10439no0 c10439no0 = new C10439no0(this);
        c10439no0.f38520e = true;
        return c10439no0;
    }

    public C10311mo0(C10311mo0 c10311mo0) {
        this.f37933c = null;
        this.f37934d = null;
        this.f37935e = null;
        this.f37936f = PorterDuff.Mode.SRC_IN;
        this.f37937g = null;
        this.f37938h = 1.0f;
        this.f37939i = 1.0f;
        this.f37941k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f37942l = 0.0f;
        this.f37943m = 0.0f;
        this.f37944n = 0;
        this.f37945o = 0;
        this.f37946p = Paint.Style.FILL_AND_STROKE;
        this.f37931a = c10311mo0.f37931a;
        this.f37932b = c10311mo0.f37932b;
        this.f37940j = c10311mo0.f37940j;
        this.f37933c = c10311mo0.f37933c;
        this.f37934d = c10311mo0.f37934d;
        this.f37936f = c10311mo0.f37936f;
        this.f37935e = c10311mo0.f37935e;
        this.f37941k = c10311mo0.f37941k;
        this.f37938h = c10311mo0.f37938h;
        this.f37945o = c10311mo0.f37945o;
        this.f37939i = c10311mo0.f37939i;
        this.f37942l = c10311mo0.f37942l;
        this.f37943m = c10311mo0.f37943m;
        this.f37944n = c10311mo0.f37944n;
        this.f37946p = c10311mo0.f37946p;
        if (c10311mo0.f37937g != null) {
            this.f37937g = new Rect(c10311mo0.f37937g);
        }
    }
}
