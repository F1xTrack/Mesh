package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import p000.AbstractC0691Ky;
import p000.C1078R8;
import p000.C6803s7;
import p000.PG0;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public class AspectRatioTextView extends C6803s7 {

    /* renamed from: h */
    public final Rect f20693h;

    /* renamed from: i */
    public final Paint f20694i;

    /* renamed from: j */
    public final int f20695j;

    /* renamed from: k */
    public float f20696k;

    /* renamed from: l */
    public String f20697l;

    /* renamed from: m */
    public float f20698m;

    /* renamed from: n */
    public float f20699n;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20693h = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PG0.f8970a);
        setGravity(1);
        this.f20697l = typedArrayObtainStyledAttributes.getString(0);
        this.f20698m = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
        float f = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.f20699n = f;
        float f2 = this.f20698m;
        if (f2 == 0.0f || f == 0.0f) {
            this.f20696k = 0.0f;
        } else {
            this.f20696k = f2 / f;
        }
        this.f20695j = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f20694i = paint;
        paint.setStyle(Paint.Style.FILL);
        m13765i();
        m13764h(getResources().getColor(R.color.ucrop_color_widget_active));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    public final void m13764h(int i) {
        Paint paint = this.f20694i;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{0}}, new int[]{i, AbstractC0691Ky.m4783a(getContext(), R.color.ucrop_color_widget)}));
    }

    /* renamed from: i */
    public final void m13765i() {
        if (!TextUtils.isEmpty(this.f20697l)) {
            setText(this.f20697l);
            return;
        }
        Locale locale = Locale.US;
        setText(((int) this.f20698m) + StringUtils.PROCESS_POSTFIX_DELIMITER + ((int) this.f20699n));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f20693h);
            float f = (r0.right - r0.left) / 2.0f;
            float f2 = r0.bottom - (r0.top / 2.0f);
            int i = this.f20695j;
            canvas.drawCircle(f, f2 - (i * 1.5f), i / 2.0f, this.f20694i);
        }
    }

    public void setActiveColor(int i) {
        m13764h(i);
        invalidate();
    }

    public void setAspectRatio(C1078R8 c1078r8) {
        this.f20697l = c1078r8.f10021a;
        float f = c1078r8.f10022b;
        this.f20698m = f;
        float f2 = c1078r8.f10023c;
        this.f20699n = f2;
        if (f == 0.0f || f2 == 0.0f) {
            this.f20696k = 0.0f;
        } else {
            this.f20696k = f / f2;
        }
        m13765i();
    }
}
