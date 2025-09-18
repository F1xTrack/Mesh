package androidx.work.impl;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC10889rJ0;
import p000.C10061kr0;
import p000.C10317mr0;
import p000.C1276UH;
import p000.C1339VH;
import p000.C6349lD;
import p000.C6404m5;
import p000.C7967Mo1;
import p000.C8071Oo1;
import p000.C8435Vo1;
import p000.C8440Vr0;
import p000.C8539Xo1;
import p000.C8875bc1;
import p000.C8998ca0;
import p000.CC0;
import p000.D61;
import p000.O90;
import p000.T71;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k */
    public volatile C8435Vo1 f16577k;

    /* renamed from: l */
    public volatile C1339VH f16578l;

    /* renamed from: m */
    public volatile C8539Xo1 f16579m;

    /* renamed from: n */
    public volatile T71 f16580n;

    /* renamed from: o */
    public volatile C7967Mo1 f16581o;

    /* renamed from: p */
    public volatile C8071Oo1 f16582p;

    /* renamed from: q */
    public volatile CC0 f16583q;

    @Override // p000.AbstractC10653pT0
    /* renamed from: d */
    public final C8998ca0 mo10330d() {
        return new C8998ca0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p000.AbstractC10653pT0
    /* renamed from: e */
    public final D61 mo10331e(C6349lD c6349lD) {
        C8875bc1 c8875bc1 = new C8875bc1(c6349lD, new C10317mr0(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        Context context = c6349lD.f36960a;
        O90.m5968f(context, "context");
        return c6349lD.f36962c.mo984n(new C6404m5(context, c6349lD.f36961b, c8875bc1, false, false));
    }

    @Override // p000.AbstractC10653pT0
    /* renamed from: f */
    public final List mo10332f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new C8440Vr0(13, 14, 9), new C8440Vr0());
    }

    @Override // p000.AbstractC10653pT0
    /* renamed from: h */
    public final Set mo10333h() {
        return new HashSet();
    }

    @Override // p000.AbstractC10653pT0
    /* renamed from: i */
    public final Map mo10334i() {
        HashMap map = new HashMap();
        map.put(C8435Vo1.class, Collections.emptyList());
        map.put(C1339VH.class, Collections.emptyList());
        map.put(C8539Xo1.class, Collections.emptyList());
        map.put(T71.class, Collections.emptyList());
        map.put(C7967Mo1.class, Collections.emptyList());
        map.put(C8071Oo1.class, Collections.emptyList());
        map.put(CC0.class, Collections.emptyList());
        map.put(AbstractC10889rJ0.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: p */
    public final C1339VH mo10323p() {
        C1339VH c1339vh;
        if (this.f16578l != null) {
            return this.f16578l;
        }
        synchronized (this) {
            try {
                if (this.f16578l == null) {
                    this.f16578l = new C1339VH(this);
                }
                c1339vh = this.f16578l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1339vh;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: q */
    public final CC0 mo10324q() {
        CC0 cc0;
        if (this.f16583q != null) {
            return this.f16583q;
        }
        synchronized (this) {
            try {
                if (this.f16583q == null) {
                    this.f16583q = new CC0(this);
                }
                cc0 = this.f16583q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cc0;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: r */
    public final T71 mo10325r() {
        T71 t71;
        if (this.f16580n != null) {
            return this.f16580n;
        }
        synchronized (this) {
            try {
                if (this.f16580n == null) {
                    T71 t712 = new T71();
                    t712.f11173a = this;
                    t712.f11174b = new C1276UH(this, 3);
                    t712.f11175c = new C10061kr0(this, 2);
                    t712.f11176d = new C10061kr0(this, 3);
                    this.f16580n = t712;
                }
                t71 = this.f16580n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t71;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: s */
    public final C7967Mo1 mo10326s() {
        C7967Mo1 c7967Mo1;
        if (this.f16581o != null) {
            return this.f16581o;
        }
        synchronized (this) {
            try {
                if (this.f16581o == null) {
                    C7967Mo1 c7967Mo12 = new C7967Mo1();
                    c7967Mo12.f7362a = this;
                    c7967Mo12.f7363b = new C1276UH(this, 4);
                    this.f16581o = c7967Mo12;
                }
                c7967Mo1 = this.f16581o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7967Mo1;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: t */
    public final C8071Oo1 mo10327t() {
        C8071Oo1 c8071Oo1;
        if (this.f16582p != null) {
            return this.f16582p;
        }
        synchronized (this) {
            try {
                if (this.f16582p == null) {
                    C8071Oo1 c8071Oo12 = new C8071Oo1();
                    c8071Oo12.f8627a = this;
                    c8071Oo12.f8628b = new C1276UH(this, 5);
                    c8071Oo12.f8629c = new C10061kr0(this, 4);
                    c8071Oo12.f8630d = new C10061kr0(this, 5);
                    this.f16582p = c8071Oo12;
                }
                c8071Oo1 = this.f16582p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8071Oo1;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: u */
    public final C8435Vo1 mo10328u() {
        C8435Vo1 c8435Vo1;
        if (this.f16577k != null) {
            return this.f16577k;
        }
        synchronized (this) {
            try {
                if (this.f16577k == null) {
                    this.f16577k = new C8435Vo1(this);
                }
                c8435Vo1 = this.f16577k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8435Vo1;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: v */
    public final C8539Xo1 mo10329v() {
        C8539Xo1 c8539Xo1;
        if (this.f16579m != null) {
            return this.f16579m;
        }
        synchronized (this) {
            try {
                if (this.f16579m == null) {
                    this.f16579m = new C8539Xo1(this);
                }
                c8539Xo1 = this.f16579m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8539Xo1;
    }
}
