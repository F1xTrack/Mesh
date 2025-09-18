package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: jl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9922jl1 extends View.BaseSavedState {
    public static final Parcelable.Creator<C9922jl1> CREATOR = new C6921u(13);

    /* renamed from: a */
    public int f35368a;

    /* renamed from: b */
    public int f35369b;

    /* renamed from: c */
    public Parcelable f35370c;

    public C9922jl1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f35368a = parcel.readInt();
        this.f35369b = parcel.readInt();
        this.f35370c = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f35368a);
        parcel.writeInt(this.f35369b);
        parcel.writeParcelable(this.f35370c, i);
    }
}
