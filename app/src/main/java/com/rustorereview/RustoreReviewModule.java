package com.rustorereview;

import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import p000.AbstractC0336FK;
import p000.AbstractC10780qS1;
import p000.AbstractC11873z12;
import p000.C10115lG0;
import p000.C10911rU0;
import p000.C8165Qj1;
import p000.C8313Tf1;
import p000.C9059d11;
import p000.C9375fU0;
import p000.C9699i11;
import p000.C9944jw1;
import p000.H30;
import p000.KL0;
import p000.O90;
import p000.Q81;
import ru.rustore.sdk.review.model.ReviewInfo;

@Metadata(m22266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m22267d2 = {"Lcom/rustorereview/RustoreReviewModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "LTf1;", "init", "()V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "requestReviewFlow", "(Lcom/facebook/react/bridge/Promise;)V", "launchReviewFlow", "", "isInitCalled", "Z", "Lru/rustore/sdk/review/model/ReviewInfo;", "reviewInfo", "Lru/rustore/sdk/review/model/ReviewInfo;", "Companion", "rU0", "react-native-rustore-review_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RustoreReviewModule extends ReactContextBaseJavaModule {
    public static final C10911rU0 Companion = new C10911rU0();
    public static C9375fU0 reviewManager;
    private boolean isInitCalled;
    private ReviewInfo reviewInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RustoreReviewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
    }

    public static final void launchReviewFlow$lambda$2(Promise promise, C8313Tf1 c8313Tf1) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(c8313Tf1, "it");
        promise.resolve(Boolean.TRUE);
    }

    public static final void launchReviewFlow$lambda$3(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th.getClass().getSimpleName(), th.getMessage());
    }

    public static final void requestReviewFlow$lambda$0(RustoreReviewModule rustoreReviewModule, Promise promise, ReviewInfo reviewInfo) {
        O90.m5968f(rustoreReviewModule, "this$0");
        O90.m5968f(promise, "$promise");
        O90.m5968f(reviewInfo, "reviewInfo");
        rustoreReviewModule.reviewInfo = reviewInfo;
        promise.resolve(Boolean.TRUE);
    }

    public static final void requestReviewFlow$lambda$1(Promise promise, Throwable th) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(th, "throwable");
        promise.reject(th.getClass().getSimpleName(), th.getMessage());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RustoreReview";
    }

    @ReactMethod
    public final void init() {
        if (this.isInitCalled) {
            return;
        }
        C10911rU0 c10911rU0 = Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        Context applicationContext = reactApplicationContext.getApplicationContext();
        O90.m5967e(applicationContext, "context.applicationContext");
        C9375fU0 c9375fU0 = new C9375fU0(applicationContext, null);
        c10911rU0.getClass();
        reviewManager = c9375fU0;
        this.isInitCalled = true;
    }

    @ReactMethod
    public final void launchReviewFlow(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ReviewInfo reviewInfo = this.reviewInfo;
        if (reviewInfo == null) {
            promise.reject("RuStoreException", "false");
            return;
        }
        Companion.getClass();
        C9375fU0 c9375fU0 = reviewManager;
        if (c9375fU0 == null) {
            O90.m5977o("reviewManager");
            throw null;
        }
        C8165Qj1 c8165Qj1 = c9375fU0.f27217a;
        c8165Qj1.getClass();
        Q81 q81M26304a = AbstractC11873z12.m26304a(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new C9944jw1(c8165Qj1, reviewInfo, 0)), new C9944jw1(c8165Qj1, reviewInfo, 2), 1), AbstractC0336FK.m2578a()));
        q81M26304a.m6585b(new KL0(19, promise), null);
        q81M26304a.m6585b(null, new KL0(20, promise));
    }

    @ReactMethod
    public final void requestReviewFlow(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Companion.getClass();
        C9375fU0 c9375fU0 = reviewManager;
        if (c9375fU0 == null) {
            O90.m5977o("reviewManager");
            throw null;
        }
        C8165Qj1 c8165Qj1 = c9375fU0.f27217a;
        c8165Qj1.getClass();
        Q81 q81M26304a = AbstractC11873z12.m26304a(AbstractC10780qS1.m24004c(new C9059d11(new C10115lG0(24, c8165Qj1)), AbstractC0336FK.m2578a()));
        q81M26304a.m6585b(new H30(this, 9, promise), null);
        q81M26304a.m6585b(null, new KL0(21, promise));
    }
}
