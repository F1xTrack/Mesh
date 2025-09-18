package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: w91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11509w91 extends AbstractC6984v {
    public static final Parcelable.Creator<C11509w91> CREATOR = new C6921u(11);

    /* renamed from: c */
    public CharSequence f44701c;

    /* renamed from: d */
    public boolean f44702d;

    public C11509w91(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f44701c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f44702d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f44701c) + "}";
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f44701c, parcel, i);
        parcel.writeInt(this.f44702d ? 1 : 0);
    }
}
