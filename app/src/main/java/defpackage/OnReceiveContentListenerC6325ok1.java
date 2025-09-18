package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: ok1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC6325ok1 implements OnReceiveContentListener {
    public final InterfaceC2039Zx0 a;

    public OnReceiveContentListenerC6325ok1(InterfaceC2039Zx0 interfaceC2039Zx0) {
        this.a = interfaceC2039Zx0;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0092Ay c0092Ay = new C0092Ay(new C0136Bm1(contentInfo));
        C0092Ay c0092AyA = ((M91) this.a).a(view, c0092Ay);
        if (c0092AyA == null) {
            return null;
        }
        if (c0092AyA == c0092Ay) {
            return contentInfo;
        }
        ContentInfo contentInfoJ = c0092AyA.a.j();
        Objects.requireNonNull(contentInfoJ);
        return T9.n(contentInfoJ);
    }
}
