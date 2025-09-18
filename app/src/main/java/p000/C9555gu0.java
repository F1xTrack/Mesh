package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: gu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9555gu0 extends AbstractC9811iu0 {

    /* renamed from: b */
    public final /* synthetic */ int f28078b;

    /* renamed from: c */
    public final /* synthetic */ int f28079c;

    /* renamed from: d */
    public final /* synthetic */ ReadableMap f28080d;

    public /* synthetic */ C9555gu0(int i, int i2, ReadableMap readableMap) {
        this.f28078b = i2;
        this.f28079c = i;
        this.f28080d = readableMap;
    }

    @Override // p000.AbstractC9811iu0
    /* renamed from: a */
    public final void mo9180a(C1881a c1881a) {
        switch (this.f28078b) {
            case 0:
                c1881a.m10927d(this.f28079c, this.f28080d);
                break;
            default:
                c1881a.m10944u(this.f28079c, this.f28080d);
                break;
        }
    }
}
