package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: oz */
/* loaded from: classes.dex */
public final class C6588oz extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC6397lz f39405a;

    /* renamed from: b */
    public boolean f39406b;

    /* renamed from: c */
    public final int f39407c;

    /* renamed from: d */
    public final int f39408d;

    /* renamed from: e */
    public final int f39409e;

    /* renamed from: f */
    public final int f39410f;

    /* renamed from: g */
    public final int f39411g;

    /* renamed from: h */
    public int f39412h;

    /* renamed from: i */
    public int f39413i;

    /* renamed from: j */
    public int f39414j;

    /* renamed from: k */
    public View f39415k;

    /* renamed from: l */
    public View f39416l;

    /* renamed from: m */
    public boolean f39417m;

    /* renamed from: n */
    public boolean f39418n;

    /* renamed from: o */
    public boolean f39419o;

    /* renamed from: p */
    public final Rect f39420p;

    public C6588oz(int i, int i2) {
        super(i, i2);
        this.f39406b = false;
        this.f39407c = 0;
        this.f39408d = 0;
        this.f39409e = -1;
        this.f39410f = -1;
        this.f39411g = 0;
        this.f39412h = 0;
        this.f39420p = new Rect();
    }

    /* renamed from: a */
    public final boolean m23582a(int i) {
        if (i == 0) {
            return this.f39417m;
        }
        if (i != 1) {
            return false;
        }
        return this.f39418n;
    }

    /* renamed from: b */
    public final void m23583b(AbstractC6397lz abstractC6397lz) {
        AbstractC6397lz abstractC6397lz2 = this.f39405a;
        if (abstractC6397lz2 != abstractC6397lz) {
            if (abstractC6397lz2 != null) {
                abstractC6397lz2.mo11206f();
            }
            this.f39405a = abstractC6397lz;
            this.f39406b = true;
            if (abstractC6397lz != null) {
                abstractC6397lz.mo11205c(this);
            }
        }
    }

    public C6588oz(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        AbstractC6397lz abstractC6397lz;
        super(context, attributeSet);
        this.f39406b = false;
        this.f39407c = 0;
        this.f39408d = 0;
        this.f39409e = -1;
        this.f39410f = -1;
        this.f39411g = 0;
        this.f39412h = 0;
        this.f39420p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, UG0.f11710b);
        this.f39407c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f39410f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f39408d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f39409e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f39411g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f39412h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f39406b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f16066s;
            if (TextUtils.isEmpty(string)) {
                abstractC6397lz = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f16066s;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f16068u;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f16067t);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC6397lz = (AbstractC6397lz) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC7222ym.m26245v("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f39405a = abstractC6397lz;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC6397lz abstractC6397lz2 = this.f39405a;
        if (abstractC6397lz2 != null) {
            abstractC6397lz2.mo11205c(this);
        }
    }

    public C6588oz(C6588oz c6588oz) {
        super((ViewGroup.MarginLayoutParams) c6588oz);
        this.f39406b = false;
        this.f39407c = 0;
        this.f39408d = 0;
        this.f39409e = -1;
        this.f39410f = -1;
        this.f39411g = 0;
        this.f39412h = 0;
        this.f39420p = new Rect();
    }

    public C6588oz(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f39406b = false;
        this.f39407c = 0;
        this.f39408d = 0;
        this.f39409e = -1;
        this.f39410f = -1;
        this.f39411g = 0;
        this.f39412h = 0;
        this.f39420p = new Rect();
    }

    public C6588oz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f39406b = false;
        this.f39407c = 0;
        this.f39408d = 0;
        this.f39409e = -1;
        this.f39410f = -1;
        this.f39411g = 0;
        this.f39412h = 0;
        this.f39420p = new Rect();
    }
}
