package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class EY1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EY1> CREATOR = new C8697aD1(16);

    /* renamed from: A */
    public final String f2747A;

    /* renamed from: B */
    public final int f2748B;

    /* renamed from: C */
    public final long f2749C;

    /* renamed from: D */
    public final String f2750D;

    /* renamed from: E */
    public final String f2751E;

    /* renamed from: F */
    public final long f2752F;

    /* renamed from: G */
    public final int f2753G;

    /* renamed from: a */
    public final String f2754a;

    /* renamed from: b */
    public final String f2755b;

    /* renamed from: c */
    public final String f2756c;

    /* renamed from: d */
    public final String f2757d;

    /* renamed from: e */
    public final long f2758e;

    /* renamed from: f */
    public final long f2759f;

    /* renamed from: g */
    public final String f2760g;

    /* renamed from: h */
    public final boolean f2761h;

    /* renamed from: i */
    public final boolean f2762i;

    /* renamed from: j */
    public final long f2763j;

    /* renamed from: k */
    public final String f2764k;

    /* renamed from: l */
    public final long f2765l;

    /* renamed from: m */
    public final int f2766m;

    /* renamed from: n */
    public final boolean f2767n;

    /* renamed from: o */
    public final boolean f2768o;

    /* renamed from: p */
    public final String f2769p;

    /* renamed from: q */
    public final Boolean f2770q;

    /* renamed from: r */
    public final long f2771r;

    /* renamed from: s */
    public final List f2772s;

    /* renamed from: t */
    public final String f2773t;

    /* renamed from: u */
    public final String f2774u;

    /* renamed from: v */
    public final String f2775v;

    /* renamed from: w */
    public final String f2776w;

    /* renamed from: x */
    public final boolean f2777x;

    /* renamed from: y */
    public final long f2778y;

    /* renamed from: z */
    public final int f2779z;

    public EY1(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, List list, String str8, String str9, String str10, boolean z5, long j6, int i2, String str11, int i3, long j7, String str12, String str13, long j8, int i4) {
        Preconditions.checkNotEmpty(str);
        this.f2754a = str;
        this.f2755b = TextUtils.isEmpty(str2) ? null : str2;
        this.f2756c = str3;
        this.f2763j = j;
        this.f2757d = str4;
        this.f2758e = j2;
        this.f2759f = j3;
        this.f2760g = str5;
        this.f2761h = z;
        this.f2762i = z2;
        this.f2764k = str6;
        this.f2765l = j4;
        this.f2766m = i;
        this.f2767n = z3;
        this.f2768o = z4;
        this.f2769p = str7;
        this.f2770q = bool;
        this.f2771r = j5;
        this.f2772s = list;
        this.f2773t = null;
        this.f2774u = str8;
        this.f2775v = str9;
        this.f2776w = str10;
        this.f2777x = z5;
        this.f2778y = j6;
        this.f2779z = i2;
        this.f2747A = str11;
        this.f2748B = i3;
        this.f2749C = j7;
        this.f2750D = str12;
        this.f2751E = str13;
        this.f2752F = j8;
        this.f2753G = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f2754a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f2755b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f2756c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f2757d, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f2758e);
        SafeParcelWriter.writeLong(parcel, 7, this.f2759f);
        SafeParcelWriter.writeString(parcel, 8, this.f2760g, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f2761h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f2762i);
        SafeParcelWriter.writeLong(parcel, 11, this.f2763j);
        SafeParcelWriter.writeString(parcel, 12, this.f2764k, false);
        SafeParcelWriter.writeLong(parcel, 14, this.f2765l);
        SafeParcelWriter.writeInt(parcel, 15, this.f2766m);
        SafeParcelWriter.writeBoolean(parcel, 16, this.f2767n);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f2768o);
        SafeParcelWriter.writeString(parcel, 19, this.f2769p, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.f2770q, false);
        SafeParcelWriter.writeLong(parcel, 22, this.f2771r);
        SafeParcelWriter.writeStringList(parcel, 23, this.f2772s, false);
        SafeParcelWriter.writeString(parcel, 24, this.f2773t, false);
        SafeParcelWriter.writeString(parcel, 25, this.f2774u, false);
        SafeParcelWriter.writeString(parcel, 26, this.f2775v, false);
        SafeParcelWriter.writeString(parcel, 27, this.f2776w, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.f2777x);
        SafeParcelWriter.writeLong(parcel, 29, this.f2778y);
        SafeParcelWriter.writeInt(parcel, 30, this.f2779z);
        SafeParcelWriter.writeString(parcel, 31, this.f2747A, false);
        SafeParcelWriter.writeInt(parcel, 32, this.f2748B);
        SafeParcelWriter.writeLong(parcel, 34, this.f2749C);
        SafeParcelWriter.writeString(parcel, 35, this.f2750D, false);
        SafeParcelWriter.writeString(parcel, 36, this.f2751E, false);
        SafeParcelWriter.writeLong(parcel, 37, this.f2752F);
        SafeParcelWriter.writeInt(parcel, 38, this.f2753G);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public EY1(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z5, long j6, int i2, String str12, int i3, long j7, String str13, String str14, long j8, int i4) {
        this.f2754a = str;
        this.f2755b = str2;
        this.f2756c = str3;
        this.f2763j = j3;
        this.f2757d = str4;
        this.f2758e = j;
        this.f2759f = j2;
        this.f2760g = str5;
        this.f2761h = z;
        this.f2762i = z2;
        this.f2764k = str6;
        this.f2765l = j4;
        this.f2766m = i;
        this.f2767n = z3;
        this.f2768o = z4;
        this.f2769p = str7;
        this.f2770q = bool;
        this.f2771r = j5;
        this.f2772s = arrayList;
        this.f2773t = str8;
        this.f2774u = str9;
        this.f2775v = str10;
        this.f2776w = str11;
        this.f2777x = z5;
        this.f2778y = j6;
        this.f2779z = i2;
        this.f2747A = str12;
        this.f2748B = i3;
        this.f2749C = j7;
        this.f2750D = str13;
        this.f2751E = str14;
        this.f2752F = j8;
        this.f2753G = i4;
    }
}
