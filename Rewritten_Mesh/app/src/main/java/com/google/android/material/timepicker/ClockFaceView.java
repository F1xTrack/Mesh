package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC10944rk1;
import p000.AbstractC3982eJ;
import p000.AbstractC8259Se1;
import p000.AbstractC8964cJ0;
import p000.C1255Tx;
import p000.C1318Ux;
import p000.C1570Yx;
import p000.InterfaceC6771rt;
import p000.NG0;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
class ClockFaceView extends AbstractC8964cJ0 implements InterfaceC6771rt {

    /* renamed from: A */
    public final int f18345A;

    /* renamed from: B */
    public final int f18346B;

    /* renamed from: C */
    public final int f18347C;

    /* renamed from: D */
    public final int f18348D;

    /* renamed from: E */
    public String[] f18349E;

    /* renamed from: F */
    public float f18350F;

    /* renamed from: G */
    public final ColorStateList f18351G;

    /* renamed from: s */
    public final ClockHandView f18352s;

    /* renamed from: t */
    public final Rect f18353t;

    /* renamed from: u */
    public final RectF f18354u;

    /* renamed from: v */
    public final Rect f18355v;

    /* renamed from: w */
    public final SparseArray f18356w;

    /* renamed from: x */
    public final C1947c f18357x;

    /* renamed from: y */
    public final int[] f18358y;

    /* renamed from: z */
    public final float[] f18359z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18353t = new Rect();
        this.f18354u = new RectF();
        this.f18355v = new Rect();
        this.f18356w = new SparseArray();
        this.f18359z = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7692f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM7406e = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 1);
        this.f18351G = colorStateListM7406e;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f18352s = clockHandView;
        this.f18345A = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM7406e.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM7406e.getDefaultColor());
        this.f18358y = new int[]{colorForState, colorForState, colorStateListM7406e.getDefaultColor()};
        clockHandView.f18370j.add(this);
        int defaultColor = AbstractC3982eJ.m17900b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM7406e2 = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM7406e2 != null ? colorStateListM7406e2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1946b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f18357x = new C1947c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m11279i(0, strArr);
        this.f18346B = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f18347C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f18348D = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // p000.InterfaceC6771rt
    /* renamed from: a */
    public final void mo11277a(float f, boolean z) {
        if (Math.abs(this.f18350F - f) > 0.001f) {
            this.f18350F = f;
            m11278h();
        }
    }

    @Override // p000.AbstractC8964cJ0
    /* renamed from: g */
    public final void mo10667g() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C1570Yx c1570Yx = new C1570Yx();
        c1570Yx.m9434b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f17419q * 0.66f) : this.f17419q;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = c1570Yx.f14625c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C1255Tx());
                }
                C1318Ux c1318Ux = ((C1255Tx) map2.get(Integer.valueOf(id))).f11602d;
                c1318Ux.f12264w = R.id.circle_center;
                c1318Ux.f12265x = iRound;
                c1318Ux.f12266y = size;
                size += 360.0f / list.size();
            }
        }
        c1570Yx.m9433a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f18356w;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* renamed from: h */
    public final void m11278h() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f18352s.f18374n;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f18356w;
            int size = sparseArray.size();
            rectF = this.f18354u;
            rect = this.f18353t;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f18355v);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f18358y, this.f18359z, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    /* renamed from: i */
    public final void m11279i(int i, String[] strArr) {
        this.f18349E = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.f18356w;
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f18349E.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f18349E.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f18349E[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                AbstractC10944rk1.m24482n(textView, this.f18357x);
                textView.setTextColor(this.f18351G);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f18349E[i2]));
                }
            }
        }
        ClockHandView clockHandView = this.f18352s;
        if (clockHandView.f18369i && !z) {
            clockHandView.f18381u = 1;
        }
        clockHandView.f18369i = z;
        clockHandView.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f18349E.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m11278h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f18348D / Math.max(Math.max(this.f18346B / displayMetrics.heightPixels, this.f18347C / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
