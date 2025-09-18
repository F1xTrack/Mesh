package p000;

import android.os.Bundle;
import android.util.Log;

/* renamed from: m02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10209m02 {

    /* renamed from: a */
    public final int f37388a;

    /* renamed from: b */
    public final S81 f37389b = new S81();

    /* renamed from: c */
    public final int f37390c;

    /* renamed from: d */
    public final Bundle f37391d;

    /* renamed from: e */
    public final /* synthetic */ int f37392e;

    public C10209m02(int i, int i2, Bundle bundle, int i3) {
        this.f37392e = i3;
        this.f37388a = i;
        this.f37390c = i2;
        this.f37391d = bundle;
    }

    /* renamed from: a */
    public final boolean m22625a() {
        switch (this.f37392e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final void m22626b(C0226Da c0226Da) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            c0226Da.toString();
        }
        this.f37389b.m7183a(c0226Da);
    }

    public final String toString() {
        return "Request { what=" + this.f37390c + " id=" + this.f37388a + " oneWay=" + m22625a() + "}";
    }
}
