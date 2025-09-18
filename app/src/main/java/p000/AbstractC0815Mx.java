package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: Mx */
/* loaded from: classes.dex */
public abstract class AbstractC0815Mx extends View {

    /* renamed from: a */
    public int[] f7409a;

    /* renamed from: b */
    public int f7410b;

    /* renamed from: c */
    public Context f7411c;

    /* renamed from: d */
    public X20 f7412d;

    /* renamed from: e */
    public String f7413e;

    /* renamed from: f */
    public HashMap f7414f;

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5481a(java.lang.String r6) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto L8e
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto L8e
        La:
            android.content.Context r0 = r5.f7411c
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f16063m
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f16063m
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.m5484d(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<IG0> r1 = p000.IG0.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f7414f
            r1.put(r0, r6)
            r5.m5482b(r3)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0815Mx.m5481a(java.lang.String):void");
    }

    /* renamed from: b */
    public final void m5482b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f7410b + 1;
        int[] iArr = this.f7409a;
        if (i2 > iArr.length) {
            this.f7409a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f7409a;
        int i3 = this.f7410b;
        iArr2[i3] = i;
        this.f7410b = i3 + 1;
    }

    /* renamed from: c */
    public final void m5483c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f7410b; i++) {
            View view = (View) constraintLayout.f16051a.get(this.f7409a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: d */
    public final int m5484d(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f7411c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public void mo5485e(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, TG0.f11273b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f7413e = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: f */
    public abstract void mo3961f(C3960dy c3960dy, boolean z);

    /* renamed from: g */
    public final void m5486g() {
        if (this.f7412d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0941Ox) {
            ((C0941Ox) layoutParams).f8743k0 = this.f7412d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f7409a, this.f7410b);
    }

    @Override // android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f7413e;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f7413e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f7410b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m5481a(str.substring(i));
                return;
            } else {
                m5481a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f7413e = null;
        this.f7410b = 0;
        for (int i : iArr) {
            m5482b(i);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
