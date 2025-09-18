package defpackage;

import android.util.Size;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7483up extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Callback f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7483up(int i, Callback callback) {
        super(1);
        this.e = i;
        this.f = callback;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        Callback callback = this.f;
        switch (this.e) {
            case 0:
                C0904Li1 c0904Li1 = (C0904Li1) obj;
                O90.f(c0904Li1, "video");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("path", c0904Li1.a);
                writableMapCreateMap.putDouble("duration", c0904Li1.b / 1000.0d);
                Size size = c0904Li1.c;
                writableMapCreateMap.putInt(Snapshot.WIDTH, size.getWidth());
                writableMapCreateMap.putInt(Snapshot.HEIGHT, size.getHeight());
                callback.invoke(writableMapCreateMap, null);
                break;
            default:
                AbstractC5762lo abstractC5762lo = (AbstractC5762lo) obj;
                O90.f(abstractC5762lo, "error");
                callback.invoke(null, AbstractC7601vQ1.e(12, abstractC5762lo.a + "/" + abstractC5762lo.b, abstractC5762lo.c, null));
                break;
        }
        return c1518Tf1;
    }
}
