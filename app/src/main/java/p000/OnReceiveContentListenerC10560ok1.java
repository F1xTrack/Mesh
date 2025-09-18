package p000;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: ok1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC10560ok1 implements OnReceiveContentListener {

    /* renamed from: a */
    public final InterfaceC8660Zx0 f39210a;

    public OnReceiveContentListenerC10560ok1(InterfaceC8660Zx0 interfaceC8660Zx0) {
        this.f39210a = interfaceC8660Zx0;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0061Ay c0061Ay = new C0061Ay(new C7391Bm1(contentInfo));
        C0061Ay c0061AyM5279a = ((M91) this.f39210a).m5279a(view, c0061Ay);
        if (c0061AyM5279a == null) {
            return null;
        }
        if (c0061AyM5279a == c0061Ay) {
            return contentInfo;
        }
        ContentInfo contentInfoMo866j = c0061AyM5279a.f492a.mo866j();
        Objects.requireNonNull(contentInfoMo866j);
        return AbstractC1205T9.m7595n(contentInfoMo866j);
    }
}
