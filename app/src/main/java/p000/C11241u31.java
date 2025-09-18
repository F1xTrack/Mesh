package p000;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: u31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11241u31 {

    /* renamed from: a */
    public final long f43466a;

    /* renamed from: b */
    public final boolean f43467b;

    /* renamed from: c */
    public final boolean f43468c;

    /* renamed from: d */
    public final boolean f43469d;

    /* renamed from: e */
    public final long f43470e;

    /* renamed from: f */
    public final List f43471f;

    /* renamed from: g */
    public final boolean f43472g;

    /* renamed from: h */
    public final long f43473h;

    /* renamed from: i */
    public final int f43474i;

    /* renamed from: j */
    public final int f43475j;

    /* renamed from: k */
    public final int f43476k;

    public C11241u31(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.f43466a = j;
        this.f43467b = z;
        this.f43468c = z2;
        this.f43469d = z3;
        this.f43471f = Collections.unmodifiableList(arrayList);
        this.f43470e = j2;
        this.f43472g = z4;
        this.f43473h = j3;
        this.f43474i = i;
        this.f43475j = i2;
        this.f43476k = i3;
    }

    public C11241u31(Parcel parcel) {
        this.f43466a = parcel.readLong();
        this.f43467b = parcel.readByte() == 1;
        this.f43468c = parcel.readByte() == 1;
        this.f43469d = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C11113t31(parcel.readInt(), parcel.readLong()));
        }
        this.f43471f = Collections.unmodifiableList(arrayList);
        this.f43470e = parcel.readLong();
        this.f43472g = parcel.readByte() == 1;
        this.f43473h = parcel.readLong();
        this.f43474i = parcel.readInt();
        this.f43475j = parcel.readInt();
        this.f43476k = parcel.readInt();
    }
}
