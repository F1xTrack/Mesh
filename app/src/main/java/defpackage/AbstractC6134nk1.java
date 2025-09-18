package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* renamed from: nk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6134nk1 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0092Ay b(View view, C0092Ay c0092Ay) {
        ContentInfo contentInfoJ = c0092Ay.a.j();
        Objects.requireNonNull(contentInfoJ);
        ContentInfo contentInfoN = T9.n(contentInfoJ);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoN);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoN ? c0092Ay : new C0092Ay(new C0136Bm1(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC2039Zx0 interfaceC2039Zx0) {
        if (interfaceC2039Zx0 == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC6325ok1(interfaceC2039Zx0));
        }
    }
}
