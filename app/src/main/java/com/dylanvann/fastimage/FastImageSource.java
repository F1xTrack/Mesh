package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.varioqub.config.model.ConfigValue;
import p000.C11121t70;
import p000.E10;
import p000.L20;

/* loaded from: classes.dex */
public class FastImageSource {
    private static final String ANDROID_CONTENT_SCHEME = "content";
    private static final String ANDROID_RESOURCE_SCHEME = "android.resource";
    private static final String DATA_SCHEME = "data";
    private static final String LOCAL_FILE_SCHEME = "file";
    private static final String LOCAL_RESOURCE_SCHEME = "res";
    private final L20 mHeaders;
    private String mSource;
    private Uri mUri;

    public FastImageSource(Context context, String str) {
        this(context, str, null);
    }

    public static boolean isBase64Uri(Uri uri) {
        return "data".equals(uri.getScheme());
    }

    public static boolean isContentUri(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    public static boolean isLocalFileUri(Uri uri) {
        return LOCAL_FILE_SCHEME.equals(uri.getScheme());
    }

    public static boolean isLocalResourceUri(Uri uri) {
        return LOCAL_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public static boolean isResourceUri(Uri uri) {
        return ANDROID_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public E10 getGlideUrl() {
        return new E10(getUri().toString(), getHeaders());
    }

    public L20 getHeaders() {
        return this.mHeaders;
    }

    public String getSource() {
        return this.mSource;
    }

    public Object getSourceForLoad() {
        return (isContentUri() || isBase64Resource()) ? getSource() : (isResource() || isLocalFile()) ? getUri() : getGlideUrl();
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isBase64Resource() {
        Uri uri = this.mUri;
        return uri != null && isBase64Uri(uri);
    }

    public boolean isLocalFile() {
        Uri uri = this.mUri;
        return uri != null && isLocalFileUri(uri);
    }

    public boolean isResource() {
        Uri uri = this.mUri;
        return uri != null && isResourceUri(uri);
    }

    public FastImageSource(Context context, String str, L20 l20) {
        this(context, str, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, l20);
    }

    public boolean isContentUri() {
        Uri uri = this.mUri;
        return uri != null && isContentUri(uri);
    }

    public FastImageSource(Context context, String str, double d, double d2, L20 l20) {
        C11121t70 c11121t70 = new C11121t70(context, str, d, d2);
        this.mSource = str;
        this.mHeaders = l20 == null ? L20.f6471a : l20;
        this.mUri = c11121t70.f42840b;
        if (isResource() && TextUtils.isEmpty(this.mUri.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getSource() + "'.");
        }
        if (isLocalResourceUri(this.mUri)) {
            this.mUri = Uri.parse(this.mUri.toString().replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
    }
}
