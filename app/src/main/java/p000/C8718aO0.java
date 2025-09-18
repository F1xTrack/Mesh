package p000;

import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;

/* renamed from: aO0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C8718aO0 {

    /* renamed from: a */
    public final /* synthetic */ C0093BT f15486a;

    public /* synthetic */ C8718aO0(C0093BT c0093bt) {
        this.f15486a = c0093bt;
    }

    /* renamed from: a */
    public final MediaMuxer m9727a(int i, WN0 wn0) {
        Uri uri = Uri.EMPTY;
        C0093BT c0093bt = this.f15486a;
        if (!(c0093bt instanceof C0093BT)) {
            throw new AssertionError("Invalid output options type: ".concat(c0093bt.getClass().getSimpleName()));
        }
        File file = c0093bt.f829b.f5048d;
        File parentFile = file.getParentFile();
        if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
            file.getAbsolutePath();
            AbstractC7806Jm0.m4412f("Recorder");
        }
        MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
        ((C9491gO0) wn0.f13156b).f27728J = Uri.fromFile(file);
        return mediaMuxer;
    }
}
