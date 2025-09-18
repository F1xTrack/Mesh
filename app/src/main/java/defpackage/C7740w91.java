package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: w91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7740w91 extends AbstractC7516v {
    public static final Parcelable.Creator<C7740w91> CREATOR = new C7325u(11);
    public CharSequence c;
    public boolean d;

    public C7740w91(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
