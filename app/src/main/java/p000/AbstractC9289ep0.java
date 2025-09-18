package p000;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: ep0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9289ep0 {
    /* renamed from: a */
    public static MediaDescription m18035a(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* renamed from: b */
    public static MediaDescription.Builder m18036b() {
        return new MediaDescription.Builder();
    }

    /* renamed from: c */
    public static CharSequence m18037c(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* renamed from: d */
    public static Bundle m18038d(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* renamed from: e */
    public static Bitmap m18039e(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m18040f(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* renamed from: g */
    public static String m18041g(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* renamed from: h */
    public static CharSequence m18042h(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* renamed from: i */
    public static CharSequence m18043i(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* renamed from: j */
    public static void m18044j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* renamed from: k */
    public static void m18045k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: l */
    public static void m18046l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* renamed from: m */
    public static void m18047m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* renamed from: n */
    public static void m18048n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* renamed from: o */
    public static void m18049o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* renamed from: p */
    public static void m18050p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
