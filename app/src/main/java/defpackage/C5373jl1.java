package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: jl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5373jl1 extends View.BaseSavedState {
    public static final Parcelable.Creator<C5373jl1> CREATOR = new C7325u(13);
    public int a;
    public int b;
    public Parcelable c;

    public C5373jl1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
