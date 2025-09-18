package p000;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.facebook.react.bridge.Callback;

/* renamed from: lL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10125lL0 implements MediaScannerConnection.OnScanCompletedListener {

    /* renamed from: a */
    public final /* synthetic */ Callback f37015a;

    public C10125lL0(Callback callback) {
        this.f37015a = callback;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        this.f37015a.invoke(null, Boolean.TRUE);
    }
}
