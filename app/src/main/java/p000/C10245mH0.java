package p000;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;

/* renamed from: mH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10245mH0 extends AbstractC9221eH0 {

    /* renamed from: o */
    public final /* synthetic */ Activity f37614o;

    /* renamed from: p */
    public final /* synthetic */ int f37615p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10245mH0(C9733iH0 c9733iH0, Activity activity, int i) {
        super(c9733iH0);
        this.f37614o = activity;
        this.f37615p = i;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        if (this.f26637b == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f26636a.getThemedReactContext().f10602a.getCurrentActivity().findViewById(R.id.content);
        View rootView = viewGroup.getRootView();
        C9733iH0 c9733iH0 = this.f26636a;
        if (rootView != c9733iH0.getRootView()) {
            c9733iH0.getRootView().setVisibility(0);
        } else {
            c9733iH0.setVisibility(0);
        }
        Activity activity = this.f37614o;
        activity.getWindow().clearFlags(512);
        viewGroup.removeView(this.f26637b);
        this.f26638c.onCustomViewHidden();
        this.f26637b = null;
        this.f26638c = null;
        activity.setRequestedOrientation(this.f37615p);
        c9733iH0.getThemedReactContext().removeLifecycleEventListener(this);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        O90.m5968f(view, "view");
        O90.m5968f(customViewCallback, "callback");
        if (this.f26637b != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        this.f26637b = view;
        this.f26638c = customViewCallback;
        Activity activity = this.f37614o;
        activity.setRequestedOrientation(-1);
        this.f26637b.setSystemUiVisibility(7942);
        activity.getWindow().setFlags(512, 512);
        this.f26637b.setBackgroundColor(-16777216);
        ViewGroup viewGroup = (ViewGroup) this.f26636a.getThemedReactContext().f10602a.getCurrentActivity().findViewById(R.id.content);
        viewGroup.addView(this.f26637b, AbstractC9221eH0.f26635n);
        View rootView = viewGroup.getRootView();
        C9733iH0 c9733iH0 = this.f26636a;
        if (rootView != c9733iH0.getRootView()) {
            c9733iH0.getRootView().setVisibility(8);
        } else {
            c9733iH0.setVisibility(8);
        }
        c9733iH0.getThemedReactContext().addLifecycleEventListener(this);
    }
}
