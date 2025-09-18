package p000;

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
public class C7696Hj0 implements InterfaceC11742y01 {

    /* renamed from: A */
    public static final Method f4452A;

    /* renamed from: B */
    public static final Method f4453B;

    /* renamed from: C */
    public static final Method f4454C;

    /* renamed from: a */
    public final Context f4455a;

    /* renamed from: b */
    public ListAdapter f4456b;

    /* renamed from: c */
    public C1659aM f4457c;

    /* renamed from: f */
    public int f4460f;

    /* renamed from: g */
    public int f4461g;

    /* renamed from: i */
    public boolean f4463i;

    /* renamed from: j */
    public boolean f4464j;

    /* renamed from: k */
    public boolean f4465k;

    /* renamed from: n */
    public C0012AB f4468n;

    /* renamed from: o */
    public View f4469o;

    /* renamed from: p */
    public AdapterView.OnItemClickListener f4470p;

    /* renamed from: q */
    public AdapterView.OnItemSelectedListener f4471q;

    /* renamed from: v */
    public final Handler f4476v;

    /* renamed from: x */
    public Rect f4478x;

    /* renamed from: y */
    public boolean f4479y;

    /* renamed from: z */
    public final C1014Q6 f4480z;

    /* renamed from: d */
    public final int f4458d = -2;

    /* renamed from: e */
    public int f4459e = -2;

    /* renamed from: h */
    public final int f4462h = 1002;

    /* renamed from: l */
    public int f4466l = 0;

    /* renamed from: m */
    public final int f4467m = Integer.MAX_VALUE;

    /* renamed from: r */
    public final RunnableC7540Ej0 f4472r = new RunnableC7540Ej0(this, 1);

    /* renamed from: s */
    public final ViewOnTouchListenerC7644Gj0 f4473s = new ViewOnTouchListenerC7644Gj0(0, this);

    /* renamed from: t */
    public final C7592Fj0 f4474t = new C7592Fj0(this);

    /* renamed from: u */
    public final RunnableC7540Ej0 f4475u = new RunnableC7540Ej0(this, 0);

