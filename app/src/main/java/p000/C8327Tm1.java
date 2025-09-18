package p000;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: Tm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8327Tm1 extends LruCache {

    /* renamed from: a */
    public final /* synthetic */ C8379Um1 f11514a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8327Tm1(C8379Um1 c8379Um1, int i) {
        super(i);
        this.f11514a = c8379Um1;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            ((InterfaceC6443mi) this.f11514a.f12032c.f7362a).mo319i(bitmap);
        }
    }
}
