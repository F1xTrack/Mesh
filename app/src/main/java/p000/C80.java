package p000;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class C80 implements D80 {

    /* renamed from: a */
    public final InputContentInfo f1224a;

    public C80(Object obj) {
        this.f1224a = (InputContentInfo) obj;
    }

    @Override // p000.D80
    /* renamed from: e */
    public final Uri mo993e() {
        return this.f1224a.getContentUri();
    }

    @Override // p000.D80
    public final ClipDescription getDescription() {
        return this.f1224a.getDescription();
    }

    @Override // p000.D80
    /* renamed from: h */
    public final void mo994h() {
        this.f1224a.requestPermission();
    }

    @Override // p000.D80
    /* renamed from: i */
    public final Uri mo995i() {
        return this.f1224a.getLinkUri();
    }

    @Override // p000.D80
    /* renamed from: r */
    public final Object mo996r() {
        return this.f1224a;
    }

    public C80(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1224a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
