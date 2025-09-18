package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9637hX0 extends AbstractC6984v {
    public static final Parcelable.Creator<C9637hX0> CREATOR = new C6921u(9);

    /* renamed from: c */
    public boolean f28445c;

    public C9637hX0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f28445c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        return AbstractC7222ym.m26236m(sb, this.f28445c, "}");
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f28445c));
    }
}
