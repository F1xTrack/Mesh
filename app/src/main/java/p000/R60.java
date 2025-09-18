package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes.dex */
public final class R60 extends AbstractC1489Xf {

    /* renamed from: a */
    public final /* synthetic */ int f10000a;

    /* renamed from: b */
    public final /* synthetic */ Promise f10001b;

    public /* synthetic */ R60(int i, Promise promise) {
        this.f10000a = i;
        this.f10001b = promise;
    }

    @Override // p000.AbstractC1489Xf
    public final void onFailureImpl(InterfaceC1523YC interfaceC1523YC) {
        switch (this.f10000a) {
            case 0:
                O90.m5968f(interfaceC1523YC, "dataSource");
                this.f10001b.reject("E_GET_SIZE_FAILURE", ((AbstractC0504I) interfaceC1523YC).m3664c());
                break;
            default:
                O90.m5968f(interfaceC1523YC, "dataSource");
                this.f10001b.reject("E_GET_SIZE_FAILURE", ((AbstractC0504I) interfaceC1523YC).m3664c());
                break;
        }
    }

    @Override // p000.AbstractC1489Xf
    public final void onNewResultImpl(InterfaceC1523YC interfaceC1523YC) {
        AbstractC7292zt abstractC7292zt;
        switch (this.f10000a) {
            case 0:
                O90.m5968f(interfaceC1523YC, "dataSource");
                if (((AbstractC0504I) interfaceC1523YC).m3668g()) {
                    abstractC7292zt = (AbstractC7292zt) interfaceC1523YC.getResult();
                    Promise promise = this.f10001b;
                    try {
                        if (abstractC7292zt == null) {
                            promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                            return;
                        }
                        try {
                            InterfaceC7103wt interfaceC7103wt = (InterfaceC7103wt) abstractC7292zt.m26572w();
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            O90.m5967e(writableMapCreateMap, "createMap(...)");
                            C1336VE c1336ve = (C1336VE) interfaceC7103wt;
                            writableMapCreateMap.putInt(Snapshot.WIDTH, c1336ve.getWidth());
                            writableMapCreateMap.putInt(Snapshot.HEIGHT, c1336ve.getHeight());
                            promise.resolve(writableMapCreateMap);
                        } catch (Exception e) {
                            promise.reject("E_GET_SIZE_FAILURE", e);
                        }
                        return;
                    } finally {
                    }
                }
                return;
            default:
                O90.m5968f(interfaceC1523YC, "dataSource");
                if (((AbstractC0504I) interfaceC1523YC).m3668g()) {
                    abstractC7292zt = (AbstractC7292zt) interfaceC1523YC.getResult();
                    Promise promise2 = this.f10001b;
                    if (abstractC7292zt == null) {
                        promise2.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                        return;
                    }
                    try {
                        try {
                            InterfaceC7103wt interfaceC7103wt2 = (InterfaceC7103wt) abstractC7292zt.m26572w();
                            WritableMap writableMapCreateMap2 = Arguments.createMap();
                            O90.m5967e(writableMapCreateMap2, "createMap(...)");
                            C1336VE c1336ve2 = (C1336VE) interfaceC7103wt2;
                            writableMapCreateMap2.putInt(Snapshot.WIDTH, c1336ve2.getWidth());
                            writableMapCreateMap2.putInt(Snapshot.HEIGHT, c1336ve2.getHeight());
                            promise2.resolve(writableMapCreateMap2);
                        } catch (Exception e2) {
                            promise2.reject("E_GET_SIZE_FAILURE", e2);
                        }
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
