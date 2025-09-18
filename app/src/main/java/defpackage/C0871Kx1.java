package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* renamed from: Kx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871Kx1 extends K7 {
    public final InterfaceC2335bU1 a;

    public C0871Kx1(InterfaceC2335bU1 interfaceC2335bU1) {
        Preconditions.checkNotNull(interfaceC2335bU1);
        this.a = interfaceC2335bU1;
    }

    @Override // defpackage.InterfaceC2335bU1
    public final int b(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void c(String str, String str2, Bundle bundle) {
        this.a.c(str, str2, bundle);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void d(String str) {
        this.a.d(str);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void e(String str) {
        this.a.e(str);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final Map f(String str, String str2, boolean z) {
        return this.a.f(str, str2, z);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void g(String str, String str2, Bundle bundle) {
        this.a.g(str, str2, bundle);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final List h(String str, String str2) {
        return this.a.h(str, str2);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String m() {
        return this.a.m();
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String n() {
        return this.a.n();
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void zza(Bundle bundle) {
        this.a.zza(bundle);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final long zzf() {
        return this.a.zzf();
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String zzg() {
        return this.a.zzg();
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String zzi() {
        return this.a.zzi();
    }
}
