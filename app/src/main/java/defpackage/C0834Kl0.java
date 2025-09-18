package defpackage;

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
import defpackage.C0834Kl0;
import defpackage.NX;
import java.util.ArrayList;

/* renamed from: Kl0 */
/* loaded from: classes.dex */
public final class C0834Kl0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0834Kl0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        Bundle bundleCreateBundle = null;
        G50 g50 = null;
        switch (this.a) {
            case 0:
                C0912Ll0 c0912Ll0 = new C0912Ll0(parcel);
                c0912Ll0.a = parcel.readString();
                c0912Ll0.c = parcel.readFloat();
                c0912Ll0.d = parcel.readInt() == 1;
                c0912Ll0.e = parcel.readString();
                c0912Ll0.f = parcel.readInt();
                c0912Ll0.g = parcel.readInt();
                return c0912Ll0;
            case 1:
                C3459do0 c3459do0 = new C3459do0(parcel);
                c3459do0.a = ((Integer) parcel.readValue(C3459do0.class.getClassLoader())).intValue();
                return c3459do0;
            case 2:
                return new C7862wo0(parcel);
            case 3:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0834Kl0(3);
                    public final int a;
                    public final MediaDescriptionCompat b;

                    public MediaBrowserCompat$MediaItem(final Parcel parcel2) {
                        this.a = parcel2.readInt();
                        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel2);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.a);
                        this.b.writeToParcel(parcel2, i);
                    }
                };
            case 4:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel2);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = AbstractC3653ep0.g(mediaDescription);
                CharSequence charSequenceI = AbstractC3653ep0.i(mediaDescription);
                CharSequence charSequenceH = AbstractC3653ep0.h(mediaDescription);
                CharSequence charSequenceC = AbstractC3653ep0.c(mediaDescription);
                Bitmap bitmapE = AbstractC3653ep0.e(mediaDescription);
                Uri uriF = AbstractC3653ep0.f(mediaDescription);
                Bundle bundleD = AbstractC3653ep0.d(mediaDescription);
                if (bundleD != null) {
                    bundleD.setClassLoader(AbstractC0300Dp0.class.getClassLoader());
                    try {
                        bundleD.isEmpty();
                    } catch (BadParcelableException unused) {
                        bundleD = null;
                    }
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = AbstractC3844fp0.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.i = mediaDescription;
                return mediaDescriptionCompat;
            case 5:
                return new MediaMetadataCompat(parcel2);
            case 6:
                return new Parcelable(parcel2) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0834Kl0(6);
                    public final MediaDescriptionCompat a;
                    public final long b;

                    {
                        this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel2);
                        this.b = parcel2.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb.append(this.a);
                        sb.append(", Id=");
                        return NX.i(sb, this.b, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.a.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.b);
                    }
                };
            case 7:
                final Parcelable parcelable = parcel2.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0834Kl0(7);
                    public final Object a;
                    public final Parcelable b;

                    {
                        this.b = parcelable;
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
                        Parcelable parcelable2 = this.b;
                        if (parcelable2 == null) {
                            return mediaSessionCompat$Token.b == null;
                        }
                        Parcelable parcelable3 = mediaSessionCompat$Token.b;
                        if (parcelable3 == null) {
                            return false;
                        }
                        return parcelable2.equals(parcelable3);
                    }

                    public final int hashCode() {
                        Parcelable parcelable2 = this.b;
                        if (parcelable2 == null) {
                            return 0;
                        }
                        return parcelable2.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable(this.b, i);
                    }
                };
            case 8:
                return new C0540Gr0(parcel2);
            case 9:
                return new C3662es0(parcel2);
            case 10:
                return C1478Ss0.b(parcel2.readInt(), parcel2.readInt());
            case 11:
                return new C1634Us0(parcel2);
            case 12:
                return new C2218at0(parcel2);
            case 13:
                return new C2409bt0(parcel2);
            case 14:
                C0315Du0 c0315Du0 = new C0315Du0(parcel2);
                c0315Du0.a = parcel2.readInt();
                return c0315Du0;
            case 15:
                return new ParcelImpl(parcel2);
            case 16:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel2.readInt();
                parcelableVolumeInfo.c = parcel2.readInt();
                parcelableVolumeInfo.d = parcel2.readInt();
                parcelableVolumeInfo.e = parcel2.readInt();
                parcelableVolumeInfo.b = parcel2.readInt();
                return parcelableVolumeInfo;
            case 17:
                return new JA0(parcel2);
            case 18:
                return new C2467cB0(parcel2);
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
                int i = RS0.b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(G50.f);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof G50)) {
                        F50 f50 = new F50();
                        f50.a = strongBinder;
                        g50 = f50;
                    } else {
                        g50 = (G50) iInterfaceQueryLocalInterface;
                    }
                }
                ss0.a = g50;
                return ss0;
            case 25:
                C3692f11 c3692f11 = new C3692f11();
                c3692f11.a = (Long) parcel2.readValue(Long.class.getClassLoader());
                return c3692f11;
            case 26:
                ArrayList arrayList = new ArrayList();
                parcel2.readList(arrayList, C5427k21.class.getClassLoader());
                return new C5618l21(arrayList);
            case 27:
                return new C5427k21(parcel2.readLong(), parcel2.readLong(), parcel2.readInt());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new A21(parcel2);
            default:
                return new C6577q31(parcel2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new C0912Ll0[i];
            case 1:
                return new C3459do0[i];
            case 2:
                return new C7862wo0[i];
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
                return new C0540Gr0[i];
            case 9:
                return new C3662es0[i];
            case 10:
                return new C1478Ss0[i];
            case 11:
                return new C1634Us0[i];
            case 12:
                return new C2218at0[i];
            case 13:
                return new C2409bt0[i];
            case 14:
                return new C0315Du0[i];
            case 15:
                return new ParcelImpl[i];
            case 16:
                return new ParcelableVolumeInfo[i];
            case 17:
                return new JA0[i];
            case 18:
                return new C2467cB0[i];
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
                return new C3692f11[i];
            case 26:
                return new C5618l21[i];
            case 27:
                return new C5427k21[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new A21[i];
            default:
                return new C6577q31[i];
        }
    }
}
