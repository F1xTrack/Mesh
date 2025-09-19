package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import p000.AbstractC11256uA1;
import p000.AbstractC6268jw;
import p000.AbstractC8259Se1;
import p000.AbstractC9900ja1;
import p000.C0008A7;
import p000.C10183lo0;
import p000.C10695po0;
import p000.C1076R6;
import p000.C6279k6;
import p000.C6342l6;
import p000.C6468n6;
import p000.C6803s7;
import p000.C8224Rn0;
import p000.C9287eo0;
import p000.DJ1;
import p000.NG0;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0008A7 {
    @Override // p000.C0008A7
    /* renamed from: a */
    public final C6279k6 mo56a(Context context, AttributeSet attributeSet) {
        return new C8224Rn0(context, attributeSet);
    }

    @Override // p000.C0008A7
    /* renamed from: b */
    public final C6342l6 mo57b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p000.C0008A7
    /* renamed from: c */
    public final C6468n6 mo58c(Context context, AttributeSet attributeSet) {
        return new C9287eo0(context, attributeSet);
    }

    @Override // p000.C0008A7
    /* renamed from: d */
    public final C1076R6 mo59d(Context context, AttributeSet attributeSet) {
        C10183lo0 c10183lo0 = new C10183lo0(AbstractC11256uA1.m25127b(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c10183lo0.getContext();
        TypedArray typedArrayM1627d = DJ1.m1627d(context2, attributeSet, NG0.f7704r, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM1627d.hasValue(0)) {
            AbstractC6268jw.m22123c(c10183lo0, AbstractC8259Se1.m7406e(context2, typedArrayM1627d, 0));
        }
        c10183lo0.f37297f = typedArrayM1627d.getBoolean(1, false);
        typedArrayM1627d.recycle();
        return c10183lo0;
    }

    @Override // p000.C0008A7
    /* renamed from: e */
    public final C6803s7 mo60e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C10695po0 c10695po0 = new C10695po0(AbstractC11256uA1.m25127b(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c10695po0.getContext();
        if (AbstractC9900ja1.m22073b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = NG0.f7707u;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iM23882h = C10695po0.m23882h(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM23882h == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, NG0.f7706t);
                    int iM23882h2 = C10695po0.m23882h(c10695po0.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM23882h2 >= 0) {
                        c10695po0.setLineHeight(iM23882h2);
                    }
                }
            }
        }
        return c10695po0;
    }
}
