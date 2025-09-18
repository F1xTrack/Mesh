package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new C2072a();
    public String URI;

    /* renamed from: a */
    private int f18986a;

    /* renamed from: b */
    private Bundle f18987b;
    public Bundle header;

    /* renamed from: com.huawei.hms.core.aidl.DataBuffer$a */
    public class C2072a implements Parcelable.Creator<DataBuffer> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel, (C2072a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer[] newArray(int i) {
            return new DataBuffer[i];
        }
    }

    public /* synthetic */ DataBuffer(Parcel parcel, C2072a c2072a) {
        this(parcel);
    }

    /* renamed from: a */
    private static ClassLoader m11640a(Class cls) {
        return cls.getClassLoader();
    }

    public DataBuffer addBody(Bundle bundle) {
        this.f18987b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBody() {
        return this.f18987b;
    }

    public int getBodySize() {
        return this.f18987b == null ? 0 : 1;
    }

    public int getProtocol() {
        return this.f18986a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.f18986a);
        parcel.writeString(this.URI);
        parcel.writeBundle(this.header);
        parcel.writeBundle(this.f18987b);
    }

    private DataBuffer(Parcel parcel) {
        this.header = null;
        this.f18986a = 1;
        this.f18987b = null;
        m11641a(parcel);
    }

    /* renamed from: a */
    private void m11641a(Parcel parcel) {
        this.f18986a = parcel.readInt();
        this.URI = parcel.readString();
        this.header = parcel.readBundle(m11640a(Bundle.class));
        this.f18987b = parcel.readBundle(m11640a(Bundle.class));
    }

    public DataBuffer() {
        this.header = null;
        this.f18986a = 1;
        this.f18987b = null;
    }

    public DataBuffer(String str) {
        this.header = null;
        this.f18986a = 1;
        this.f18987b = null;
        this.URI = str;
    }

    public DataBuffer(String str, int i) {
        this.header = null;
        this.f18987b = null;
        this.URI = str;
        this.f18986a = i;
    }
}
