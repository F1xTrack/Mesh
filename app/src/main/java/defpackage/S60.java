package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.image.ImageLoaderModule;

/* loaded from: classes.dex */
public final class S60 extends AbstractC1828Xf {
    public final /* synthetic */ ImageLoaderModule a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Promise c;

    public S60(ImageLoaderModule imageLoaderModule, int i, Promise promise) {
        this.a = imageLoaderModule;
        this.b = i;
        this.c = promise;
    }

    @Override // defpackage.AbstractC1828Xf
    public final void onFailureImpl(YC yc) {
        O90.f(yc, "dataSource");
        try {
            this.a.removeRequest(this.b);
            this.c.reject("E_PREFETCH_FAILURE", ((I) yc).c());
        } finally {
            yc.close();
        }
    }

    @Override // defpackage.AbstractC1828Xf
    public final void onNewResultImpl(YC yc) {
        Promise promise = this.c;
        O90.f(yc, "dataSource");
        try {
            if (((I) yc).g()) {
                try {
                    this.a.removeRequest(this.b);
                    promise.resolve(Boolean.TRUE);
                } catch (Exception e) {
                    promise.reject("E_PREFETCH_FAILURE", e);
                }
            }
        } finally {
            yc.close();
        }
    }
}
