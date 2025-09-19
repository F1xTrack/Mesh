package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC11256uA1;
import p000.C10895rM0;
import p000.C7110x;
import p000.C8432Vn0;
import p000.C8435Vo1;
import p000.DJ1;
import p000.InterfaceC8484Wn0;
import p000.L90;
import p000.LZ0;
import p000.NG0;
import p000.QQ0;
import p000.S02;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f18162k = 0;

    /* renamed from: a */
    public final ArrayList f18163a;

    /* renamed from: b */
    public final QQ0 f18164b;

    /* renamed from: c */
    public final LinkedHashSet f18165c;

    /* renamed from: d */
    public final L90 f18166d;

    /* renamed from: e */
    public Integer[] f18167e;

    /* renamed from: f */
    public boolean f18168f;

    /* renamed from: g */
    public boolean f18169g;

    /* renamed from: h */
    public boolean f18170h;

    /* renamed from: i */
    public final int f18171i;

    /* renamed from: j */
    public HashSet f18172j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC11256uA1.m25127b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f18163a = new ArrayList();
        this.f18164b = new QQ0(this);
        this.f18165c = new LinkedHashSet();
        this.f18166d = new L90(1, this);
        this.f18168f = false;
        this.f18172j = new HashSet();
        TypedArray typedArrayM1627d = DJ1.m1627d(getContext(), attributeSet, NG0.f7700n, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM1627d.getBoolean(3, false));
        this.f18171i = typedArrayM1627d.getResourceId(1, -1);
        this.f18170h = typedArrayM1627d.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM1627d.getBoolean(0, true));
        typedArrayM1627d.recycle();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m11221c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m11221c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m11221c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f18164b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m11219a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            m11220b(materialButton.getId(), materialButton.f18159o);
            LZ0 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f18163a.add(new C8432Vn0(shapeAppearanceModel.f6718e, shapeAppearanceModel.f6721h, shapeAppearanceModel.f6719f, shapeAppearanceModel.f6720g));
            materialButton.setEnabled(isEnabled());
            AbstractC10944rk1.m24482n(materialButton, new C10895rM0(2, this));
        }
    }

    /* renamed from: b */
    public final void m11220b(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f18172j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f18169g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f18170h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m11222d(hashSet);
    }

    /* renamed from: c */
    public final boolean m11221c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: d */
    public final void m11222d(Set set) {
        HashSet hashSet = this.f18172j;
        this.f18172j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f18168f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f18168f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean zContains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.f18165c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC8484Wn0) it.next()).mo8859a(id, zContains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f18166d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f18167e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m11223e() {
        C8432Vn0 c8432Vn0;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C8435Vo1 c8435Vo1M5027e = materialButton.getShapeAppearanceModel().m5027e();
                C8432Vn0 c8432Vn02 = (C8432Vn0) this.f18163a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    C7110x c7110x = C8432Vn0.f12750e;
                    if (i == firstVisibleChildIndex) {
                        c8432Vn0 = z ? S02.m7146b(this) ? new C8432Vn0(c7110x, c7110x, c8432Vn02.f12752b, c8432Vn02.f12753c) : new C8432Vn0(c8432Vn02.f12751a, c8432Vn02.f12754d, c7110x, c7110x) : new C8432Vn0(c8432Vn02.f12751a, c7110x, c8432Vn02.f12752b, c7110x);
                    } else if (i == lastVisibleChildIndex) {
                        c8432Vn0 = z ? S02.m7146b(this) ? new C8432Vn0(c8432Vn02.f12751a, c8432Vn02.f12754d, c7110x, c7110x) : new C8432Vn0(c7110x, c7110x, c8432Vn02.f12752b, c8432Vn02.f12753c) : new C8432Vn0(c7110x, c8432Vn02.f12754d, c7110x, c8432Vn02.f12753c);
                    } else {
                        c8432Vn02 = null;
                    }
                    c8432Vn02 = c8432Vn0;
                }
                if (c8432Vn02 == null) {
                    c8435Vo1M5027e.f12767e = new C7110x(0.0f);
                    c8435Vo1M5027e.f12768f = new C7110x(0.0f);
                    c8435Vo1M5027e.f12769g = new C7110x(0.0f);
                    c8435Vo1M5027e.f12770h = new C7110x(0.0f);
                } else {
                    c8435Vo1M5027e.f12767e = c8432Vn02.f12751a;
                    c8435Vo1M5027e.f12770h = c8432Vn02.f12754d;
                    c8435Vo1M5027e.f12768f = c8432Vn02.f12752b;
                    c8435Vo1M5027e.f12769g = c8432Vn02.f12753c;
                }
                materialButton.setShapeAppearanceModel(c8435Vo1M5027e.m8561c());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f18169g || this.f18172j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f18172j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f18172j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f18167e;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f18171i;
        if (i != -1) {
            m11222d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f18169g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m11223e();
        m11219a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f18163a.remove(iIndexOfChild);
        }
        m11223e();
        m11219a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f18170h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f18169g != z) {
            this.f18169g = z;
            m11222d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f18169g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
