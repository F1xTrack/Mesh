package p000;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import p000.AbstractC0852NX;
import p000.C7856Kl0;

/* renamed from: Kl0 */
/* loaded from: classes.dex */
public final class C7856Kl0 implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f6272a;

    public /* synthetic */ C7856Kl0(int i) {
        this.f6272a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        Bundle bundleCreateBundle = null;
        G50 g50 = null;
        switch (this.f6272a) {
            case 0:
                C7908Ll0 c7908Ll0 = new C7908Ll0(parcel);
                c7908Ll0.f6828a = parcel.readString();
                c7908Ll0.f6830c = parcel.readFloat();
                c7908Ll0.f6831d = parcel.readInt() == 1;
                c7908Ll0.f6832e = parcel.readString();
                c7908Ll0.f6833f = parcel.readInt();
                c7908Ll0.f6834g = parcel.readInt();
                return c7908Ll0;
            case 1:
                C9159do0 c9159do0 = new C9159do0(parcel);
                c9159do0.f26278a = ((Integer) parcel.readValue(C9159do0.class.getClassLoader())).intValue();
                return c9159do0;
            case 2:
                return new C11590wo0(parcel);
            case 3:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C7856Kl0(3);

                    /* renamed from: a */
                    public final int f15696a;

                    /* renamed from: b */
                    public final MediaDescriptionCompat f15697b;

                    public MediaBrowserCompat$MediaItem(final Parcel parcel2) {
                        this.f15696a = parcel2.readInt();
                        this.f15697b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel2);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f15696a + ", mDescription=" + this.f15697b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.f15696a);
                        this.f15697b.writeToParcel(parcel2, i);
                    }
                };
            case 4:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel2);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strM18041g = AbstractC9289ep0.m18041g(mediaDescription);
                CharSequence charSequenceM18043i = AbstractC9289ep0.m18043i(mediaDescription);
                CharSequence charSequenceM18042h = AbstractC9289ep0.m18042h(mediaDescription);
                CharSequence charSequenceM18037c = AbstractC9289ep0.m18037c(mediaDescription);
                Bitmap bitmapM18039e = AbstractC9289ep0.m18039e(mediaDescription);
                Uri uriM18040f = AbstractC9289ep0.m18040f(mediaDescription);
                Bundle bundleM18038d = AbstractC9289ep0.m18038d(mediaDescription);
                if (bundleM18038d != null) {
                    bundleM18038d.setClassLoader(AbstractC7500Dp0.class.getClassLoader());
                    try {
                        bundleM18038d.isEmpty();
                    } catch (BadParcelableException unused) {
                        bundleM18038d = null;
                    }
                }
                Uri uriM18298a = bundleM18038d != null ? (Uri) bundleM18038d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriM18298a == null) {
                    bundle = bundleM18038d;
                } else if (bundleM18038d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM18038d.size() == 2) {
                    bundle = null;
                } else {
                    bundleM18038d.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleM18038d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleM18038d;
                }
                if (uriM18298a == null) {
                    uriM18298a = AbstractC9417fp0.m18298a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM18041g, charSequenceM18043i, charSequenceM18042h, charSequenceM18037c, bitmapM18039e, uriM18040f, bundle, uriM18298a);
                mediaDescriptionCompat.f15706i = mediaDescription;
                return mediaDescriptionCompat;
            case 5:
                return new MediaMetadataCompat(parcel2);
            case 6:
                return new Parcelable(parcel2) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C7856Kl0(6);

                    /* renamed from: a */
                    public final MediaDescriptionCompat f15710a;

                    /* renamed from: b */
                    public final long f15711b;

                    {
                        this.f15710a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel2);
                        this.f15711b = parcel2.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb.append(this.f15710a);
                        sb.append(", Id=");
                        return AbstractC0852NX.m5760i(sb, this.f15711b, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f15710a.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.f15711b);
                    }
                };
            case 7:
                final Parcelable parcelable = parcel2.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C7856Kl0(7);

                    /* renamed from: a */
                    public final Object f15713a;

                    /* renamed from: b */
                    public final Parcelable f15714b;

                    {
                        this.f15714b = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Parcelable parcelable2 = this.f15714b;
                        if (parcelable2 == null) {
                            return mediaSessionCompat$Token.f15714b == null;
                        }
                        Parcelable parcelable3 = mediaSessionCompat$Token.f15714b;
                        if (parcelable3 == null) {
                            return false;
                        }
                        return parcelable2.equals(parcelable3);
                    }

                    public final int hashCode() {
                        Parcelable parcelable2 = this.f15714b;
                        if (parcelable2 == null) {
                            return 0;
                        }
                        return parcelable2.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable(this.f15714b, i);
                    }
                };
            case 8:
                return new C7660Gr0(parcel2);
            case 9:
                return new C9295es0(parcel2);
            case 10:
                return C8286Ss0.m7456b(parcel2.readInt(), parcel2.readInt());
            case 11:
                return new C8390Us0(parcel2);
            case 12:
                return new C8780at0(parcel2);
            case 13:
                return new C8908bt0(parcel2);
            case 14:
                C7510Du0 c7510Du0 = new C7510Du0(parcel2);
                c7510Du0.f2293a = parcel2.readInt();
                return c7510Du0;
            case 15:
                return new ParcelImpl(parcel2);
            case 16:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f15715a = parcel2.readInt();
                parcelableVolumeInfo.f15717c = parcel2.readInt();
                parcelableVolumeInfo.f15718d = parcel2.readInt();
                parcelableVolumeInfo.f15719e = parcel2.readInt();
                parcelableVolumeInfo.f15716b = parcel2.readInt();
                return parcelableVolumeInfo;
            case 17:
                return new JA0(parcel2);
            case 18:
                return new C8948cB0(parcel2);
            case 19:
                return new PlaybackStateCompat(parcel2);
            case 20:
                return new AD0(parcel2);
            case 21:
                return new BD0(parcel2);
            case 22:
                return new RatingCompat(parcel2.readFloat(), parcel2.readInt());
            case 23:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
                while (parcel2.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel2);
                    if (SafeParcelReader.getFieldId(header) != 2) {
                        SafeParcelReader.skipUnknownField(parcel2, header);
                    } else {
                        bundleCreateBundle = SafeParcelReader.createBundle(parcel2, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel2, iValidateObjectHeader);
                return new OQ0(bundleCreateBundle);
            case 24:
                SS0 ss0 = new SS0();
                IBinder strongBinder = parcel2.readStrongBinder();
                int i = RS0.f10182b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(G50.f3566f);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof G50)) {
                        F50 f50 = new F50();
                        f50.f3061a = strongBinder;
                        g50 = f50;
                    } else {
                        g50 = (G50) iInterfaceQueryLocalInterface;
                    }
                }
                ss0.f10770a = g50;
                return ss0;
            case 25:
                C9315f11 c9315f11 = new C9315f11();
                c9315f11.f27015a = (Long) parcel2.readValue(Long.class.getClassLoader());
                return c9315f11;
            case 26:
                ArrayList arrayList = new ArrayList();
                parcel2.readList(arrayList, C9958k21.class.getClassLoader());
                return new C10086l21(arrayList);
            case 27:
                return new C9958k21(parcel2.readLong(), parcel2.readLong(), parcel2.readInt());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new A21(parcel2);
            default:
                return new C10729q31(parcel2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f6272a) {
            case 0:
                return new C7908Ll0[i];
            case 1:
                return new C9159do0[i];
            case 2:
                return new C11590wo0[i];
            case 3:
                return new MediaBrowserCompat$MediaItem[i];
            case 4:
                return new MediaDescriptionCompat[i];
            case 5:
                return new MediaMetadataCompat[i];
            case 6:
                return new MediaSessionCompat$QueueItem[i];
            case 7:
                return new MediaSessionCompat$Token[i];
            case 8:
                return new C7660Gr0[i];
            case 9:
                return new C9295es0[i];
            case 10:
                return new C8286Ss0[i];
            case 11:
                return new C8390Us0[i];
            case 12:
                return new C8780at0[i];
            case 13:
                return new C8908bt0[i];
            case 14:
                return new C7510Du0[i];
            case 15:
                return new ParcelImpl[i];
            case 16:
                return new ParcelableVolumeInfo[i];
            case 17:
                return new JA0[i];
            case 18:
                return new C8948cB0[i];
            case 19:
                return new PlaybackStateCompat[i];
            case 20:
                return new AD0[i];
            case 21:
                return new BD0[i];
            case 22:
                return new RatingCompat[i];
            case 23:
                return new OQ0[i];
            case 24:
                return new SS0[i];
            case 25:
                return new C9315f11[i];
            case 26:
                return new C10086l21[i];
            case 27:
                return new C9958k21[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new A21[i];
            default:
                return new C10729q31[i];
        }
    }
}
