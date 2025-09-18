package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: Ei1 */
/* loaded from: classes.dex */
public final class C7539Ei1 extends AbstractC7487Di1 {

    /* renamed from: d */
    public final SparseIntArray f2846d;

    /* renamed from: e */
    public final Parcel f2847e;

    /* renamed from: f */
    public final int f2848f;

    /* renamed from: g */
    public final int f2849g;

    /* renamed from: h */
    public final String f2850h;

    /* renamed from: i */
    public int f2851i;

    /* renamed from: j */
    public int f2852j;

    /* renamed from: k */
    public int f2853k;

    public C7539Ei1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C7119x8(), new C7119x8(), new C7119x8());
    }

    @Override // p000.AbstractC7487Di1
    /* renamed from: a */
    public final C7539Ei1 mo1845a() {
        Parcel parcel = this.f2847e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f2852j;
        if (i == this.f2848f) {
            i = this.f2849g;
        }
        return new C7539Ei1(parcel, iDataPosition, i, AbstractC1374Vq.m8593l(new StringBuilder(), this.f2850h, "  "), this.f2184a, this.f2185b, this.f2186c);
    }

    @Override // p000.AbstractC7487Di1
    /* renamed from: e */
    public final boolean mo1849e(int i) {
        while (this.f2852j < this.f2849g) {
            int i2 = this.f2853k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f2852j;
            Parcel parcel = this.f2847e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f2853k = parcel.readInt();
            this.f2852j += i4;
        }
        return this.f2853k == i;
    }

    @Override // p000.AbstractC7487Di1
    /* renamed from: i */
    public final void mo1853i(int i) {
        int i2 = this.f2851i;
        SparseIntArray sparseIntArray = this.f2846d;
        Parcel parcel = this.f2847e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f2851i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C7539Ei1(Parcel parcel, int i, int i2, String str, C7119x8 c7119x8, C7119x8 c7119x82, C7119x8 c7119x83) {
        super(c7119x8, c7119x82, c7119x83);
        this.f2846d = new SparseIntArray();
        this.f2851i = -1;
        this.f2853k = -1;
        this.f2847e = parcel;
        this.f2848f = i;
        this.f2849g = i2;
        this.f2852j = i;
        this.f2850h = str;
    }
}
