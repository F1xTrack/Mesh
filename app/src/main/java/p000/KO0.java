package p000;

/* loaded from: classes.dex */
public final class KO0 {

    /* renamed from: a */
    public int f6045a;

    /* renamed from: b */
    public int f6046b;

    /* renamed from: c */
    public int f6047c;

    /* renamed from: d */
    public int f6048d;

    /* renamed from: e */
    public int f6049e;

    /* renamed from: f */
    public boolean f6050f;

    /* renamed from: g */
    public boolean f6051g;

    /* renamed from: h */
    public boolean f6052h;

    /* renamed from: i */
    public boolean f6053i;

    /* renamed from: j */
    public boolean f6054j;

    /* renamed from: k */
    public boolean f6055k;

    /* renamed from: l */
    public int f6056l;

    /* renamed from: m */
    public long f6057m;

    /* renamed from: n */
    public int f6058n;

    /* renamed from: a */
    public final void m4624a(int i) {
        if ((this.f6048d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f6048d));
    }

    /* renamed from: b */
    public final int m4625b() {
        return this.f6051g ? this.f6046b - this.f6047c : this.f6049e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.f6045a);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.f6049e);
        sb.append(", mIsMeasuring=");
        sb.append(this.f6053i);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.f6046b);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f6047c);
        sb.append(", mStructureChanged=");
        sb.append(this.f6050f);
        sb.append(", mInPreLayout=");
        sb.append(this.f6051g);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f6054j);
        sb.append(", mRunPredictiveAnimations=");
        return F91.m2540w(sb, this.f6055k, '}');
    }
}
