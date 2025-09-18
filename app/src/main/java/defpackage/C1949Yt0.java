package defpackage;

import android.util.SparseArray;
import com.facebook.react.animated.a;

/* renamed from: Yt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1949Yt0 extends AbstractC5208iu0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ C1949Yt0(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // defpackage.AbstractC5208iu0
    public final void a(a aVar) {
        switch (this.b) {
            case 0:
                aVar.h(this.c);
                break;
            case 1:
                aVar.g(this.c);
                break;
            case 2:
                aVar.r(this.c);
                break;
            case 3:
                aVar.m(this.c);
                break;
            case 4:
                aVar.t(this.c);
                break;
            default:
                SparseArray sparseArray = aVar.a;
                int i = this.c;
                sparseArray.remove(i);
                aVar.c.remove(i);
                break;
        }
    }
}
