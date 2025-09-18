package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC9289ep0;
import p000.AbstractC9417fp0;
import p000.C7856Kl0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C7856Kl0(4);

    /* renamed from: a */
    public final String f15698a;

    /* renamed from: b */
    public final CharSequence f15699b;

    /* renamed from: c */
    public final CharSequence f15700c;

    /* renamed from: d */
    public final CharSequence f15701d;

    /* renamed from: e */
    public final Bitmap f15702e;

    /* renamed from: f */
    public final Uri f15703f;

    /* renamed from: g */
    public final Bundle f15704g;

    /* renamed from: h */
    public final Uri f15705h;

    /* renamed from: i */
    public MediaDescription f15706i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f15698a = str;
        this.f15699b = charSequence;
        this.f15700c = charSequence2;
        this.f15701d = charSequence3;
        this.f15702e = bitmap;
        this.f15703f = uri;
        this.f15704g = bundle;
        this.f15705h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f15699b) + ", " + ((Object) this.f15700c) + ", " + ((Object) this.f15701d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionM18035a = this.f15706i;
        if (mediaDescriptionM18035a == null) {
            MediaDescription.Builder builderM18036b = AbstractC9289ep0.m18036b();
            AbstractC9289ep0.m18048n(builderM18036b, this.f15698a);
            AbstractC9289ep0.m18050p(builderM18036b, this.f15699b);
            AbstractC9289ep0.m18049o(builderM18036b, this.f15700c);
            AbstractC9289ep0.m18044j(builderM18036b, this.f15701d);
            AbstractC9289ep0.m18046l(builderM18036b, this.f15702e);
            AbstractC9289ep0.m18047m(builderM18036b, this.f15703f);
            AbstractC9289ep0.m18045k(builderM18036b, this.f15704g);
            AbstractC9417fp0.m18299b(builderM18036b, this.f15705h);
            mediaDescriptionM18035a = AbstractC9289ep0.m18035a(builderM18036b);
            this.f15706i = mediaDescriptionM18035a;
        }
        mediaDescriptionM18035a.writeToParcel(parcel, i);
    }
}
