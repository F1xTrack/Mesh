package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: pB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10618pB1 {

    /* renamed from: a */
    public final String f39886a;

    /* renamed from: b */
    public final String f39887b;

    /* renamed from: c */
    public final long f39888c;

    /* renamed from: d */
    public final long f39889d;

    /* renamed from: e */
    public final long f39890e;

    /* renamed from: f */
    public final long f39891f;

    /* renamed from: g */
    public final long f39892g;

    /* renamed from: h */
    public final Long f39893h;

    /* renamed from: i */
    public final Long f39894i;

    /* renamed from: j */
    public final Long f39895j;

    /* renamed from: k */
    public final Boolean f39896k;

    public C10618pB1(String str, String str2, long j) {
        this(str, str2, 0L, 0L, 0L, j, 0L, null, null, null, null);
    }

    /* renamed from: a */
    public final C10618pB1 m23638a(long j) {
        return new C10618pB1(this.f39886a, this.f39887b, this.f39888c, this.f39889d, this.f39890e, j, this.f39892g, this.f39893h, this.f39894i, this.f39895j, this.f39896k);
    }

    /* renamed from: b */
    public final C10618pB1 m23639b(Long l, Long l2, Boolean bool) {
        return new C10618pB1(this.f39886a, this.f39887b, this.f39888c, this.f39889d, this.f39890e, this.f39891f, this.f39892g, this.f39893h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public C10618pB1(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        this.f39886a = str;
        this.f39887b = str2;
        this.f39888c = j;
        this.f39889d = j2;
        this.f39890e = j3;
        this.f39891f = j4;
        this.f39892g = j5;
        this.f39893h = l;
        this.f39894i = l2;
        this.f39895j = l3;
        this.f39896k = bool;
    }
}
