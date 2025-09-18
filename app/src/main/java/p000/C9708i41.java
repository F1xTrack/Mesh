package p000;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import java.io.File;
import java.util.HashMap;

/* renamed from: i41 */
/* loaded from: classes.dex */
public final class C9708i41 implements InterfaceC7602Fo0 {

    /* renamed from: a */
    public long f28810a;

    /* renamed from: b */
    public long f28811b;

    /* renamed from: c */
    public boolean f28812c;

    /* renamed from: d */
    public final Object f28813d;

    /* renamed from: e */
    public Object f28814e;

    public C9708i41(UM1 um1, String str, long j) {
        this.f28814e = um1;
        Preconditions.checkNotEmpty(str);
        this.f28813d = str;
        this.f28810a = j;
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: a */
    public void mo2784a(CB0 cb0) {
        if (this.f28812c) {
            m18960d(mo2785b());
        }
        this.f28814e = cb0;
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: b */
    public long mo2785b() {
        long j = this.f28810a;
        if (!this.f28812c) {
            return j;
        }
        ((M71) this.f28813d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f28811b;
        return j + (((CB0) this.f28814e).f1239a == 1.0f ? AbstractC7485Dh1.m1802Q(jElapsedRealtime) : jElapsedRealtime * r4.f1241c);
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: c */
    public /* synthetic */ boolean mo2786c() {
        return false;
    }

    /* renamed from: d */
    public void m18960d(long j) {
        this.f28810a = j;
        if (this.f28812c) {
            ((M71) this.f28813d).getClass();
            this.f28811b = SystemClock.elapsedRealtime();
        }
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: e */
    public CB0 mo2787e() {
        return (CB0) this.f28814e;
    }

    /* renamed from: f */
    public void m18961f() {
        if (this.f28812c) {
            return;
        }
        ((M71) this.f28813d).getClass();
        this.f28811b = SystemClock.elapsedRealtime();
        this.f28812c = true;
    }

    /* renamed from: g */
    public long m18962g() {
        if (!this.f28812c) {
            this.f28812c = true;
            this.f28811b = ((UM1) this.f28814e).m7993C1().getLong((String) this.f28813d, this.f28810a);
        }
        return this.f28811b;
    }

    /* renamed from: h */
    public void m18963h(long j) {
        SharedPreferences.Editor editorEdit = ((UM1) this.f28814e).m7993C1().edit();
        editorEdit.putLong((String) this.f28813d, j);
        editorEdit.apply();
        this.f28811b = j;
    }

    public C9708i41(M71 m71) {
        this.f28813d = m71;
        this.f28814e = CB0.f1238d;
    }

    public C9708i41(long j, long j2, boolean z, File file, HashMap map) {
        this.f28810a = j;
        this.f28813d = file;
        this.f28811b = j2;
        this.f28814e = map;
        this.f28812c = z;
    }
}
