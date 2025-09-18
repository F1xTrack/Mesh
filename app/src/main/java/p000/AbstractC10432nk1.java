package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* renamed from: nk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10432nk1 {
    /* renamed from: a */
    public static String[] m23212a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: b */
    public static C0061Ay m23213b(View view, C0061Ay c0061Ay) {
        ContentInfo contentInfoMo866j = c0061Ay.f492a.mo866j();
        Objects.requireNonNull(contentInfoMo866j);
        ContentInfo contentInfoM7595n = AbstractC1205T9.m7595n(contentInfoMo866j);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM7595n);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM7595n ? c0061Ay : new C0061Ay(new C7391Bm1(contentInfoPerformReceiveContent));
    }

    /* renamed from: c */
    public static void m23214c(View view, String[] strArr, InterfaceC8660Zx0 interfaceC8660Zx0) {
        if (interfaceC8660Zx0 == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC10560ok1(interfaceC8660Zx0));
        }
    }
}
