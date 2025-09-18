package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.TextView;
import com.yalantis.ucrop.UCropActivity;
import java.util.Locale;
import kotlin.KotlinVersion;
import p000.AbstractC6284kB;
import p000.C11929zT0;
import p000.C7621Fx1;
import p000.GQ0;
import p000.InterfaceC10800qc1;

/* loaded from: classes2.dex */
public class GestureCropImageView extends AbstractC6284kB {

    /* renamed from: E */
    public ScaleGestureDetector f20656E;

    /* renamed from: F */
    public C11929zT0 f20657F;

    /* renamed from: G */
    public GestureDetector f20658G;

    /* renamed from: H */
    public float f20659H;

    /* renamed from: I */
    public float f20660I;

    /* renamed from: J */
    public boolean f20661J;

    /* renamed from: K */
    public boolean f20662K;

    /* renamed from: L */
    public int f20663L;

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20661J = true;
        this.f20662K = true;
        this.f20663L = 5;
    }

    public int getDoubleTapScaleSteps() {
        return this.f20663L;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f20663L));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
            m22161f();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f20659H = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f20660I = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.f20658G.onTouchEvent(motionEvent);
        if (this.f20662K) {
            this.f20656E.onTouchEvent(motionEvent);
        }
        if (this.f20661J) {
            C11929zT0 c11929zT0 = this.f20657F;
            c11929zT0.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                c11929zT0.f46838c = motionEvent.getX();
                c11929zT0.f46839d = motionEvent.getY();
                c11929zT0.f46840e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                c11929zT0.f46842g = 0.0f;
                c11929zT0.f46843h = true;
            } else if (actionMasked == 1) {
                c11929zT0.f46840e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    c11929zT0.f46836a = motionEvent.getX();
                    c11929zT0.f46837b = motionEvent.getY();
                    c11929zT0.f46841f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    c11929zT0.f46842g = 0.0f;
                    c11929zT0.f46843h = true;
                } else if (actionMasked == 6) {
                    c11929zT0.f46841f = -1;
                }
            } else if (c11929zT0.f46840e != -1 && c11929zT0.f46841f != -1 && motionEvent.getPointerCount() > c11929zT0.f46841f) {
                float x = motionEvent.getX(c11929zT0.f46840e);
                float y = motionEvent.getY(c11929zT0.f46840e);
                float x2 = motionEvent.getX(c11929zT0.f46841f);
                float y2 = motionEvent.getY(c11929zT0.f46841f);
                if (c11929zT0.f46843h) {
                    c11929zT0.f46842g = 0.0f;
                    c11929zT0.f46843h = false;
                } else {
                    float degrees = (((float) Math.toDegrees((float) Math.atan2(y2 - y, x2 - x))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(c11929zT0.f46837b - c11929zT0.f46839d, c11929zT0.f46836a - c11929zT0.f46838c))) % 360.0f);
                    c11929zT0.f46842g = degrees;
                    if (degrees < -180.0f) {
                        c11929zT0.f46842g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        c11929zT0.f46842g = degrees - 360.0f;
                    }
                }
                C7621Fx1 c7621Fx1 = c11929zT0.f46844i;
                if (c7621Fx1 != null) {
                    float f = c11929zT0.f46842g;
                    GestureCropImageView gestureCropImageView = (GestureCropImageView) c7621Fx1.f3494a;
                    float f2 = gestureCropImageView.f20659H;
                    float f3 = gestureCropImageView.f20660I;
                    if (f != 0.0f) {
                        Matrix matrix = gestureCropImageView.f41760g;
                        matrix.postRotate(f, f2, f3);
                        gestureCropImageView.setImageMatrix(matrix);
                        InterfaceC10800qc1 interfaceC10800qc1 = gestureCropImageView.f41763j;
                        if (interfaceC10800qc1 != null) {
                            float[] fArr = gestureCropImageView.f41759f;
                            matrix.getValues(fArr);
                            double d = fArr[1];
                            matrix.getValues(fArr);
                            float f4 = (float) (-(Math.atan2(d, fArr[0]) * 57.29577951308232d));
                            TextView textView = ((UCropActivity) ((GQ0) interfaceC10800qc1).f3735b).f20610B;
                            if (textView != null) {
                                textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f4)));
                            }
                        }
                    }
                }
                c11929zT0.f46836a = x2;
                c11929zT0.f46837b = y2;
                c11929zT0.f46838c = x;
                c11929zT0.f46839d = y;
            }
        }
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.f20663L = i;
    }

    public void setRotateEnabled(boolean z) {
        this.f20661J = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f20662K = z;
    }
}
