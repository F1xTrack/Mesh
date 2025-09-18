package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: og0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10551og0 {

    /* renamed from: a */
    public final C8532Xl0 f39158a;

    /* renamed from: b */
    public final Object f39159b;

    /* renamed from: c */
    public Object f39160c;

    /* renamed from: d */
    public final Interpolator f39161d;

    /* renamed from: e */
    public final Interpolator f39162e;

    /* renamed from: f */
    public final Interpolator f39163f;

    /* renamed from: g */
    public final float f39164g;

    /* renamed from: h */
    public Float f39165h;

    /* renamed from: i */
    public float f39166i;

    /* renamed from: j */
    public float f39167j;

    /* renamed from: k */
    public int f39168k;

    /* renamed from: l */
    public int f39169l;

    /* renamed from: m */
    public float f39170m;

    /* renamed from: n */
    public float f39171n;

    /* renamed from: o */
    public PointF f39172o;

    /* renamed from: p */
    public PointF f39173p;

    public C10551og0(C8532Xl0 c8532Xl0, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.f39166i = -3987645.8f;
        this.f39167j = -3987645.8f;
        this.f39168k = 784923401;
        this.f39169l = 784923401;
        this.f39170m = Float.MIN_VALUE;
        this.f39171n = Float.MIN_VALUE;
        this.f39172o = null;
        this.f39173p = null;
        this.f39158a = c8532Xl0;
        this.f39159b = obj;
        this.f39160c = obj2;
        this.f39161d = interpolator;
        this.f39162e = null;
        this.f39163f = null;
        this.f39164g = f;
        this.f39165h = f2;
    }

    /* renamed from: a */
    public final float m23517a() {
        C8532Xl0 c8532Xl0 = this.f39158a;
        if (c8532Xl0 == null) {
            return 1.0f;
        }
        if (this.f39171n == Float.MIN_VALUE) {
            if (this.f39165h == null) {
                this.f39171n = 1.0f;
            } else {
                this.f39171n = ((this.f39165h.floatValue() - this.f39164g) / (c8532Xl0.f13959m - c8532Xl0.f13958l)) + m23518b();
            }
        }
        return this.f39171n;
    }

    /* renamed from: b */
    public final float m23518b() {
        C8532Xl0 c8532Xl0 = this.f39158a;
        if (c8532Xl0 == null) {
            return 0.0f;
        }
        if (this.f39170m == Float.MIN_VALUE) {
            float f = c8532Xl0.f13958l;
            this.f39170m = (this.f39164g - f) / (c8532Xl0.f13959m - f);
        }
        return this.f39170m;
    }

    /* renamed from: c */
    public final boolean m23519c() {
        return this.f39161d == null && this.f39162e == null && this.f39163f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f39159b + ", endValue=" + this.f39160c + ", startFrame=" + this.f39164g + ", endFrame=" + this.f39165h + ", interpolator=" + this.f39161d + '}';
    }

    public C10551og0(C8532Xl0 c8532Xl0, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.f39166i = -3987645.8f;
        this.f39167j = -3987645.8f;
        this.f39168k = 784923401;
        this.f39169l = 784923401;
        this.f39170m = Float.MIN_VALUE;
        this.f39171n = Float.MIN_VALUE;
        this.f39172o = null;
        this.f39173p = null;
        this.f39158a = c8532Xl0;
        this.f39159b = obj;
        this.f39160c = obj2;
        this.f39161d = null;
        this.f39162e = interpolator;
        this.f39163f = interpolator2;
        this.f39164g = f;
        this.f39165h = null;
    }

    public C10551og0(C8532Xl0 c8532Xl0, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f39166i = -3987645.8f;
        this.f39167j = -3987645.8f;
        this.f39168k = 784923401;
        this.f39169l = 784923401;
        this.f39170m = Float.MIN_VALUE;
        this.f39171n = Float.MIN_VALUE;
        this.f39172o = null;
        this.f39173p = null;
        this.f39158a = c8532Xl0;
        this.f39159b = obj;
        this.f39160c = obj2;
        this.f39161d = interpolator;
        this.f39162e = interpolator2;
        this.f39163f = interpolator3;
        this.f39164g = f;
        this.f39165h = f2;
    }

    public C10551og0(Object obj) {
        this.f39166i = -3987645.8f;
        this.f39167j = -3987645.8f;
        this.f39168k = 784923401;
        this.f39169l = 784923401;
        this.f39170m = Float.MIN_VALUE;
        this.f39171n = Float.MIN_VALUE;
        this.f39172o = null;
        this.f39173p = null;
        this.f39158a = null;
        this.f39159b = obj;
        this.f39160c = obj;
        this.f39161d = null;
        this.f39162e = null;
        this.f39163f = null;
        this.f39164g = Float.MIN_VALUE;
        this.f39165h = Float.valueOf(Float.MAX_VALUE);
    }

    public C10551og0(Q10 q10, Q10 q102) {
        this.f39166i = -3987645.8f;
        this.f39167j = -3987645.8f;
        this.f39168k = 784923401;
        this.f39169l = 784923401;
        this.f39170m = Float.MIN_VALUE;
        this.f39171n = Float.MIN_VALUE;
        this.f39172o = null;
        this.f39173p = null;
        this.f39158a = null;
        this.f39159b = q10;
        this.f39160c = q102;
        this.f39161d = null;
        this.f39162e = null;
        this.f39163f = null;
        this.f39164g = Float.MIN_VALUE;
        this.f39165h = Float.valueOf(Float.MAX_VALUE);
    }
}
