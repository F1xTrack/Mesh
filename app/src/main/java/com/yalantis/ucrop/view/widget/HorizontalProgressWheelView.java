package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.KotlinVersion;
import p000.AbstractC0691Ky;
import p000.K30;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public class HorizontalProgressWheelView extends View {

    /* renamed from: a */
    public final Rect f20700a;

    /* renamed from: b */
    public K30 f20701b;

    /* renamed from: c */
    public float f20702c;

    /* renamed from: d */
    public final Paint f20703d;

    /* renamed from: e */
    public final Paint f20704e;

    /* renamed from: f */
    public final int f20705f;

    /* renamed from: g */
    public final int f20706g;

    /* renamed from: h */
    public final int f20707h;

    /* renamed from: i */
    public boolean f20708i;

    /* renamed from: j */
    public float f20709j;

    /* renamed from: k */
    public int f20710k;

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20700a = new Rect();
        this.f20710k = AbstractC0691Ky.m4783a(getContext(), R.color.ucrop_color_widget_rotate_mid_line);
        this.f20705f = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);
        this.f20706g = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);
        this.f20707h = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f20703d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f20703d.setStrokeWidth(this.f20705f);
        this.f20703d.setColor(getResources().getColor(R.color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f20703d);
        this.f20704e = paint2;
        paint2.setColor(this.f20710k);
        this.f20704e.setStrokeCap(Paint.Cap.ROUND);
        this.f20704e.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f20700a;
        canvas.getClipBounds(rect);
        int iWidth = rect.width() / (this.f20705f + this.f20707h);
        float f = this.f20709j % (r3 + r2);
        for (int i = 0; i < iWidth; i++) {
            int i2 = iWidth / 4;
            if (i < i2) {
                this.f20703d.setAlpha((int) ((i / i2) * 255.0f));
            } else if (i > (iWidth * 3) / 4) {
                this.f20703d.setAlpha((int) (((iWidth - i) / i2) * 255.0f));
            } else {
                this.f20703d.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            }
            float f2 = -f;
            canvas.drawLine(rect.left + f2 + ((this.f20705f + this.f20707h) * i), rect.centerY() - (this.f20706g / 4.0f), f2 + rect.left + ((this.f20705f + this.f20707h) * i), (this.f20706g / 4.0f) + rect.centerY(), this.f20703d);
        }
        canvas.drawLine(rect.centerX(), rect.centerY() - (this.f20706g / 2.0f), rect.centerX(), (this.f20706g / 2.0f) + rect.centerY(), this.f20704e);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20702c = motionEvent.getX();
        } else if (action == 1) {
            K30 k30 = this.f20701b;
            if (k30 != null) {
                this.f20708i = false;
                k30.mo4538f();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f20702c;
            if (x != 0.0f) {
                if (!this.f20708i) {
                    this.f20708i = true;
                    K30 k302 = this.f20701b;
                    if (k302 != null) {
                        k302.mo4540j();
                    }
                }
                this.f20709j -= x;
                postInvalidate();
                this.f20702c = motionEvent.getX();
                K30 k303 = this.f20701b;
                if (k303 != null) {
                    k303.mo4539h(-x);
                }
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i) {
        this.f20710k = i;
        this.f20704e.setColor(i);
        invalidate();
    }

    public void setScrollingListener(K30 k30) {
        this.f20701b = k30;
    }
}
