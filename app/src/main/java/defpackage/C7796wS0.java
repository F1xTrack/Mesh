package defpackage;

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
public final class C7796wS0 {
    public static C7796wS0 i;
    public WeakHashMap a;
    public L01 b;
    public C2443c31 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public C1241Pr0 g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final C7415uS0 j = new C7415uS0(6);

    public static synchronized C7796wS0 d() {
        try {
            if (i == null) {
                C7796wS0 c7796wS0 = new C7796wS0();
                i = c7796wS0;
                j(c7796wS0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C7415uS0 c7415uS0 = j;
        c7415uS0.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c7415uS0.e(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(C7796wS0 c7796wS0) {
        if (Build.VERSION.SDK_INT < 24) {
            c7796wS0.a("vector", new C7606vS0(3));
            c7796wS0.a("animated-vector", new C7606vS0(2));
            c7796wS0.a("animated-selector", new C7606vS0(1));
            c7796wS0.a("drawable", new C7606vS0(0));
        }
    }

    public final void a(String str, C7606vS0 c7606vS0) {
        if (this.b == null) {
            this.b = new L01();
        }
        this.b.put(str, c7606vS0);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0366El0 c0366El0 = (C0366El0) this.d.get(context);
                if (c0366El0 == null) {
                    c0366El0 = new C0366El0();
                    this.d.put(context, c0366El0);
                }
                c0366El0.k(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) throws Resources.NotFoundException {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableT = null;
        if (this.g != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawableT = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawableT = C1241Pr0.t(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableT = C1241Pr0.t(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableT = C1241Pr0.t(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableT != null) {
            layerDrawableT.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawableT);
        }
        return layerDrawableT;
    }

    public final synchronized Drawable e(Context context, long j2) {
        C0366El0 c0366El0 = (C0366El0) this.d.get(context);
        if (c0366El0 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0366El0.j(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = AbstractC0300Dp0.b(c0366El0.b, c0366El0.d, j2);
            if (iB >= 0) {
                Object[] objArr = c0366El0.c;
                Object obj = objArr[iB];
                Object obj2 = C0366El0.e;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    c0366El0.a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public final synchronized Drawable g(Context context, int i2, boolean z) {
        Drawable drawableK;
        try {
            if (!this.f) {
                this.f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof C7464ui1) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i2);
            if (drawableK == null) {
                drawableK = c(context, i2);
            }
            if (drawableK == null) {
                drawableK = AbstractC0794Jy.b(context, i2);
            }
            if (drawableK != null) {
                drawableK = n(context, i2, z, drawableK);
            }
            if (drawableK != null) {
                AbstractC6820rL.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        C2443c31 c2443c31;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListU = null;
        colorStateList = (weakHashMap == null || (c2443c31 = (C2443c31) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2443c31.f(i2, null);
        if (colorStateList == null) {
            C1241Pr0 c1241Pr0 = this.g;
            if (c1241Pr0 != null) {
                colorStateListU = c1241Pr0.u(context, i2);
            }
            if (colorStateListU != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                C2443c31 c2443c312 = (C2443c31) this.a.get(context);
                if (c2443c312 == null) {
                    c2443c312 = new C2443c31();
                    this.a.put(context, c2443c312);
                }
                c2443c312.a(i2, colorStateListU);
            }
            colorStateList = colorStateListU;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        L01 l01 = this.b;
        if (l01 == null || l01.isEmpty()) {
            return null;
        }
        C2443c31 c2443c31 = this.c;
        if (c2443c31 != null) {
            String str = (String) c2443c31.f(i2, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.c = new C2443c31();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
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
                this.c.a(i2, name);
                C7606vS0 c7606vS0 = (C7606vS0) this.b.getOrDefault(name, null);
                if (c7606vS0 != null) {
                    drawableE = c7606vS0.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, drawableE);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableE == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        C0366El0 c0366El0 = (C0366El0) this.d.get(context);
        if (c0366El0 != null) {
            c0366El0.e();
        }
    }

    public final synchronized void m(C1241Pr0 c1241Pr0) {
        this.g = c1241Pr0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7796wS0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
