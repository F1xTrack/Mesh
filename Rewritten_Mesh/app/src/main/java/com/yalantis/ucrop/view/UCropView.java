package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000.A61;
import p000.C10641pN0;
import p000.PG0;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public class UCropView extends FrameLayout {

    /* renamed from: a */
    public final GestureCropImageView f20691a;

    /* renamed from: b */
    public final OverlayView f20692b;

    public UCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.ucrop_view, (ViewGroup) this, true);
        GestureCropImageView gestureCropImageView = (GestureCropImageView) findViewById(R.id.image_view_crop);
        this.f20691a = gestureCropImageView;
        OverlayView overlayView = (OverlayView) findViewById(R.id.view_overlay);
        this.f20692b = overlayView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PG0.f8971b);
        overlayView.getClass();
        overlayView.f20676l = typedArrayObtainStyledAttributes.getBoolean(2, false);
        int color = typedArrayObtainStyledAttributes.getColor(3, overlayView.getResources().getColor(R.color.ucrop_color_default_dimmed));
        overlayView.f20677m = color;
        Paint paint = overlayView.f20679o;
        paint.setColor(color);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color2 = typedArrayObtainStyledAttributes.getColor(4, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_frame));
        Paint paint2 = overlayView.f20681q;
        paint2.setStrokeWidth(dimensionPixelSize);
        paint2.setColor(color2);
        paint2.setStyle(style);
        Paint paint3 = overlayView.f20682r;
        paint3.setStrokeWidth(dimensionPixelSize * 3);
        paint3.setColor(color2);
        paint3.setStyle(style);
        overlayView.f20674j = typedArrayObtainStyledAttributes.getBoolean(10, true);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color3 = typedArrayObtainStyledAttributes.getColor(6, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_grid));
        Paint paint4 = overlayView.f20680p;
        paint4.setStrokeWidth(dimensionPixelSize2);
        paint4.setColor(color3);
        overlayView.f20670f = typedArrayObtainStyledAttributes.getInt(8, 2);
        overlayView.f20671g = typedArrayObtainStyledAttributes.getInt(7, 2);
        overlayView.f20675k = typedArrayObtainStyledAttributes.getBoolean(11, true);
        gestureCropImageView.getClass();
        float fAbs = Math.abs(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        float fAbs2 = Math.abs(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            gestureCropImageView.f36340u = 0.0f;
        } else {
            gestureCropImageView.f36340u = fAbs / fAbs2;
        }
        typedArrayObtainStyledAttributes.recycle();
        gestureCropImageView.setCropBoundsChangeListener(new C10641pN0(9, this));
        overlayView.setOverlayViewChangeListener(new A61(2, this));
    }

    public GestureCropImageView getCropImageView() {
        return this.f20691a;
    }

    public OverlayView getOverlayView() {
        return this.f20692b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
