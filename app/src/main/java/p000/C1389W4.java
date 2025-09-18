package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;

/* renamed from: W4 */
/* loaded from: classes.dex */
public final class C1389W4 extends Drawable.ConstantState {

    /* renamed from: A */
    public boolean f12955A;

    /* renamed from: B */
    public ColorFilter f12956B;

    /* renamed from: C */
    public boolean f12957C;

    /* renamed from: D */
    public ColorStateList f12958D;

    /* renamed from: E */
    public PorterDuff.Mode f12959E;

    /* renamed from: F */
    public boolean f12960F;

    /* renamed from: G */
    public boolean f12961G;

    /* renamed from: H */
    public int[][] f12962H;

    /* renamed from: I */
    public C7544El0 f12963I;

    /* renamed from: J */
    public C8932c31 f12964J;

    /* renamed from: a */
    public final C1578Z4 f12965a;

    /* renamed from: b */
    public Resources f12966b;

    /* renamed from: c */
    public int f12967c;

    /* renamed from: d */
    public int f12968d;

    /* renamed from: e */
    public int f12969e;

    /* renamed from: f */
    public SparseArray f12970f;

    /* renamed from: g */
    public Drawable[] f12971g;

    /* renamed from: h */
    public int f12972h;

    /* renamed from: i */
    public boolean f12973i;

    /* renamed from: j */
    public boolean f12974j;

    /* renamed from: k */
    public Rect f12975k;

    /* renamed from: l */
    public boolean f12976l;

    /* renamed from: m */
    public boolean f12977m;

    /* renamed from: n */
    public int f12978n;

    /* renamed from: o */
    public int f12979o;

    /* renamed from: p */
    public int f12980p;

    /* renamed from: q */
    public int f12981q;

    /* renamed from: r */
    public boolean f12982r;

    /* renamed from: s */
    public int f12983s;

    /* renamed from: t */
    public boolean f12984t;

    /* renamed from: u */
    public boolean f12985u;

    /* renamed from: v */
    public boolean f12986v;

    /* renamed from: w */
    public boolean f12987w;

    /* renamed from: x */
    public int f12988x;

    /* renamed from: y */
    public int f12989y;

    /* renamed from: z */
    public int f12990z;

    public C1389W4(C1389W4 c1389w4, C1578Z4 c1578z4, Resources resources) {
        this.f12973i = false;
        this.f12976l = false;
        this.f12987w = true;
        this.f12989y = 0;
        this.f12990z = 0;
        this.f12965a = c1578z4;
        this.f12966b = resources != null ? resources : c1389w4 != null ? c1389w4.f12966b : null;
        int i = c1389w4 != null ? c1389w4.f12967c : 0;
        int i2 = C1578Z4.f14685t;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.f12967c = i;
        if (c1389w4 != null) {
            this.f12968d = c1389w4.f12968d;
            this.f12969e = c1389w4.f12969e;
            this.f12985u = true;
            this.f12986v = true;
            this.f12973i = c1389w4.f12973i;
            this.f12976l = c1389w4.f12976l;
            this.f12987w = c1389w4.f12987w;
            this.f12988x = c1389w4.f12988x;
            this.f12989y = c1389w4.f12989y;
            this.f12990z = c1389w4.f12990z;
            this.f12955A = c1389w4.f12955A;
            this.f12956B = c1389w4.f12956B;
            this.f12957C = c1389w4.f12957C;
            this.f12958D = c1389w4.f12958D;
            this.f12959E = c1389w4.f12959E;
            this.f12960F = c1389w4.f12960F;
            this.f12961G = c1389w4.f12961G;
            if (c1389w4.f12967c == i) {
                if (c1389w4.f12974j) {
                    this.f12975k = c1389w4.f12975k != null ? new Rect(c1389w4.f12975k) : null;
                    this.f12974j = true;
                }
                if (c1389w4.f12977m) {
                    this.f12978n = c1389w4.f12978n;
                    this.f12979o = c1389w4.f12979o;
                    this.f12980p = c1389w4.f12980p;
                    this.f12981q = c1389w4.f12981q;
                    this.f12977m = true;
                }
            }
            if (c1389w4.f12982r) {
                this.f12983s = c1389w4.f12983s;
                this.f12982r = true;
            }
            if (c1389w4.f12984t) {
                this.f12984t = true;
            }
            Drawable[] drawableArr = c1389w4.f12971g;
            this.f12971g = new Drawable[drawableArr.length];
            this.f12972h = c1389w4.f12972h;
            SparseArray sparseArray = c1389w4.f12970f;
            if (sparseArray != null) {
                this.f12970f = sparseArray.clone();
            } else {
                this.f12970f = new SparseArray(this.f12972h);
            }
            int i3 = this.f12972h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f12970f.put(i4, constantState);
                    } else {
                        this.f12971g[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.f12971g = new Drawable[10];
            this.f12972h = 0;
        }
        if (c1389w4 != null) {
            this.f12962H = c1389w4.f12962H;
        } else {
            this.f12962H = new int[this.f12971g.length][];
        }
        if (c1389w4 != null) {
            this.f12963I = c1389w4.f12963I;
            this.f12964J = c1389w4.f12964J;
        } else {
            this.f12963I = new C7544El0();
            this.f12964J = new C8932c31();
        }
    }

    /* renamed from: a */
    public final int m8660a(Drawable drawable) {
        int i = this.f12972h;
        if (i >= this.f12971g.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f12971g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f12971g = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f12962H, 0, iArr, 0, i);
            this.f12962H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f12965a);
        this.f12971g[i] = drawable;
        this.f12972h++;
        this.f12969e = drawable.getChangingConfigurations() | this.f12969e;
        this.f12982r = false;
        this.f12984t = false;
        this.f12975k = null;
        this.f12974j = false;
        this.f12977m = false;
        this.f12985u = false;
        return i;
    }

    /* renamed from: b */
    public final void m8661b() {
        this.f12977m = true;
        m8662c();
        int i = this.f12972h;
        Drawable[] drawableArr = this.f12971g;
        this.f12979o = -1;
        this.f12978n = -1;
        this.f12981q = 0;
        this.f12980p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f12978n) {
                this.f12978n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f12979o) {
                this.f12979o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f12980p) {
                this.f12980p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f12981q) {
                this.f12981q = minimumHeight;
            }
        }
    }

    /* renamed from: c */
    public final void m8662c() {
        SparseArray sparseArray = this.f12970f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f12970f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12970f.valueAt(i);
                Drawable[] drawableArr = this.f12971g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f12966b);
                AbstractC4236iL.m19004b(drawableNewDrawable, this.f12988x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f12965a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f12970f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f12972h;
        Drawable[] drawableArr = this.f12971g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12970f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (AbstractC4173hL.m18800b(drawable)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m8663d(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f12971g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f12970f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f12970f.valueAt(iIndexOfKey)).newDrawable(this.f12966b);
        AbstractC4236iL.m19004b(drawableNewDrawable, this.f12988x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f12965a);
        this.f12971g[i] = drawableMutate;
        this.f12970f.removeAt(iIndexOfKey);
        if (this.f12970f.size() == 0) {
            this.f12970f = null;
        }
        return drawableMutate;
    }

    /* renamed from: e */
    public final int m8664e(int[] iArr) {
        int[][] iArr2 = this.f12962H;
        int i = this.f12972h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f12968d | this.f12969e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1578Z4(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1578Z4(this, resources);
    }
}
