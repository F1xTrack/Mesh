package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: Xe1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC8519Xe1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f13889a;

    /* renamed from: b */
    public final /* synthetic */ UCropActivity f13890b;

    public /* synthetic */ ViewOnClickListenerC8519Xe1(UCropActivity uCropActivity, int i) {
        this.f13889a = i;
        this.f13890b = uCropActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UCropActivity uCropActivity = this.f13890b;
        switch (this.f13889a) {
            case 0:
                GestureCropImageView gestureCropImageView = uCropActivity.f20631s;
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) ((ViewGroup) view).getChildAt(0);
                if (view.isSelected()) {
                    if (aspectRatioTextView.f20696k != 0.0f) {
                        float f = aspectRatioTextView.f20698m;
                        float f2 = aspectRatioTextView.f20699n;
                        aspectRatioTextView.f20698m = f2;
                        aspectRatioTextView.f20699n = f;
                        aspectRatioTextView.f20696k = f2 / f;
                    }
                    aspectRatioTextView.m13765i();
                }
                gestureCropImageView.setTargetAspectRatio(aspectRatioTextView.f20696k);
                uCropActivity.f20631s.setImageToWrapCropBounds(true);
                if (!view.isSelected()) {
                    Iterator it = uCropActivity.f20609A.iterator();
                    while (it.hasNext()) {
                        ViewGroup viewGroup = (ViewGroup) it.next();
                        viewGroup.setSelected(viewGroup == view);
                    }
                    break;
                }
                break;
            case 1:
                GestureCropImageView gestureCropImageView2 = uCropActivity.f20631s;
                float f3 = -gestureCropImageView2.getCurrentAngle();
                RectF rectF = gestureCropImageView2.f36338s;
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                if (f3 != 0.0f) {
                    Matrix matrix = gestureCropImageView2.f41760g;
                    matrix.postRotate(f3, fCenterX, fCenterY);
                    gestureCropImageView2.setImageMatrix(matrix);
                    InterfaceC10800qc1 interfaceC10800qc1 = gestureCropImageView2.f41763j;
                    if (interfaceC10800qc1 != null) {
                        float[] fArr = gestureCropImageView2.f41759f;
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
                uCropActivity.f20631s.setImageToWrapCropBounds(true);
                break;
            case 2:
                GestureCropImageView gestureCropImageView3 = uCropActivity.f20631s;
                float f5 = 90;
                RectF rectF2 = gestureCropImageView3.f36338s;
                float fCenterX2 = rectF2.centerX();
                float fCenterY2 = rectF2.centerY();
                if (f5 != 0.0f) {
                    Matrix matrix2 = gestureCropImageView3.f41760g;
                    matrix2.postRotate(f5, fCenterX2, fCenterY2);
                    gestureCropImageView3.setImageMatrix(matrix2);
                    InterfaceC10800qc1 interfaceC10800qc12 = gestureCropImageView3.f41763j;
                    if (interfaceC10800qc12 != null) {
                        float[] fArr2 = gestureCropImageView3.f41759f;
                        matrix2.getValues(fArr2);
                        double d2 = fArr2[1];
                        matrix2.getValues(fArr2);
                        float f6 = (float) (-(Math.atan2(d2, fArr2[0]) * 57.29577951308232d));
                        TextView textView2 = ((UCropActivity) ((GQ0) interfaceC10800qc12).f3735b).f20610B;
                        if (textView2 != null) {
                            textView2.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f6)));
                        }
                    }
                }
                uCropActivity.f20631s.setImageToWrapCropBounds(true);
                break;
            default:
                if (!view.isSelected()) {
                    int id = view.getId();
                    Bitmap.CompressFormat compressFormat = UCropActivity.f20608K;
                    uCropActivity.m13761m(id);
                    break;
                }
                break;
        }
    }
}
