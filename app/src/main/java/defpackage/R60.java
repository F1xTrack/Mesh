package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes.dex */
public final class R60 extends AbstractC1828Xf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;

    public /* synthetic */ R60(int i, Promise promise) {
        this.a = i;
        this.b = promise;
    }

    @Override // defpackage.AbstractC1828Xf
    public final void onFailureImpl(YC yc) {
        switch (this.a) {
            case 0:
                O90.f(yc, "dataSource");
                this.b.reject("E_GET_SIZE_FAILURE", ((I) yc).c());
                break;
            default:
                O90.f(yc, "dataSource");
                this.b.reject("E_GET_SIZE_FAILURE", ((I) yc).c());
                break;
        }
    }

    @Override // defpackage.AbstractC1828Xf
    public final void onNewResultImpl(YC yc) {
        AbstractC8446zt abstractC8446zt;
        switch (this.a) {
            case 0:
                O90.f(yc, "dataSource");
                if (((I) yc).g()) {
                    abstractC8446zt = (AbstractC8446zt) yc.getResult();
                    Promise promise = this.b;
                    try {
                        if (abstractC8446zt == null) {
                            promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                            return;
                        }
                        try {
                            InterfaceC7876wt interfaceC7876wt = (InterfaceC7876wt) abstractC8446zt.w();
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            O90.e(writableMapCreateMap, "createMap(...)");
                            VE ve = (VE) interfaceC7876wt;
                            writableMapCreateMap.putInt(Snapshot.WIDTH, ve.getWidth());
                            writableMapCreateMap.putInt(Snapshot.HEIGHT, ve.getHeight());
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
                O90.f(yc, "dataSource");
                if (((I) yc).g()) {
                    abstractC8446zt = (AbstractC8446zt) yc.getResult();
                    Promise promise2 = this.b;
                    if (abstractC8446zt == null) {
                        promise2.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                        return;
                    }
                    try {
                        try {
                            InterfaceC7876wt interfaceC7876wt2 = (InterfaceC7876wt) abstractC8446zt.w();
                            WritableMap writableMapCreateMap2 = Arguments.createMap();
                            O90.e(writableMapCreateMap2, "createMap(...)");
                            VE ve2 = (VE) interfaceC7876wt2;
                            writableMapCreateMap2.putInt(Snapshot.WIDTH, ve2.getWidth());
                            writableMapCreateMap2.putInt(Snapshot.HEIGHT, ve2.getHeight());
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
