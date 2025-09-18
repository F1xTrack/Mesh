package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import ru.mes.dnevnik.R;

/* renamed from: gb1 */
/* loaded from: classes.dex */
public final class C9518gb1 implements InterfaceC3977eE {

    /* renamed from: a */
    public final Toolbar f27862a;

    /* renamed from: b */
    public int f27863b;

    /* renamed from: c */
    public final View f27864c;

    /* renamed from: d */
    public Drawable f27865d;

    /* renamed from: e */
    public Drawable f27866e;

    /* renamed from: f */
    public Drawable f27867f;

    /* renamed from: g */
    public boolean f27868g;

    /* renamed from: h */
    public CharSequence f27869h;

    /* renamed from: i */
    public final CharSequence f27870i;

    /* renamed from: j */
    public final CharSequence f27871j;

    /* renamed from: k */
    public Window.Callback f27872k;

    /* renamed from: l */
    public boolean f27873l;

    /* renamed from: m */
    public C6527o2 f27874m;

    /* renamed from: n */
    public final int f27875n;

    /* renamed from: o */
    public final Drawable f27876o;

    public C9518gb1(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f27875n = 0;
        this.f27862a = toolbar;
        this.f27869h = toolbar.getTitle();
        this.f27870i = toolbar.getSubtitle();
        this.f27868g = this.f27869h != null;
        this.f27867f = toolbar.getNavigationIcon();
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(toolbar.getContext(), null, AbstractC8704aH0.f15423a, R.attr.actionBarStyle);
        int i = 15;
        this.f27876o = c8539Xo1M9117J.m9121C(15);
        if (z) {
            TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f27868g = true;
                this.f27869h = text;
                if ((this.f27863b & 8) != 0) {
                    Toolbar toolbar2 = this.f27862a;
                    toolbar2.setTitle(text);
                    if (this.f27868g) {
                        AbstractC10944rk1.m24483o(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f27870i = text2;
                if ((this.f27863b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableM9121C = c8539Xo1M9117J.m9121C(20);
            if (drawableM9121C != null) {
                this.f27866e = drawableM9121C;
                m18587c();
            }
            Drawable drawableM9121C2 = c8539Xo1M9117J.m9121C(17);
            if (drawableM9121C2 != null) {
                this.f27865d = drawableM9121C2;
                m18587c();
            }
            if (this.f27867f == null && (drawable = this.f27876o) != null) {
                this.f27867f = drawable;
                int i2 = this.f27863b & 4;
                Toolbar toolbar3 = this.f27862a;
                if (i2 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            m18585a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f27864c;
                if (view != null && (this.f27863b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f27864c = viewInflate;
                if (viewInflate != null && (this.f27863b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                m18585a(this.f27863b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.m9856d();
                toolbar.f15908t.m7018a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f15900l = resourceId2;
                C6803s7 c6803s7 = toolbar.f15890b;
                if (c6803s7 != null) {
                    c6803s7.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f15901m = resourceId3;
                C6803s7 c6803s72 = toolbar.f15891c;
                if (c6803s72 != null) {
                    c6803s72.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f27876o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f27863b = i;
        }
        c8539Xo1M9117J.m9130M();
        if (R.string.abc_action_bar_up_description != this.f27875n) {
            this.f27875n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i3 = this.f27875n;
                this.f27871j = i3 != 0 ? toolbar.getContext().getString(i3) : null;
                m18586b();
            }
        }
        this.f27871j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC8536Xn0(this));
    }

    /* renamed from: a */
    public final void m18585a(int i) {
        View view;
        int i2 = this.f27863b ^ i;
        this.f27863b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m18586b();
                }
                int i3 = this.f27863b & 4;
                Toolbar toolbar = this.f27862a;
                if (i3 != 0) {
                    Drawable drawable = this.f27867f;
                    if (drawable == null) {
                        drawable = this.f27876o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m18587c();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.f27862a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f27869h);
                    toolbar2.setSubtitle(this.f27870i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f27864c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m18586b() {
        if ((this.f27863b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f27871j);
            Toolbar toolbar = this.f27862a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f27875n);
            } else {
                toolbar.setNavigationContentDescription(this.f27871j);
            }
        }
    }

    /* renamed from: c */
    public final void m18587c() {
        Drawable drawable;
        int i = this.f27863b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f27866e) == null) {
            drawable = this.f27865d;
        }
        this.f27862a.setLogo(drawable);
    }
}
