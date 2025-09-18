package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import ru.mes.dnevnik.R;

/* renamed from: wS0 */
/* loaded from: classes.dex */
public final class C11546wS0 {

    /* renamed from: i */
    public static C11546wS0 f44881i;

    /* renamed from: a */
    public WeakHashMap f44883a;

    /* renamed from: b */
    public L01 f44884b;

    /* renamed from: c */
    public C8932c31 f44885c;

    /* renamed from: d */
    public final WeakHashMap f44886d = new WeakHashMap(0);

    /* renamed from: e */
    public TypedValue f44887e;

    /* renamed from: f */
    public boolean f44888f;

    /* renamed from: g */
    public C8128Pr0 f44889g;

    /* renamed from: h */
    public static final PorterDuff.Mode f44880h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final C11291uS0 f44882j = new C11291uS0(6);

    /* renamed from: d */
    public static synchronized C11546wS0 m25618d() {
        try {
            if (f44881i == null) {
                C11546wS0 c11546wS0 = new C11546wS0();
                f44881i = c11546wS0;
                m25620j(c11546wS0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f44881i;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m25619h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C11291uS0 c11291uS0 = f44882j;
        c11291uS0.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c11291uS0.m4572e(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* renamed from: j */
    public static void m25620j(C11546wS0 c11546wS0) {
        if (Build.VERSION.SDK_INT < 24) {
            c11546wS0.m25621a("vector", new C11419vS0(3));
            c11546wS0.m25621a("animated-vector", new C11419vS0(2));
            c11546wS0.m25621a("animated-selector", new C11419vS0(1));
            c11546wS0.m25621a("drawable", new C11419vS0(0));
        }
    }

    /* renamed from: a */
    public final void m25621a(String str, C11419vS0 c11419vS0) {
        if (this.f44884b == null) {
            this.f44884b = new L01();
        }
        this.f44884b.put(str, c11419vS0);
    }

    /* renamed from: b */
    public final synchronized void m25622b(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C7544El0 c7544El0 = (C7544El0) this.f44886d.get(context);
                if (c7544El0 == null) {
                    c7544El0 = new C7544El0();
                    this.f44886d.put(context, c7544El0);
                }
                c7544El0.m2383k(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final Drawable m25623c(Context context, int i) throws Resources.NotFoundException {
        if (this.f44887e == null) {
            this.f44887e = new TypedValue();
        }
        TypedValue typedValue = this.f44887e;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableM25624e = m25624e(context, j);
        if (drawableM25624e != null) {
            return drawableM25624e;
        }
        LayerDrawable layerDrawableM6443t = null;
        if (this.f44889g != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM6443t = new LayerDrawable(new Drawable[]{m25625f(context, R.drawable.abc_cab_background_internal_bg), m25625f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM6443t = C8128Pr0.m6443t(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM6443t = C8128Pr0.m6443t(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM6443t = C8128Pr0.m6443t(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM6443t != null) {
            layerDrawableM6443t.setChangingConfigurations(typedValue.changingConfigurations);
            m25622b(context, j, layerDrawableM6443t);
        }
        return layerDrawableM6443t;
    }

    /* renamed from: e */
    public final synchronized Drawable m25624e(Context context, long j) {
        C7544El0 c7544El0 = (C7544El0) this.f44886d.get(context);
        if (c7544El0 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c7544El0.m2382j(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM1901b = AbstractC7500Dp0.m1901b(c7544El0.f2882b, c7544El0.f2884d, j);
            if (iM1901b >= 0) {
                Object[] objArr = c7544El0.f2883c;
                Object obj = objArr[iM1901b];
                Object obj2 = C7544El0.f2880e;
                if (obj != obj2) {
                    objArr[iM1901b] = obj2;
                    c7544El0.f2881a = true;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final synchronized Drawable m25625f(Context context, int i) {
        return m25626g(context, i, false);
    }

    /* renamed from: g */
    public final synchronized Drawable m25626g(Context context, int i, boolean z) {
        Drawable drawableM25628k;
        try {
            if (!this.f44888f) {
                this.f44888f = true;
                Drawable drawableM25625f = m25625f(context, R.drawable.abc_vector_test);
                if (drawableM25625f == null || (!(drawableM25625f instanceof C11324ui1) && !"android.graphics.drawable.VectorDrawable".equals(drawableM25625f.getClass().getName()))) {
                    this.f44888f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM25628k = m25628k(context, i);
            if (drawableM25628k == null) {
                drawableM25628k = m25623c(context, i);
            }
            if (drawableM25628k == null) {
                drawableM25628k = AbstractC0628Jy.m4480b(context, i);
            }
            if (drawableM25628k != null) {
                drawableM25628k = m25631n(context, i, z, drawableM25628k);
            }
            if (drawableM25628k != null) {
                AbstractC6737rL.m24315a(drawableM25628k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM25628k;
    }

    /* renamed from: i */
    public final synchronized ColorStateList m25627i(Context context, int i) {
        ColorStateList colorStateList;
        C8932c31 c8932c31;
        WeakHashMap weakHashMap = this.f44883a;
        ColorStateList colorStateListM6456u = null;
        colorStateList = (weakHashMap == null || (c8932c31 = (C8932c31) weakHashMap.get(context)) == null) ? null : (ColorStateList) c8932c31.m10582f(i, null);
        if (colorStateList == null) {
            C8128Pr0 c8128Pr0 = this.f44889g;
            if (c8128Pr0 != null) {
                colorStateListM6456u = c8128Pr0.m6456u(context, i);
            }
            if (colorStateListM6456u != null) {
                if (this.f44883a == null) {
                    this.f44883a = new WeakHashMap();
                }
                C8932c31 c8932c312 = (C8932c31) this.f44883a.get(context);
                if (c8932c312 == null) {
                    c8932c312 = new C8932c31();
                    this.f44883a.put(context, c8932c312);
                }
                c8932c312.m10580a(i, colorStateListM6456u);
            }
            colorStateList = colorStateListM6456u;
        }
        return colorStateList;
    }

    /* renamed from: k */
    public final Drawable m25628k(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        L01 l01 = this.f44884b;
        if (l01 == null || l01.isEmpty()) {
            return null;
        }
        C8932c31 c8932c31 = this.f44885c;
        if (c8932c31 != null) {
            String str = (String) c8932c31.m10582f(i, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f44884b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f44885c = new C8932c31();
        }
        if (this.f44887e == null) {
            this.f44887e = new TypedValue();
        }
        TypedValue typedValue = this.f44887e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableM25624e = m25624e(context, j);
        if (drawableM25624e != null) {
            return drawableM25624e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f44885c.m10580a(i, name);
                C11419vS0 c11419vS0 = (C11419vS0) this.f44884b.getOrDefault(name, null);
                if (c11419vS0 != null) {
                    drawableM25624e = c11419vS0.m25423a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM25624e != null) {
                    drawableM25624e.setChangingConfigurations(typedValue.changingConfigurations);
                    m25622b(context, j, drawableM25624e);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableM25624e == null) {
            this.f44885c.m10580a(i, "appcompat_skip_skip");
        }
        return drawableM25624e;
    }

    /* renamed from: l */
    public final synchronized void m25629l(Context context) {
        C7544El0 c7544El0 = (C7544El0) this.f44886d.get(context);
        if (c7544El0 != null) {
            c7544El0.m2379e();
        }
    }

    /* renamed from: m */
    public final synchronized void m25630m(C8128Pr0 c8128Pr0) {
        this.f44889g = c8128Pr0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00ee  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m25631n(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11546wS0.m25631n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
