package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: v31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11369v31 extends AbstractC10345n31 {
    public static final Parcelable.Creator<C11369v31> CREATOR = new C10857r31(1);

    /* renamed from: a */
    public final List f44122a;

    public C11369v31(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C11241u31(parcel));
        }
        this.f44122a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f44122a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C11241u31 c11241u31 = (C11241u31) list.get(i2);
            parcel.writeLong(c11241u31.f43466a);
            parcel.writeByte(c11241u31.f43467b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c11241u31.f43468c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c11241u31.f43469d ? (byte) 1 : (byte) 0);
            List list2 = c11241u31.f43471f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C11113t31 c11113t31 = (C11113t31) list2.get(i3);
                parcel.writeInt(c11113t31.f42820a);
                parcel.writeLong(c11113t31.f42821b);
            }
            parcel.writeLong(c11241u31.f43470e);
            parcel.writeByte(c11241u31.f43472g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c11241u31.f43473h);
            parcel.writeInt(c11241u31.f43474i);
            parcel.writeInt(c11241u31.f43475j);
            parcel.writeInt(c11241u31.f43476k);
        }
    }

    public C11369v31(ArrayList arrayList) {
        this.f44122a = Collections.unmodifiableList(arrayList);
    }
}
