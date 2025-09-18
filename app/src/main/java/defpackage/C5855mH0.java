package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;

/* renamed from: mH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5855mH0 extends AbstractC3551eH0 {
    public final /* synthetic */ Activity o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5855mH0(C4315iH0 c4315iH0, Activity activity, int i) {
        super(c4315iH0);
        this.o = activity;
        this.p = i;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        if (this.b == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.a.getThemedReactContext().a.getCurrentActivity().findViewById(R.id.content);
        View rootView = viewGroup.getRootView();
        C4315iH0 c4315iH0 = this.a;
        if (rootView != c4315iH0.getRootView()) {
            c4315iH0.getRootView().setVisibility(0);
        } else {
            c4315iH0.setVisibility(0);
        }
        Activity activity = this.o;
        activity.getWindow().clearFlags(512);
        viewGroup.removeView(this.b);
        this.c.onCustomViewHidden();
        this.b = null;
        this.c = null;
        activity.setRequestedOrientation(this.p);
        c4315iH0.getThemedReactContext().removeLifecycleEventListener(this);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        O90.f(view, "view");
        O90.f(customViewCallback, "callback");
        if (this.b != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        this.b = view;
        this.c = customViewCallback;
        Activity activity = this.o;
        activity.setRequestedOrientation(-1);
        this.b.setSystemUiVisibility(7942);
        activity.getWindow().setFlags(512, 512);
        this.b.setBackgroundColor(-16777216);
        ViewGroup viewGroup = (ViewGroup) this.a.getThemedReactContext().a.getCurrentActivity().findViewById(R.id.content);
        viewGroup.addView(this.b, AbstractC3551eH0.n);
        View rootView = viewGroup.getRootView();
        C4315iH0 c4315iH0 = this.a;
        if (rootView != c4315iH0.getRootView()) {
            c4315iH0.getRootView().setVisibility(8);
        } else {
            c4315iH0.setVisibility(8);
        }
        c4315iH0.getThemedReactContext().addLifecycleEventListener(this);
    }
}
