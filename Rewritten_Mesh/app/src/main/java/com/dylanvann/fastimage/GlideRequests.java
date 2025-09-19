package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.io.File;
import java.net.URL;
import p000.AbstractC0106Bg;
import p000.C9186e10;
import p000.FR0;
import p000.InterfaceC7486Di0;
import p000.JR0;
import p000.OR0;
import p000.PR0;

/* loaded from: classes.dex */
public class GlideRequests extends JR0 {
    public GlideRequests(ComponentCallbacks2C1874a componentCallbacks2C1874a, InterfaceC7486Di0 interfaceC7486Di0, OR0 or0, Context context) {
        super(componentCallbacks2C1874a, interfaceC7486Di0, or0, context);
    }

    @Override // p000.JR0
    public void setRequestOptions(PR0 pr0) {
        if (pr0 instanceof GlideOptions) {
            super.setRequestOptions(pr0);
        } else {
            super.setRequestOptions(new GlideOptions().apply((AbstractC0106Bg) pr0));
        }
    }

    @Override // p000.JR0
    public GlideRequests addDefaultRequestListener(FR0 fr0) {
        super.addDefaultRequestListener(fr0);
        return this;
    }

    @Override // p000.JR0
    public synchronized GlideRequests applyDefaultRequestOptions(PR0 pr0) {
        super.applyDefaultRequestOptions(pr0);
        return this;
    }

    @Override // p000.JR0
    /* renamed from: as */
    public <ResourceType> GlideRequest<ResourceType> mo4325as(Class<ResourceType> cls) {
        return new GlideRequest<>(this.glide, this, cls, this.context);
    }

    @Override // p000.JR0
    public GlideRequest<Bitmap> asBitmap() {
        return (GlideRequest) super.asBitmap();
    }

    @Override // p000.JR0
    public GlideRequest<Drawable> asDrawable() {
        return (GlideRequest) mo4325as(Drawable.class);
    }

    /* renamed from: asFile, reason: merged with bridge method [inline-methods] */
    public GlideRequest<File> m26646asFile() {
        return (GlideRequest) mo4325as(File.class).apply((AbstractC0106Bg) PR0.skipMemoryCacheOf(true));
    }

    @Override // p000.JR0
    public GlideRequest<C9186e10> asGif() {
        return (GlideRequest) super.asGif();
    }

    /* renamed from: download, reason: merged with bridge method [inline-methods] */
    public GlideRequest<File> m26647download(Object obj) {
        return (GlideRequest) downloadOnly().m26632load(obj);
    }

    @Override // p000.JR0
    public GlideRequest<File> downloadOnly() {
        return (GlideRequest) super.downloadOnly();
    }

    @Override // p000.JR0
    public synchronized GlideRequests setDefaultRequestOptions(PR0 pr0) {
        super.setDefaultRequestOptions(pr0);
        return this;
    }

    @Override // p000.JR0
    /* renamed from: load, reason: merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26653load(Object obj) {
        return (GlideRequest) super.m26653load(obj);
    }

    /* renamed from: load, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26657load(Bitmap bitmap) {
        return (GlideRequest) asDrawable().m26627load(bitmap);
    }

    /* renamed from: load, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26658load(Drawable drawable) {
        return (GlideRequest) asDrawable().m26628load(drawable);
    }

    /* renamed from: load, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26662load(String str) {
        return (GlideRequest) asDrawable().m26633load(str);
    }

    /* renamed from: load, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26659load(Uri uri) {
        return (GlideRequest) asDrawable().m26629load(uri);
    }

    /* renamed from: load, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26660load(File file) {
        return (GlideRequest) asDrawable().m26630load(file);
    }

    /* renamed from: load, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26661load(Integer num) {
        return (GlideRequest) asDrawable().m26631load(num);
    }

    @Deprecated
    /* renamed from: load, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26663load(URL url) {
        return (GlideRequest) asDrawable().m26634load(url);
    }

    /* renamed from: load, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GlideRequest<Drawable> m26664load(byte[] bArr) {
        return (GlideRequest) asDrawable().m26635load(bArr);
    }
}
