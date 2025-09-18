package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class C80 implements D80 {
    public final InputContentInfo a;

    public C80(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // defpackage.D80
    public final Uri e() {
        return this.a.getContentUri();
    }

    @Override // defpackage.D80
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override // defpackage.D80
    public final void h() {
        this.a.requestPermission();
    }

    @Override // defpackage.D80
    public final Uri i() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.D80
    public final Object r() {
        return this.a;
    }

    public C80(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
