package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import p000.AbstractC10490oB1;
import p000.AbstractC10944rk1;
import p000.AbstractC6467n5;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a */
    public TextView f18256a;

    /* renamed from: b */
    public Button f18257b;

    /* renamed from: c */
    public int f18258c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC10490oB1.m23360e(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC6467n5.f38091b);
    }

    /* renamed from: a */
    public final boolean m11252a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f18256a.getPaddingTop() == i2 && this.f18256a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f18256a;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f18257b;
    }

    public TextView getMessageView() {
        return this.f18256a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f18256a = (TextView) findViewById(R.id.snackbar_text);
        this.f18257b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f18256a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f18258c <= 0 || this.f18257b.getMeasuredWidth() <= this.f18258c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m11252a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m11252a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f18258c = i;
    }
}
