package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import ru.mes.dnevnik.R;

/* renamed from: Rn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8224Rn0 extends C6279k6 {

    /* renamed from: e */
    public final C7696Hj0 f10415e;

    /* renamed from: f */
    public final AccessibilityManager f10416f;

    /* renamed from: g */
    public final Rect f10417g;

    /* renamed from: h */
    public final int f10418h;

    /* renamed from: i */
    public final float f10419i;

    /* renamed from: j */
    public ColorStateList f10420j;

    /* renamed from: k */
    public int f10421k;

    /* renamed from: l */
    public ColorStateList f10422l;

    public C8224Rn0(Context context, AttributeSet attributeSet) {
        super(AbstractC11256uA1.m25127b(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f10417g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM1627d = DJ1.m1627d(context2, attributeSet, NG0.f7698l, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM1627d.hasValue(0) && typedArrayM1627d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f10418h = typedArrayM1627d.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f10419i = typedArrayM1627d.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM1627d.hasValue(2)) {
            this.f10420j = ColorStateList.valueOf(typedArrayM1627d.getColor(2, 0));
        }
        this.f10421k = typedArrayM1627d.getColor(4, 0);
        this.f10422l = AbstractC8259Se1.m7406e(context2, typedArrayM1627d, 5);
        this.f10416f = (AccessibilityManager) context2.getSystemService("accessibility");
        C7696Hj0 c7696Hj0 = new C7696Hj0(context2, null, R.attr.listPopupWindowStyle);
        this.f10415e = c7696Hj0;
        c7696Hj0.f4479y = true;
        c7696Hj0.f4480z.setFocusable(true);
        c7696Hj0.f4469o = this;
        c7696Hj0.f4480z.setInputMethodMode(2);
        c7696Hj0.mo3567o(getAdapter());
        c7696Hj0.f4470p = new C1765b7(1, this);
        if (typedArrayM1627d.hasValue(6)) {
            setSimpleItems(typedArrayM1627d.getResourceId(6, 0));
        }
        typedArrayM1627d.recycle();
    }

    /* renamed from: a */
    public static void m7116a(C8224Rn0 c8224Rn0, Object obj) {
        c8224Rn0.setText(c8224Rn0.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout m7117b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m7118c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f10416f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m7118c()) {
            this.f10415e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f10420j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM7117b = m7117b();
        return (textInputLayoutM7117b == null || !textInputLayoutM7117b.f18270E) ? super.getHint() : textInputLayoutM7117b.getHint();
    }

    public float getPopupElevation() {
        return this.f10419i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f10421k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f10422l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM7117b = m7117b();
        if (textInputLayoutM7117b != null && textInputLayoutM7117b.f18270E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10415e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM7117b = m7117b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM7117b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C7696Hj0 c7696Hj0 = this.f10415e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c7696Hj0.f4480z.isShowing() ? -1 : c7696Hj0.f4457c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM7117b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c7696Hj0.f4480z.getBackground();
                if (background != null) {
                    Rect rect = this.f10417g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM7117b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m7118c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f10415e.mo3567o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C7696Hj0 c7696Hj0 = this.f10415e;
        if (c7696Hj0 != null) {
            c7696Hj0.m3564h(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f10420j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C10439no0) {
            ((C10439no0) dropDownBackground).m23238j(this.f10420j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f10415e.f4471q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM7117b = m7117b();
        if (textInputLayoutM7117b != null) {
            textInputLayoutM7117b.m11271s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f10421k = i;
        if (getAdapter() instanceof C8172Qn0) {
            ((C8172Qn0) getAdapter()).m6784a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f10422l = colorStateList;
        if (getAdapter() instanceof C8172Qn0) {
            ((C8172Qn0) getAdapter()).m6784a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m7118c()) {
            this.f10415e.mo335b();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C8172Qn0(this, getContext(), this.f10418h, strArr));
    }
}
