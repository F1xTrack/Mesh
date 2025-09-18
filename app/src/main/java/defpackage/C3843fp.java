package defpackage;

import android.view.ScaleGestureDetector;
import android.view.View;
import com.yalantis.ucrop.view.GestureCropImageView;

/* renamed from: fp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3843fp extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ C3843fp(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                O90.f(scaleGestureDetector, "detector");
                C4034gp c4034gp = (C4034gp) this.b;
                c4034gp.setZoom(scaleGestureDetector.getScaleFactor() * c4034gp.getZoom());
                c4034gp.d();
                break;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                GestureCropImageView gestureCropImageView = (GestureCropImageView) this.b;
                gestureCropImageView.h(scaleFactor, gestureCropImageView.H, gestureCropImageView.I);
                break;
        }
        return true;
    }
}
