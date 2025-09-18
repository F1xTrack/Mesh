package p000;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: uq */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC6974uq implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f43969a;

    /* renamed from: b */
    public final /* synthetic */ Object f43970b;

    public /* synthetic */ ViewOnLayoutChangeListenerC6974uq(int i, Object obj) {
        this.f43969a = i;
        this.f43970b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f43969a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f43970b;
                carouselLayoutManager.getClass();
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new RunnableC0383G4(21, carouselLayoutManager));
                    break;
                }
            case 1:
                C0851NW c0851nw = (C0851NW) this.f43970b;
                O90.m5968f(c0851nw, "this$0");
                c0851nw.m5751b();
                break;
            case 2:
                C10237mD0 c10237mD0 = (C10237mD0) this.f43970b;
                c10237mD0.getClass();
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    c10237mD0.m22704a();
                    DV1.m1716a();
                    c10237mD0.getViewPort();
                    break;
                }
                break;
            case 3:
                C10891rK0 c10891rK0 = (C10891rK0) this.f43970b;
                PictureInPictureParams.Builder builder = c10891rK0.f41596y;
                C4053fR c4053fR = c10891rK0.f41570g;
                S91 s91 = c10891rK0.f41589u1;
                O90.m5968f(s91, "context");
                O90.m5968f(c4053fR, "playerView");
                if (builder != null && Build.VERSION.SDK_INT >= 26) {
                    Rect rect = new Rect();
                    View surfaceView = c4053fR.getSurfaceView();
                    if (surfaceView != null) {
                        surfaceView.getGlobalVisibleRect(rect);
                    }
                    int[] iArr = new int[2];
                    View surfaceView2 = c4053fR.getSurfaceView();
                    if (surfaceView2 != null) {
                        surfaceView2.getLocationOnScreen(iArr);
                    }
                    int i9 = rect.bottom - rect.top;
                    int i10 = iArr[1];
                    rect.top = i10;
                    rect.bottom = i10 + i9;
                    builder.setSourceRectHint(rect);
                    PictureInPictureParams pictureInPictureParamsBuild = builder.build();
                    O90.m5967e(pictureInPictureParamsBuild, "build(...)");
                    AbstractC10638pL1.m23744d(s91, pictureInPictureParamsBuild);
                    break;
                }
                break;
            default:
                C11338up1 c11338up1 = (C11338up1) this.f43970b;
                O90.m5968f(c11338up1, "this$0");
                c11338up1.m25249l();
                break;
        }
    }
}
