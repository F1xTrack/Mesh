package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: i3 */
/* loaded from: classes.dex */
public final class C4271i3 implements InterfaceC3629eh0 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public C4271i3(String str, String str2, String str3, String str4, String str5, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.a = i;
    }

    public static C4271i3 e(Context context, int i) throws Resources.NotFoundException {
        AbstractC3377dM1.d("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, NG0.p);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListE = AbstractC1437Se1.e(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListE2 = AbstractC1437Se1.e(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListE3 = AbstractC1437Se1.e(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        LZ0 lz0C = LZ0.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C7897x(0)).c();
        typedArrayObtainStyledAttributes.recycle();
        return new C4271i3(colorStateListE, colorStateListE2, colorStateListE3, dimensionPixelSize, lz0C, rect);
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C6553px) this.d) != null) {
                if (((C6553px) this.f) == null) {
                    this.f = new C6553px();
                }
                C6553px c6553px = (C6553px) this.f;
                c6553px.c = null;
                c6553px.b = false;
                c6553px.d = null;
                c6553px.a = false;
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                ColorStateList colorStateListG = AbstractC4021gk1.g(view);
                if (colorStateListG != null) {
                    c6553px.b = true;
                    c6553px.c = colorStateListG;
                }
                PorterDuff.Mode modeH = AbstractC4021gk1.h(view);
                if (modeH != null) {
                    c6553px.a = true;
                    c6553px.d = modeH;
                }
                if (c6553px.b || c6553px.a) {
                    J6.e(background, c6553px, view.getDrawableState());
                    return;
                }
            }
            C6553px c6553px2 = (C6553px) this.e;
            if (c6553px2 != null) {
                J6.e(background, c6553px2, view.getDrawableState());
                return;
            }
            C6553px c6553px3 = (C6553px) this.d;
            if (c6553px3 != null) {
                J6.e(background, c6553px3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4080h3 c4080h3 = (C4080h3) arrayList.get(i2);
            int i3 = c4080h3.a;
            if (i3 == 8) {
                if (h(c4080h3.c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c4080h3.b;
                int i5 = c4080h3.c + i4;
                while (i4 < i5) {
                    if (h(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0136Bm1) this.e).p((C4080h3) arrayList.get(i));
        }
        s(arrayList);
        this.a = 0;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4080h3 c4080h3 = (C4080h3) arrayList.get(i);
            int i2 = c4080h3.a;
            C0136Bm1 c0136Bm1 = (C0136Bm1) this.e;
            if (i2 == 1) {
                c0136Bm1.p(c4080h3);
                c0136Bm1.u(c4080h3.b, c4080h3.c);
            } else if (i2 == 2) {
                c0136Bm1.p(c4080h3);
                int i3 = c4080h3.b;
                int i4 = c4080h3.c;
                RecyclerView recyclerView = (RecyclerView) c0136Bm1.b;
                recyclerView.S(i3, i4, true);
                recyclerView.v1 = true;
                recyclerView.s1.c += i4;
            } else if (i2 == 4) {
                c0136Bm1.p(c4080h3);
                c0136Bm1.s(c4080h3.b, c4080h3.c);
            } else if (i2 == 8) {
                c0136Bm1.p(c4080h3);
                c0136Bm1.w(c4080h3.b, c4080h3.c);
            }
        }
        s(arrayList);
        this.a = 0;
    }

    public void f(C4080h3 c4080h3) {
        int i;
        int i2 = c4080h3.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iX = x(c4080h3.b, i2);
        int i3 = c4080h3.b;
        int i4 = c4080h3.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c4080h3);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c4080h3.c; i6++) {
            int iX2 = x((i * i6) + c4080h3.b, c4080h3.a);
            int i7 = c4080h3.a;
            if (i7 == 2 ? iX2 != iX : !(i7 == 4 && iX2 == iX + 1)) {
                C4080h3 c4080h3M = m(i7, iX, i5);
                g(c4080h3M, i3);
                ((Pools$SimplePool) this.b).d(c4080h3M);
                if (c4080h3.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iX = iX2;
            } else {
                i5++;
            }
        }
        ((Pools$SimplePool) this.b).d(c4080h3);
        if (i5 > 0) {
            C4080h3 c4080h3M2 = m(c4080h3.a, iX, i5);
            g(c4080h3M2, i3);
            ((Pools$SimplePool) this.b).d(c4080h3M2);
        }
    }

    public void g(C4080h3 c4080h3, int i) {
        C0136Bm1 c0136Bm1 = (C0136Bm1) this.e;
        c0136Bm1.p(c4080h3);
        int i2 = c4080h3.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0136Bm1.s(i, c4080h3.c);
        } else {
            int i3 = c4080h3.c;
            RecyclerView recyclerView = (RecyclerView) c0136Bm1.b;
            recyclerView.S(i, i3, true);
            recyclerView.v1 = true;
            recyclerView.s1.c += i3;
        }
    }

    public int h(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C4080h3 c4080h3 = (C4080h3) arrayList.get(i2);
            int i3 = c4080h3.a;
            if (i3 == 8) {
                int i4 = c4080h3.b;
                if (i4 == i) {
                    i = c4080h3.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c4080h3.c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c4080h3.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c4080h3.c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c4080h3.c;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList i() {
        C6553px c6553px = (C6553px) this.e;
        if (c6553px != null) {
            return (ColorStateList) c6553px.c;
        }
        return null;
    }

    public PorterDuff.Mode j() {
        C6553px c6553px = (C6553px) this.e;
        if (c6553px != null) {
            return (PorterDuff.Mode) c6553px.d;
        }
        return null;
    }

    public boolean k() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void l(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListI;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = AbstractC2104aH0.A;
        C1857Xo1 c1857Xo1J = C1857Xo1.J(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c1857Xo1J.c;
        View view2 = (View) this.b;
        AbstractC6897rk1.m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c1857Xo1J.c, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                J6 j6 = (J6) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (j6) {
                    colorStateListI = j6.a.i(context2, i2);
                }
                if (colorStateListI != null) {
                    t(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC4021gk1.q(view, c1857Xo1J.B(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC4021gk1.r(view, AbstractC6820rL.c(typedArray.getInt(2, -1), null));
            }
        } finally {
            c1857Xo1J.M();
        }
    }

    public C4080h3 m(int i, int i2, int i3) {
        C4080h3 c4080h3 = (C4080h3) ((Pools$SimplePool) this.b).i();
        if (c4080h3 != null) {
            c4080h3.a = i;
            c4080h3.b = i2;
            c4080h3.c = i3;
            return c4080h3;
        }
        C4080h3 c4080h32 = new C4080h3();
        c4080h32.a = i;
        c4080h32.b = i2;
        c4080h32.c = i3;
        return c4080h32;
    }

    public void n() {
        UiThreadUtil.assertOnUiThread();
        ViewGroupManager viewGroupManager = (ViewGroupManager) this.b;
        ViewGroup viewGroup = (ViewGroup) this.c;
        View view = (View) this.d;
        viewGroupManager.removeView(viewGroup, view);
        C8260yu0 c8260yu0 = (C8260yu0) this.f;
        c8260yu0.dropView(view);
        Integer numValueOf = Integer.valueOf(view.getId());
        Set set = (Set) this.e;
        set.remove(numValueOf);
        if (set.isEmpty()) {
            c8260yu0.mPendingDeletionsForTag.remove(Integer.valueOf(this.a));
        }
    }

    public void o() {
        this.a = -1;
        t(null);
        a();
    }

    public void p(int i) {
        ColorStateList colorStateListI;
        this.a = i;
        J6 j6 = (J6) this.c;
        if (j6 != null) {
            Context context = ((View) this.b).getContext();
            synchronized (j6) {
                colorStateListI = j6.a.i(context, i);
            }
        } else {
            colorStateListI = null;
        }
        t(colorStateListI);
        a();
    }

    public void q(C4080h3 c4080h3) {
        ((ArrayList) this.d).add(c4080h3);
        int i = c4080h3.a;
        C0136Bm1 c0136Bm1 = (C0136Bm1) this.e;
        if (i == 1) {
            c0136Bm1.u(c4080h3.b, c4080h3.c);
            return;
        }
        if (i == 2) {
            int i2 = c4080h3.b;
            int i3 = c4080h3.c;
            RecyclerView recyclerView = (RecyclerView) c0136Bm1.b;
            recyclerView.S(i2, i3, false);
            recyclerView.v1 = true;
            return;
        }
        if (i == 4) {
            c0136Bm1.s(c4080h3.b, c4080h3.c);
        } else if (i == 8) {
            c0136Bm1.w(c4080h3.b, c4080h3.c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c4080h3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:250:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r() {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4271i3.r():void");
    }

    public void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4080h3 c4080h3 = (C4080h3) arrayList.get(i);
            c4080h3.getClass();
            ((Pools$SimplePool) this.b).d(c4080h3);
        }
        arrayList.clear();
    }

    public void t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C6553px) this.d) == null) {
                this.d = new C6553px();
            }
            C6553px c6553px = (C6553px) this.d;
            c6553px.c = colorStateList;
            c6553px.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void u(ColorStateList colorStateList) {
        if (((C6553px) this.e) == null) {
            this.e = new C6553px();
        }
        C6553px c6553px = (C6553px) this.e;
        c6553px.c = colorStateList;
        c6553px.b = true;
        a();
    }

    public void v(PorterDuff.Mode mode) {
        if (((C6553px) this.e) == null) {
            this.e = new C6553px();
        }
        C6553px c6553px = (C6553px) this.e;
        c6553px.d = mode;
        c6553px.a = true;
        a();
    }

    public void w(TextView textView) {
        C6145no0 c6145no0 = new C6145no0();
        C6145no0 c6145no02 = new C6145no0();
        LZ0 lz0 = (LZ0) this.f;
        c6145no0.setShapeAppearanceModel(lz0);
        c6145no02.setShapeAppearanceModel(lz0);
        c6145no0.j((ColorStateList) this.d);
        c6145no0.a.j = this.a;
        c6145no0.invalidateSelf();
        C5954mo0 c5954mo0 = c6145no0.a;
        ColorStateList colorStateList = c5954mo0.d;
        ColorStateList colorStateList2 = (ColorStateList) this.e;
        if (colorStateList != colorStateList2) {
            c5954mo0.d = colorStateList2;
            c6145no0.onStateChange(c6145no0.getState());
        }
        ColorStateList colorStateList3 = (ColorStateList) this.c;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), c6145no0, c6145no02);
        Rect rect = (Rect) this.b;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        textView.setBackground(insetDrawable);
    }

    public int x(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C4080h3 c4080h3 = (C4080h3) arrayList.get(size);
            int i5 = c4080h3.a;
            if (i5 == 8) {
                int i6 = c4080h3.b;
                int i7 = c4080h3.c;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c4080h3.b = i6 + 1;
                            c4080h3.c = i7 + 1;
                        } else if (i2 == 2) {
                            c4080h3.b = i6 - 1;
                            c4080h3.c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c4080h3.c = i7 + 1;
                    } else if (i2 == 2) {
                        c4080h3.c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c4080h3.b = i6 + 1;
                    } else if (i2 == 2) {
                        c4080h3.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c4080h3.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c4080h3.c;
                    } else if (i5 == 2) {
                        i += c4080h3.c;
                    }
                } else if (i2 == 1) {
                    c4080h3.b = i8 + 1;
                } else if (i2 == 2) {
                    c4080h3.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C4080h3 c4080h32 = (C4080h3) arrayList.get(size2);
            if (c4080h32.a == 8) {
                int i9 = c4080h32.c;
                if (i9 == c4080h32.b || i9 < 0) {
                    arrayList.remove(size2);
                    ((Pools$SimplePool) this.b).d(c4080h32);
                }
            } else if (c4080h32.c <= 0) {
                arrayList.remove(size2);
                ((Pools$SimplePool) this.b).d(c4080h32);
            }
        }
        return i;
    }

    public C4271i3(View view) {
        this.a = -1;
        this.b = view;
        this.c = J6.a();
    }

    public C4271i3(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, LZ0 lz0, Rect rect) {
        AbstractC3377dM1.g(rect.left);
        AbstractC3377dM1.g(rect.top);
        AbstractC3377dM1.g(rect.right);
        AbstractC3377dM1.g(rect.bottom);
        this.b = rect;
        this.c = colorStateList2;
        this.d = colorStateList;
        this.e = colorStateList3;
        this.a = i;
        this.f = lz0;
    }

    public C4271i3(C0136Bm1 c0136Bm1) {
        this.b = new Pools$SimplePool(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = c0136Bm1;
        this.f = new C0481Fx1(this);
    }

    public C4271i3(int[] iArr, C1350Rb1[] c1350Rb1Arr, int[] iArr2, int[][][] iArr3, C1350Rb1 c1350Rb1) {
        this.b = iArr;
        this.c = c1350Rb1Arr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = c1350Rb1;
        this.a = iArr.length;
    }

    public C4271i3(C8260yu0 c8260yu0, ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i) {
        this.f = c8260yu0;
        this.b = viewGroupManager;
        this.c = viewGroup;
        this.d = view;
        this.e = set;
        this.a = i;
    }
}
