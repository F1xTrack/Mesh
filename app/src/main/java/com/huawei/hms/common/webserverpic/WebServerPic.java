package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;
import p000.AbstractC1374Vq;

/* loaded from: classes.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();

    /* renamed from: a */
    private final Uri f18983a;

    /* renamed from: b */
    private final int f18984b;

    /* renamed from: c */
    private final int f18985c;

    public WebServerPic(Uri uri, int i, int i2) throws IllegalArgumentException {
        this.f18983a = uri;
        this.f18984b = i;
        this.f18985c = i2;
        if (uri == null) {
            throw new IllegalArgumentException("url is not able to be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height should be positive or 0");
        }
    }

    public final int getHeight() {
        return this.f18985c;
    }

    public final Uri getUrl() {
        return this.f18983a;
    }

    public final int getWidth() {
        return this.f18984b;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        int i = this.f18984b;
        int i2 = this.f18985c;
        String string = this.f18983a.toString();
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Image ", "x", i, i2, " ");
        sbM8594m.append(string);
        return sbM8594m.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebServerPic(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }
}
