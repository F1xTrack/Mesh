package p000;

import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.image.ImageLoaderModule;

/* loaded from: classes.dex */
public final class S60 extends AbstractC1489Xf {

    /* renamed from: a */
    public final /* synthetic */ ImageLoaderModule f10582a;

    /* renamed from: b */
    public final /* synthetic */ int f10583b;

    /* renamed from: c */
    public final /* synthetic */ Promise f10584c;

    public S60(ImageLoaderModule imageLoaderModule, int i, Promise promise) {
        this.f10582a = imageLoaderModule;
        this.f10583b = i;
        this.f10584c = promise;
    }

    @Override // p000.AbstractC1489Xf
    public final void onFailureImpl(InterfaceC1523YC interfaceC1523YC) {
        O90.m5968f(interfaceC1523YC, "dataSource");
        try {
            this.f10582a.removeRequest(this.f10583b);
            this.f10584c.reject("E_PREFETCH_FAILURE", ((AbstractC0504I) interfaceC1523YC).m3664c());
        } finally {
            interfaceC1523YC.close();
        }
    }

    @Override // p000.AbstractC1489Xf
    public final void onNewResultImpl(InterfaceC1523YC interfaceC1523YC) {
        Promise promise = this.f10584c;
        O90.m5968f(interfaceC1523YC, "dataSource");
        try {
            if (((AbstractC0504I) interfaceC1523YC).m3668g()) {
                try {
                    this.f10582a.removeRequest(this.f10583b);
                    promise.resolve(Boolean.TRUE);
                } catch (Exception e) {
                    promise.reject("E_PREFETCH_FAILURE", e);
                }
            }
        } finally {
            interfaceC1523YC.close();
        }
    }
}
