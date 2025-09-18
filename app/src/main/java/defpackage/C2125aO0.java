package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;

/* renamed from: aO0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2125aO0 {
    public final /* synthetic */ BT a;

    public /* synthetic */ C2125aO0(BT bt) {
        this.a = bt;
    }

    public final MediaMuxer a(int i, WN0 wn0) {
        Uri uri = Uri.EMPTY;
        BT bt = this.a;
        if (!(bt instanceof BT)) {
            throw new AssertionError("Invalid output options type: ".concat(bt.getClass().getSimpleName()));
        }
        File file = bt.b.d;
        File parentFile = file.getParentFile();
        if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
            file.getAbsolutePath();
            AbstractC0759Jm0.f("Recorder");
        }
        MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
        ((C3954gO0) wn0.b).J = Uri.fromFile(file);
        return mediaMuxer;
    }
}
