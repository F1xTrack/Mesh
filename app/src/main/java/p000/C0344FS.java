package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* renamed from: FS */
/* loaded from: classes.dex */
public final class C0344FS extends AbstractC11665xO0 {

    /* renamed from: C */
    public static final int[] f3226C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f3227D = new int[0];

    /* renamed from: A */
    public int f3228A;

    /* renamed from: B */
    public final GR0 f3229B;

    /* renamed from: a */
    public final int f3230a;

    /* renamed from: b */
    public final int f3231b;

    /* renamed from: c */
    public final StateListDrawable f3232c;

    /* renamed from: d */
    public final Drawable f3233d;

    /* renamed from: e */
    public final int f3234e;

    /* renamed from: f */
    public final int f3235f;

    /* renamed from: g */
    public final StateListDrawable f3236g;

    /* renamed from: h */
    public final Drawable f3237h;

    /* renamed from: i */
    public final int f3238i;

    /* renamed from: j */
    public final int f3239j;

    /* renamed from: k */
    public int f3240k;

    /* renamed from: l */
    public int f3241l;

    /* renamed from: m */
    public float f3242m;

    /* renamed from: n */
    public int f3243n;

    /* renamed from: o */
    public int f3244o;

    /* renamed from: p */
    public float f3245p;

    /* renamed from: s */
    public final RecyclerView f3248s;

    /* renamed from: z */
    public final ValueAnimator f3255z;

    /* renamed from: q */
    public int f3246q = 0;

    /* renamed from: r */
    public int f3247r = 0;

    /* renamed from: t */
    public boolean f3249t = false;

    /* renamed from: u */
    public boolean f3250u = false;

    /* renamed from: v */
    public int f3251v = 0;

    /* renamed from: w */
    public int f3252w = 0;

    /* renamed from: x */
    public final int[] f3253x = new int[2];

    /* renamed from: y */
    public final int[] f3254y = new int[2];

    public C0344FS(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3255z = valueAnimatorOfFloat;
        this.f3228A = 0;
        GR0 gr0 = new GR0(20, this);
        this.f3229B = gr0;
        C0218DS c0218ds = new C0218DS(this);
        this.f3232c = stateListDrawable;
        this.f3233d = drawable;
        this.f3236g = stateListDrawable2;
        this.f3237h = drawable2;
        this.f3234e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3235f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3238i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3239j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3230a = i2;
        this.f3231b = i3;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        valueAnimatorOfFloat.addListener(new C0281ES(this));
        valueAnimatorOfFloat.addUpdateListener(new C0863Ni(true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f3248s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC11919zO0 abstractC11919zO0 = recyclerView2.f16512n;
            if (abstractC11919zO0 != null) {
                abstractC11919zO0.mo10208c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f16514p;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m10250R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3248s;
            recyclerView3.f16515q.remove(this);
            if (recyclerView3.f16517r == this) {
                recyclerView3.f16517r = null;
            }
            ArrayList arrayList2 = this.f3248s.f16524u1;
            if (arrayList2 != null) {
                arrayList2.remove(c0218ds);
            }
            this.f3248s.removeCallbacks(gr0);
        }
        this.f3248s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m10268i(this);
            this.f3248s.f16515q.add(this);
            this.f3248s.m10270j(c0218ds);
        }
    }

    /* renamed from: e */
    public static int m2655e(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // p000.AbstractC11665xO0
    /* renamed from: b */
    public final void mo2656b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f3246q;
        RecyclerView recyclerView2 = this.f3248s;
        if (i != recyclerView2.getWidth() || this.f3247r != recyclerView2.getHeight()) {
            this.f3246q = recyclerView2.getWidth();
            this.f3247r = recyclerView2.getHeight();
            m2659f(0);
            return;
        }
        if (this.f3228A != 0) {
            if (this.f3249t) {
                int i2 = this.f3246q;
                int i3 = this.f3234e;
                int i4 = i2 - i3;
                int i5 = this.f3241l;
                int i6 = this.f3240k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f3232c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f3247r;
                int i9 = this.f3235f;
                Drawable drawable = this.f3233d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f3250u) {
                int i10 = this.f3247r;
                int i11 = this.f3238i;
                int i12 = i10 - i11;
                int i13 = this.f3244o;
                int i14 = this.f3243n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f3236g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f3246q;
                int i17 = this.f3239j;
                Drawable drawable2 = this.f3237h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* renamed from: c */
    public final boolean m2657c(float f, float f2) {
        if (f2 >= this.f3247r - this.f3238i) {
            int i = this.f3244o;
            int i2 = this.f3243n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m2658d(float f, float f2) {
        RecyclerView recyclerView = this.f3248s;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = this.f3234e;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f3246q - i) {
            return false;
        }
        int i2 = this.f3241l;
        int i3 = this.f3240k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* renamed from: f */
    public final void m2659f(int i) {
        GR0 gr0 = this.f3229B;
        StateListDrawable stateListDrawable = this.f3232c;
        if (i == 2 && this.f3251v != 2) {
            stateListDrawable.setState(f3226C);
            this.f3248s.removeCallbacks(gr0);
        }
        if (i == 0) {
            this.f3248s.invalidate();
        } else {
            m2660g();
        }
        if (this.f3251v == 2 && i != 2) {
            stateListDrawable.setState(f3227D);
            this.f3248s.removeCallbacks(gr0);
            this.f3248s.postDelayed(gr0, 1200);
        } else if (i == 1) {
            this.f3248s.removeCallbacks(gr0);
            this.f3248s.postDelayed(gr0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f3251v = i;
    }

    /* renamed from: g */
    public final void m2660g() {
        int i = this.f3228A;
        ValueAnimator valueAnimator = this.f3255z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3228A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
