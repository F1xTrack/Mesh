package defpackage;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: fp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3844fp0 {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
