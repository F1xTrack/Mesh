package defpackage;

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
public final class ViewOnClickListenerC1827Xe1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UCropActivity b;

    public /* synthetic */ ViewOnClickListenerC1827Xe1(UCropActivity uCropActivity, int i) {
        this.a = i;
        this.b = uCropActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UCropActivity uCropActivity = this.b;
        switch (this.a) {
            case 0:
                GestureCropImageView gestureCropImageView = uCropActivity.s;
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) ((ViewGroup) view).getChildAt(0);
                if (view.isSelected()) {
                    if (aspectRatioTextView.k != 0.0f) {
                        float f = aspectRatioTextView.m;
                        float f2 = aspectRatioTextView.n;
                        aspectRatioTextView.m = f2;
                        aspectRatioTextView.n = f;
                        aspectRatioTextView.k = f2 / f;
                    }
                    aspectRatioTextView.i();
                }
                gestureCropImageView.setTargetAspectRatio(aspectRatioTextView.k);
                uCropActivity.s.setImageToWrapCropBounds(true);
                if (!view.isSelected()) {
                    Iterator it = uCropActivity.A.iterator();
                    while (it.hasNext()) {
                        ViewGroup viewGroup = (ViewGroup) it.next();
                        viewGroup.setSelected(viewGroup == view);
                    }
                    break;
                }
                break;
            case 1:
                GestureCropImageView gestureCropImageView2 = uCropActivity.s;
                float f3 = -gestureCropImageView2.getCurrentAngle();
                RectF rectF = gestureCropImageView2.s;
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                if (f3 != 0.0f) {
                    Matrix matrix = gestureCropImageView2.g;
                    matrix.postRotate(f3, fCenterX, fCenterY);
                    gestureCropImageView2.setImageMatrix(matrix);
                    InterfaceC6683qc1 interfaceC6683qc1 = gestureCropImageView2.j;
                    if (interfaceC6683qc1 != null) {
                        float[] fArr = gestureCropImageView2.f;
                        matrix.getValues(fArr);
                        double d = fArr[1];
                        matrix.getValues(fArr);
                        float f4 = (float) (-(Math.atan2(d, fArr[0]) * 57.29577951308232d));
                        TextView textView = ((UCropActivity) ((GQ0) interfaceC6683qc1).b).B;
                        if (textView != null) {
                            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f4)));
                        }
                    }
                }
                uCropActivity.s.setImageToWrapCropBounds(true);
                break;
            case 2:
                GestureCropImageView gestureCropImageView3 = uCropActivity.s;
                float f5 = 90;
                RectF rectF2 = gestureCropImageView3.s;
                float fCenterX2 = rectF2.centerX();
                float fCenterY2 = rectF2.centerY();
                if (f5 != 0.0f) {
                    Matrix matrix2 = gestureCropImageView3.g;
                    matrix2.postRotate(f5, fCenterX2, fCenterY2);
                    gestureCropImageView3.setImageMatrix(matrix2);
                    InterfaceC6683qc1 interfaceC6683qc12 = gestureCropImageView3.j;
                    if (interfaceC6683qc12 != null) {
                        float[] fArr2 = gestureCropImageView3.f;
                        matrix2.getValues(fArr2);
                        double d2 = fArr2[1];
                        matrix2.getValues(fArr2);
                        float f6 = (float) (-(Math.atan2(d2, fArr2[0]) * 57.29577951308232d));
                        TextView textView2 = ((UCropActivity) ((GQ0) interfaceC6683qc12).b).B;
                        if (textView2 != null) {
                            textView2.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f6)));
                        }
                    }
                }
                uCropActivity.s.setImageToWrapCropBounds(true);
                break;
            default:
                if (!view.isSelected()) {
                    int id = view.getId();
                    Bitmap.CompressFormat compressFormat = UCropActivity.K;
                    uCropActivity.m(id);
                    break;
                }
                break;
        }
    }
}