    /* renamed from: w */
    public final Rect f4477w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4452A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f4454C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f4453B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C7696Hj0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f4455a = context;
        this.f4476v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15437o, i, 0);
        this.f4460f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4461g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4463i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1014Q6 c1014q6 = new C1014Q6(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15441s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC10235mC0.m22701c(c1014q6, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1014q6.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC11918zN1.m26394b(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f4480z = c1014q6;
        c1014q6.setInputMethodMode(1);
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: a */
    public final boolean mo334a() {
        return this.f4480z.isShowing();
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: b */
    public final void mo335b() {
        int i;
        int iM1301a;
        int paddingBottom;
        C1659aM c1659aM;
        C1659aM c1659aM2 = this.f4457c;
        C1014Q6 c1014q6 = this.f4480z;
        Context context = this.f4455a;
        if (c1659aM2 == null) {
            C1659aM c1659aMMo3568p = mo3568p(context, !this.f4479y);
            this.f4457c = c1659aMMo3568p;
            c1659aMMo3568p.setAdapter(this.f4456b);
            this.f4457c.setOnItemClickListener(this.f4470p);
            this.f4457c.setFocusable(true);
            this.f4457c.setFocusableInTouchMode(true);
            this.f4457c.setOnItemSelectedListener(new C7384Bj0(0, this));
            this.f4457c.setOnScrollListener(this.f4474t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f4471q;
            if (onItemSelectedListener != null) {
                this.f4457c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1014q6.setContentView(this.f4457c);
        }
        Drawable background = c1014q6.getBackground();
        Rect rect = this.f4477w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f4463i) {
                this.f4461g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = c1014q6.getInputMethodMode() == 2;
        View view = this.f4469o;
        int i3 = this.f4461g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f4453B;
            if (method != null) {
                try {
                    iM1301a = ((Integer) method.invoke(c1014q6, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            } else {
                iM1301a = c1014q6.getMaxAvailableHeight(view, i3);
            }
        } else {
            iM1301a = AbstractC7436Cj0.m1301a(c1014q6, view, i3, z);
        }
        int i4 = this.f4458d;
        if (i4 == -1) {
            paddingBottom = iM1301a + i;
        } else {
            int i5 = this.f4459e;
            int iM9714a = this.f4457c.m9714a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM1301a);
            paddingBottom = iM9714a + (iM9714a > 0 ? this.f4457c.getPaddingBottom() + this.f4457c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f4480z.getInputMethodMode() == 2;
        AbstractC10235mC0.m22702d(c1014q6, this.f4462h);
        if (c1014q6.isShowing()) {
            if (this.f4469o.isAttachedToWindow()) {
                int width = this.f4459e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f4469o.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c1014q6.setWidth(this.f4459e == -1 ? -1 : 0);
                        c1014q6.setHeight(0);
                    } else {
                        c1014q6.setWidth(this.f4459e == -1 ? -1 : 0);
                        c1014q6.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                c1014q6.setOutsideTouchable(true);
                c1014q6.update(this.f4469o, this.f4460f, this.f4461g, width < 0 ? -1 : width, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.f4459e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f4469o.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        c1014q6.setWidth(width2);
        c1014q6.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f4452A;
            if (method2 != null) {
                try {
                    method2.invoke(c1014q6, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            AbstractC7488Dj0.m1859b(c1014q6, true);
        }
        c1014q6.setOutsideTouchable(true);
        c1014q6.setTouchInterceptor(this.f4473s);
        if (this.f4465k) {
            AbstractC10235mC0.m22701c(c1014q6, this.f4464j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f4454C;
            if (method3 != null) {
                try {
                    method3.invoke(c1014q6, this.f4478x);
                } catch (Exception unused3) {
                }
            }
        } else {
            AbstractC7488Dj0.m1858a(c1014q6, this.f4478x);
        }
        c1014q6.showAsDropDown(this.f4469o, this.f4460f, this.f4461g, this.f4466l);
        this.f4457c.setSelection(-1);
        if ((!this.f4479y || this.f4457c.isInTouchMode()) && (c1659aM = this.f4457c) != null) {
            c1659aM.setListSelectionHidden(true);
            c1659aM.requestLayout();
        }
        if (this.f4479y) {
            return;
        }
        this.f4476v.post(this.f4475u);
    }

    /* renamed from: c */
    public final int m3561c() {
        return this.f4460f;
    }

    /* renamed from: d */
    public final void m3562d(int i) {
        this.f4460f = i;
    }

    @Override // p000.InterfaceC11742y01
    public final void dismiss() {
        C1014Q6 c1014q6 = this.f4480z;
        c1014q6.dismiss();
        c1014q6.setContentView(null);
        this.f4457c = null;
        this.f4476v.removeCallbacks(this.f4472r);
    }

    /* renamed from: f */
    public final Drawable m3563f() {
        return this.f4480z.getBackground();
    }

    /* renamed from: h */
    public final void m3564h(Drawable drawable) {
        this.f4480z.setBackgroundDrawable(drawable);
    }

    /* renamed from: i */
    public final void m3565i(int i) {
        this.f4461g = i;
        this.f4463i = true;
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: j */
    public final C1659aM mo336j() {
        return this.f4457c;
    }

    /* renamed from: m */
    public final int m3566m() {
        if (this.f4463i) {
            return this.f4461g;
        }
        return 0;
    }

    /* renamed from: o */
    public void mo3567o(ListAdapter listAdapter) {
        C0012AB c0012ab = this.f4468n;
        if (c0012ab == null) {
            this.f4468n = new C0012AB(1, this);
        } else {
            ListAdapter listAdapter2 = this.f4456b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0012ab);
            }
        }
        this.f4456b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4468n);
        }
        C1659aM c1659aM = this.f4457c;
        if (c1659aM != null) {
            c1659aM.setAdapter(this.f4456b);
        }
    }

    /* renamed from: p */
    public C1659aM mo3568p(Context context, boolean z) {
        return new C1659aM(context, z);
    }

    /* renamed from: q */
    public final void m3569q(int i) {
        Drawable background = this.f4480z.getBackground();
        if (background == null) {
            this.f4459e = i;
            return;
        }
        Rect rect = this.f4477w;
        background.getPadding(rect);
        this.f4459e = rect.left + rect.right + i;
    }
}
