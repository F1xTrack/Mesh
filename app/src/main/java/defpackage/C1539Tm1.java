package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: Tm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539Tm1 extends LruCache {
    public final /* synthetic */ C1617Um1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539Tm1(C1617Um1 c1617Um1, int i) {
        super(i);
        this.a = c1617Um1;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            ((InterfaceC5935mi) this.a.c.a).i(bitmap);
        }
    }
}
