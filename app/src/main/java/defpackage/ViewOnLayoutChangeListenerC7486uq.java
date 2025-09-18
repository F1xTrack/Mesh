package defpackage;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: uq */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC7486uq implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnLayoutChangeListenerC7486uq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.b;
                carouselLayoutManager.getClass();
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new G4(21, carouselLayoutManager));
                    break;
                }
            case 1:
                NW nw = (NW) this.b;
                O90.f(nw, "this$0");
                nw.b();
                break;
            case 2:
                C5843mD0 c5843mD0 = (C5843mD0) this.b;
                c5843mD0.getClass();
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    c5843mD0.a();
                    DV1.a();
                    c5843mD0.getViewPort();
                    break;
                }
                break;
            case 3:
                C6818rK0 c6818rK0 = (C6818rK0) this.b;
                PictureInPictureParams.Builder builder = c6818rK0.y;
                C3771fR c3771fR = c6818rK0.g;
                S91 s91 = c6818rK0.u1;
                O90.f(s91, "context");
                O90.f(c3771fR, "playerView");
                if (builder != null && Build.VERSION.SDK_INT >= 26) {
                    Rect rect = new Rect();
                    View surfaceView = c3771fR.getSurfaceView();
                    if (surfaceView != null) {
                        surfaceView.getGlobalVisibleRect(rect);
                    }
                    int[] iArr = new int[2];
                    View surfaceView2 = c3771fR.getSurfaceView();
                    if (surfaceView2 != null) {
                        surfaceView2.getLocationOnScreen(iArr);
                    }
                    int i9 = rect.bottom - rect.top;
                    int i10 = iArr[1];
                    rect.top = i10;
                    rect.bottom = i10 + i9;
                    builder.setSourceRectHint(rect);
                    PictureInPictureParams pictureInPictureParamsBuild = builder.build();
                    O90.e(pictureInPictureParamsBuild, "build(...)");
                    AbstractC6441pL1.d(s91, pictureInPictureParamsBuild);
                    break;
                }
                break;
            default:
                C7485up1 c7485up1 = (C7485up1) this.b;
                O90.f(c7485up1, "this$0");
                c7485up1.l();
                break;
        }
    }
}
