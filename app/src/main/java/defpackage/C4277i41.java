package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import java.io.File;
import java.util.HashMap;

/* renamed from: i41 */
/* loaded from: classes.dex */
public final class C4277i41 implements InterfaceC0453Fo0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public C4277i41(UM1 um1, String str, long j) {
        this.e = um1;
        Preconditions.checkNotEmpty(str);
        this.d = str;
        this.a = j;
    }

    @Override // defpackage.InterfaceC0453Fo0
    public void a(CB0 cb0) {
        if (this.c) {
            d(b());
        }
        this.e = cb0;
    }

    @Override // defpackage.InterfaceC0453Fo0
    public long b() {
        long j = this.a;
        if (!this.c) {
            return j;
        }
        ((M71) this.d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return j + (((CB0) this.e).a == 1.0f ? AbstractC0277Dh1.Q(jElapsedRealtime) : jElapsedRealtime * r4.c);
    }

    @Override // defpackage.InterfaceC0453Fo0
    public /* synthetic */ boolean c() {
        return false;
    }

    public void d(long j) {
        this.a = j;
        if (this.c) {
            ((M71) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.InterfaceC0453Fo0
    public CB0 e() {
        return (CB0) this.e;
    }

    public void f() {
        if (this.c) {
            return;
        }
        ((M71) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    public long g() {
        if (!this.c) {
            this.c = true;
            this.b = ((UM1) this.e).C1().getLong((String) this.d, this.a);
        }
        return this.b;
    }

    public void h(long j) {
        SharedPreferences.Editor editorEdit = ((UM1) this.e).C1().edit();
        editorEdit.putLong((String) this.d, j);
        editorEdit.apply();
        this.b = j;
    }

    public C4277i41(M71 m71) {
        this.d = m71;
        this.e = CB0.d;
    }

    public C4277i41(long j, long j2, boolean z, File file, HashMap map) {
        this.a = j;
        this.d = file;
        this.b = j2;
        this.e = map;
        this.c = z;
    }
}
