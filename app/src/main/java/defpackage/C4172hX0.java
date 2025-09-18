package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4172hX0 extends AbstractC7516v {
    public static final Parcelable.Creator<C4172hX0> CREATOR = new C7325u(9);
    public boolean c;

    public C4172hX0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        return AbstractC8235ym.m(sb, this.c, "}");
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.c));
    }
}
