package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC1374Vq;

@SafeParcelable.Class(creator = "WebImageCreator")
/* loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    @SafeParcelable.VersionField(m11122id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getUrl", m11119id = 2)
    private final Uri zab;

    @SafeParcelable.Field(getter = "getWidth", m11119id = 3)
    private final int zac;

    @SafeParcelable.Field(getter = "getHeight", m11119id = 4)
    private final int zad;

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param(m11120id = 1) int i, @SafeParcelable.Param(m11120id = 2) Uri uri, @SafeParcelable.Param(m11120id = 3) int i2, @SafeParcelable.Param(m11120id = 4) int i3) {
        this.zaa = i;
        this.zab = uri;
        this.zac = i2;
        this.zad = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.equal(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zad;
    }

    public Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        return Objects.hashCode(this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad));
    }

    @KeepForSdk
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.zab.toString());
            jSONObject.put(Snapshot.WIDTH, this.zac);
            jSONObject.put(Snapshot.HEIGHT, this.zad);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        Locale locale = Locale.US;
        int i = this.zac;
        int i2 = this.zad;
        String string = this.zab.toString();
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Image ", "x", i, i2, " ");
        sbM8594m.append(string);
        return sbM8594m.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeParcelable(parcel, 2, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebImage(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    public WebImage(JSONObject jSONObject) throws IllegalArgumentException {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt(Snapshot.WIDTH, 0), jSONObject.optInt(Snapshot.HEIGHT, 0));
    }
}
