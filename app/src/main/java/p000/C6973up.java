package p000;

import android.util.Size;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: up */
/* loaded from: classes2.dex */
public final class C6973up extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f43929e;

    /* renamed from: f */
    public final /* synthetic */ Callback f43930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6973up(int i, Callback callback) {
        super(1);
        this.f43929e = i;
        this.f43930f = callback;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        Callback callback = this.f43930f;
        switch (this.f43929e) {
            case 0:
                C7903Li1 c7903Li1 = (C7903Li1) obj;
                O90.m5968f(c7903Li1, "video");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("path", c7903Li1.f6818a);
                writableMapCreateMap.putDouble("duration", c7903Li1.f6819b / 1000.0d);
                Size size = c7903Li1.f6820c;
                writableMapCreateMap.putInt(Snapshot.WIDTH, size.getWidth());
                writableMapCreateMap.putInt(Snapshot.HEIGHT, size.getHeight());
                callback.invoke(writableMapCreateMap, null);
                break;
            default:
                AbstractC6386lo abstractC6386lo = (AbstractC6386lo) obj;
                O90.m5968f(abstractC6386lo, "error");
                callback.invoke(null, AbstractC11416vQ1.m25421e(12, abstractC6386lo.f37292a + "/" + abstractC6386lo.f37293b, abstractC6386lo.f37294c, null));
                break;
        }
        return c8313Tf1;
    }
}
