package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public final class C1688a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
        mediaSessionCompat$ResultReceiverWrapper.f15712a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        return mediaSessionCompat$ResultReceiverWrapper;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaSessionCompat$ResultReceiverWrapper[i];
    }
}
