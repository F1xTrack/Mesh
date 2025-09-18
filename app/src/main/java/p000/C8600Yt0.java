package p000;

import android.util.SparseArray;
import com.facebook.react.animated.C1881a;

/* renamed from: Yt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8600Yt0 extends AbstractC9811iu0 {

    /* renamed from: b */
    public final /* synthetic */ int f14578b;

    /* renamed from: c */
    public final /* synthetic */ int f14579c;

    public /* synthetic */ C8600Yt0(int i, int i2) {
        this.f14578b = i2;
        this.f14579c = i;
    }

    @Override // p000.AbstractC9811iu0
    /* renamed from: a */
    public final void mo9180a(C1881a c1881a) {
        switch (this.f14578b) {
            case 0:
                c1881a.m10931h(this.f14579c);
                break;
            case 1:
                c1881a.m10930g(this.f14579c);
                break;
            case 2:
                c1881a.m10941r(this.f14579c);
                break;
            case 3:
                c1881a.m10936m(this.f14579c);
                break;
            case 4:
                c1881a.m10943t(this.f14579c);
                break;
            default:
                SparseArray sparseArray = c1881a.f17879a;
                int i = this.f14579c;
                sparseArray.remove(i);
                c1881a.f17881c.remove(i);
                break;
        }
    }
}
