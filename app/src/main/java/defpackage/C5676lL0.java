package defpackage;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.facebook.react.bridge.Callback;

/* renamed from: lL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5676lL0 implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ Callback a;

    public C5676lL0(Callback callback) {
        this.a = callback;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        this.a.invoke(null, Boolean.TRUE);
    }
}
