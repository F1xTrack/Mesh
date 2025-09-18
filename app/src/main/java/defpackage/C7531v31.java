package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: v31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7531v31 extends AbstractC6004n31 {
    public static final Parcelable.Creator<C7531v31> CREATOR = new C6767r31(1);
    public final List a;

    public C7531v31(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C7340u31(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C7340u31 c7340u31 = (C7340u31) list.get(i2);
            parcel.writeLong(c7340u31.a);
            parcel.writeByte(c7340u31.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c7340u31.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c7340u31.d ? (byte) 1 : (byte) 0);
            List list2 = c7340u31.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C7149t31 c7149t31 = (C7149t31) list2.get(i3);
                parcel.writeInt(c7149t31.a);
                parcel.writeLong(c7149t31.b);
            }
            parcel.writeLong(c7340u31.e);
            parcel.writeByte(c7340u31.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c7340u31.h);
            parcel.writeInt(c7340u31.i);
            parcel.writeInt(c7340u31.j);
            parcel.writeInt(c7340u31.k);
        }
    }

    public C7531v31(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
