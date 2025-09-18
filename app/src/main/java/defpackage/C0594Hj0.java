package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: Hj0 */
/* loaded from: classes.dex */
public class C0594Hj0 implements InterfaceC8090y01 {
    public static final Method A;
    public static final Method B;
    public static final Method C;
    public final Context a;
    public ListAdapter b;
    public C2118aM c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public AB n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final Q6 z;
    public final int d = -2;
    public int e = -2;
    public final int h = 1002;
    public int l = 0;
    public final int m = Integer.MAX_VALUE;
    public final RunnableC0360Ej0 r = new RunnableC0360Ej0(this, 1);
    public final ViewOnTouchListenerC0516Gj0 s = new ViewOnTouchListenerC0516Gj0(0, this);
    public final C0438Fj0 t = new C0438Fj0(this);
    public final RunnableC0360Ej0 u = new RunnableC0360Ej0(this, 0);
    public final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C0594Hj0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2104aH0.o, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        Q6 q6 = new Q6(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2104aH0.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC5840mC0.c(q6, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        q6.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC8352zN1.b(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.z = q6;
        q6.setInputMethodMode(1);
    }

    @Override // defpackage.InterfaceC8090y01
    public final boolean a() {
        return this.z.isShowing();
    }

    @Override // defpackage.InterfaceC8090y01
    public final void b() {
        int i;
        int iA;
        int paddingBottom;
        C2118aM c2118aM;
        C2118aM c2118aM2 = this.c;
        Q6 q6 = this.z;
        Context context = this.a;
        if (c2118aM2 == null) {
            C2118aM c2118aMP = p(context, !this.y);
            this.c = c2118aMP;
            c2118aMP.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new C0126Bj0(0, this));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            q6.setContentView(this.c);
        }
        Drawable background = q6.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = q6.getInputMethodMode() == 2;
        View view = this.o;
        int i3 = this.g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = B;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(q6, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            } else {
                iA = q6.getMaxAvailableHeight(view, i3);
            }
        } else {
            iA = AbstractC0204Cj0.a(q6, view, i3, z);
        }
        int i4 = this.d;
        if (i4 == -1) {
            paddingBottom = iA + i;
        } else {
            int i5 = this.e;
            int iA2 = this.c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.z.getInputMethodMode() == 2;
        AbstractC5840mC0.d(q6, this.h);
        if (q6.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.o.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        q6.setWidth(this.e == -1 ? -1 : 0);
                        q6.setHeight(0);
                    } else {
                        q6.setWidth(this.e == -1 ? -1 : 0);
                        q6.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                q6.setOutsideTouchable(true);
                q6.update(this.o, this.f, this.g, width < 0 ? -1 : width, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.o.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        q6.setWidth(width2);
        q6.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(q6, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            AbstractC0282Dj0.b(q6, true);
        }
        q6.setOutsideTouchable(true);
        q6.setTouchInterceptor(this.s);
        if (this.k) {
            AbstractC5840mC0.c(q6, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = C;
            if (method3 != null) {
                try {
                    method3.invoke(q6, this.x);
                } catch (Exception unused3) {
                }
            }
        } else {
            AbstractC0282Dj0.a(q6, this.x);
        }
        q6.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (c2118aM = this.c) != null) {
            c2118aM.setListSelectionHidden(true);
            c2118aM.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    public final int c() {
        return this.f;
    }

    public final void d(int i) {
        this.f = i;
    }

    @Override // defpackage.InterfaceC8090y01
    public final void dismiss() {
        Q6 q6 = this.z;
        q6.dismiss();
        q6.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final Drawable f() {
        return this.z.getBackground();
    }

    public final void h(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public final void i(int i) {
        this.g = i;
        this.i = true;
    }

    @Override // defpackage.InterfaceC8090y01
    public final C2118aM j() {
        return this.c;
    }

    public final int m() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        AB ab = this.n;
        if (ab == null) {
            this.n = new AB(1, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(ab);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        C2118aM c2118aM = this.c;
        if (c2118aM != null) {
            c2118aM.setAdapter(this.b);
        }
    }

    public C2118aM p(Context context, boolean z) {
        return new C2118aM(context, z);
    }

    public final void q(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
