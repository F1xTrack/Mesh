package p000;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: fp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9417fp0 {
    /* renamed from: a */
    public static Uri m18298a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* renamed from: b */
    public static void m18299b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
