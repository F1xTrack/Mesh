package p000;

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
public final class C4218i3 implements InterfaceC9273eh0 {

    /* renamed from: a */
    public int f28781a;

    /* renamed from: b */
    public final Object f28782b;

    /* renamed from: c */
    public final Object f28783c;

    /* renamed from: d */
    public Object f28784d;

    /* renamed from: e */
    public Object f28785e;

    /* renamed from: f */
    public Object f28786f;

    public C4218i3(String str, String str2, String str3, String str4, String str5, int i) {
        this.f28782b = str;
        this.f28783c = str2;
        this.f28784d = str3;
        this.f28785e = str4;
        this.f28786f = str5;
        this.f28781a = i;
    }

    /* renamed from: e */
    public static C4218i3 m18936e(Context context, int i) throws Resources.NotFoundException {
        AbstractC9104dM1.m17545d("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, NG0.f7702p);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM7406e = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM7406e2 = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM7406e3 = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        LZ0 lz0M8561c = LZ0.m5023a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C7110x(0)).m8561c();
        typedArrayObtainStyledAttributes.recycle();
        return new C4218i3(colorStateListM7406e, colorStateListM7406e2, colorStateListM7406e3, dimensionPixelSize, lz0M8561c, rect);
    }

    /* renamed from: a */
    public void m18937a() {
        View view = (View) this.f28782b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C6649px) this.f28784d) != null) {
                if (((C6649px) this.f28786f) == null) {
                    this.f28786f = new C6649px();
                }
                C6649px c6649px = (C6649px) this.f28786f;
                c6649px.f40447c = null;
                c6649px.f40446b = false;
                c6649px.f40448d = null;
                c6649px.f40445a = false;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                ColorStateList colorStateListM18612g = AbstractC9536gk1.m18612g(view);
                if (colorStateListM18612g != null) {
                    c6649px.f40446b = true;
                    c6649px.f40447c = colorStateListM18612g;
                }
                PorterDuff.Mode modeM18613h = AbstractC9536gk1.m18613h(view);
                if (modeM18613h != null) {
                    c6649px.f40445a = true;
                    c6649px.f40448d = modeM18613h;
                }
                if (c6649px.f40446b || c6649px.f40445a) {
                    C0574J6.m4157e(background, c6649px, view.getDrawableState());
                    return;
                }
            }
            C6649px c6649px2 = (C6649px) this.f28785e;
            if (c6649px2 != null) {
                C0574J6.m4157e(background, c6649px2, view.getDrawableState());
                return;
            }
            C6649px c6649px3 = (C6649px) this.f28784d;
            if (c6649px3 != null) {
                C0574J6.m4157e(background, c6649px3, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public boolean m18938b(int i) {
        ArrayList arrayList = (ArrayList) this.f28784d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4155h3 c4155h3 = (C4155h3) arrayList.get(i2);
            int i3 = c4155h3.f28181a;
            if (i3 == 8) {
                if (m18943h(c4155h3.f28183c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c4155h3.f28182b;
                int i5 = c4155h3.f28183c + i4;
                while (i4 < i5) {
                    if (m18943h(i4, i2 + 1) == i) {
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

    /* renamed from: c */
    public void m18939c() {
        ArrayList arrayList = (ArrayList) this.f28784d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C7391Bm1) this.f28785e).m871p((C4155h3) arrayList.get(i));
        }
        m18954s(arrayList);
        this.f28781a = 0;
    }

    /* renamed from: d */
    public void m18940d() {
        m18939c();
        ArrayList arrayList = (ArrayList) this.f28783c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4155h3 c4155h3 = (C4155h3) arrayList.get(i);
            int i2 = c4155h3.f28181a;
            C7391Bm1 c7391Bm1 = (C7391Bm1) this.f28785e;
            if (i2 == 1) {
                c7391Bm1.m871p(c4155h3);
                c7391Bm1.m876u(c4155h3.f28182b, c4155h3.f28183c);
            } else if (i2 == 2) {
                c7391Bm1.m871p(c4155h3);
                int i3 = c4155h3.f28182b;
                int i4 = c4155h3.f28183c;
                RecyclerView recyclerView = (RecyclerView) c7391Bm1.f1022b;
                recyclerView.m10251S(i3, i4, true);
                recyclerView.f16526v1 = true;
                recyclerView.f16520s1.f6047c += i4;
            } else if (i2 == 4) {
                c7391Bm1.m871p(c4155h3);
                c7391Bm1.m874s(c4155h3.f28182b, c4155h3.f28183c);
            } else if (i2 == 8) {
                c7391Bm1.m871p(c4155h3);
                c7391Bm1.m878w(c4155h3.f28182b, c4155h3.f28183c);
            }
        }
        m18954s(arrayList);
        this.f28781a = 0;
    }

    /* renamed from: f */
    public void m18941f(C4155h3 c4155h3) {
        int i;
        int i2 = c4155h3.f28181a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM18959x = m18959x(c4155h3.f28182b, i2);
        int i3 = c4155h3.f28182b;
        int i4 = c4155h3.f28181a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c4155h3);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c4155h3.f28183c; i6++) {
            int iM18959x2 = m18959x((i * i6) + c4155h3.f28182b, c4155h3.f28181a);
            int i7 = c4155h3.f28181a;
            if (i7 == 2 ? iM18959x2 != iM18959x : !(i7 == 4 && iM18959x2 == iM18959x + 1)) {
                C4155h3 c4155h3M18948m = m18948m(i7, iM18959x, i5);
                m18942g(c4155h3M18948m, i3);
                ((Pools$SimplePool) this.f28782b).mo4580d(c4155h3M18948m);
                if (c4155h3.f28181a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM18959x = iM18959x2;
            } else {
                i5++;
            }
        }
        ((Pools$SimplePool) this.f28782b).mo4580d(c4155h3);
        if (i5 > 0) {
            C4155h3 c4155h3M18948m2 = m18948m(c4155h3.f28181a, iM18959x, i5);
            m18942g(c4155h3M18948m2, i3);
            ((Pools$SimplePool) this.f28782b).mo4580d(c4155h3M18948m2);
        }
    }

    /* renamed from: g */
    public void m18942g(C4155h3 c4155h3, int i) {
        C7391Bm1 c7391Bm1 = (C7391Bm1) this.f28785e;
        c7391Bm1.m871p(c4155h3);
        int i2 = c4155h3.f28181a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c7391Bm1.m874s(i, c4155h3.f28183c);
        } else {
            int i3 = c4155h3.f28183c;
            RecyclerView recyclerView = (RecyclerView) c7391Bm1.f1022b;
            recyclerView.m10251S(i, i3, true);
            recyclerView.f16526v1 = true;
            recyclerView.f16520s1.f6047c += i3;
        }
    }

    /* renamed from: h */
    public int m18943h(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f28784d;
        int size = arrayList.size();
        while (i2 < size) {
            C4155h3 c4155h3 = (C4155h3) arrayList.get(i2);
            int i3 = c4155h3.f28181a;
            if (i3 == 8) {
                int i4 = c4155h3.f28182b;
                if (i4 == i) {
                    i = c4155h3.f28183c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c4155h3.f28183c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c4155h3.f28182b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c4155h3.f28183c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c4155h3.f28183c;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: i */
    public ColorStateList m18944i() {
        C6649px c6649px = (C6649px) this.f28785e;
        if (c6649px != null) {
            return (ColorStateList) c6649px.f40447c;
        }
        return null;
    }

    /* renamed from: j */
    public PorterDuff.Mode m18945j() {
        C6649px c6649px = (C6649px) this.f28785e;
        if (c6649px != null) {
            return (PorterDuff.Mode) c6649px.f40448d;
        }
        return null;
    }

    /* renamed from: k */
    public boolean m18946k() {
        return ((ArrayList) this.f28783c).size() > 0;
    }

    /* renamed from: l */
    public void m18947l(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM25627i;
        View view = (View) this.f28782b;
        Context context = view.getContext();
        int[] iArr = AbstractC8704aH0.f15421A;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        View view2 = (View) this.f28782b;
        AbstractC10944rk1.m24481m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c8539Xo1M9117J.f13982c, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f28781a = typedArray.getResourceId(0, -1);
                C0574J6 c0574j6 = (C0574J6) this.f28783c;
                Context context2 = view.getContext();
                int i2 = this.f28781a;
                synchronized (c0574j6) {
                    colorStateListM25627i = c0574j6.f5338a.m25627i(context2, i2);
                }
                if (colorStateListM25627i != null) {
                    m18955t(colorStateListM25627i);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC9536gk1.m18622q(view, c8539Xo1M9117J.m9120B(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC9536gk1.m18623r(view, AbstractC6737rL.m24317c(typedArray.getInt(2, -1), null));
            }
        } finally {
            c8539Xo1M9117J.m9130M();
        }
    }

    /* renamed from: m */
    public C4155h3 m18948m(int i, int i2, int i3) {
        C4155h3 c4155h3 = (C4155h3) ((Pools$SimplePool) this.f28782b).mo4581i();
        if (c4155h3 != null) {
            c4155h3.f28181a = i;
            c4155h3.f28182b = i2;
            c4155h3.f28183c = i3;
            return c4155h3;
        }
        C4155h3 c4155h32 = new C4155h3();
        c4155h32.f28181a = i;
        c4155h32.f28182b = i2;
        c4155h32.f28183c = i3;
        return c4155h32;
    }

    /* renamed from: n */
    public void m18949n() {
        UiThreadUtil.assertOnUiThread();
        ViewGroupManager viewGroupManager = (ViewGroupManager) this.f28782b;
        ViewGroup viewGroup = (ViewGroup) this.f28783c;
        View view = (View) this.f28784d;
        viewGroupManager.removeView(viewGroup, view);
        C11856yu0 c11856yu0 = (C11856yu0) this.f28786f;
        c11856yu0.dropView(view);
        Integer numValueOf = Integer.valueOf(view.getId());
        Set set = (Set) this.f28785e;
        set.remove(numValueOf);
        if (set.isEmpty()) {
            c11856yu0.mPendingDeletionsForTag.remove(Integer.valueOf(this.f28781a));
        }
    }

    /* renamed from: o */
    public void m18950o() {
        this.f28781a = -1;
        m18955t(null);
        m18937a();
    }

    /* renamed from: p */
    public void m18951p(int i) {
        ColorStateList colorStateListM25627i;
        this.f28781a = i;
        C0574J6 c0574j6 = (C0574J6) this.f28783c;
        if (c0574j6 != null) {
            Context context = ((View) this.f28782b).getContext();
            synchronized (c0574j6) {
                colorStateListM25627i = c0574j6.f5338a.m25627i(context, i);
            }
        } else {
            colorStateListM25627i = null;
        }
        m18955t(colorStateListM25627i);
        m18937a();
    }

    /* renamed from: q */
    public void m18952q(C4155h3 c4155h3) {
        ((ArrayList) this.f28784d).add(c4155h3);
        int i = c4155h3.f28181a;
        C7391Bm1 c7391Bm1 = (C7391Bm1) this.f28785e;
        if (i == 1) {
            c7391Bm1.m876u(c4155h3.f28182b, c4155h3.f28183c);
            return;
        }
        if (i == 2) {
            int i2 = c4155h3.f28182b;
            int i3 = c4155h3.f28183c;
            RecyclerView recyclerView = (RecyclerView) c7391Bm1.f1022b;
            recyclerView.m10251S(i2, i3, false);
            recyclerView.f16526v1 = true;
            return;
        }
        if (i == 4) {
            c7391Bm1.m874s(c4155h3.f28182b, c4155h3.f28183c);
        } else if (i == 8) {
            c7391Bm1.m878w(c4155h3.f28182b, c4155h3.f28183c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c4155h3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:250:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x000d A[SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18953r() {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4218i3.m18953r():void");
    }

    /* renamed from: s */
    public void m18954s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4155h3 c4155h3 = (C4155h3) arrayList.get(i);
            c4155h3.getClass();
            ((Pools$SimplePool) this.f28782b).mo4580d(c4155h3);
        }
        arrayList.clear();
    }

    /* renamed from: t */
    public void m18955t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C6649px) this.f28784d) == null) {
                this.f28784d = new C6649px();
            }
            C6649px c6649px = (C6649px) this.f28784d;
            c6649px.f40447c = colorStateList;
            c6649px.f40446b = true;
        } else {
            this.f28784d = null;
        }
        m18937a();
    }

    /* renamed from: u */
    public void m18956u(ColorStateList colorStateList) {
        if (((C6649px) this.f28785e) == null) {
            this.f28785e = new C6649px();
        }
        C6649px c6649px = (C6649px) this.f28785e;
        c6649px.f40447c = colorStateList;
        c6649px.f40446b = true;
        m18937a();
    }

    /* renamed from: v */
    public void m18957v(PorterDuff.Mode mode) {
        if (((C6649px) this.f28785e) == null) {
            this.f28785e = new C6649px();
        }
        C6649px c6649px = (C6649px) this.f28785e;
        c6649px.f40448d = mode;
        c6649px.f40445a = true;
        m18937a();
    }

    /* renamed from: w */
    public void m18958w(TextView textView) {
        C10439no0 c10439no0 = new C10439no0();
        C10439no0 c10439no02 = new C10439no0();
        LZ0 lz0 = (LZ0) this.f28786f;
        c10439no0.setShapeAppearanceModel(lz0);
        c10439no02.setShapeAppearanceModel(lz0);
        c10439no0.m23238j((ColorStateList) this.f28784d);
        c10439no0.f38516a.f37940j = this.f28781a;
        c10439no0.invalidateSelf();
        C10311mo0 c10311mo0 = c10439no0.f38516a;
        ColorStateList colorStateList = c10311mo0.f37934d;
        ColorStateList colorStateList2 = (ColorStateList) this.f28785e;
        if (colorStateList != colorStateList2) {
            c10311mo0.f37934d = colorStateList2;
            c10439no0.onStateChange(c10439no0.getState());
        }
        ColorStateList colorStateList3 = (ColorStateList) this.f28783c;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), c10439no0, c10439no02);
        Rect rect = (Rect) this.f28782b;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        textView.setBackground(insetDrawable);
    }

    /* renamed from: x */
    public int m18959x(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f28784d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C4155h3 c4155h3 = (C4155h3) arrayList.get(size);
            int i5 = c4155h3.f28181a;
            if (i5 == 8) {
                int i6 = c4155h3.f28182b;
                int i7 = c4155h3.f28183c;
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
                            c4155h3.f28182b = i6 + 1;
                            c4155h3.f28183c = i7 + 1;
                        } else if (i2 == 2) {
                            c4155h3.f28182b = i6 - 1;
                            c4155h3.f28183c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c4155h3.f28183c = i7 + 1;
                    } else if (i2 == 2) {
                        c4155h3.f28183c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c4155h3.f28182b = i6 + 1;
                    } else if (i2 == 2) {
                        c4155h3.f28182b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c4155h3.f28182b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c4155h3.f28183c;
                    } else if (i5 == 2) {
                        i += c4155h3.f28183c;
                    }
                } else if (i2 == 1) {
                    c4155h3.f28182b = i8 + 1;
                } else if (i2 == 2) {
                    c4155h3.f28182b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C4155h3 c4155h32 = (C4155h3) arrayList.get(size2);
            if (c4155h32.f28181a == 8) {
                int i9 = c4155h32.f28183c;
                if (i9 == c4155h32.f28182b || i9 < 0) {
                    arrayList.remove(size2);
                    ((Pools$SimplePool) this.f28782b).mo4580d(c4155h32);
                }
            } else if (c4155h32.f28183c <= 0) {
                arrayList.remove(size2);
                ((Pools$SimplePool) this.f28782b).mo4580d(c4155h32);
            }
        }
        return i;
    }

    public C4218i3(View view) {
        this.f28781a = -1;
        this.f28782b = view;
        this.f28783c = C0574J6.m4154a();
    }

    public C4218i3(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, LZ0 lz0, Rect rect) {
        AbstractC9104dM1.m17548g(rect.left);
        AbstractC9104dM1.m17548g(rect.top);
        AbstractC9104dM1.m17548g(rect.right);
        AbstractC9104dM1.m17548g(rect.bottom);
        this.f28782b = rect;
        this.f28783c = colorStateList2;
        this.f28784d = colorStateList;
        this.f28785e = colorStateList3;
        this.f28781a = i;
        this.f28786f = lz0;
    }

    public C4218i3(C7391Bm1 c7391Bm1) {
        this.f28782b = new Pools$SimplePool(30);
        this.f28783c = new ArrayList();
        this.f28784d = new ArrayList();
        this.f28781a = 0;
        this.f28785e = c7391Bm1;
        this.f28786f = new C7621Fx1(this);
    }

    public C4218i3(int[] iArr, C8201Rb1[] c8201Rb1Arr, int[] iArr2, int[][][] iArr3, C8201Rb1 c8201Rb1) {
        this.f28782b = iArr;
        this.f28783c = c8201Rb1Arr;
        this.f28785e = iArr3;
        this.f28784d = iArr2;
        this.f28786f = c8201Rb1;
        this.f28781a = iArr.length;
    }

    public C4218i3(C11856yu0 c11856yu0, ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i) {
        this.f28786f = c11856yu0;
        this.f28782b = viewGroupManager;
        this.f28783c = viewGroup;
        this.f28784d = view;
        this.f28785e = set;
        this.f28781a = i;
    }
}
