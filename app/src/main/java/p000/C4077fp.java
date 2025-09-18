package p000;

import android.view.ScaleGestureDetector;
import android.view.View;
import com.yalantis.ucrop.view.GestureCropImageView;

/* renamed from: fp */
/* loaded from: classes2.dex */
public final class C4077fp extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a */
    public final /* synthetic */ int f27402a;

    /* renamed from: b */
    public final /* synthetic */ View f27403b;

    public /* synthetic */ C4077fp(int i, View view) {
        this.f27402a = i;
        this.f27403b = view;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f27402a) {
            case 0:
                O90.m5968f(scaleGestureDetector, "detector");
                C4140gp c4140gp = (C4140gp) this.f27403b;
                c4140gp.setZoom(scaleGestureDetector.getScaleFactor() * c4140gp.getZoom());
                c4140gp.m18651d();
                break;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                GestureCropImageView gestureCropImageView = (GestureCropImageView) this.f27403b;
                gestureCropImageView.m22163h(scaleFactor, gestureCropImageView.f20659H, gestureCropImageView.f20660I);
                break;
        }
        return true;
    }
}
